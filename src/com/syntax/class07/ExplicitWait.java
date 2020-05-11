package com.syntax.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/dynamic-data-loading-demo.html");
		
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='save']")).click();
		
		WebDriverWait wait= new WebDriverWait (driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(), 'First N') ]")));
		
		boolean isDisplayed=driver.findElement(By.xpath("//p[contains(text(), 'First N') ]")).isDisplayed();
		System.out.println("First name is displayed?"+isDisplayed);
		
		
	}

}
