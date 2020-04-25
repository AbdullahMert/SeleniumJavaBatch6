package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleImages {

	public static void main(String[] args) {
		String url=("https://images.search.yahoo.com/");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.id("yschsp")).sendKeys("Be Happy Ahmet");
		driver.findElement(By.className("ygbt")).click();
		
		

	}

}
