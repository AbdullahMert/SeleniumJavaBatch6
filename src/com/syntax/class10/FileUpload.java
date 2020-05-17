package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		WebDriver driver = new ChromeDriver();

		// open browser and navigate to the-internet.herokuapp.com
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();

		// We simply use sendkeys() method to upload the file.
		// locate the choose element and send() path of file to it.
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Mert\\eclipse-workspace\\uploads\\Hello.png"); // right
																														// click
																														// on
																														// the
																														// file
																														// to
																														// get
																														// (FilePath+FileName)
		// click on upload button
		driver.findElement(By.id("file-submit")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
