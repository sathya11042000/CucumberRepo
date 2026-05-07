package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFun extends BaseClass {

	WebDriver driver;
	public static Pom p;

	@Given("User launches the browser")
	public void user_launches_the_browser() {

		// Launch Chrome browser
		driver = new ChromeDriver();

		// Maximize window
		driver.manage().window().maximize();
	}

	@Given("User navigates to {string}")
	public void user_navigates_to(String url) {

		// Open Instagram URL
		driver.get(url);
	}

	@Given("Instagram login page is displayed")
	public void instagram_login_page_is_displayed() {

		// Simple validation using title
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
	}

	@When("User enters valid username")
	public void user_enters_valid_username() {
		p = new Pom();
		WebElement e = p.getEmail();
		e.sendKeys("sathya123@gmail.com");

		driver.navigate().refresh();

		p.getEmail();
		e.sendKeys("sathya");

	}

	@When("User enters valid password")
	public void user_enters_valid_password() {
		WebElement e = p.getPassWord();
		e.sendKeys("sathya123");
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {

		// Locate login button and click
		WebElement loginBtn = p.getLogIn();
		loginBtn.click();

	}

	@Then("User should be navigated to homepage")
	public void user_should_be_navigated_to_homepage() {

		// Wait for page load (simple wait)
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}

		// Validate URL change
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentUrl);
	}

	@Then("User profile icon should be displayed")
	public void user_profile_icon_should_be_displayed() {

		// Check profile icon presence
		boolean isDisplayed = driver.findElement(By.xpath("//span[text()='close friends']")).isDisplayed();

		if (isDisplayed) {
			System.out.println("Login Successful - Profile icon displayed");
		} else {
			System.out.println("Login Failed");
		}

		// Close browser
		driver.quit();

	}
}
