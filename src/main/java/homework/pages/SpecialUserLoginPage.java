package homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecialUserLoginPage extends BasePage{
	
	@FindBy(name = "username")
	public WebElement userNameTextBox;
	
	@FindBy(name = "password")
	public WebElement passwordTextBox;
	
	@FindBy(name = "keeploggedin")
	public WebElement keepLoggedInCheckbox;
	
	@FindBy(css = ".WikiaArticle > .input-group.login-button.big > input")
	public WebElement loginButton;
	
	@FindBy(css = ".WikiaArticle > .input-group.error.required > div")
	public WebElement userNameErrorDiv;
	
	@FindBy(css = ".WikiaArticle > .input-group.password-input.error.required > div")
	public WebElement passwordErrorDiv;
	
	public SpecialUserLoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void login(String userName, String password) {
		userNameTextBox.sendKeys(userName);
		passwordTextBox.sendKeys(password);
		loginButton.click();
	}
}
