package user1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.StaysPage;
import utilities.ExcelUtils;

public class StaysPageTest extends BrowserTest {

	public StaysPageTest() {
		super();
		
	}

	String path = System.getProperty("user.dir");
	StaysPage staysPage = new StaysPage();
	
	@Test(dataProvider = "userData")
	public void searchBar(String place,String checkInDate,String CheckOutDate,String adult,String children,String room) 
    {
		int DateOfCheckIn = Integer.parseInt(checkInDate);
		int DateOfCheckOut = Integer.parseInt(CheckOutDate);
		int NumberOfAdult = Integer.parseInt(adult);
		int NumberOfChildren = Integer.parseInt(children);
		int NumberOfRooms = Integer.parseInt(room);
		
	//	staysPage.searchBar(place, checkInDate, CheckOutDate, adult, children, room);
		staysPage.setText("Hyderabad");
//		staysPage.setCheckInDate("16-03-2020");
//		staysPage.setCheckOutDate(DateOfCheckOut);
//		staysPage.setNumberOfAdult(NumberOfAdult);
//		staysPage.setNumberOfChildren(NumberOfChildren);
//		staysPage.setNumberOfRooms(NumberOfRooms);
    }
     
     String sheet = "Sheet1";
    @DataProvider(name="userData")
    public String[][] userFormData() throws Exception
    {
        String[][] data = ExcelUtils.getUserNameForRegister(sheet);
        return data;
    }

	

}
