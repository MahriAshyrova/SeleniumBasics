package com.class11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class JavaScriptDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
	
		String url="https://www.toolsqa.com/automation-practice-form/";
		setUpDriver("chrome", url);
		// scroll down to the page 
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 550)"); // scroll down
	//	js.executeScript("window.scrollBy(0, -400)"); // scroll up
		
		WebElement label=driver.findElement(By.xpath("//label[text()='Automation Tool']"));
		js.executeScript("arguments[0].scrollIntoView(true);", label);  

		// click on QTP 
		String expectedValue="QTP";
		List<WebElement> toolCheckbox=driver.findElements(By.name("tool"));
		
		for(WebElement checkbox:toolCheckbox ) {
			if(checkbox.isEnabled()) {
				if(checkbox.getAttribute("value").equals(expectedValue)) {
					if(!checkbox.isSelected()) {
						checkbox.click();
						break;
					}else {
						System.out.println("Checkbox is selected by default");
					}
				}
				
			}else {
				System.out.println("Checkbox is not enabled");
			}
		}
		
		WebElement el = driver.findElement(By.name("submit"));
		js.executeScript("arguments[0].click();", el);
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
