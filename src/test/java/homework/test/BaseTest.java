package homework.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
  public String baseURL = "http://testhomework.wikia.com/";
  public WebDriver driver = null;
  
  public void beforeTest() {
	  driver = getWebDriver();
	  driver.get(baseURL);
  }

  public void afterTest() {
	  driver.quit();
  }
  
  private WebDriver getWebDriver() {
	  if(System.getProperty("browser").equals("chrome")) {
          System.setProperty("webdriver.chrome.driver", "/pathto/my/chromedriver.ex");
          driver = new ChromeDriver();
      } else {
          driver = new FirefoxDriver();
      }
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      return driver;
  }
}