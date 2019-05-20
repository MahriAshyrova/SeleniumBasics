package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("google")) {
			System.out.println("This is the right title");
		}else {
			System.out.println("Sorry, this is not the title");
		}
		
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://facebook.com");
		System.out.println(driver1.getTitle());
		String title1 = driver1.getTitle();
		if(title1.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
			System.out.println("This is the right title");
		}else {
			System.out.println("Sorry, this is not the right title");
		}
	}

}
