package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
	
//	Using Xpath ONLY
//	TC 1: Facebook login:
//	Open chrome browser
//	Go to “https://www.facebook.com/”
//	Enter valid username and valid password and click login
//	User successfully logged in

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");	
	
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("202-330-9163");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("selenjik");
	driver.findElement(By.xpath("//input[@value='Log In']")).click();


		
	}

}
