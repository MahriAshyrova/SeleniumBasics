package com.class7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Homework extends CommonMethods {

//	Open chrome browser
//	Go to “https://the-internet.herokuapp.com/”
//	Click on “Multiple Windows” link
//	Click on “Elemental Selenium”
//	Verify title of second window is “Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro”
//	Close second window
//	Click on “Click Here” link
//	Verify title if newly open window is “New Window”
//	Close second window
//	Verify title of second window is “The Internet”
//	Quit browser
//	NOTE: Selenium execution could be too fast, please use Thread.sleep
	public static void main(String[] args) throws InterruptedException {
		
		
		CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		Thread.sleep(2000);
		String MultipleTitle=driver.getTitle();
		String MultipleId=driver.getWindowHandle();
		System.out.println("Parent title is: "+MultipleTitle+" Parent ID is: "+MultipleId);
		
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		Set<String> allwindows=driver.getWindowHandles();
		Iterator<String> it=allwindows.iterator();
		MultipleTitle=it.next();
		String ElementalTitle=it.next();  
		
		driver.switchTo().window(ElementalTitle);
		ElementalTitle=driver.getTitle(); 
		String ElementalId=driver.getWindowHandle();
		System.out.println("Child title is: ,"+ElementalTitle+" Child ID is: "+ElementalId);
		String expectedTitle="Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro"; 
		if(expectedTitle.equals(ElementalTitle)) {
			System.out.println("Passed the title verification test");
		}else {
			System.out.println("Failed the title verification test");	
		}
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(MultipleTitle);
		
		driver.findElement(By.xpath("//a[starts-with(text(),'Click Here')]")).click();
		Thread.sleep(2000);
		Set<String> allwindows1=driver.getWindowHandles();
				
		Iterator<String> it1=allwindows1.iterator();
		MultipleTitle=it1.next();
	    String hereTitle=it1.next();
	    
	    driver.switchTo().window(hereTitle);
		hereTitle=driver.getTitle();
		Thread.sleep(2000);
		String hereId= driver.getWindowHandle();
		System.out.println("Click Here title is: ,"+hereTitle+" Click Here ID is: "+hereId);
		String expectedTitleClickHere="New Window";
		if(expectedTitleClickHere.equals(hereTitle)) {
			System.out.println("Passed the title verification test");
		}else {
			System.out.println("Failed the title verification test");	
		}
		Thread.sleep(2000);
		driver.close();
		
	
		driver.switchTo().window(MultipleTitle);
		Thread.sleep(2000);
		String generalTitle=driver.getTitle();
		System.out.println(generalTitle);
		String expectedTitleGeneral="The Internet";
		if(expectedTitleGeneral.equals(generalTitle)) {
			System.out.println("Passed the title verification test");
		}else {
			System.out.println("Failed the title verification test");		
		}
		Thread.sleep(2000);
		driver.quit();	
		}
	}


