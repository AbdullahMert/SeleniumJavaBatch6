package com.syntax.class02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws IOException {

	String userDirectory= System.getProperty("user.dir");
	//System.out.println(userDirectory);
	String filePath=userDirectory+"\\configs\\configuration.properties";
	//System.out.println(filePath);
	FileInputStream fis = new FileInputStream(filePath);

	Properties prop= new Properties();
	
	prop.load(fis);
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get(prop.getProperty("url"));
	driver.findElement(By.xpath("//*[@id=\'ap_customer_name\']")).sendKeys(prop.getProperty("name"));
	driver.findElement(By.cssSelector("#ap_email")).sendKeys(prop.getProperty("email"));
	driver.findElement(By.cssSelector("#ap_password")).sendKeys(prop.getProperty("password"));
	driver.findElement(By.id("ap_password_check")).sendKeys(prop.getProperty("password"));
	driver.findElement(By.id("continue")).click();
	}

}
