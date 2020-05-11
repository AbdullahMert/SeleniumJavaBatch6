package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class FrameDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp(); // please uncomment http://uitestpractice.com/Students/Switchto

		String text = driver.findElement(By.xpath("//h3[text()='click on the below link: ']")).getText();
		System.out.println(text);

		/*
		 * We can switch to a frame using three different methods 1. By Index 2. By
		 * NameOrID 3. By WebElement (xpath/CSS)
		 */

		// 1st way-By index

		driver.switchTo().frame(0); //
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Abdullah");
		driver.switchTo().defaultContent(); // switch back to main window/page/default content
		Thread.sleep(2000);

		// 2nd way - by Name/ID

		driver.switchTo().frame("iframe_a");// switch method is used to switch to a frame-name used
		name.clear();
		name.sendKeys("Sermed");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		// 3rd way- By WebElement

		WebElement firstFrame = driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
		driver.switchTo().frame(firstFrame);
		name.clear();
		name.sendKeys("Asel");
		driver.switchTo().defaultContent();// switch back to main window/page/default content
		
		Thread.sleep(3000);
		tearDown();

	}

}
