package com.class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertTask {

//	TC 1: JavaScript alert text verification
//	Open chrome browser
//	Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
//	Verify
//	alert box with text “I am an alert box!” is present
//	confirm box with text “Press a button!” is present
//	prompt box with text “Please enter your name” is present
//	Quit browser
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().fullscreen();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		String text=alert.getText();
		String expectedText= "I am an alert box!";
		if(text.equals(expectedText)) {
			System.out.println("Aler Box text has PASSED");
		}else {
			System.out.println("Aler Box text has Failed");
		}
		alert.accept();
        Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        Thread.sleep(2000);
		Alert alert1=driver.switchTo().alert();
        Thread.sleep(2000);
		String confirmAlert=alert1.getText();
		String expectedConfirmText="Press a button!";
		if(confirmAlert.equals(expectedConfirmText)) {
			System.out.println("Confirm alert test has PASSED");
		}else {
			System.out.println("Confirm alert test has Failed");
		}
		alert.dismiss();
        Thread.sleep(2000);

		 
		driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
        Thread.sleep(2000);
		Alert alert2=driver.switchTo().alert();
        Thread.sleep(2000);
		String promptAlert=alert2.getText();
		String expectedPromptText="Please enter your name";
		if(promptAlert.equals(expectedPromptText)) {
			System.out.println("Prompt alert test has PASSED");
		}else {
			System.out.println("Prompt alert test has Failed");
		}
		alert.dismiss();
		Thread.sleep(2000);
		driver.quit();	
		
	}
}
