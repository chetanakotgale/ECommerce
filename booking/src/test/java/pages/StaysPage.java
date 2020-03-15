package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import user1.BrowserTest;
import user1.StaysPageTest;
public class StaysPage extends BrowserTest{
	
	WebElement element;
	

	private static Logger log = LogManager.getLogger(StaysPageTest.class);
	
	By search = By.id("//input[@name=\"ss\"]");
	By CheckIn = By.id("//div[@class=\"xp__dates-inner xp__dates__checkin\"]");
	By CheckOut = By.id("//div[@class=\"xp__dates-inner xp__dates__checkout\"]");
	By Adults = By.id("//span[@class=\"xp__guests__count\"]/span[1]");
	By Children = By.id("//span[@class=\"xp__guests__count\"]/span[2]");
	By Room = By.id("//span[@class=\"xp__guests__count\"]/span[3]");

	

//	public void searchBar(String place,String checkInDate,String CheckOutDate,String adult,String children,String room) 
//	{
//		page = new StaysPage(driver);
//		page.setText(place);
//		element.findElement(search).sendKeys(place);
//		element.findElement(Integer.parseInt(CheckIn).sendKeys(checkInDate);
//		element.findElement(CheckOut).sendKeys(CheckOutDate);
//		element.findElement(Adults).sendKeys(adult);
//		element.findElement(Children).sendKeys(children);
//		element.findElement(Room).sendKeys(room);
//	}

	public void setText(String text)
	{
		System.out.println(text);
		element = driver.findElement(search);
		element.sendKeys(text);

	}
	
	public void setCheckInDate(int checkInDate)
	{
		element = driver.findElement(CheckIn);
		element.click();
		
	}
	
	public void setCheckOutDate(int checkOutDate)
	{
		element = driver.findElement(CheckOut);
		element.click();
		
	}
	
	public void setNumberOfAdult(int AdultNumber)
	{
		element = driver.findElement(Adults);
		element.click();
		
	}
	
	public void setNumberOfChildren(int ChildrenNumber)
	{
		element = driver.findElement(Children);
		element.click();
		
	}
	
	public void setNumberOfRooms(int Rooms)
	{
		element = driver.findElement(Room);
		element.click();
		
	}
}

//driver = DriverFactory.getDriver();
//log.info("Driver is set");
//log.info("Browser is opened in Stays Page");
//driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[4]/a/div")).click();
//log.info("Click Action on is performed");
//driver.findElement(
//		By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/div/div/div/form/div[1]/div/div/div/input"))
//		.sendKeys(ExcelUtils.getUserNameForRegister());
//driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/div/div/div/form/button")).click();
//
//driver.close();
//log.info("Driver is closed");
