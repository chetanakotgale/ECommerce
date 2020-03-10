package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BrowserReaderFromProperties {
	public static String getDriver() throws IOException {
		
		String path = System.getProperty("user.dir") + "\\config\\configuration.properties";

		try (FileInputStream file = new FileInputStream(new File(path))) {
			Properties prop = new Properties();
			prop.load(file);

			String browser = prop.getProperty("browser");

			System.out.print(browser);

			return browser;
		}
	}

	public static String getUrl() throws IOException {
		try (FileInputStream file = new FileInputStream("config\\configuration.properties")) {
			Properties prop = new Properties();
			prop.load(file);

			String Website = prop.getProperty("Website");

			return Website;
		}
	}
}
