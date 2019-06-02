package com.class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class Task3 extends CommonMethods {

//	TC 3: Verify element is enabled
//	1.Open chrome browser2.
//	Go to “https://the-internet.herokuapp.com/”
//		3.Click on “Click on the “Dynamic Controls” link
//		4.Click on enable button
//		5.Enter “Hello” and verify text is entered successfully
//		6.Close the browser
	
	
	public static void main(String[] args) throws InterruptedException {
		
		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome",url);
		
		String text="Dynamic Controls";
		driver.findElement(By.linkText(text)).click();
		
		String buttonXpath="//button[text()='Enable']";
		driver.findElement(By.xpath(buttonXpath)).click();
		
		
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
//		
//		String textToEnter ="Hello";
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(textToEnter);
//		String returnedText= driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value"); 
//		// compare if entered and returned text
//		if(returnedText.equalsIgnoreCase(textToEnter)) {
//			System.out.println("Text is Present");
//		}else {
//			System.out.println("Text is not Present");
//		}
		
		
		// 2 way 
		
		// identify the element and then pass it to the expected conditions
		
		WebElement el= driver.findElement(By.xpath("//input[@type='text']"));
		WebDriverWait wait1=new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(el));
		
		String textToBeEntered="hi";
		el.sendKeys(textToBeEntered);
		
		String ValueOfTextBoxYouEntered= el.getAttribute("value");
				
		if(textToBeEntered.equalsIgnoreCase(ValueOfTextBoxYouEntered)) {
			System.out.println("The text is Present");
		}else {
			System.out.println(ValueOfTextBoxYouEntered+" is not present");
		}
		

		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
