package com.syntax.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.syntax.utils.BaseClass;
import com.syntax.utils.ConfigsReader;

public class ScreenShotDemo extends BaseClass {

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
		driver.findElement(By.className("button")).click();

		Thread.sleep(2000);
		//Create an object of TakesScreenshot interface and cast the Webdriver with it.
		TakesScreenshot ts=(TakesScreenshot)driver;
		//Use getScreenshotAs() method to take the screenshot(int the constructor pass Type.File
		File souceFile=ts.getScreenshotAs(OutputType.FILE);
		
		//Copy the file from source to a another destination 
		try {
			FileUtils.copyFile(souceFile, new File("screenshots/HRMS/pics.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Screenshot was not taken");
		}
		tearDown();
		
		
	}

}