package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsNegativeLogin {

//	TC 2: Swag Labs Negative login:
//		Open chrome browser
//		Go to “https://www.saucedemo.com/”
//		Enter invalid username and password and click login
//		Verify error message contains: “Username and password do not match any user in this service”
//	
	
	public static String userName="standard";
	public static String password="secret";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com");
		WebElement userNameTxt=driver.findElement(By.cssSelector("input[id='user-name']"));
		userNameTxt.sendKeys(userName);
		WebElement passTxt=driver.findElement(By.cssSelector("input[id='password']"));
		passTxt.sendKeys(password);
		driver.findElement(By.cssSelector("input[type='submit']")).click();	
		
		WebElement error=driver.findElement(By.cssSelector("h3[data-test='error']"));
		String errorMessage=error.getText();
		if(errorMessage.equals("Epic sadface: Username and password do not match any user in this service")) {
			System.out.println("Negative Test is Passed");
		}else {
			System.out.println("Negative Test is Failed");
		}
		
		driver.quit();
		
	}

}
