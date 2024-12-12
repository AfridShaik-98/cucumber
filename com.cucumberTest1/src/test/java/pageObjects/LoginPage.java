package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	WebElement usernamefield;

	@FindBy(id = "password")
	WebElement passwordfield;

	@FindBy(id = "login-button")
	WebElement loginbutton;

	public void usernametextfield(String value) {
		usernamefield.sendKeys(value);
	}

	public void passwordtextfield(String value) {
		passwordfield.sendKeys(value);
	}

	public void loginbuttonclick() {
		loginbutton.click();
	}
}
