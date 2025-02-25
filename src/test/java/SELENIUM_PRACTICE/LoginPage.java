package SELENIUM_PRACTICE;


import org.openqa.selenium.By;
import org.openqa.selenium.*;



public class LoginPage {
	
	
	WebDriver driver;
		
	LoginPage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	By username =By.xpath("//input[@id='user-name']");
	
	By password = By.xpath("//input[@id='password']");
	
	By submit = By.xpath("//input[@id='login-button']");
	By checkout = By.xpath("//button[@id='checkout']");
	
	
	
	By Assert = By.xpath("//span[contains(text(),'Products')]");
	
	
	
	
	
	By AddToCart= By.xpath("//*[@id=\'add-to-cart-sauce-labs-fleece-jacket\']");
	
	By ViewCart= By.xpath("//a[@data-test='shopping-cart-link']");
	
	
	
	
	public void setUserName(String user) {
		
		
		driver.findElement(username).sendKeys(user);
		
	}
	
	public void setPassword(String pwd)
	
	{
	
		driver.findElement(password).sendKeys(pwd);			

	}
	
	public void click_button() {
		
		driver.findElement(submit).click();
	}
	
	
	public void click_AddToCart() {
		
		
		driver.findElement(AddToCart).click();
	}
	
	public void click_ViewCart() {
		
		driver.findElement(ViewCart).click();
	}
	
	public void click_Checkout() {
		
		driver.findElement(checkout).click();
	}
}

