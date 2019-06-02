package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class HoverOverTask extends CommonMethods {
	//Task for hoverOver
//  Navigate to https://www.toolsqa.com
//      Hover over the Tutorial menu
//      Click on Software Testing Tutorial
//      Close the browser

		public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.toolsqa.com");	
		WebElement hover=driver.findElement(By.xpath("//span[text()='VIDEOS']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(hover).click().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Cucumber Video Tutorials']")).click();
		Thread.sleep(3000);
		driver.close();

		

	}

}
