package org.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {
	@Given("user must launch the facebook url")
	public static void user_must_launch_the_facebook_url() {
//		WebDriverManager.chromedriver().setup();
//		 driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
		browserLaunch("https://www.facebook.com/");
		

	}

	@When("user enters the correct username and correct password")
	public static void user_enters_the_correct_username_and_correct_password() {
//		driver.findElement(By.id("email")).sendKeys("viji");
//		driver.findElement(By.id("pass")).sendKeys("1234");
		FacebookHomePage a = new FacebookHomePage();
		enterText(a.getUsername(),"viji");
		enterText(a.getPassword(),"123456");
		

	}

	@And("user clicks on the login button")
	public static void user_clicks_on_the_login_button() {
//		driver.findElement(By.name("login")).click();
		FacebookHomePage b = new FacebookHomePage();
		buttonClick(b.getLogin());
	}

	@Then("user Validates url is navigated to Home Page")
	public static void user_Validates_url_is_navigated_to_Home_Page() {
		boolean contains = driver.getTitle().contains("Facebook");
		Assert.assertTrue(contains);
		System.out.println("Facebook Validation");
		System.out.println(contains);
	}


}
