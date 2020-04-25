package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

	public static void main(String[] args) {
		
		//Commands with the page
		//getCurrentUrl
		//get()
		//getTitle()
		//.close()
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.microsoft.com/"); // opens the window
		String url= driver.getCurrentUrl();  // assign it to a String
		System.out.println("Current url is:" +url);
		
		String title=driver.getTitle(); // getting the page title
		System.out.println(title);
		
		driver.close(); // closing the browser
		
	}

}
