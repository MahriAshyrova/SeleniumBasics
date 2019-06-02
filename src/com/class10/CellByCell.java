package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class CellByCell extends CommonMethods {

	public static void main(String[] args) {
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
		for(WebElement r: rows) {
			System.out.println(r.getText());
		}
		
		// How to get values cell by cell 
		// 1. loop thru all rows
		// 2. loop thru all cols
		// 3. driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"[rows]/td[cols]")).getText());
		
		
		for(int i=1; i<=rows.size(); i++) {
			for(int j=1; j<=cols.size(); j++) {
				String cellText=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(cellText);
			}
		}
		
		// 2 way
		List<WebElement> cells=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		
		for(WebElement cell: cells) {
			String cellsText=cell.getText();
			System.out.println(cellsText);
		}
		
		driver.quit();
		
	}

}
