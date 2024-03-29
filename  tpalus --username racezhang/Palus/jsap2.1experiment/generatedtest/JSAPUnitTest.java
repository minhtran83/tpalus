package generatedtest;
import junit.framework.*;
import junit.textui.*;

public class JSAPUnitTest extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public JSAPUnitTest(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(JSAPUnitTest0.class));
    result.addTest(new TestSuite(JSAPUnitTest1.class));
    result.addTest(new TestSuite(JSAPUnitTest2.class));
    result.addTest(new TestSuite(JSAPUnitTest3.class));
    return result;
  }

}
