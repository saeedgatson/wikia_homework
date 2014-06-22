package homework.test;

import homework.pages.HomePage;
import homework.pages.SpecialUserLoginPage;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends BaseTest {
	private HomePage homePage;
	
	@BeforeTest
	public void beforeTest() {
		super.beforeTest();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		homePage = new HomePage(driver);
	}

	@Test
	public void loggedInUsernameShown() {
		String userName = "nostag";
		String password = "wikia1234";
		
		homePage.login(userName, password);
		Assert.assertEquals(homePage.loginLink.getText().toLowerCase(), userName);
	}
	
	@Test
	public void errorWhenInvalideUserNameGiven() {
		String userName = "nostagFail";
		String password = "wikia1234";
		
		homePage.login(userName, password);
		SpecialUserLoginPage specialUserLoginPage = new SpecialUserLoginPage(driver);
		
		String errorMessage = "Hm, we don't recognize this name. Don't forget usernames are case sensitive.";
		Assert.assertEquals(specialUserLoginPage.userNameErrorDiv.getText(), errorMessage);
	}
	
	@AfterTest
	public void afterTest() {
		super.afterTest();
	}
}
