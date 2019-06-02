package com.class11;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class AdvancedXpath extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
String url="https://opensource-demo.orangehrmlive.com/";

	setUpDriver("chrome", url);
		
	driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin"); 
	driver.findElement(By.xpath("//div[@id= 'divPassword']/input")).sendKeys("admin123"); 
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
	Thread.sleep(2000);
	driver.quit();

	}

}
