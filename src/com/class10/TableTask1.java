package com.class10;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TableTask1 extends CommonMethods {
//	TC 1: Table headers and rows verification
//	Open chrome browser
//	Go to “https://the-internet.herokuapp.com/”
//	Click on “Click on the “Sortable Data Tables” link
//	Verify tables consist of 4 rows and 6 columns
//	Print name of all column headers
//	Print data of all rows
	
	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		List<WebElement> colHeaders=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		
		int totalHeader=colHeaders.size(); 
		System.out.println("Total number of column headers: "+totalHeader);
		
		System.out.println("------Cols data--------");

		Iterator<WebElement>it = colHeaders.iterator();
		while(it.hasNext()) {
			String headerText=it.next().getText();
			System.out.println(headerText);
		}
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		int rowsNum=rows.size();
		System.out.println("Total number of rows: "+rowsNum);
		
		
		System.out.println("------Rows data--------");
		for( WebElement row:rows) {
			String rowText=row.getText();
			System.out.println(rowText);
		}
		
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
