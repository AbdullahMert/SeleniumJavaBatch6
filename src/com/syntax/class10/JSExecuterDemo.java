  
package com.syntax.class10;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.syntax.utils.BaseClass;
import com.syntax.utils.ConfigsReader;

public class JSExecuterDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		WebDriver driver = new ChromeDriver();

		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		
		//Login to HRMS Application
		WebElement userName = driver.findElement(By.name("txtUsername"));
		userName.sendKeys("Admin");
		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys("Hum@nhrm123");
		WebElement loginBtn=driver.findElement(By.className("button"));
		
		//create object of JavascriptExecutor interface and down-cast web-driver to it.
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//change the background color of an element.
		js.executeScript("arguments[0].style.backgroundColor='red'", pass);
		
		//click on on login btn using js
		js.executeScript("arguments[0].click()", loginBtn);
		
		Thread.sleep(3000);
		//scroll down by pixels
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(3000);
		
		//scroll up by pixels
		js.executeScript("window.scrollBy(0,-250)");
		
		Thread.sleep(5000);
		tearDown();
		
		
	}

}