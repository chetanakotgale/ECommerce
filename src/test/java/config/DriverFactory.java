package config;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	public static WebDriver getDriver() throws IOException {

        WebDriver driver = null;
        String browser = BrowserReaderFromProperties.getDriver();

            switch (browser) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
                    driver = new FirefoxDriver();
                    break;
                default:
                    System.out.println("Invalid browser name");
            }

       return driver;
        }

}
