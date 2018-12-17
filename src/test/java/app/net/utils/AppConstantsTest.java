package app.net.utils;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * The Class AppConstantsTest.
 *
 * @author chirags
 */
@SpringBootTest
public class AppConstantsTest extends AbstractTestNGSpringContextTests {

  /**
   * Test.
   */
  @Test
  public void test() {
    AppConstants.test();
    assert (true);
  }
}
