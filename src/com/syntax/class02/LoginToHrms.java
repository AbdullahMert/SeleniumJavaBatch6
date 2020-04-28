package com.syntax.class02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToHrms {
	public static WebDriver driver; // we set this variable static

	public static void main(String[] args) throws IOException, InterruptedException {
		// preparation
		String filePath = System.getProperty("user.dir") + "\\configs\\configuration.properties"; // we do this so
		System.out.println(filePath); // different testers can use on their local machines- everyone has eclipse
										// installed different locations

		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();

		prop.load(fis);

		// starting to use methods
		String browser = prop.getProperty("browser");

		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		}

		// now action starts
		driver.get(prop.getProperty("url"));

		Thread.sleep(3000);
		driver.close();

	}

}
