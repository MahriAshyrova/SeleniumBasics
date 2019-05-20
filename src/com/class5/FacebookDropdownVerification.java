package com.class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdownVerification {
//	TC 1: Facebook dropdown verification
//	Open chrome browser
//	Go to “https://www.facebook.com”
//	Verify:
//	month dd has 12 month options
//	day dd has 31 day options
//	year dd has 115 year options
//	Select your date of birth    
//	Quit browser
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com");
		
		WebElement monthsDD= driver.findElement(By.name("birthday_month"));
		Select month=new Select(monthsDD);
		List<WebElement> allMonths=month.getOptions();
		boolean allMonthsD=driver.findElement(By.name("birthday_month")).isDisplayed();
		if(allMonthsD) {
			System.out.println(allMonths.size()+" months in months dropdown are displayed");
		}else {
			System.out.println(allMonths.size()+" months in months dropdown are not displayed");
		}
		
		
		WebElement daysDD= driver.findElement(By.name("birthday_day"));
		Select days=new Select(daysDD);
		List<WebElement> allDays=days.getOptions();
		boolean allDaysD=driver.findElement(By.name("birthday_day")).isDisplayed();
		if(allDaysD) {
			System.out.println(allDays.size()+" days in days dropdown are displayed");
		}else {
			System.out.println(allDays.size()+" days in days dropdown are not displayed");
		}
		
		
		WebElement yearsDD= driver.findElement(By.name("birthday_year"));
		Select years=new Select(yearsDD);
		List<WebElement> allYears=years.getOptions();
		boolean allYearsD=driver.findElement(By.name("birthday_year")).isDisplayed();
		if(allYearsD) {
			System.out.println(allYears.size()+" years in years dropdown are displayed");
		}else {
			System.out.println(allYears.size()+" years in years dropdown are not displayed");
		}
		
		month.selectByVisibleText("Oct");
		days.selectByIndex(11);
		years.selectByVisibleText("1983");
		Thread.sleep(4000);
		driver.quit();
	
	}

}
