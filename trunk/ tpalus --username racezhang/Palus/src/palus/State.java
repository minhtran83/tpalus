// Copyright 2010 Google Inc. All Rights Reserved.

package palus;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public enum State {

  //the init state of every field
  INIT,
  
  //for primitive types
  BOOLEAN_TRUE, BOOLEAN_FALSE,
  CHAR_ZERO, CHAR_NON_ZERO,
  BYTE_ZERO, BYTE_NON_ZERO,
  SHORT_EQ_ZERO, SHORT_GT_ZERO, SHORT_LT_ZERO,
  INT_EQ_ZERO, INT_GT_ZERO, INT_LT_ZERO,
  FLOAT_EQ_ZERO, FLOAT_GT_ZERO, FLOAT_LT_ZERO,
  LONG_EQ_ZERO, LONG_GT_ZERO, LONG_LT_ZERO,
  DOUBLE_EQ_ZERO, DOUBLE_GT_ZERO, DOUBLE_LT_ZERO,
  
  //for object types
  OBJ_NULL, OBJ_NOT_NULL,
  /*ARRAY_NULL,*/ ARRAY_EMPTY, ARRAY_NOT_EMPTY,
  /*COLLECTION_NULL,*/ COLLECTION_NOT_EMPTY, COLLECTION_EMPTY,
}
