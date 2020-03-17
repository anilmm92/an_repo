package com.testautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.teatautomation.utils.PropertyReader;

public class PageBase {

	WebDriver driver;

	public void clickElement(By by, WebDriver drv){
		drv.findElement(by).click();
	}
	
}
