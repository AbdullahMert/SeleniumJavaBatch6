package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static String url = "https://rahulshettyacademy.com/seleniumPractise/#/";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']"))
				.sendKeys("Cauliflower");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='increment']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='increment']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='increment']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	}

}
