package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.UpdateProfileObjects;

public class UpdateProfile {

	
	@Test
	public void updateProfile() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", 		
				"C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");
				
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.userName.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.submitButton.click();
		Thread.sleep(5000);
		PageFactory.initElements(driver, UpdateProfileObjects.class);
		UpdateProfileObjects.myprofile.click();
		
		UpdateProfileObjects.phoneNumber.sendKeys("1234567890");
		UpdateProfileObjects.city.sendKeys("Kings Landing");
		UpdateProfileObjects.submitButton.click();
		
	
		
	}
	
}
