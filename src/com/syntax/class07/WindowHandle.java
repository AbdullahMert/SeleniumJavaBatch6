package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/window-popup-modal-demo.html");
		
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("What is the Parent Window Handle?" +parentWindowHandle);
		
		
		
		driver.findElement(By.linkText("Follow On Instagram")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Like us On Facebook")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
		Thread.sleep(1000);
		
		Set<String> allWindowHandles=driver.getWindowHandles();
		System.out.println("What is the NUmber of windows opened?"+allWindowHandles.size() );
		
		Iterator<String>it=allWindowHandles.iterator();
		while(it.hasNext()) {
			String handle=it.next();
			if(!handle.equals(parentWindowHandle)) {// avoiding checking parent window by using !
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();
			}
			
		}
		
		
		
		
		
		
		Thread.sleep(4000);
		driver.quit();
	}

}
