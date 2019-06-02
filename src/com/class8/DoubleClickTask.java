package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class DoubleClickTask extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.saucedemo.com");
		driver.findElement(By.cssSelector("input#password ")).sendKeys("doubleClick");
		Actions act= new Actions(driver);
		act.doubleClick(driver.findElement(By.cssSelector("input#password "))).perform();
		Thread.sleep(2000);
		driver.close();
			
	}

}
