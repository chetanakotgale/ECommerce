package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	public static WebDriver getDriver() throws IOException {

        WebDriver driver = null;
        String browser = BrowserReaderFromProperties.getBrowserPath();
        String path = System.getProperty("user.dir");

            switch (browser) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver",  path + "\\drivers\\geckodriver.exe");
                    driver = new FirefoxDriver();
                    break;
                default:
                    System.out.println("Invalid browser name");
            }

       return driver;
        }

}
