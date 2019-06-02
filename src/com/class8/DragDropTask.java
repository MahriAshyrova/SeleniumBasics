package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class DragDropTask extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	
		setUpDriver("chrome", "https://jqueryui.com/droppable/");
		WebElement element= driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(element);
		WebElement drag= driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop= driver.findElement(By.cssSelector("div#droppable"));
		Actions act= new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		driver.close();

		
		

	}

}
