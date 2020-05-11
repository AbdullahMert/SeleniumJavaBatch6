package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownPractice2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement myDD = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

		Select select = new Select(myDD);

		List<WebElement> options = select.getOptions();

		for (int i = 0; i < options.size(); i++) {
			select.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		select.selectByVisibleText("Option2"); // notice that visible text and value are different
		Thread.sleep(1000);
		
		select.selectByValue("option1");   // notice that visible text and value are different
		
		tearDown();

	}

}
