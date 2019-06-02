package com.class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
	// check all Automation Tools checkboxes are clickable and keep "Selenium WebDriver" option as selected 

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		String valueToSelect="Selenium Webdriver";

		List<WebElement>toolsList=driver.findElements(By.name("tool"));
		
		System.out.println(toolsList.size());
		
		for(WebElement tools:toolsList) {
			if(tools.isEnabled()) {
				Thread.sleep(2000);
				tools.click();
			}}	
		
		for(WebElement tools:toolsList) {
		String value=tools.getAttribute("value");
		//System.out.println(value);
		if((!value.equals(valueToSelect))) {
			Thread.sleep(2000);
			tools.click();	
		}}	
	
		Thread.sleep(3000);
		driver.quit();

	

	}}
