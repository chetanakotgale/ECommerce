package user1;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utilities.BrowserReaderFromProperties;
import utilities.DriverFactory;
import utilities.ExtentReportUsingTestNG;

public class BrowserTest extends ExtentReportUsingTestNG {
	
	
	protected WebDriver driver = null;
	private static Logger log = LogManager.getLogger(BrowserTest.class);

	@BeforeSuite
	public void setUp() throws IOException
	{
		driver = DriverFactory.getDriver();
		log.info("Driver is set");
	}
	
	
	@Test
	public void bookingSearch() throws IOException
	{
		log.info("get URL");
		driver.get(BrowserReaderFromProperties.getUrl());
	}
	
	@AfterSuite
	public void tearDownTest()
	{
		driver.close();
		log.info("Driver is closed");
	}
}