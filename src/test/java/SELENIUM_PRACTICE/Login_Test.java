package SELENIUM_PRACTICE;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Login_Test {

	WebDriver driver;
	
	@BeforeClass
	void setup() {
		
		
		driver= new ChromeDriver();
			
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		LoginPage lp=new LoginPage(driver);
		
		
	}

	
	
	@Test
	void testlogin() {
	
		
		LogIn_PageFactory lp=new LogIn_PageFactory(driver);
		
		lp.setUserName("standard_user");
		lp.setPassword("secret_sauce");
		lp.click_button();
		
		lp.click_AddToCart();
		lp.click_ViewCart();
		lp.click_Checkout();
		
			
		//AssertJUnit.assertEquals(driver.getTitle(),"Swag Labs");
	
		
		
	}

/*	@Test
	
	void AddCart() {
		
		
		
		LoginPage lp=new LoginPage(driver);
		
		
		
		
		lp.click_AddToCart();
		
		
	}
	
	@Test
	
	void ViewCart() {
		
		
		LoginPage lp=new LoginPage(driver);
		lp.click_ViewCart();
		
		
	}
	
	@Test
	void CheckOut() {
		LoginPage lp=new LoginPage(driver);
		lp.click_Checkout();	
		
		
	}
*/

}