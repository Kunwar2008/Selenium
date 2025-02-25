package SELENIUM_PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	
	HomePage(WebDriver driver)
	
	
	{
		this.driver=driver;
		
		
	}
	
	
	By AddToCart= By.xpath("//*[@id=\'add-to-cart-sauce-labs-fleece-jacket\']");
	
	By ViewCart= By.xpath("//a[@data-test='shopping-cart-link']");
	
	
	public void click_AddToCart() {
		
		
		driver.findElement(AddToCart).click();
	}
	
	public void click_ViewCart() {
		
		driver.findElement(ViewCart).click();
	}
	
	
}
