package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class FacebookSignup extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp();

		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		sendText(name, "Abdullah");
		Thread.sleep(1000);

		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		sendText(lastName, "Mert");
		Thread.sleep(1000);

		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		sendText(email, "abdbirisi77@gmail.com");
		Thread.sleep(1000);

		List<WebElement> radioB = driver.findElements(By.xpath("//input[@name='sex']"));
		clickRadioOrCheckbox(radioB, "2");
		Thread.sleep(1000);

		
		// select by visible text -DD
		WebElement monthDD = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		selectDdValue(monthDD, "Jul");
		Thread.sleep(1000);

		WebElement dayDD = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		selectDdValue(dayDD, "27");
		Thread.sleep(1000);

		WebElement yearDD = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		selectDdValue(yearDD, "1980");
		Thread.sleep(1000);
		
		
		/// select by index- DD		
		selectDdValue(monthDD, 6);
		Thread.sleep(1000);
		
		selectDdValue(dayDD, 23);
		Thread.sleep(1000);
		
		selectDdValue(yearDD,45);
		Thread.sleep(2000);

		tearDown();

	}

}
