package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import CommonMethods.CommonMethods;

public class Task2 extends CommonMethods {

//	Task Two
//	Ahead to http://uitestpractice.com/Students/Index
//	Click on the Actions
//	Handle the drag and drop
//	Close the browser
//	Task Three
//	Ahead to http://uitestpractice.com/Students/Index
//	Click on the Actions
//	Click and hold on 1,2,3,4 boxes
//	Close the browser
	
	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act= new Actions(driver);
		act.dragAndDrop(drag, drop).click().perform();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
	}

}
