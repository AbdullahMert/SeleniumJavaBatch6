package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {
	public static String url = "https://demoqa.com/automation-practice-form//";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		WebElement maleRadioB = driver.findElement(By.xpath("//input[@id='sex-0']"));
		System.out.println(maleRadioB.isDisplayed());
		System.out.println(maleRadioB.isEnabled());
		System.out.println(maleRadioB.isSelected());

		// first way to click on Radio Button
		maleRadioB.click();

		// second way to click on Radio Button
		List<WebElement> proList = driver.findElements(By.xpath("//input[@name='profession']"));

		int listSize = proList.size();
		System.out.println("Size of checkboxes are :" + listSize);

		String valueToBeSelected = "Automation Tester";
		for (WebElement i : proList) {
			if (i.isEnabled()) { // checking if checkbox is enabled
				String value = i.getAttribute("value"); // getting the value of the value attribute
				System.out.println(value);
				if (value.equals(valueToBeSelected)) {
					i.click();
					break;

				}
			}
		}
		
		driver.findElement(By.xpath("//input[@id='exp-4']")).click();
		
		//List<WebElement>expList=driver.findElements(By.xpath("//input[@name='Years of Experience']"));
		//int listSize2 = expList.size();

		//System.out.println("Size of years of experience are :" + listSize2);

		
		//int input = 5;
		//for (WebElement i : expList) {
			//if (i.isEnabled()) { // checking if checkbox is enabled
				//String value = i.getAttribute("value"); // getting the value of the value attribute
				//if (value.equals(input)) {
					//i.click();
					//break;

				//}
			//}
		}

	}


