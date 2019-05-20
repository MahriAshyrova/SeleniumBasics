package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Users/mahri/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Link Text")).click();
		driver.findElement(By.partialLinkText("Link T")).click();
		
		
		
	}

}
