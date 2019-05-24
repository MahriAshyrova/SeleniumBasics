package selenium.review;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Navigate to facebook and sign up will all fields needed, but you dont need to click sign up
public class FaceBookTask {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("Selena");
		driver.findElement(By.id("u_0_e")).sendKeys("Selina");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("202-330-9163");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("selenjik");
		WebElement months=driver.findElement(By.cssSelector("select#month"));
		Select dropD= new Select(months);
		dropD.selectByVisibleText("Oct");
		
		WebElement days=driver.findElement(By.cssSelector("select#day"));
		Select day= new Select(days);
		day.selectByIndex(5);
		
		WebElement years=driver.findElement(By.cssSelector("select#year"));
		Select year= new Select(years);
		year.selectByValue("2019");
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@name='sex']"));
		
		String valueToSelect="Female";
		for(WebElement radio: list) {
			if(radio.isEnabled()) {
				Thread.sleep(2000);
				radio.click();	
		}	
	}
		Thread.sleep(2000);
		driver.close();
	}
}
