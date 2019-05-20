package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryCSS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Mary");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Selina");
		driver.findElement(By.cssSelector("input[name^='lastName']")).sendKeys("304-456-9865");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("selena@gmail.com");
		driver.findElement(By.cssSelector("input[name$='ress1']")).sendKeys("123 Abs street");
		driver.findElement(By.cssSelector("input[name*='city']")).sendKeys("Fairfax");
		driver.findElement(By.cssSelector("input[name*='state']")).sendKeys("VA");
		driver.findElement(By.cssSelector("input[name*='postalCode']")).sendKeys("20171");
		driver.findElement(By.cssSelector("input#email")).sendKeys("test123");
		driver.findElement(By.cssSelector("input[name^='password']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[name$='Password']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[name$='register']")).click();
		
		
	}

}
