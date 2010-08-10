// Copyright 2010 Google Inc. All Rights Reserved.

package palus;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public final class AbstractState implements java.io.Serializable {
  
  private final Class<?> clz;
  
  private transient /*final*/ Field[] fields; //field could not be serialized
  private final State[] states;
  
  private final String[] serializableFields;
  
  public boolean isPrimtiveOrString = false;
  public Object valueOfPrimitiveOrString = null;
  
  public AbstractState(Object obj) throws IllegalArgumentException, IllegalAccessException {
    this(obj, false);
  }
  
  /** init indicates whether the object is before creation */
  public AbstractState(Object obj, boolean init) throws IllegalArgumentException, IllegalAccessException {
    //check for null
    if(obj == null) {
      clz = null;
      fields = new Field[0];
      serializableFields = new String[0];
      states = new State[0];
      return;
    }
    
    //for non-null object
    this.clz = obj.getClass();
    if(this.clz.isPrimitive() || PalusUtil.isPrimitive(this.clz)
        || this.clz == java.lang.String.class) {
      fields = new Field[0];
      serializableFields = new String[0];
      states = new State[0];
      isPrimtiveOrString = true;
      valueOfPrimitiveOrString = obj;
    } else {    
      //deal with non-primitive, and non-string
      Field[] allMutableClassFields = this.getNonStaticNonFinalFields(obj.getClass());
      this.fields = allMutableClassFields;
      this.serializableFields = new String[this.fields.length];
      if(!init) {
        this.states = this.extractStates(this.fields, obj);
      } else {
        this.states = new State[allMutableClassFields.length];
        for(int i = 0; i < this.states.length; i++) {
          this.states[i] = State.INIT;
        }
      }
    }
  }
  
  public static void serialize(ObjectOutputStream oos, AbstractState abState) throws IOException {
    abState.saveFieldStates();
    oos.writeObject(abState);
  }
  
  public static AbstractState deserialize(ObjectInputStream ois) throws IOException, ClassNotFoundException {
    Object obj = ois.readObject();
    PalusUtil.checkTrue(obj instanceof AbstractState);
    AbstractState abState = (AbstractState)obj;
    abState.recoverFieldStates();
    return abState;
  }
  
  private void saveFieldStates() {
    for(int i = 0; i < this.fields.length; i++) {
      this.serializableFields[i] = this.fields[i].toGenericString();
    }
  }
  
  private void recoverFieldStates() {
    PalusUtil.checkNull(this.clz);
    Field[] declaredFields = this.clz.getDeclaredFields();
    this.fields = new Field[this.serializableFields.length];
    for(int i = 0; i < this.serializableFields.length; i++) {
      String signature = this.serializableFields[i];
      Field field = null;
      for(Field f : declaredFields) {
        if(f.toGenericString().equals(signature)) {
          field = f;
          break;
        }
      }
      PalusUtil.checkNull(field);
      this.fields[i] = field;
    }
  }
  
  public Class<?> getStateClass() {
    return clz;
  }
  
  public Field[] getStateFields() {
    return fields;
  }
  
  public State[] getStates() {
    return states;
  }
  
  public int getStateSize() {
    return this.states.length;
  }
  
  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof AbstractState)) {
      return false;
    }
    
    AbstractState state = (AbstractState)obj;
    if(state.getStateClass() != this.clz) {
      return false;
    }
    
    assert state.getStates().length == this.states.length;
    for(int i = 0; i < this.states.length; i++) {
      if(state.getStates()[i] != this.states[i]) {
        //different states
        return false;
      }
    }
    
    return true;
  }
  
  @Override
  public String toString() {
    assert this.fields.length == this.states.length;
    
    if(this.clz == null) {
      return "NULL_OBJ_STATE";
    }
    
    if(this.isPrimtiveOrString) {
      assert this.valueOfPrimitiveOrString != null;
      return this.valueOfPrimitiveOrString.toString();
    }
    
    StringBuffer sb = new StringBuffer();
    
    for(int i = 0; i < this.states.length; i++) {
      if(i > 0 ) {
        sb.append("  ");
      }
      sb.append(this.fields[i].getName() + ":" + this.states[i].toString());
    }
    
    return sb.toString();
  }
  
  //convert the state to abstract domain
  private State[] extractStates(Field[] fields, Object obj) throws IllegalArgumentException, IllegalAccessException {
    
    State[] extracts = new State[fields.length];
    for(int i = 0; i < fields.length; i++) {
      State s = State.INIT;
      //convert the value to abstract state
      Field field = fields[i];
      Class<?> fieldType = field.getType();
      //get the object value
      field.setAccessible(true);
      Object fieldValue = field.get(obj);
      
      if(fieldType.isPrimitive()) {
        //all primitives must have values
        if(fieldType == java.lang.Byte.class || fieldType == byte.class) {
          java.lang.Byte byteValue = (java.lang.Byte)fieldValue;
          if(byteValue == 0) {
            s = State.BYTE_ZERO;
          } else {
            s = State.BYTE_NON_ZERO;
          }
        } else if(fieldType == java.lang.Character.class || fieldType == char.class) {
          java.lang.Character charValue = (java.lang.Character)fieldValue;
          if(charValue == '\u0000') {
            s = State.CHAR_ZERO;
          } else {
            s = State.CHAR_NON_ZERO;
          }
        } else if(fieldType == java.lang.Boolean.class || fieldType == boolean.class) {
          java.lang.Boolean boolValue = (java.lang.Boolean)fieldValue;
          if(boolValue) {
            s = State.BOOLEAN_TRUE;
          } else {
            s = State.BOOLEAN_FALSE;
          }
        } else if(fieldType == java.lang.Short.class || fieldType == short.class) {
          java.lang.Short shortValue = (java.lang.Short)fieldValue;
          if(shortValue == 0) {
            s = State.SHORT_EQ_ZERO;
          } else if (shortValue > 0) {
            s = State.SHORT_GT_ZERO;
          } else {
            s = State.SHORT_LT_ZERO;
          }
        } else if(fieldType == java.lang.Integer.class || fieldType == int.class) {
          java.lang.Integer intValue = (java.lang.Integer)fieldValue;
          if(intValue == 0) {
            s = State.INT_EQ_ZERO;
          } else if (intValue > 0) {
            s = State.INT_GT_ZERO;
          } else {
            s = State.INT_LT_ZERO;
          }
        } else if(fieldType == java.lang.Float.class || fieldType == float.class) {
          java.lang.Float floatValue = (java.lang.Float)fieldValue;
          if(floatValue == 0.0f) {
            s = State.FLOAT_EQ_ZERO;
          } else if (floatValue > 0.0f) {
            s = State.FLOAT_GT_ZERO;
          } else {
            s = State.FLOAT_LT_ZERO;
          }          
        } else if(fieldType == java.lang.Long.class || fieldType == long.class) {
          java.lang.Long longValue = (java.lang.Long)fieldValue;
          if(longValue == 0l) {
            s = State.LONG_EQ_ZERO;
          } else if (longValue > 0l) {
            s = State.LONG_GT_ZERO;
          } else {
            s = State.LONG_LT_ZERO;
          }
        } else if(fieldType == java.lang.Double.class || fieldType == double.class) {
          java.lang.Double doubleValue = (java.lang.Double)fieldValue;
          if(doubleValue == 0l) {
            s = State.DOUBLE_EQ_ZERO;
          } else if (doubleValue > 0l) {
            s = State.DOUBLE_GT_ZERO;
          } else {
            s = State.DOUBLE_LT_ZERO;
          }
        } else {
          throw new RuntimeException("Unexpected type: " + fieldType);
        }
      } else {
        //for object types
        if(fieldValue == null) {
          s = State.OBJ_NULL;
        } else {
          //if it is an array
          if(fieldType.isArray()) {
            if(Array.getLength(fieldValue) == 0) {
              s = State.ARRAY_EMPTY;
            } else {
              s = State.ARRAY_NOT_EMPTY;
            }
          } else if (fieldValue instanceof java.util.Collection<?>) {
            boolean isEmpty = ((java.util.Collection<?>)fieldValue).isEmpty();
            if(!isEmpty) {
              s = State.COLLECTION_NOT_EMPTY;
            } else {
              s = State.COLLECTION_EMPTY;
            }
          } else {
            s = State.OBJ_NOT_NULL;
          }
        }
      }
      //assign the states
      extracts[i] = s;
    }
    
    return extracts;
  }
  
  private Field[] getNonStaticNonFinalFields(Class<?> c) {
    List<Field> list = new ArrayList<Field>();
    Field[] allFields = c.getDeclaredFields();
    for(Field field : allFields) {
      if(!(Modifier.isFinal(field.getModifiers()) || Modifier.isStatic(field.getModifiers()))) {
        list.add(field);
      }
    }
    return (Field[])list.toArray(new Field[0]);
  }
}
