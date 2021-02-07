package com.testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.BaseClass;
import com.pages.LoginPage;
import com.utility.BrowserCollection;
import com.utility.ExcelDataReader;

public class LoginDemoApp extends BaseClass {
	

	
	@Test
	
	public void loginApp()
	{
		logger=report.createTest("Login in Demo App");
		
		ExcelDataReader excel=new ExcelDataReader();
		LoginPage lgnpage= PageFactory.initElements(driver, LoginPage.class);
		lgnpage.logintoapplication(excel.getStringData("login", 0, 0), excel.getStringData("login", 0, 1));
		logger.pass(" Login done ");
		
	}
		
@Test(priority=1)
	
	public void loginAppAgain()
	{
		logger=report.createTest("Login in Demo App Again");
		
		
		logger.fail(" Login done Again priority=1 ");
		
	}
	
	
	@Test(priority=2)
	
	public void Demo()
	{
		logger=report.createTest("Demo");
		
	    
		logger.fail(" Demo Fail ");
		
		
		
	}
	
}
