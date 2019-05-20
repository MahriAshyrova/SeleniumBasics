package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryToursTask {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Mary");
		driver.findElement(By.name("lastName")).sendKeys("Selina");
		driver.findElement(By.name("phone")).sendKeys("304-456-9865");
		driver.findElement(By.id("userName")).sendKeys("selena@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("123 Abs street");
		driver.findElement(By.name("city")).sendKeys("Fairfax");
		driver.findElement(By.name("state")).sendKeys("VA");
		driver.findElement(By.name("postalCode")).sendKeys("20171");
		driver.findElement(By.id("email")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.name("confirmPassword")).sendKeys("1234");
		driver.findElement(By.name("register")).click();

		
				

		
		


		
		

	}

}
