package com.class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQATask {
//	TC 1: Tools QA check all elements
//	Open chrome browser
//	Go to “https://www.toolsqa.com/automation-practice-form/”
//	Fill out:
//	First Name
//	Last Name
//	Check that sex radio buttons are enabled and select “Male”
//	Check all Years of Experience radio buttons are clickable
//	Date
//	Select both checkboxes for profession
//	Check all Automation Tools checkboxes are clickable and keep “Selenium WebDriver” option as selected
//	Quit browser
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Selena");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Selina");
		
		String valueToSelect= "Male";
		List<WebElement> radioList=driver.findElements(By.name("sex"));		
		for(WebElement radio:radioList) {
			if(radio.isEnabled()) {
				radio.click();	
				}}
				
				for(WebElement radio1:radioList) {
				String value=radio1.getAttribute("value");
				//System.out.println(value);
				if(value.equals(valueToSelect)) {
				radio1.click();		
			}}
		List<WebElement> radioYear=driver.findElements(By.name("exp"));	
				for(WebElement years:radioYear) {
					if(years.isEnabled()) {
						years.click();
				}}
		driver.findElement(By.cssSelector("input[id='datepicker']")).sendKeys("2019");
		List<WebElement> profession=driver.findElements(By.name("profession"));
		
		for (WebElement professionBoxes:profession) {
			if(professionBoxes.isEnabled()) {
				professionBoxes.click();
				Thread.sleep(2000);
			}}
		
		List<WebElement> toolsList=driver.findElements(By.name("tool"));
		for(WebElement tools:toolsList) {
			if(tools.isEnabled()) {
				Thread.sleep(2000);
				tools.click();
			}}	
		
		for(WebElement tools:toolsList) {
		String value=tools.getAttribute("value");
		System.out.println(value);
		if((!value.equals("Selenium Webdriver"))) {
			Thread.sleep(2000);
			tools.click();	
		}}	
		
		Thread.sleep(5000);
		driver.quit();
	}

}
