package com.syntax.class02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws IOException {
		String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);
		String filePath = userDirectory + "/configs/Examples.properties";

		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();

		prop.load(fis);

		String url = prop.getProperty("url");

		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		} else {
			System.out.println("Please use Chrome as the browser.");
		}

		WebDriver driver = new ChromeDriver();

		String userName = prop.getProperty("username");

		String pw = prop.getProperty("password");

		driver.get(url);

		driver.findElement(By.id("pseudonym_session_unique_id")).sendKeys(userName);

		driver.findElement(By.id("pseudonym_session_password")).sendKeys(pw);
		driver.findElement(By.cssSelector("button.Button.Button--login")).click();
	}

}
