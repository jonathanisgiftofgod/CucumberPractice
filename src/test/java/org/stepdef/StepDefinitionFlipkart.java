package org.stepdef;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.BaseClass;
import pageObjectModel.PageObjectFlipkartAllPages;

public class StepDefinitionFlipkart extends BaseClass {
	PageObjectFlipkartAllPages p;
	
@Given("click the mobile webelement")
public void click_the_mobile_webelement() throws InterruptedException, AWTException {
	p = new PageObjectFlipkartAllPages();
	launchUrl("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(3000);
	robotAction();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mi mobiles");
} 

@When("click the microphone")
public void click_the_microphone() {
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
}

@When("select the Rs{int}\\/- minimum price")
public void select_the_Rs_minimum_price(Integer int1) {
   WebElement min = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]"));
   Select s = new Select(min);
   s.selectByValue("4000");
   WebElement max = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"));
   Select s1 = new Select(max);
   s1.selectByValue("20000");  
}

@When("scroll down the page till the next page")
public void scroll_down_the_page_till_the_next_page() throws InterruptedException {
	WebElement pagination = driver.findElement(By.xpath("//nav[@class='yFHi8N']"));
   JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("arguments[0].scrollIntoView(true)", pagination);
   List<WebElement> pageList = driver.findElements(By.xpath("//nav[@class='yFHi8N']/a"));
	List<Integer> li = new ArrayList<Integer>();
	for (int i = 0; i < pageList.size(); i++) {
		boolean paginationStatus = driver.findElement(By.xpath("//span[text()='Next']")).isEnabled();
		if (paginationStatus) {
			pagination.click();
		}
		pageList.get(i).click();
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for (int j = 0; j < prices.size(); j++) {
			Thread.sleep(2000);
			String price = prices.get(j).getText();
			char[] c = price.toCharArray();
			String cost = "";
			for (int k = 0; k < c.length; k++) {
				if (c[k]>=32 && c[k]<=47) {
					
				} else {
					cost = cost + c[k];
				}
			}
			System.out.println(cost);
		}
	} 
}

@When("select the price the of product")
public void select_the_price_the_of_product() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("I validate the outcomes")
public void i_validate_the_outcomes() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}


}
