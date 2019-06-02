package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TablePractice extends CommonMethods{

	public static void main(String[] args) {
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/tables");
		List<WebElement> list=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		for(int i=1; i<=list.size(); i++) {
			if(i<7) {
			String text=driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th["+i+"]")).getText();
			System.out.println(text);
				}else {
				System.out.println("Failed");
			}
		}
		List<WebElement>row=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		boolean isClicked=false;
		for (int i=1; i<=row.size(); i++) {                                         // if i=3
			String rowText=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]")).getText();
			System.out.println(rowText);
			if(rowText.equals("Doe")) {                                     // 3
				driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td/a[1]")).click();
				System.out.println("Passed");
				isClicked=true;
				break; 
			}	
		}
			if(!isClicked) {
			System.out.println("The test failed");
		}	
	driver.close();			
	}					
}
	


