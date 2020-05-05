package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
	public static String url = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//a[contains(text(),'Input Forms')]")).click();
		driver.findElement(By.xpath("//a[@href='basic-first-form-demo.html']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.quit();


	}

}
