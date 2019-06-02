package com.GroupTasks;

import org.openqa.selenium.By;

import utils.CommonMethods;

	public class Task1 extends CommonMethods{
		
//	TC 1: Users Application Form Fill 
//  1.Open chrome browser
//	2.Go to “http://uitestpractice.com/”
//	3.Click on “Forms” link
//	4.Fill out the entire form
//	5.Close the browser MUST USE Functions: 

	public static void main(String[] args) {
	
	String url ="http://uitestpractice.com/";
	setUpDriver("chrome", url);	
	click(driver.findElement(By.linkText("Form")));
	
	//filling the form using the CommonMethods Functions 
	sendText(driver.findElement(By.cssSelector("input[id='firstname']")), "Jane");
	sendText(driver.findElement(By.cssSelector("input[id='lastname']")), "Eyre");
	radioButtonToSelect(driver.findElements(By.cssSelector("label.radio-inline")), "Married");
	checkBoxToSelect(driver.findElements(By.xpath("//input[@type='checkbox']")), "value", "read"); 
	selectValueFromDD(driver.findElement(By.xpath("//select[contains(@id,'sel')]")), "Canada");
	driver.findElement(By.id("datepicker")).click();
	selectValueFromDD(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")), "Oct");
	selectValueFromDD(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")), "2000");
	getDate(driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td")), "11");
	sendText(driver.findElement(By.cssSelector("input[id='phonenumber']")), "202-220-220");
	sendText(driver.findElement(By.cssSelector("input[id='username']")), "JaneEyre");
	sendText(driver.findElement(By.cssSelector("input[id='email']")), "JaneEyre@gmail.com");
	sendText(driver.findElement(By.cssSelector("textarea[id='comment']")), "I am Learning Java and Selenium automation tools.");
	sendText(driver.findElement(By.cssSelector("input[id='pwd']")), "54321");
	
	submit(driver.findElement(By.xpath("//button[@type='submit']")));
	driver.quit();
	
}
}

	
	