package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");	
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.toolsqa.com/automation-practice-form");
//		driver.findElement(By.xpath("html/body/div/div[5]/div/div/div/div/div/div/div/div[2]/div/form/fieldset/div[8]/input[@name=‘firstname’]")).sendKeys("name");
//		
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@type='text']")).sendKeys("standard_user\n");
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@value='LOGIN']")).click();
		Thread.sleep(3000);
		//driver.close();
	}

}
