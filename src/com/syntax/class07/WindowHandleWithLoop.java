package com.syntax.class07;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleWithLoop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-switch-windows-2/");

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("What is the Parent Window Handle?" + parentWindowHandle);

		for (int i = 1; i <= 3; i++) {
			driver.findElement(By.id("button1")).click();
			Thread.sleep(2000);

		}

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String i : allWindowHandles) {
			System.out.println("Id of the window is:" + i);
			driver.switchTo().window(i);
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			driver.close();
		}

	}

}
