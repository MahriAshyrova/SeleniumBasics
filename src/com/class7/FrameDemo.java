package com.class7;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class FrameDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		//Way 1; name 
		//driver.switchTo().frame("iframe_a");
		//Way 2 webelelement 
		//WebElement ele = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		//driver.switchTo().frame(ele);
		//Way 3 //index
		//driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#name")).sendKeys("arif");

	}
}
