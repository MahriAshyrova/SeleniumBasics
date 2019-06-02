package com.class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	// check all years of experience radio buttons are clickable  
	// check all Automation Tools checkboxes are clickable and keep "Selenium WebDriver" option as selected 
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
	
		List<WebElement>yearsList=driver.findElements(By.name("exp"));
		System.out.println(yearsList.size());
		
		for(WebElement years:yearsList) {
			if(years.isEnabled()) {
				years.click();
				Thread.sleep(3000);
				String value=years.getAttribute("value");
				System.out.println(value);
				
			}	
		}
		Thread.sleep(3000);
		//driver.quit();

		
		
		
	}

}
