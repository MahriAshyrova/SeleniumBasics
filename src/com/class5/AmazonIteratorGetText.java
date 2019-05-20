package com.class5;

import java.util.Iterator;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIteratorGetText {

//	
//		TC 1: Amazon link count:
//		Open chrome browser
//		Go to “https://www.amazon.com/”
//		Using Iterator get text of each link
//		Get number of links that has text
//	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		List <WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println("Total number of links are "+ links);
		
		int count=0;
		Iterator <WebElement> it=links.iterator();
		
		while (it.hasNext()) {
		WebElement link=it.next();
		String linkText=link.getText();
			if (!linkText.isEmpty()) {
				System.out.println(linkText);
				count++;
		}
	}
		System.out.println("Total number of links with text is " +count);
		driver.quit();

}
}
