package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectFlipkartAllPages extends BaseClass{
	public PageObjectFlipkartAllPages() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement close;
	@FindBy(xpath="//input[@name='q']")
	private WebElement search;
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	private WebElement button;	
	
	public WebElement getClose() {
		return close;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getButton() {
		return button;
	}
	
}
