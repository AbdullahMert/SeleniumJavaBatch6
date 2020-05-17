package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class FileUploadPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();

		String filePath = "C:\\Users\\Mert\\eclipse-workspace\\uploads\\Hello.png";
		driver.findElement(By.id("file-upload")).sendKeys(filePath);
		driver.findElement(By.id("file-submit")).click();

		String expText = "File Uploaded!";
		String actText = driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText();
		if (actText.equals(expText)) {
			System.out.println("File Upload Test: PASS");
		} else {
			System.out.println("File Upload Test: FAIL");
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
