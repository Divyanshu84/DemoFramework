package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	
	Properties prop;
	public ConfigFileReader() throws IOException
	{
		
		File src =new File ("C:\\Users\\User\\eclipse-workspace2\\BasicFMM\\src\\test\\java\\com\\config\\config.properties");
		
		FileInputStream fin = new FileInputStream(src);
		
		prop = new Properties();
		
		prop.load(fin);
	}

	public String getBrowser()
	{
		return prop.getProperty("Browser");
		
	}
	
	public String getUrl()
	{
		return prop.getProperty("Url");
	}
}
