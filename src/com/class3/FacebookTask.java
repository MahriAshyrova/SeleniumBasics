package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Selena");
		driver.findElement(By.name("lastname")).sendKeys("Selina");
		driver.findElement(By.id("u_0_h")).sendKeys("202-330-9163");
		driver.findElement(By.id("u_0_o")).sendKeys("selenjik");
		driver.findElement(By.id("month")).sendKeys("September");
		driver.findElement(By.id("day")).sendKeys("14");
		driver.findElement(By.id("year")).sendKeys("1998");
		driver.findElement(By.className("_58mt")).click();
		driver.findElement(By.id("u_0_u")).click();
		
		
		
	}

}
