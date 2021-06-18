//changed the method name to comply with naming convention:03/06/2021


package com.ort.qa.util;

import java.util.LinkedList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ort.qa.base.TestBase;


public class DropDownHandler extends TestBase {
	
	public DropDownHandler(WebDriver driver) {
	}

	public static void selectUsingVisibleValue(WebElement element, String visibleValue) {
	Select select = new Select(element);
	select.selectByVisibleText(visibleValue);
	}

	

	public void selectUsingIndex(WebElement element, int index) {
	Select select = new Select(element);
	select.selectByIndex(index);
	}

	public void selectUsingVisibleText(WebElement element, String text) {
	Select select = new Select(element);
	select.selectByVisibleText(text);

	}

	public List<String> getAllDropDownValues(WebElement locator) {
	Select select = new Select(locator);
	List<WebElement> elementList = select.getOptions();
	List<String> valueList = new LinkedList<String>();

	for (WebElement element : elementList) {
	valueList.add(element.getText());
	}
	return valueList;
	}
	}
	
	


