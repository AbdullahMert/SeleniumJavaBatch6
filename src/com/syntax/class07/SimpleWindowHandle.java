package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");

		String signUpTitle = driver.getTitle();
		System.out.println("Main Page title is :" + signUpTitle);

		driver.findElement(By.linkText("Help")).click();

		/*
		 * How to get window handle? In Selenium we have two methods to get the handle
		 * of the window 1:getWindowHandle() 2:getWindowHandles
		 */

		Set<String> allWindowHandles = driver.getWindowHandles(); // returns set of string ID's of all windows currently
																	// opened by the current instance
		System.out.println("number of windows open is :" + allWindowHandles.size());

		Iterator<String> it = allWindowHandles.iterator();

		String mainWindowHandle = it.next(); // returns the id of Main window
		System.out.println("ID of main page is :" + mainWindowHandle);

		String childWindowHandle = it.next();// returns the id of child window
		System.out.println("ID of child page is :" + childWindowHandle);

		driver.switchTo().window(childWindowHandle);
		String childWindowTitle = driver.getTitle();
		System.out.println("Child Page Title is:" + childWindowTitle);

	}

}
