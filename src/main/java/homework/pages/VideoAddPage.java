package homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VideoAddPage extends BasePage {
	
	@FindBy(id = "wpWikiaVideoAddUrl")
	public WebElement videoUrlTextBox;
	
	@FindBy(css = "#mw-content-text > form > div > input[type='submit']")
	public WebElement addButton;
	
	@FindBy(css = "body > div.WikiaSiteWrapper > div.global-notification.confirm > div")
	public WebElement flashMessageDiv;
	
	@FindBy(css = "body > div.WikiaSiteWrapper > div.global-notification.confirm > div > a")
	public WebElement flashMessageLink;
	
	@FindBy(css = "#WikiaPageHeader > h1")
	public WebElement videoHeader;
	
	public VideoAddPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void sumbitVideo(String videoUrl) {
		videoUrlTextBox.sendKeys(videoUrl);
		addButton.click();
	}
	
	public boolean isFileNameInUrl(String fileName) {
		String fileNameNoSpace = fileName.replace(" ", "_");
		String url = driver.getCurrentUrl();
		if (url.contains(fileNameNoSpace))
			return true;
		return false;
	}
}