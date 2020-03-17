package com.testautomation.tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.teatautomation.utils.PropertyReader;

public class TestNGTest1 {
	
	WebDriver driver;
	
	PageBase pg;
	
	@BeforeTest
	public void setupApplication()
	{
		System.setProperty("webdriver.chrome.driver", PropertyReader.readPropertiesFile("chromedriver"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(PropertyReader.readPropertiesFile("baseurl"));
		Reporter.log("++++++++++++Browser session initiated+++++++++++++++++",true);
	}
	
	@AfterTest
	public void closeBrowser()
	{
		
		//driver.quit();
		Reporter.log("++++++++++++Browser session closed+++++++++++++++++",true);
	}
	
	public void firstTest() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id=\"navbar-brand-centered\"]//a[contains(text(),'Input Forms')]")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li//a[contains(text(),\"Simple Form Demo\")]")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id =\"user-message\"]")).sendKeys("Testing selenium");
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
	    System.out.println(driver.findElement(By.xpath("//span[@id='display']")).getText());
	    String txt =driver.findElement(By.xpath("//span[@id='display']")).getText();
	    Assert.assertEquals(txt, "Testing selenium");
	    
	}
	
	@Test
	public void testSecond() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id=\"navbar-brand-centered\"]//a[contains(text(),'Input Forms')]")).click();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li//a[contains(text(),\"Simple Form Demo\")]")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li//a[contains(text(),\"Checkbox Demo\")]")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id = \"isAgeSelected\"]")).click();
		String Actual = "Success - Check box is checked";
		String Expected =  driver.findElement(By.xpath("//div[@id = \"txtAge\"]")).getText();
		System.out.println(Expected);
		assertEquals(Expected, Actual);
	}

}
