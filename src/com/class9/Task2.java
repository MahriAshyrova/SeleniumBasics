package com.class9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task2 {
	
//	TC 2: Verify element is clickable.
//	Open chrome browser.
//	Go to “https://the-internet.herokuapp.com/”.
//	Click on “Click on the “Dynamic Controls” link.
//	Select checkbox and click Remove.
//	Click on Add button and verify “It's back!” text is displayed.
//  Close the browser
	
	public static void main(String[] args) {
		
	String url="https://the-internet.herokuapp.com/";	
		
	System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);
	driver.findElement(By.linkText("Dynamic Controls")).click();
	driver.findElement(By.cssSelector("	input[type='checkbox']")).click();
	driver.findElement(By.xpath("//button[text()='Remove']")).click();
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	WebElement element=driver.findElement(By.xpath("//button[text()='Add']"));
	element.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add']")));
	if(element.isDisplayed()) {
		System.out.println("Element is present");
		String text=element.getText();
		System.out.println(text);
	}else {
		System.out.println("Element is not present");
	}
	
	WebElement ele=driver.findElement(By.xpath("//p[@id='message']"));
	if(ele.isDisplayed()) {
		System.out.println("Element is present");
		String text=ele.getText();
		System.out.println(text);
	}else {
		System.out.println("Element is present");
	}
	driver.quit();
	}


}
