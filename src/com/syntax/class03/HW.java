package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
	
	public static String url="http://newtours.demoaut.com/";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Abdullah");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Mert");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("2109996688");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("abdbirisi77@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123 Nice Street");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("San Antonio");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("78239");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abdbirisi77@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//input[@name='register']")).click();


		
	}

}
