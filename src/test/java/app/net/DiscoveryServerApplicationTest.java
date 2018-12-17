package app.net;

import org.testng.annotations.Test;

import app.net.utils.AppConstants;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * The Class DiscoveryServerApplicationTest.
 *
 * @author chirags
 */
@SpringBootTest
@ContextConfiguration(classes = DiscoveryServerApplication.class)
public class DiscoveryServerApplicationTest extends AbstractTestNGSpringContextTests {

  static {
    System.setProperty(AppConstants.SPRING_ACTIVE_PROFILE_PROPERTY_NAME, "DEV");
  }

  /**
   * Main.
   */
  @Test
  public void main() {
    String[] args = {"DEV"};
    DiscoveryServerApplication.main(args);
    assert (true);
  }

}
