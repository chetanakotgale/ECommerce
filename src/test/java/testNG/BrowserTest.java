package testNG;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.TestNG;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.BrowserReaderFromProperties;
import config.DriverFactory;

public class BrowserTest{
	
	
	WebDriver driver = null;
	private static Logger log = LogManager.getLogger(BrowserTest.class);
	
	@BeforeTest
	public void setUp() throws IOException
	{
		driver = DriverFactory.getDriver();
	}
	
	@Test
	public void bookingSearch() throws IOException
	{
		driver.get(BrowserReaderFromProperties.getUrl());
		driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[6]/a")).click();
	}
	
	@AfterTest
	public void tearDownTest 
	{
		driver.close();
	}
}