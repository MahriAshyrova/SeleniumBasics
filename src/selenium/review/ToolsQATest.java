package selenium.review;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQATest {

	public static void main(String[] args) throws InterruptedException {
	
	
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		List<WebElement> radio=driver.findElements(By.name("exp"));
		
		for(WebElement list:radio) {
			if(list.isEnabled()) {
				Thread.sleep(3000);
				list.click();
			}
		}
		
		Iterator<WebElement> it=radio.iterator();
		while(it.hasNext()) {
			Thread.sleep(3000);
			it.next().click();
		}
		Thread.sleep(3000);
		driver.close();
		

	}

}
