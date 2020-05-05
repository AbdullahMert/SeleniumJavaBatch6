package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GrocerriesShoppingRahul1 {
	public static String url = "https://rahulshettyacademy.com/seleniumPractise/#/";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys("potato");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='increment']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='increment']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys("Apple");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[contains(@src,'bag.png')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("Promo");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(5000);

		Thread.sleep(5000);
		// driver.quit();

	}

}
