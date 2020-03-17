package com.teatautomation.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyReader {
	
	static String path = "F:\\Study_Material\\GIT\\an_repo\\Selenium_automation\\src\\main\\resources\\automation.properties";
	static Properties prop = new Properties();
	
	public static void main(String args[])
	{
		System.out.println(readPropertiesFile("browser"));
		writePropertiesFile("browser", "Ann");
	}
	
	
	public static String readPropertiesFile(String key)
	{
		try {
			FileInputStream inpstr = new FileInputStream(path);
			prop.load(inpstr);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return prop.get(key).toString();
	}
	
	public static void writePropertiesFile(String key, String value)
	{
		try {
			FileOutputStream output = new FileOutputStream(path);
			prop.setProperty(key, value);
			prop.store(output, "new property added");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
