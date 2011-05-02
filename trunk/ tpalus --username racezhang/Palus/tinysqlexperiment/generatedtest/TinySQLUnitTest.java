package generatedtest;
import junit.framework.*;
import junit.textui.*;

public class TinySQLUnitTest extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public TinySQLUnitTest(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(TinySQLUnitTest0.class));
//    result.addTest(new TestSuite(TinySQLUnitTest1.class));
//    result.addTest(new TestSuite(TinySQLUnitTest2.class));
//    result.addTest(new TestSuite(TinySQLUnitTest3.class));
    return result;
  }

}
