package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class UploadFileAndTakeScreenShotTask extends CommonMethods {
	
//	TC 1: Upload file and Take Screenshot
//
//	Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
//	Upload file
//	Verify file got successfully uploaded and take screenshot
	 static String expectedText="File uploaded!";

	public static void main(String[] args) {
		
		String url="http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload";
		setUpDriver("chrome", url);
		
		String filePath="/Users/mahri/Desktop/xpath_css.png";
		driver.findElement(By.cssSelector("input.gwt-FileUpload")).sendKeys(filePath);
		driver.findElement(By.cssSelector("button.gwt-Button")).click();
		
		Alert alert=driver.switchTo().alert();
		String textActual =	alert.getText(); 
		if(textActual.equals(expectedText)) {
			System.out.println("File is uploaded");
		}else {
			System.out.println("File is not uploaded");
		}
		alert.accept();
	
		takeScreenshot("Google", "Upload");
		
//		Alert alert=driver.switchTo().alert();
//      alert.accept();
//		boolean isDisplayed=driver.findElement(By.cssSelector("button.gwt-Button")).isDisplayed();
//		
//		if(isDisplayed) {
//			System.out.println("The File Uploded is displayed");
//		}else {
//			System.out.println("The File Uploded is not displayed");
//		}
		
//		TakesScreenshot camera=(TakesScreenshot)driver;
//		File uploaded=camera.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(uploaded, new File("Screenshots/Google/Upload.png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("Upload screenshot not taken");
//		}
		
	
		
		driver.quit();
		
		
		
		
	}

}
