package com.class6;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownReview {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "/Users/mahri/Selenium/geckodriver");
		//WebDriver driver= new FirefoxDriver();
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		// identify DD with <select>
		WebElement countriesDD=driver.findElement(By.cssSelector("select#continents"));
		Select select = new Select(countriesDD);
		List<WebElement> allOptions=select.getOptions();
		System.out.println("Number of options in country drop down is equals "+allOptions.size());
		
		System.out.println("--------All options from country dd--------------");
		Iterator<WebElement> it=allOptions.iterator();
		while(it.hasNext()) {
			String optionText=it.next().getText();
			System.out.println(optionText);
		}
		select.selectByVisibleText("Africa");
		Thread.sleep(2000);
		select.selectByIndex(5);
		//select.deselectByIndex(5); - can only deselect options with multiselect
		
		
		//working with multiselect
		WebElement commandsDD=driver.findElement(By.id("selenium_commands"));
		Select select1 = new Select(commandsDD);
		List<WebElement> allOptions1=select1.getOptions();
		System.out.println("Number of options in commands drop down is equals "+allOptions1.size());
		
		System.out.println("--------All options from command dd--------------");
		for(int i=0; i<allOptions1.size(); i++) {
			String text =allOptions1.get(i).getText();
			System.out.println(text);
		}
	
		if (select1.isMultiple()) { // checks if drop down supports multiple options 
			select1.selectByVisibleText("Navigation Commands");
			Thread.sleep(5000);
			Thread.sleep(3000);
			select1.selectByIndex(3);
			select1.selectByIndex(4);
			Thread.sleep(3000);
		}
		// deselecting options from MULTIPLE select 
		select1.deselectByIndex(2);
		Thread.sleep(3000);
		select1.deselectByVisibleText("Navigation Commands");
		Thread.sleep(3000);
		select1.deselectAll();
		Thread.sleep(2000);
		driver.quit();	
	}
}
