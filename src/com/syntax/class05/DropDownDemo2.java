package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo2 extends BaseClass {

	public static void main(String[] args) {
		setUp();//In properties file, uncomment demoqa.com URL (code written for demoqa.com).

		WebElement continent = driver.findElement(By.id("continents"));

		Select select = new Select(continent);

		List<WebElement> options = select.getOptions();

		for (WebElement i : options) {
			String text = i.getText();
			System.out.println(text);
			if (text.equals("Africa")) {
				i.click();
				String ddText=i.getText();
				
				if(ddText.equals("Africa")) {
					System.out.println("Africa is selected ::" +i.isSelected());
				}else {
					System.out.println("Africa is NOT selected ::" +i.isSelected());
	
				}
				
			}
			//select.deselectByVisibleText("Antarctica");// you can select by visible text

		}
		
		boolean isMultiple=select.isMultiple();
		System.out.println(isMultiple);
		//tearDown();
		

	}

}
