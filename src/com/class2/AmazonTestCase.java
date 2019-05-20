package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestCase {
//		TC 1: Amazon Page Title Verification:
//		Open chrome browser
//		Go to “https://www.amazon.com/”
//		Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, 
//		Books, DVDs & more” is displayed
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com/");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("This is the right title");
		}else {
			System.out.println("The title is wrong!");
			
		}
		
		driver.quit();
	}

}
