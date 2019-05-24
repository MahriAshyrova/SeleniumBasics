package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import CommonMethods.CommonMethods;

public class FrameTask extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		//driver.switchTo().frame("iframe_a");
//		WebElement element =driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
//		driver.switchTo().frame(element);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("mahri");
		
		driver.switchTo().defaultContent();
		
		boolean Switch =driver.findElement(By.xpath("//h2[text()='SwitchTo']")).isDisplayed();
		if(Switch==true) {
		driver.close();
	}}

}
