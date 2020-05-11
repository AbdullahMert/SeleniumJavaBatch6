package com.syntax.class06;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class AlertsIntro extends BaseClass {

	public static void main(String[] args) {
		setUp();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@hrm123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		// continue practicing on Systax HRM for alerts
	}
}
