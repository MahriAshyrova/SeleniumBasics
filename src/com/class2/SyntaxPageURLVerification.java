package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxPageURLVerification {

//	TC 2: Syntax Page URL Verification:
//		Open chrome browser
//		Navigate to “https://www.syntaxtechs.com/”
//		Navigate to “https://www.google.com/”
//		Navigate back to Syntax Technologies Page
//		Refresh current page
//		Verify url contains “Syntax”
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.syntaxtechs.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		if(title.contains("Syntax")) {
			System.out.println("Title contains Syntax");
		}else {
			System.out.println("Title doesn't contain Syntax");
		}
		
		
	}

}
