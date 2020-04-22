package com.syntax.class01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"/Users/Mert/eclipse-workspace/SeleniumJavaBatch6/drivers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://syntaxtechs.com/");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		// System.out.println(driver.getTitle().length());
		String[] title = driver.getTitle().split(" ");
		for (String i:title) {
			System.out.println(i);
		}
		
		driver.close();
	}

}
