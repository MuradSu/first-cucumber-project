package tesla;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageStepDefinitions {
	// this is a regular expression / regex that cucumber
	// uses to match a java method to a cucumber step

	WebDriver driver;

	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() {
		System.out.println("I am going to the www.tesla.com");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://tesla.com");
	}

	@When("^I click on Model S link$")
	public void i_click_on_Model_S_link() {
		System.out.println("Clicked on the Model S link");

		driver.findElement(By.linkText("MODEL S")).click();
	}

	@Then("^Model S home page should be displayed$")
	public void model_S_home_page_should_be_displayed() {
		System.out.println("Verifying the Model S home page");
		assertTrue(driver.getTitle().contains("model-s"));

	}

	@When("^I click on Roadster link$")
	public void i_click_on_Roadster_link() {
		driver.findElement(By.linkText("ROADSTER")).click();
	}

	@Then("^Roadster home page should be displayed$")
	public void roadster_home_page_should_be_displayed() {
		assertTrue(driver.getTitle().contains("model-s"));
	}
	
	
	@Then("^I close browser$")
	public void i_close_browser() {
	    driver.quit();
	}

	@When("^I click on Model (\\d+) link$")
	public void i_click_on_Model_link(int arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Model (\\d+) home page should be displayed$")
	public void model_home_page_should_be_displayed(int arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
