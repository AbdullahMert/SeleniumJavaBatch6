package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static String userName = "admin";
	public static String pw = "Hum@nhrm123";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		String message = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		if (message.equals("Password cannot be empty")) {
			System.out.println("Password cannot be empty message is displayed. Test case Passed");
		} else {
			System.out.println("Password cannot be empty message is NOT displayed. Test case Failed");

		}
	}

}
