package com.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.utility.BrowserCollection;
import com.utility.ConfigFileReader;
import com.utility.Helper;

public class BaseClass {

	public WebDriver driver;
	public ConfigFileReader config;

	// Added here for reports
	public ExtentReports report;
	public ExtentTest logger;

	@BeforeSuite

	public void startSuite() throws IOException {
		config = new ConfigFileReader();
		
		System.out.println("Report staritng ");
		String Rpath = System.getProperty("user.dir") + "/Reports/AppReports" + Helper.getTime() + ".html";
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(Rpath));
		report = new ExtentReports();
		report.attachReporter(extent);

	}

	@Parameters ({"browser","url"})
	@BeforeClass

	public void setup( String browser, String url) {
		
		driver = BrowserCollection.StartApp(driver, browser , url);
	//	driver = BrowserCollection.StartApp(driver, config.getBrowser(), config.getUrl());
	}

	@AfterMethod

	public void captureScreen(ITestResult result) throws IOException {

		/*
		 * if(result.getStatus()==ITestResult.SUCCESS) {
		 * Helper.captureScreenShot(driver); }
		 */
		// Added code if Screen shot required in Report

		
		if (result.getStatus() == ITestResult.SUCCESS) {

			logger.pass("Login Done",
					MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenShot(driver)).build());
		} else if (result.getStatus() == ITestResult.FAILURE) {

			logger.pass("Login Failed",
					MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenShot(driver)).build());
		}

		report.flush();
	}

	@AfterClass
	public void teardown()

	{
		BrowserCollection.QuitBrowser(driver);

	}

}
