package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.forProducts;

public class steps extends BaseClass {
	private static final Logger logger = LoggerFactory.getLogger(steps.class);

	@Given("Open the browser and enter the URL as {string}")
	public void open_the_browser_and_enter_the_url_as(String url) {
		logger.info("Opening browser and navigating to URL: {}", url);
		driver = new ChromeDriver();
		lo = new LoginPage(driver);
		fp = new forProducts(driver);
		driver.manage().window().maximize();
		driver.get(url);
	}

	@When("Enter the username as {string}")
	public void enterUsername(String username) {
		logger.info("user name is entered as : {}", username);
		lo.usernametextfield(username);
	}

	@When("Enter the password as {string}")
	public void enterpassword(String password) {

		lo.passwordtextfield(password);
	}

	@When("Click on Login button")
	public void clickOnLoginButton() {

		lo.loginbuttonclick();
	}

	@Then("Expected value is {string}")
	public void verification(String value) throws Throwable {

		String actualvalue = driver.findElement(By.xpath("//div[contains(text(),'" + value + "')]")).getText();

		String expectedvalue = value;
		Thread.sleep(5000);
		Assert.assertEquals(expectedvalue, actualvalue);

	}

	@Then("Expected title is {string}")
	public void verification1(String value) {

		String actualvalue = driver.getTitle();

		String expectedvalue = value;

		Assert.assertEquals(expectedvalue, actualvalue);

	}

	@When("Click on Add to cart button")
	public void addcart() {
		fp.addcart();
	}

	@When("Click on Cart button")
	public void cart() {
		fp.cart();
	}

	@And("Close the browser")
	public void closethebrowser() {

		driver.close();
	}

	@After
	public void tearDown() throws Throwable {
		Thread.sleep(10000);
		if (driver != null) {
			driver.quit();
		}
	}

}
