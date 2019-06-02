package com.class9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class Task1 extends CommonMethods {
//	TC 1: Verify element is present
//	Open chrome browser
//	Go to “https://the-internet.herokuapp.com/”
//	Click on “Click on the “Dynamic Loading” link
//	Click on “Example 1...” and click on “Start”
//	Verify element with text “Hello World!” is displayed
//	Close the browser
	
	public static void main(String[] args) {

		String url ="https://the-internet.herokuapp.com/"; 
		setUpDriver("chrome", url);
//	    driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get(url);
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();

		
		WebDriverWait wait= new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!'] ")));
		WebElement element=driver.findElement(By.xpath("//h4[text()='Hello World!'] "));
		
		if(element.isDisplayed()) {
			String text=element.getText();
			System.out.println(text);
			System.out.println("The element is displayed");
		}else {
			System.out.println("The element is not displayed");
		}
		driver.quit();	
	}
}
