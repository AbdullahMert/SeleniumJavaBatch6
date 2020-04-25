package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
/*		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Abdullah");
		driver.findElement(By.name("lastName")).sendKeys("Birisi");
		driver.findElement(By.name("phone")).sendKeys("2109996677");
		driver.findElement(By.name("userName")).sendKeys("abdbirisi77@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Nice Road");
		driver.findElement(By.name("city")).sendKeys("San Antonio");
		driver.findElement(By.name("state")).sendKeys("Texas");
		driver.findElement(By.name("postalCode")).sendKeys("345678");
		driver.findElement(By.name("email")).sendKeys("abdbirisi77@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcd1234");
		driver.findElement(By.name("confirmPassword")).sendKeys("abcd1234");
		driver.findElement(By.name("postalCode")).sendKeys("345678");
		driver.findElement(By.name("register")).click();
*/
		
		
		driver.get("http://newtours.demoaut.com/mercurysignon.php/");
		driver.findElement(By.name("userName")).sendKeys("abdbirisi77@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcd1234");
		driver.findElement(By.name("login")).click();
		
		driver.quit();

		

		

		

	}

}
