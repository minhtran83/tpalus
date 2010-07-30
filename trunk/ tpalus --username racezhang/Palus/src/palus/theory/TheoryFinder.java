// Copyright 2010 Google Inc. All Rights Reserved.

package palus.theory;

import palus.PalusUtil;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class TheoryFinder {
  private final List<Class<?>> classList;
  
  public TheoryFinder(List<Class<?>> classList) {
    PalusUtil.checkNull(classList);
    this.classList = classList;
  }
  
  public Method[] getAllThoeryMethods() {
    
    //classList.getClass().get
    
    return null;
  }
}
