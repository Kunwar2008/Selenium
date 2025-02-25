package SELENIUM_PRACTICE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class LogIn_PageFactory {

	
	
	WebDriver driver;
	
	
	LogIn_PageFactory(WebDriver driver)
	{
		
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='user-name']") 
	WebElement username;
	
	
	@FindBy(xpath="//input[@id='password']") 
	
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']") 
	WebElement submit;
	
	@FindBy(xpath="//*[@id=\'add-to-cart-sauce-labs-fleece-jacket\']") 
	WebElement AddToCart;
	
	@FindBy(xpath="//a[@data-test='shopping-cart-link']") 
	WebElement ViewCart;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement Checkout;


	public void setUserName(String user) {
		
		
		username.sendKeys(user);
		
	}
	
	
	public void setPassword(String pwd)
	
	{
	
		password.sendKeys(pwd);			

	}
	

	public void click_button() {
		
		submit.click();
		
	}
	
	public void click_AddToCart() {
		
		
		AddToCart.click();
	}
	public void click_ViewCart() {
		
		ViewCart.click();
	}
	
	public void click_Checkout() {
		
		Checkout.click();
	}
	
	
	
}







