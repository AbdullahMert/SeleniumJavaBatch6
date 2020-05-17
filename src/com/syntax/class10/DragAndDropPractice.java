package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();

		// Selecting to object to be Dragged and Dropped
		WebElement obj1 = driver.findElement(By.xpath("//img[@id='sourceImage']"));

		// Selecting the destination WebElement
		WebElement dest = driver.findElement(By.xpath("//div[@id='targetDiv']"));

		// Creating an object of Actions Class
		Actions action = new Actions(driver);

		// Performing the Action
		Thread.sleep(5000);
		action.clickAndHold(obj1).moveToElement(dest).release().perform();
		Thread.sleep(5000);
		
		action.dragAndDrop(obj1, dest);
		
		

	}

}
