/**
 * package declaration
 */
package app.net;

/**
 * import statements
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.context.config.annotation.EnableContextInstanceData;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.stagemonitor.core.Stagemonitor;

import app.net.utils.AppConstants;

/**
 * The Class DiscoveryServerApplication.
 *
 * @author chirags
 */
@EnableEurekaServer
@SpringBootApplication
@EnableContextInstanceData
// @EnableAsync
// @EnableHystrix
// @EnableHystrixDashboard
public class DiscoveryServerApplication {

  /** The Constant LOGGER. */
  private static final Logger LOGGER = LogManager.getLogger("logger");

  /**
   * The main method.
   *
   * @param args
   *          the arguments
   */
  public static void main(final String[] args) {

    String environment = AppConstants.DEFAULT_ENV;

    if (args.length > 0) {
      LOGGER.info("Environment based argument is :- " + args[0]);
      environment = args[0];
    }

    // Load environment based upon pass argument
    loadEnvironment(environment);
    Stagemonitor.init();
    SpringApplication.run(DiscoveryServerApplication.class, args);
  }

  /**
   * Load environment based upon Command line arguments.
   *
   * @param environment
   *          the environment
   */
  private static void loadEnvironment(final String environment) {
    LOGGER.info("Current Environment is :- " + environment);
    System.setProperty(AppConstants.SPRING_ACTIVE_PROFILE_PROPERTY_NAME, environment.toUpperCase());
  }

}
