package com.syntax.class04;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllElementsAmazon {
	public static String url = "https://www.amazon.com";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int totalTagA = allLinks.size();
		System.out.println("The total number of items with a tag name 'a'is " + totalTagA);

		TreeSet<String> uniqueLinks = new TreeSet<>();

		int count = 0;
		for (WebElement i : allLinks) {
			String value = i.getText();
			if (!value.isEmpty()) {
				System.out.println(value);
				uniqueLinks.add(value);
				count++;
			}
		}
		System.out.println("The total number of links with text is :" + count);
		System.out.println("The total number of unique links with text is:" + uniqueLinks.size());
		System.out.println("Unique Links with Alphabetic Order");
		for (String i : uniqueLinks) {
			System.out.println(i);

		}
	}

}
