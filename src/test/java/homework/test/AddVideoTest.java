package homework.test;

import homework.pages.HomePage;
import homework.pages.VideoAddPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AddVideoTest extends BaseTest{
	private HomePage homePage;
	private VideoAddPage videoAddPage;
	
	@Test
	public void uploadConfirmed() {
		videoAddPage = homePage.clickAddVideo();
		videoAddPage.sumbitVideo("http://www.youtube.com/watch?v=h9tRIZyTXTI");
		String fileName = videoAddPage.flashMessageLink.getText();
		videoAddPage.flashMessageLink.click();
		Assert.assertEquals(true, videoAddPage.isFileNameInUrl(fileName));
	}
	
	@BeforeMethod
	public void beforeMethod() {
		homePage = new HomePage(driver);
		
		String userName = "nostag";
		String password = "wikia1234";
		homePage.login(userName, password);
	}
	
	@AfterMethod
	public void afterMethod() {
		//logout
	}
	
	@BeforeTest
	public void beforeTest() {
		super.beforeTest();
	}
	
	@AfterTest
	public void afterTest() {
		super.afterTest();
	}
}
