package test.drivers;

import org.openqa.selenium.WebDriver;

public class DriverManager {

      private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

      private DriverManager() {
      }

      public static WebDriver getDriver() {
            return driver.get();
      }

      public static void setDriver(WebDriver driver) {
            DriverManager.driver.set(driver);
      }

      public static void refreshCurrentPage() {
            driver.get().navigate().refresh();
      }
      public static void forwardCurrentPage() {
            driver.get().navigate().forward();
      }
      public static void backCurrentPage() {
            driver.get().navigate().back();
      }

      public static void quit() {
            DriverManager.driver.get().quit();
            driver.remove();
      }


}