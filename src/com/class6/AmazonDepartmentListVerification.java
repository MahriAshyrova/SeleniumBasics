package com.class6;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDepartmentListVerification {
//	TC 1: Amazon Department List Verification
//	Open chrome browser
//	Go to “http://amazon.com/”
//	Verify how many department options available.
//	Print each department
//	Select Computers
//	Quit browser
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		WebElement departmentDD = driver.findElement(By.id("searchDropdownBox"));
		
		Select select=new Select(departmentDD);
		List<WebElement> allOptions=select.getOptions();
		System.out.println("The number of departments in Amazon are "+allOptions.size());

		System.out.println("--------All Departments from Amazon-------");
		Iterator<WebElement> it=allOptions.iterator();
		while(it.hasNext()) {
			String options=it.next().getText();
			System.out.println(options);
		}
		select.selectByVisibleText("Computers");
		Thread.sleep(2000);
		driver.quit();	
		

	}

}
