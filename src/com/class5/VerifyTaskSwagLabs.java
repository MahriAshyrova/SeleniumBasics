package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 1: Swag Labs Positive login:
//Open chrome browser
//Go to “https://www.saucedemo.com/”
//Enter valid username and valid password and click login
//Verify robot icon is displayed
//Verify “Products” text is available next to the robot icon

public class VerifyTaskSwagLabs {
	
	public static String userName="standard_user";
	public static String password="secret_sauce";

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com");
		WebElement userNameTxt=driver.findElement(By.cssSelector("input[id='user-name']"));
		userNameTxt.sendKeys(userName);
		WebElement passTxt=driver.findElement(By.cssSelector("input[id='password']"));
		passTxt.sendKeys(password);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		// logo verification 
		boolean logo = driver.findElement(By.cssSelector("div.peek")).isDisplayed();
		if (logo) {
			System.out.println("Robot icon is displayed");
		} else {
			System.out.println("Robot icon is NOT displayed");
		}
		// verify product text 
		WebElement products = driver.findElement(By.xpath("//div[text()='Products']"));
		boolean displayP=products.isDisplayed();
		String value = products.getText();
		
		String  expectedText="Products";

		if (displayP  && value.equals(expectedText)) {
			System.out.println("Test case PASS, has "+expectedText );
		} else {
			System.out.println("Test case FAIL, no "+expectedText);
		}
		
		Thread.sleep(3000);
		driver.quit();

		
		
		
		
		
		
		
	}

}
