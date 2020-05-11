package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultiplePractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();

		WebElement myDD = driver.findElement(By.xpath("//select[@id='continentsmultiple']"));

		Select select = new Select(myDD);

		List<WebElement> options = select.getOptions(); // this block is for retrieving all the values 
		for (WebElement i : options) {
			String text = i.getText();
			System.out.println(text);
			Thread.sleep(1000);
		}

		List<WebElement> multOpt = select.getOptions(); // this block is for selecting Europe and Africa
		for (WebElement i : multOpt) {
			String value = i.getText();
			if (value.equals("Europe") || value.equals("Africa")) {
				i.click();
			}
		}
		
		Thread.sleep(4000);
		driver.quit();

	}

}
