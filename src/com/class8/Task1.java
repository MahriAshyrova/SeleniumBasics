package com.class8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task1 extends CommonMethods {

//	Task One
//	Ahead to http://uitestpractice.com/Students/Index
//	Click on the Actions
//	Click on the click me !
//	Handle the alert and click okay
//	Double Click Double Click Me !
//	Handle the alert and click okay
//	Close the browser

	public static void main(String[] args) throws InterruptedException {
		

		setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		WebElement ele=driver.findElement(By.xpath("//button[@name='click']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().perform();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		WebElement element=driver.findElement(By.xpath("//button[@name='dblClick']"));
		act.doubleClick(element).perform();
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
		Thread.sleep(2000);
		driver.close();
			
	}

}
