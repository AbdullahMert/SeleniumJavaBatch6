package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://166.62.36.207/syntaxpractice/basic-select-dropdown-demo.html");
		driver.manage().window().fullscreen();
		WebElement myDD = driver.findElement(By.xpath("//select[@id='select-demo']")); // locating the dropdown and
																						// assigning it to a variable

		Select select = new Select(myDD);// because the DD has select tag, we use Select class methods

		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			select.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		select.selectByVisibleText("Thursday");
		Thread.sleep(1000);
		select.selectByValue("Friday");
		

	}

}
