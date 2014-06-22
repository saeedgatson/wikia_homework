package homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	@FindBy(name = "username")
	public WebElement userNameTextBox;
	
	@FindBy(name = "password")
	public WebElement passwordTextBox;
	
	@FindBy(css = "#AccountNavigation > li:nth-child(1) > a")
	public WebElement loginLink;
	
	@FindBy(css = "#UserLoginDropdown > form > fieldset > div.input-group.login-button > input")
	public WebElement loginSubmitButton;
	
	@FindBy(css = "#WikiHeader > div.buttons > nav")
	public WebElement contributeButton;
	
	@FindBy(linkText = "Add a Video")
	public WebElement addVideoLink;
	
	@FindBy(id = "UserLoginDropdown")
	public WebElement userLoginDiv;
	
	@FindBy(css = "#WikiHeader > div.buttons > nav > ul")
	public WebElement contributeUl;
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void login(String userName, String password) {
		hoverOver(loginLink);
		userNameTextBox.sendKeys(userName);
		passwordTextBox.sendKeys(password);
		loginSubmitButton.click();
	}
	
	public VideoAddPage clickAddVideo() {
		contributeButton.click();
		addVideoLink.click();
		return new VideoAddPage(driver);
	}
}
