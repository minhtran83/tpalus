package generatedtest;
import junit.framework.*;
import junit.textui.*;

public class SAT4JUnitTest extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public SAT4JUnitTest(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(SAT4JUnitTest0.class));
    result.addTest(new TestSuite(SAT4JUnitTest1.class));
    return result;
  }

}
