package com.syntax.utils;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseClass {

	/**
	 * Method that clears and send keys
	 * 
	 * @param element
	 * @param text
	 */
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	/**
	 * method checks if radio/checkbox is enabled and clicks it
	 * 
	 * @param radioOrCheckbox
	 * @param value
	 */
	public static void clickRadioOrCheckbox(List<WebElement> radioOrCheckbox, String value) {
		String actualValue;
		for (WebElement el : radioOrCheckbox) {
			actualValue = el.getAttribute("value").trim();
			if (el.isEnabled() && actualValue.equals(value)) {
				el.click();
				break;
			}

		}
	}

	/**
	 * Method that checks if text is there and then selects it -works only with DD
	 * with select attribute
	 * 
	 * @param element
	 * @param textToSelect
	 */
	public static void selectDdValue(WebElement element, String textToSelect) {
		try {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (WebElement el : options) {
				String value = el.getText();
				if (value.equals(textToSelect)) {
					// select.selectByVisibleText(textToSelect); this one or the next line works the
					// same
					el.click();
					break;
				}
			}

		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}

	}

	/***
	 * Method that checks if index is valid and then selects by index value - works
	 * only with DD with select tag
	 * 
	 * @param element
	 * @param index
	 */
	public static void selectDdValue(WebElement element, int index) {
		try {
			Select select = new Select(element);
			int indSize = select.getOptions().size();
			if (index < indSize) {
				select.selectByIndex(index);
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	// alerts==============================================================================
	public static void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

	}

	public static void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {

		}
	}

	public static String getAlertText() {
		String alertText = null;
		try {

			Alert alert = driver.switchTo().alert();
			alertText = alert.getText();

		} catch (NoAlertPresentException e) {
			e.printStackTrace();

		}
		return alertText;
	}

// frames===================================================================
	public static void switchToFrame(String nameOrId) {
		try {
			driver.switchTo().frame(nameOrId);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	public static void switchToFrame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}

	}
	// page waits ================================================================

	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
		return wait;
	}

	public static void waitForClickability(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}
}