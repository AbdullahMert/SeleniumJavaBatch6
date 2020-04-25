package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPath_CSS_Examples {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		/*
		 * driver.get("https://www.facebook.com");
		 * driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@yahoo.com");
		 * driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("sasas");
		 * driver.findElement(By.xpath(
		 * "//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		 */
		
		
		driver.get("https://www.salesforce.com");
		// driver.findElement(By.cssSelector("div.dropdpwn")).click(); error
		driver.findElement(By.linkText("Login")).click();

		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("abcd");
		driver.findElement(By.cssSelector("#password")).sendKeys("1234");
		//driver.findElement(By.cssSelector("//*[@id='Login']")).click(); error
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());// printing the Error Message
		
	}

}
