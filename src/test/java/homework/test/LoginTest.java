package homework.test;

import homework.pages.HomePage;

import org.openqa.selenium.support.PageFactory;
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
		homePage = PageFactory.initElements(driver, HomePage.class);
	}

	@Test
	public void loggedInUsernameShown() {
		String userName = "nostag";
		String password = "wikia1234";
		
		homePage.login(userName, password);
		Assert.assertEquals(homePage.loginLink.getText().toLowerCase(), userName);
	}
	
	@AfterTest
	public void afterTest() {
		super.afterTest();
	}
}
