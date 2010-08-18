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
  
  //private static final long serialVersionUID = 961812625417279099L;
  
  private final Class<?> clz;
  
  //it could not be final
  private transient /*final*/ Field[] fields; //field could not be serialized
  private final State[] states;
  
  private final String[] serializableFields;
  
  private boolean isNullValue = false;
  
  public boolean isPrimtiveOrString = false;
  public Object valueOfPrimitiveOrString = null;
  
  public AbstractState(Object obj, Class<?> type) {
    this(obj, type, false);
  }
  
  /** init indicates whether the object is before creation */
  public AbstractState(Object obj, Class<?> type, boolean init) {
    PalusUtil.checkNull(type);
    
    //check for null
    if(obj == null) {
      this.isNullValue = true;
      this.clz = type; //static type
      fields = new Field[0];
      serializableFields = new String[0];
      states = new State[0];
      return;
    }
    
    this.clz = obj.getClass(); //runtime type
    
    if(!PalusUtil.isPrimitive(type) && !type.isPrimitive() && !type.isArray()) {
        PalusUtil.checkTrue(type.isAssignableFrom(this.clz));
    } else if (type.isArray()) {
        PalusUtil.checkTrue(PalusUtil.isTwoArrayCompatible(type, this.clz));
    }
    
    //for non-null object
    if(this.clz.isPrimitive() || PalusUtil.isPrimitive(this.clz)
        || this.clz == java.lang.String.class ) {
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
      this.saveFieldStates(); //for serialization purpose
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
  
  /**
   * Call this before perform serialization
   * */
  private void saveFieldStates() {
    for(int i = 0; i < this.fields.length; i++) {
      this.serializableFields[i] = this.fields[i].toGenericString();
      //System.out.println("save field: " + this.serializableFields[i]);
      PalusUtil.checkNull(this.serializableFields[i]);
    }
  }
  
  /**
   * Call this after recovering from  serialization
   * */
  private void recoverFieldStates() {
    PalusUtil.checkNull(this.clz);
    Field[] declaredFields = this.clz.getDeclaredFields();
    this.fields = new Field[this.serializableFields.length];
    
    //System.out.println("length: " + this.serializableFields.length);
    
    for(int i = 0; i < this.serializableFields.length; i++) {
      String signature = this.serializableFields[i];
      Field field = null;
      for(Field f : declaredFields) {
        if(f.toGenericString().equals(signature)) {
          field = f;
          break;
        }
      }
      //xxx
      //System.out.println("Field name: null? " + (serializableFields[i] == null) + ", cls: " + this.clz);
      PalusUtil.checkNull(field);
      this.fields[i] = field;
    }
  }
  
  public Class<?> getStateClass() {
    return clz;
  }
  
  public Field[] getStateFields() {
    this.checkAndRecover();
    return fields;
  }
  
  public State[] getStates() {
    return states;
  }
  
  public int getStateSize() {
    return this.states.length;
  }
  
  @Override
  public int hashCode() {
    int stateCode = 0;
    for(int i = 0; i < this.states.length; i++) {
      stateCode += i * this.states[i].hashCode() + 17;
    }
    return 133 * (this.isNullValue ? 3 : 1) + 15* this.clz.hashCode() + stateCode;
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
    
    if(state.isPrimtiveOrString == this.isPrimtiveOrString) {
      if(state.valueOfPrimitiveOrString != null &&
          this.valueOfPrimitiveOrString != null) {
        return state.valueOfPrimitiveOrString.equals(this.valueOfPrimitiveOrString);
      }
    }
    
    if(state.isNullValue != this.isNullValue) {
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
    this.checkAndRecover();
    
    PalusUtil.checkTrue(this.fields.length == this.states.length);
    
    boolean debug = false;
    
    if(this.isNullValue) {
      return "Null@" + this.clz.getName();
    }
    
    if(this.isPrimtiveOrString) {
      PalusUtil.checkTrue(this.valueOfPrimitiveOrString != null);
      return this.valueOfPrimitiveOrString.toString() + "@" + this.clz.getName();
    }
    
    StringBuffer sb = new StringBuffer();
    
    sb.append("{");
    for(int i = 0; i < this.states.length; i++) {
      if(i > 0 ) {
        sb.append("  ");
      }
      String fieldName = this.fields == null? "NULL_FIELD_FROM_DESERI" : this.fields[i].getName();
      sb.append(fieldName + ":" + this.states[i].toString());
    }
    sb.append("}");
    sb.append("@");
    sb.append(this.clz.getName());
    
    //append some debugging information
    if(debug) {
      sb.append("\n    ");
      for(int i = 0; i < serializableFields.length; i++) {
        if(i > 0) {
           sb.append(", ");
        }
        sb.append(this.serializableFields[i]);
      }
      sb.append("\n");
    }
    
    
    return sb.toString();
  }
  
  private void checkAndRecover() {
    if(this.fields == null) {
      this.recoverFieldStates();
    }
  }
  
  //convert the state to abstract domain
  private State[] extractStates(Field[] fields, Object obj) {
    
    State[] extracts = new State[fields.length];
    for(int i = 0; i < fields.length; i++) {
      State s = State.INIT;
      //convert the value to abstract state
      Field field = fields[i];
      Class<?> fieldType = field.getType();
      //get the object value
      field.setAccessible(true);
      Object fieldValue = null;
      //XXX be aware here
      try {
        fieldValue = field.get(obj);
      } catch (IllegalArgumentException e) {
         throw new RuntimeException(e);
      } catch (IllegalAccessException e) {
         throw new RuntimeException(e);
      }
      
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
