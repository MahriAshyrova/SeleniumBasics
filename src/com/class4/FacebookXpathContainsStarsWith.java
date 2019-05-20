package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpathContainsStarsWith {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("202-330-9163");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("selenjik");
		driver.findElement(By.xpath("//a[starts-with(text(),'Forgot account')]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("202-330-9163");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("selenjik");
		driver.findElement(By.xpath("//input[contains(@type, 'submit')]")).click();
		driver.close();
		
		
		
		
		
		
	}

}
