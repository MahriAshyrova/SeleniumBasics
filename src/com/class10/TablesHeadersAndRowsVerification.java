package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;
public class TablesHeadersAndRowsVerification extends CommonMethods{
	
//		TC 1: Table headers and rows verification
//		1.Open browser and go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
//		2.Login to the application
//		3.Create an Order
//		4.Verify order of that person is displayed in the table “List of All Orders”
//		5.Click on edit of that specific order
//		6.Verify each order details
//		7.Update street address
//		8.Verify in the table that street has been updated
//		9.Close browser
	
	public static void main(String[] args) throws InterruptedException {
	
	String product="FamilyAlbum";
	String quantity="1";
	String customerName="Sally Snow";
	String street= "5 Lemon Street";
	String city = "Fairfax";
	String state= "VA";
	String zipCode= "201918";
	String cardName ="Visa";
	String cardNum= "102030405023";
	String expireDate ="11/23";
		
		
	String url ="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	setUpDriver("chrome", url);	
		
	// logging in 
	sendText(driver.findElement(By.cssSelector("input[id*='username']")), "Tester");
	sendText(driver.findElement(By.cssSelector("input[id*='password']")), "test");
	click(driver.findElement(By.cssSelector("input[id*='button']")));
	
	// creating a new order 
	driver.findElement(By.linkText("Order")).click();
	selectValueFromDD(driver.findElement(By.cssSelector("select[id*='Product']")), product);
	sendText(driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_txtQuantity']")),quantity);
	sendText(driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_txtName']")), customerName);
	sendText(driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_TextBox2']")), street);
	sendText(driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_TextBox3']")), city);
	sendText(driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_TextBox4']")), state );
	sendText(driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_TextBox5']")), zipCode);
	radioButtonToSelect(driver.findElements(By.xpath("//input[contains(@name, 'cardList')]")), "value", cardName);
	sendText(driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_TextBox6']")), cardNum);
	sendText(driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_TextBox1']")), expireDate);
	driver.findElement(By.linkText("Process")).click();		
	
	//view the new order
	click(driver.findElement(By.linkText("View all orders")));

	// veryfy if the new order has been created by looping and retrieving the text from all the rows 
	List<WebElement> rows=driver.findElements(By.xpath("//*[contains(@id, 'orderGrid')]/tbody/tr "));
	boolean orderIsDisplayed=false;	
	for(int i=1; i<=rows.size(); i++) {	
	String actualText=driver.findElement(By.xpath("//*[contains(@id, 'orderGrid')]/tbody/tr["+i+"]")).getText();
	System.out.println(actualText);
		if(actualText.contains(customerName)) {
			System.out.println("The new order is displayed");
			orderIsDisplayed=true;
			break;
	}
	}
	if(!orderIsDisplayed) {
	System.out.println("The new order is not displayed");
	}
	
	// verify each item on the order
	for(int i=1; i<=rows.size(); i++) {	
	String actualText=driver.findElement(By.xpath("//*[contains(@id, 'orderGrid')]/tbody/tr["+i+"]")).getText();
 	if(actualText.contains(customerName)) {
 		driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]/td[13]")).click();
 		
 		
 		String expecProduct=driver.findElement(By.xpath("//option[text()='FamilyAlbum']")).getText();
 		String expecQuantity=driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_txtQuantity')]")).getText(); 
 		String expecCustomerName=driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_txtName')]")).getText(); 
 		String expecStreet=driver.findElement(By.xpath("//input[contains(@id,'fmwOrder_TextBox2')]")).getText(); 
 		String expecCity=driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox3')]")).getText(); 
 		String expecState=driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox4')]")).getText();
 		String expecZipCode=driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox5')]")).getText(); 
 		String expecCardName=driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_cardList')]")).getText(); 
 		String expecCardNum=driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox6')]")).getText(); 
 		String expecExpireDate=driver.findElement(By.xpath("//input[contains(@id,'MainContent_fmwOrder_TextBox1')]")).getText(); 
 		
 		verify(actualText, expecProduct);
 		verify(actualText, expecQuantity);
 		verify(actualText, expecCustomerName);
 		verify(actualText, expecStreet);
 		verify(actualText, expecCity);
 		verify(actualText, expecState);
 		verify(actualText, expecZipCode);
 		verify(actualText, expecCardName);
 		verify(actualText, expecCardNum);
 		verify(actualText, expecExpireDate);
 		//updating the address for Sally Snow
 		sendText(driver.findElement(By.xpath("//input[contains(@id, 'ctl00_MainContent_fmwOrder_TextBox2')]")), "7 Strawberry Line");
 		click(driver.findElement(By.linkText("Update"))); 	
 	}
}
	//veryfing the updated address 	
	boolean updatedAddressIsDisplayed=false;	
	for(int i=1; i<=rows.size(); i++) {	
	String expectedAdrdress="7 Strawberry Line";
	String updatedAddress=driver.findElement(By.xpath("//*[contains(@id, 'orderGrid')]/tbody/tr["+i+"]")).getText();
		if(updatedAddress.contains(expectedAdrdress)) {	
		System.out.println("The updated address is displayed");
		updatedAddressIsDisplayed=true; 
		break;
	} 
}
	if(!updatedAddressIsDisplayed){
		System.out.println("The updated address is not displayed");
		}
	driver.quit();
			
	}
	}

	
//	verify(actualText, product);
//	verify(actualText, quantity);
//	verify(actualText, customerName);
//	verify(actualText, street);
//	verify(actualText, city);
//	verify(actualText, state);
//	verify(actualText, zipCode);
//	verify(actualText, cardName);
//	verify(actualText, cardNum);
//	verify(actualText, expireDate);
	
//	if(actualText.contains(product)) {
//		if(actualText.contains(quantity)) {
//			if(actualText.contains(customerName)) {
//				if(actualText.contains(street)) {
//					if(actualText.contains(city)) {
//						if(actualText.contains(state)) {
//							if(actualText.contains(zipCode)) {
//								if(actualText.contains(cardName)) {
//									if(actualText.contains(cardNum )) {
//										if(actualText.contains(expireDate )) {
//										System.out.println("Each item is verified");
//										}	
//									}
//								}
//							}
//						 }
//					  }
//				   }
//				}
//			}
//		}
	

//WebDriverWait wait1 = new WebDriverWait(driver, 20);
//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id, 'orderGrid')]/tbody/tr["+i+"]")));
//System.out.println("The List Of All Orders with an updated address: "+updatedAddress);
//System.out.println("List Of All Orders : "+actualText);
