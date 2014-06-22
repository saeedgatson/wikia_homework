package homework.test;

import homework.pages.HomePage;
import homework.pages.SpecialUserLoginPage;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends BaseTest {
	private HomePage homePage;

	@Test
	public void loggedInUsernameShown() {
		homePage = new HomePage(driver);
		String userName = "nostag";
		String password = "wikia1234";
		
		homePage.login(userName, password);
		Assert.assertEquals(homePage.loginLink.getText().toLowerCase(), userName);
	}
	
	@Test
	public void errorWhenInvalideUserNameGiven() {
		homePage = new HomePage(driver);
		String userName = "nostagFail";
		String password = "wikia1234";
		
		homePage.login(userName, password);
		SpecialUserLoginPage specialUserLoginPage = new SpecialUserLoginPage(driver);
		
		String errorMessage = "Hm, we don't recognize this name. Don't forget usernames are case sensitive.";
		Assert.assertEquals(specialUserLoginPage.userNameErrorDiv.getText(), errorMessage);
	}
	
	@Test
	public void errorWhenInvalidePasswordGiven() {
		homePage = new HomePage(driver);
		String userName = "nostag";
		String password = "wikia1234Fail";
		
		homePage.login(userName, password);
		SpecialUserLoginPage specialUserLoginPage = new SpecialUserLoginPage(driver);
		
		String errorMessage = "Oops, wrong password. Make sure caps lock is off and try again";
		Assert.assertEquals(specialUserLoginPage.passwordErrorDiv.getText(), errorMessage);
	}
}
