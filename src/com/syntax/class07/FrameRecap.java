package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class FrameRecap extends BaseClass {
/// url :  url= http://166.62.36.207/syntaxpractice/bootstrap-iframe.html 
	public static void main(String[] args) {
		WebDriver driver= BaseClass.setUp();
		
		boolean isHomeDisplayed= driver.findElement(By.xpath("//a[@href='./index.html']")).isDisplayed();
		System.out.println("Is home link displayed?"+isHomeDisplayed);
		
		driver.switchTo().frame("Frame One");
		String welcomeMessage =driver.findElement(By.xpath("//h3[text()='Welcome to Selenium Easy ']")).getText();
		
		
		driver.switchTo().defaultContent();		
		driver.switchTo().frame("Frame Two");
	}

}
