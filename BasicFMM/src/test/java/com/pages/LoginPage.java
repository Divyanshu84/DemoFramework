package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	WebDriver driver;
	public void Loginpage(WebDriver driver)
	
	{
		this.driver=driver;
	}

	
	@FindBy (name="txtUsername") WebElement username;
	@FindBy (name="txtPassword") WebElement password;
	@FindBy (name="Submit")WebElement Loginbtn;
	
	
	public void logintoapplication(String UserName,String PassWord)
	
	{
		username.sendKeys(UserName);
		password.sendKeys(PassWord);
		Loginbtn.click();
	}
}
