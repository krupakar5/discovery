package app.net.utils;

/**
 * The Class AppConstants.
 *
 * @author chirags
 */
public final class AppConstants {

  /** The Constant LOCAL_PROFILE_NAME. */
  public static final String DEFAULT_ENV = "DEV";

  /** The spring active profile property name. */
  public static final String SPRING_ACTIVE_PROFILE_PROPERTY_NAME = "spring.profiles.active";

  /** The Constant ALIVE_MSG. */
  public static final String ALIVE_MSG = "ALIVE";

  /** The Constant HEALTH_CHECK_ENDPOINT. */
  public static final String HEALTH_CHECK_ENDPOINT = "/health";

  /**
   * Instantiates a new app constants.
   */
  private AppConstants() {
  }

  /**
   * Test.
   *
   * @return the app constants
   */
  public static AppConstants test() {
    return new AppConstants();
  }

}
