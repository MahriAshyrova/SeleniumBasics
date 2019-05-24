package selenium.review;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAToolsTask2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		String title=driver.getTitle();
		String expectedTitle="Demo Form for practicing Selenium Automation";
		System.out.println(title);
		if(title.equalsIgnoreCase(expectedTitle)) {
			System.out.println("You are in the right location");
		}else {
			System.out.println("You are in the wrong location");

		}
		
		 driver.findElement(By.name("firstname")).sendKeys("FirstName");
	        List <WebElement> links=driver.findElements(By.tagName("a"));
	        
	        for(WebElement link:links) {
	            System.out.println(link.getText());
	        }
	        driver.quit();
		
	}

}
