package com.syntax.class10;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class ScreenShotPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		WebDriver driver = new ChromeDriver();

		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("firstName")).sendKeys("Hakan");
		driver.findElement(By.id("lastName")).sendKeys("Sukur");
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Hakan");
		driver.findElement(By.id("searchBtn")).click();

		// checking the result table

		List<WebElement> resultRows = driver.findElements(By.xpath("//table[@id='resultTable']//tr"));

		for (int i =1; i< resultRows.size(); i++) {
			String value = resultRows.get(i).getText();
			if (value.contains("Hakan") && value.contains("Sukur")) {
				System.out.println("Employee Entry Test : PASS");
				TakesScreenshot ts = (TakesScreenshot) driver;
				File souceFile = ts.getScreenshotAs(OutputType.FILE);
				try {
					FileUtils.copyFile(souceFile, new File("screenshots/HRMS/pics.png"));
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("Screenshot was not taken");
				}
			} else {
				System.out.println("Employee Entry Test : FAIL");
			}
		}
		
		driver.quit();

	}

}
