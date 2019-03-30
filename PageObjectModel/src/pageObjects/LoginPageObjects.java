package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
/*
	@FindBy(how=How.NAME,using="username")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath="//*[@id='loginfrm']/button")
	public static WebElement submit;*/
	
	
	
	/*public static WebElement userName(WebDriver driver){
		return driver.findElement(By.name("username"));
	}
	
	public static WebElement password(WebDriver driver){
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement loginButton(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='loginfrm']/button"));
	}
	*/
	
	
	
	@FindBy(name="username")
	public static WebElement userName;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath="//*[@id='loginfrm']/button")
	public static WebElement submitButton;
}
