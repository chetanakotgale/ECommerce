package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BrowserReaderFromProperties 
{
	
	
	static String path = System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\config.properties";
	
	static Logger log = LogManager.getLogger(BrowserReaderFromProperties.class);

	public static String getBrowserPath() throws IOException {
		
		System.out.println(path);
		
		try (FileInputStream file = new FileInputStream(new File(path))) {
			
			Properties prop = new Properties();
			
			prop.load(file);

			String browser = prop.getProperty("browser");

			log.info(browser + " has opened");

			return browser;
		}
	}

	public static String getUrl() throws IOException {
		
		try (FileInputStream file = new FileInputStream(new File(path))) {
			
			Properties prop = new Properties();
			
			prop.load(file);

			String Website = prop.getProperty("Website");

			log.info(Website + " has opened");
			
			return Website;
		}
	}
}
