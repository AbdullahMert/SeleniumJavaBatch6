package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class Authentication {

	public static void main(String[] args) {
		// This is for http://abcdatabase.com/basicauth
		// Making connection to the driver
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test:test@abcdatabase.com/basicauth");// right before url write userN:pw@

	}

}
