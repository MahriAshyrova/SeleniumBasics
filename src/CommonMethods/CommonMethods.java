package CommonMethods;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	
	public static WebDriver driver;
	   public static void setUpDriver(String browser, String url) {
		   if(browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "/Users/mahri/Selenium/chromedriver");
		  	driver = new ChromeDriver();
		   }else if (browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "/Users/mahri/Selenium/geckodriver");
		   driver= new FirefoxDriver();
		   }else {
			   System.out.println("The invalid browser!");
		   }
		   
		  driver.get(url); 
		 // driver.manage().window().fullscreen();
		   
	   }
	
	 public static void selectValueFromDD(WebElement element, String text) {
	        Select select = new Select(element);
	        List<WebElement> options = select.getOptions();
	        for (WebElement option : options) {
	            String optionText = option.getText();
	            if (optionText.equals(text)) {
	                select.selectByVisibleText(text);
	                break;
	            }else {
	                System.out.println("Option with text “+text+” is not available");
	            }
	        }
	    }

	    public static void selectValueFromDD(WebElement element, int index) {
	        Select select = new Select(element);
	        List<WebElement> options = select.getOptions();
	        if (options.size() > index) {
	            select.selectByIndex(index);
	        }else {
	            System.out.println("Invalid index has been passed");
	        }
	    }
	    
	    public static void sendText(WebElement element, String value) {
	        element.clear();
	        element.sendKeys(value);
	    }

	    
	
	
	    
		   
	   } 
	    
	    
	    
	    
	    
	    
	    
	    

