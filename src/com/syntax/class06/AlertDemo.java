package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BaseClass.setUp(); // the code is for http://uitestpractice.com/Students/Switchto
		driver.manage().window().maximize(); // maximizing the window
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		Thread.sleep(2000);

		// handling simple Alert for PopUps
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(2000);

		String simpleAlertText = simpleAlert.getText(); // getting the text from the Alert window
		System.out.println(simpleAlertText);

		simpleAlert.accept(); // Accepting the Alert
		Thread.sleep(2000);

		// handling confirmation Alert
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		String confirmAText = confirmAlert.getText();
		System.out.println(confirmAText);
		Thread.sleep(2000);
		confirmAlert.dismiss(); // Dismissing the Alert

		Thread.sleep(2000);

		// handling Prompt alerts/confirmation alerts by providing some confirmation
		// message
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println("This is Prompt alert text:" + promptAlert.getText());
		promptAlert.sendKeys("Abdullah");
		promptAlert.accept();
		String message = driver.findElement(By.xpath("//div[@id='demo']")).getText();
		if (message.contains("Abdullah")) {
			System.out.println("Text was added");
		} else {
			System.err.println("Text not added");

		}

		Thread.sleep(2000);

		BaseClass.tearDown();

	}

}
