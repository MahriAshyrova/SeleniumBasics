package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

//Task for contextClick
//Navigate to https://www.saucedemo.com
//	 Right click on the password textbox 
//	 Close the browser 

public class RightClickTask extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "https://www.saucedemo.com");
		WebElement rightClick =driver.findElement(By.cssSelector("input#password "));
		Actions act= new Actions(driver);
		act.contextClick(rightClick).perform();
		Thread.sleep(1000);
		driver.close();
		
	}

}
