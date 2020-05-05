package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static String userName = "admin";
	public static String pw = "Hum@nhrm123";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pw);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Boolean proofDisplay = driver.findElement(By.xpath("//img[contains(@src,'syntax.png')]")).isDisplayed();
		if (proofDisplay) {
			System.out.println("Test Case Passed, logged in successfully");
		} else {
			System.out.println("Test Case Failed, could not logg in ");

		}

	}

}
