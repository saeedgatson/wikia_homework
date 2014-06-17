package homework.test;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
  public String baseURL = "http://testhomework.wikia.com/";
  public WebDriver driver = new FirefoxDriver();
  
  @BeforeTest
  public void beforeTest() {
	  driver.get(baseURL);
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}