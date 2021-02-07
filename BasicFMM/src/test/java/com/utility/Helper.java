package com.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	
public static String captureScreenShot(WebDriver driver) 
	
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenShotPath=System.getProperty("user.dir")+"./ScreenShots/ProjectImage "+getTime()+".png";
		
		try {
		//	FileHandler.copy(src, new File("./ScreenShots/image.png"));
		FileHandler.copy(src, new File(screenShotPath));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return screenShotPath;
	
	}
	public static String getCurrDateTime()
	{
		DateFormat DFormat=new SimpleDateFormat("DD_MM_YYYY_HH_MM_SS");
		
		Date CDate =new Date();
		
		return DFormat.format(CDate);
	}
	
	
	public static String getDate() 
	{
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		return dateFormat.format(date);
	}
	

	/*	To get the Current Time */
	public static String getTime() 
	{
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("kk.mm");
		return dateFormat.format(date);
	}
}
