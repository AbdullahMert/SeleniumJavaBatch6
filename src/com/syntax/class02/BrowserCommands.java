package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {

		// commands with browsers
		// driver.navigate().to
		// driver.navigate().back
		// driver.navigate().forward

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		driver.navigate().refresh();
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();

		driver.navigate().to("https://amazon.com");
		
		
		

	}

}