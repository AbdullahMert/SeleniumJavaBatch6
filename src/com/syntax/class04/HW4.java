package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW4 {
	public static String url = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//a[contains(text(),'Input Forms')]")).click();
		driver.findElement(By.xpath("//a[@href='basic-radiobutton-demo.html']")).click();
		Thread.sleep(2000);

		String input = "Female";
		List<WebElement> list = driver.findElements(By.xpath("//input[@name='optradio']"));

		for (WebElement i : list) {
			String value = i.getAttribute("value");
			if (value.equals(input)) {
				i.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='buttoncheck']")).click();
		Thread.sleep(2000);
		String verification = driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
		if (verification.contains(input)) {
			System.out.println("Test case passed, " + input + " was selected and the selection has been verified");
		}

		Thread.sleep(2000);
		String input2a = "Male";

		List<WebElement> list2 = driver.findElements(By.xpath("//input[@name='gender']"));

		for (WebElement i : list2) {
			String value = i.getAttribute("value");
			if (value.equals(input2a)) {
				i.click();
				break;
			}
		}

		Thread.sleep(2000);
		String input2b = "15 - 50";

		List<WebElement> list3 = driver.findElements(By.xpath("//input[@name='ageGroup']"));

		for (WebElement i : list3) {
			String value = i.getAttribute("value");
			if (value.equals(input2b)) {
				i.click();
				break;
			}
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='getValues();']")).click();

		String verify2 = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();
		if (verify2.contains(input2a) && verify2.contains(input2b)) {
			System.out.println("Test case passed, " + input2a + " and " + input2b
					+ " were selected and the selection has been verified");
		}

		Thread.sleep(2000);
		driver.quit();

	}

}
