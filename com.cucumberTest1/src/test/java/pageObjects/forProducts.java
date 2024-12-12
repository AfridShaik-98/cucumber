package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forProducts {

	WebDriver driver;

	public forProducts(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class=\"btn_primary btn_inventory\"]")
	WebElement addcart;

	@FindBy(xpath = "//div[@id='shopping_cart_container']")
	WebElement cart;

	// Actions method

	public void addcart() {
		addcart.click();
	}

	public void cart() {
		cart.click();
	}
}
