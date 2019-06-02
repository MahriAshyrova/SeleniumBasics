package com.class8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task3 extends CommonMethods {
//	Task Three
//	Ahead to http://uitestpractice.com/Students/Index
//	Click on the Actions
//	Click and hold on 1,2,3,4 boxes
//	Close the browser
	
	public static void main(String[] args) {
	
		setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		WebElement one=driver.findElement(By.xpath("//li[@name='one']"));
		WebElement two=driver.findElement(By.xpath("//li[@name='two']"));
		WebElement three=driver.findElement(By.xpath("//li[@name='three']"));
		WebElement four=driver.findElement(By.xpath("//li[@name='four']"));
		
		Actions act= new Actions(driver);
act.moveToElement(one).clickAndHold(one).moveToElement(two).clickAndHold(two).moveToElement(three).clickAndHold(three).moveToElement(four).clickAndHold(four).perform();
		driver.close();
	}

}
