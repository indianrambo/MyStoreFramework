package com.mystore.utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ReadConfig {
	Properties properties;
	
	String path = "C:\\Users\\DELL\\eclipse-workspace\\MyStore\\configuration\\config.properties";
	 public ReadConfig()
	 {
		 try
		 {
			 properties = new Properties();
			 FileInputStream fis = new FileInputStream(path);
			 properties.load(fis);
			 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	 public String getBaseURL()
	 {
		 String value = properties.getProperty("baseURL");
		 if(value!=null)
			 return value;
		 else 
			 throw new RuntimeException("url not found");
	 }
	 public String getBrowser()
	 {
		 String value = properties.getProperty("browser");
		 if(value!=null)
			 return value;
		 else 
			 throw new RuntimeException("browser not found");
	 }

}
