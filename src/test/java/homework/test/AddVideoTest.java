package homework.test;

import homework.pages.HomePage;
import homework.pages.VideoAddPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddVideoTest extends BaseTest{
	private HomePage homePage;
	private VideoAddPage videoAddPage;
	
	@Test
	public void uploadConfirmed() {
		homePage = new HomePage(driver);
		String userName = "nostag";
		String password = "wikia1234";
		homePage.login(userName, password);
		
		videoAddPage = homePage.clickAddVideo();
		videoAddPage.sumbitVideo("http://www.youtube.com/watch?v=h9tRIZyTXTI");
		String fileName = videoAddPage.flashMessageLink.getText();
		videoAddPage.flashMessageLink.click();
		Assert.assertEquals(true, videoAddPage.isFileNameInUrl(fileName));
	}
}
