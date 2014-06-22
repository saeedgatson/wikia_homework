package homework.test;

import homework.pages.HomePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
  private HomePage homePage;
  
  @Test
  public void redirectedToHomeUrl() {
	  String expectedUrl = "http://testhomework.wikia.com/wiki/Test-homework_Wiki";
	  Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
  }
  
  @Test
  public void loginFormDisplayed() {
	  homePage = new HomePage(driver);
	  homePage.hoverOver(homePage.loginLink);
	  Assert.assertTrue(homePage.userLoginDiv.isDisplayed(), "User Login Div Isn't Displayed");
  }
  
  @Test
  public void clickContributeExpandsDropdown() {
	  homePage = new HomePage(driver);
	  homePage.contributeButton.click();
	  Assert.assertTrue(homePage.contributeButton.isDisplayed());
  }
  
  @Test
  public void correctTitleDisplayed() {
	  homePage = new HomePage(driver);
	  Assert.assertEquals(homePage.getTitle(), "Test-homework Wiki");
  }
}
