package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Mary");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Selina");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("304-456-9865");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("selena@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123 Abs street");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Fairfax");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("VA");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("20171");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='register']")).click();


		
		
		
	}

}
