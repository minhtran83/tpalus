package generatedtest;
import junit.framework.*;
import junit.textui.*;

public class ApacheCollectionJUnitTest extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public ApacheCollectionJUnitTest(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(ApacheCollectionJUnitTest0.class));
    result.addTest(new TestSuite(ApacheCollectionJUnitTest1.class));
    return result;
  }

}
