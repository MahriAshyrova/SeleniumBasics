package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://google.com");
//		WebDriver driver1 = new ChromeDriver();
//		driver1.get("http://facebook.com");
//		WebDriver driver2 = new ChromeDriver();
//		driver2.get("http://amazon.com");
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/mahri/Selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("http://facebook.com");
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("http://amazon.com");
		
		
		
		
		
		
	}

}
