package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeRadioButton {
	public static String url = "https://rahulshettyacademy.com/AutomationPractice/";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		String input = "Option2";
		List<WebElement> list = driver.findElements(By.xpath("//label[contains(@for, 'radio')]"));
		
		int listSize = list.size();
		System.out.println("Size of radio buttons are :" + list);
		
		for (WebElement i : list) {
			if (i.isEnabled()) {
				String value = i.getAttribute("for");
				System.out.println(value);
				if (value.equals(input)) {
					i.click();
					break;
				}
			}
		}

	}

}
