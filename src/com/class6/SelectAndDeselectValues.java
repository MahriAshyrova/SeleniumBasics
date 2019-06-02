package com.class6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class SelectAndDeselectValues {
//	TC 2: Select and Deselect values
//	Open chrome browser
//	Go to “http://uitestpractice.com/”
//	Click on “Select” tab
//	Verify how many options available in the first drop down and then select “United states of America”
//	Verify how many options available in the second drop down and then select all.
//	Deselect China from the second drop down
//	Quit browser (edited) 
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.xpath("//a[text()='Select']")).click();
		
		// working with Single drop down 
		WebElement countriesDD = driver.findElement(By.id("countriesSingle"));
		
        CommonMethods.selectValueFromDD(countriesDD, "United states of America");
		
		
		Select select =new Select(countriesDD);
		int options=select.getOptions().size();
		System.out.println("The number of countries in the drop down is "+options);
		select.selectByVisibleText("United states of America");
		
		// working with Multiple drop down  
		WebElement countriesMultipleDD =driver.findElement(By.id("countriesMultiple"));
		Select select1 =new Select(countriesMultipleDD);
		List<WebElement> multipleOptions=select1.getOptions();
		System.out.println(multipleOptions.size());
		
		System.out.println("--------All options from multiple countries drop down dd--------------");
		for(int i=0; i<multipleOptions.size(); i++) {
			String text =multipleOptions.get(i).getText();
			System.out.println(text);
		}
		// check if we can select multiple options 
		if (select1.isMultiple()) {
			for (int i=0; i<multipleOptions.size(); i++) {
				select1.selectByIndex(i);
			}}

		for (WebElement option: multipleOptions) {
			option.click();
			Thread.sleep(2000);
		}
		select1.deselectByVisibleText("China");
		Thread.sleep(2000);
		driver.quit();	
	}
}











