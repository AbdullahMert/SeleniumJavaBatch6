package com.syntax.class01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://syntaxtechs.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.close();

	}

}
