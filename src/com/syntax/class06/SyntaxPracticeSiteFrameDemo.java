package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.syntax.utils.BaseClass;

public class SyntaxPracticeSiteFrameDemo {

	public static void main(String[] args) throws InterruptedException {

		// launch this url from properties file.
		// http://166.62.36.207/syntaxpractice/bootstrap-iframe.html
		WebDriver driver = BaseClass.setUp();
		driver.manage().window().maximize();

		driver.switchTo().frame("FrameOne");// switch to frameOne by name.
		boolean logIsDis = driver.findElement(By.id("hide")).isDisplayed();// checking presence of the logo inside frame
		System.out.println("Logo inside frame one is displayed:: " + logIsDis);
		driver.switchTo().defaultContent();// Switching back to parent content.

		driver.switchTo().frame("FrameTwo");// switch to frameTwo by name.
		boolean enrolBtnIsEnabled = driver.findElement(By.className("enroll-btn")).isEnabled();
		System.out.println("Enrol Button inside frame Two is Enabled:: " + enrolBtnIsEnabled);

		Thread.sleep(3000);
		BaseClass.tearDown();

	}

}