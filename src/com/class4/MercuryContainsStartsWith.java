package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryContainsStartsWith {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.findElement(By.xpath("//input[starts-with(@name,'firstName')]")).sendKeys("Mary");
		driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("Selina");
		driver.findElement(By.xpath("//input[contains(@name,'ph')]")).sendKeys("304-456-9865");
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("selena@gmail.com");
		
		
	}

}
