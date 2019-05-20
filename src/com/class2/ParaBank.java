package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=0133196A0C8B10B52814852DF38D891F");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.firstName")).sendKeys("bob");
		Thread.sleep(2000);
		driver.findElement(By.name("customer.lastName")).sendKeys("doe");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.street")).sendKeys("123 Street");
		Thread.sleep(2000);
		driver.findElement(By.name("customer.address.city")).sendKeys("Fairfax");
		driver.findElement(By.id("customer.address.state")).sendKeys("VA");
		Thread.sleep(2000);
		driver.findElement(By.name("customer.address.zipCode")).sendKeys("20171");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("202-230-340");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.ssn")).sendKeys("2746272");	
		Thread.sleep(2000);
		driver.findElement(By.id("customer.username")).sendKeys("Mark");
		Thread.sleep(2000);
		driver.findElement(By.name("customer.password")).sendKeys("achar");
		Thread.sleep(2000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("achar");
		Thread.sleep(2000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
