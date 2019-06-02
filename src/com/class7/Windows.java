package com.class7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class Windows extends CommonMethods{

	public static void main(String[] args)   {
		
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		String parentTitle=driver.getTitle();
		String parentId=driver.getWindowHandle();
		System.out.println("Title: "+parentTitle+" ID: "+parentId);
		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		Iterator <String> it=allWindows.iterator(); // iterating through all windows 
		parentTitle=it.next();
		String childTitle=it.next();
		driver.switchTo().window(childTitle);
		childTitle=driver.getTitle();
		String childID= driver.getWindowHandle();
		System.out.println("Title: "+childTitle+" ID: "+childID);
		driver.close();
		
		
//		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
//		String parent = driver.getTitle();
//		String parentID =driver.getWindowHandle();
//		System.out.println("Title: "+parent+" "+" ID: "+parentID);
//		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
//		Set<String> allwindows=driver.getWindowHandles();
//		
//		Iterator<String> it=allwindows.iterator();
//		parent=it.next();
//		String child=it.next();
//		driver.switchTo().window(child);
//		child=driver.getTitle();
//		String childId=driver.getWindowHandle();
//		System.out.println("Title: "+child+" ID: "+childId);
//		driver.close(); // will close the child window 
//		
	}

}
