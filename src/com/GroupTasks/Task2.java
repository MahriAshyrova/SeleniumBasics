package com.GroupTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task2 extends CommonMethods{

	
//	TC 1: Table headers and rows verification
//	1.Open chrome browser
//	2.Go to “https://jqueryui.com/”
//	3.Click on “Datepicker”
//	4.Select August 10 of 2019
//	5.Verify date “08/10/2019” has been entered succesfully
//	6.Close browser
	
	public static void main(String[] args)  {
		
		String url ="https://jqueryui.com/";
		setUpDriver("chrome", url);			
		
		click(driver.findElement(By.linkText("Datepicker")));
		
		//switching to a frame where the calendar is present 
		WebElement frame=driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		switchToFrame(frame);
		
		//clicking on the datepicker
		click(driver.findElement(By.id("datepicker")));
		String monthToEnter="August 2019";
		
		// looping and continuing to click until the set condition for a month is met
		while(true) {
		  String text=driver.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText();
			if(text.equals(monthToEnter)) {
				break;
					}else {
						click(driver.findElement(By.xpath("//span[text()='Next']")));	
		}
		}
		// selecting the date 	
		getDate(driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td")), "10");
		
		// switching to the main page 
		driver.switchTo().defaultContent();
		driver.quit();
		}
		}




	
