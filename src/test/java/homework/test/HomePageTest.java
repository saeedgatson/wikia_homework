package homework.test;

import homework.pages.HomePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HomePageTest extends BaseTest {
  private HomePage homePage;
  
  @BeforeTest
  public void beforeTest() {
	  super.beforeTest(); 
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  homePage = PageFactory.initElements(driver, HomePage.class);
  }
  
  @Test
  public void redirectedToHomeUrl() {
	  String expectedUrl = "http://testhomework.wikia.com/wiki/Test-homework_Wiki";
	  Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
  }
  
  @Test
  public void loginFormDisplayed() {
	  homePage.hoverOver(homePage.loginLink);
	  Assert.assertTrue(homePage.userLoginDiv.isDisplayed(), "User Login Div Isn't Displayed");
  }
  
  @Test
  public void clickContributeExpandsDropdown() {
	  homePage.contributeButton.click();
	  Assert.assertTrue(homePage.contributeButton.isDisplayed());
  }
  
  @Test
  public void correctTitleDisplayed() {
	  Assert.assertEquals(homePage.getTitle(), "Test-homework Wiki");
  }
  
  @AfterMethod
  public void afterMethod() {
  }

  @AfterTest
  public void afterTest() {
	  super.afterTest();
  }
}
