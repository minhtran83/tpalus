// Copyright 2010 Google Inc. All Rights Reserved.

package palus.theory;

import java.util.Arrays;

import palus.PalusUtil;
import randoop.Check;
import randoop.ObjectContract;
import randoop.ObjectContractUtils;
import randoop.Variable;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class TheoryCheck implements Check {
  
  //The contract for checking the property
  public final TheoryContract contract;
  
  //variables involving into the theory checking
  public final Variable[] vars;

  /**
   * Constructor. Initialize all final fields
   * */
  public TheoryCheck(ObjectContract contract, Variable... vars) {
    PalusUtil.checkNull(contract);
    PalusUtil.checkNull(vars);
    PalusUtil.checkTrue(contract instanceof TheoryContract);
    PalusUtil.checkTrue(contract.getArity() == vars.length);
    
    this.contract = (TheoryContract)contract;
    this.vars = new Variable[vars.length];
    for(int i = 0; i < vars.length; i++) {
      this.vars[i] = vars[i];
    }
  }
  /**
   * Returns a unique name for this check
   * */
  @Override
  public String get_value() {
    return contract.toCodeString();
  }

  /**
   * Replace all xi to be the real variable names
   * */
  @Override
  public String toCodeStringPostStatement() {
    return ObjectContractUtils.localizeContractCode(contract.toCodeString(), vars);
  }

  /**
   * Empty on purpose
   * */
  @Override
  public String toCodeStringPreStatement() {
    return "";
  }

  @Override
  public boolean equals(Object o) {
    if( o == null) {
      return false;
    }
    if( o == this) {
      return true;
    }
    if( !(o instanceof TheoryCheck)) {
      return false;
    }
    TheoryCheck other = (TheoryCheck)o;
    return contract.equals(other.contract) && Arrays.equals(vars, other.vars);
  }
  
  @Override
  public int hashCode() {
    int b = 23;
    b = b * 7 + this.contract.hashCode();
    b = b * 15 + Arrays.hashCode(this.vars);
    return b;
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("<");
    sb.append(contract.getClass().getName());
    sb.append("  " + this.vars.toString() + "  ");
    return sb.toString();
  }
}
