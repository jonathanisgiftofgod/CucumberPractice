package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefinitionClass {
	WebDriver driver;
@Given("User should open the facebook webpage application")
public void user_should_open_the_facebook_webpage_application() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}

@When("User should give correct UserId and password")
public void user_should_give_correct_UserId_and_password() {
  driver.findElement(By.id("email")).sendKeys("britto");
  driver.findElement(By.id("pass")).sendKeys("joseph");
}

@And("User should click the login button")
public void user_should_click_the_login_button() {
  driver.findElement(By.xpath("//button[@value='1']")).click();
}

@Then("User verify the facebook home webpage")
public void user_verify_the_facebook_home_webpage() {
  System.out.println("All the best");
}


}
