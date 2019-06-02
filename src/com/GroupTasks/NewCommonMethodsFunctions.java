package com.GroupTasks;

import java.util.List;

import org.openqa.selenium.WebElement;

public class NewCommonMethodsFunctions {
	
	/**
	 * A method that will click on the specified element 
	 * @param element
	 */
	public static void click(WebElement element) {
	element.click();
	
	}
	/**
	 * A method that will check if radio buttons are enabled and select the specified radio button value
	 * @param element
	 * @param buttonToSelect
	 * @throws InterruptedException 
	 */
	
	
	public static void radioButtonToSelect(List<WebElement> element, String buttonToSelect) {	
		List<WebElement> radioList=element;
		for(WebElement radioButton:radioList ) {
			if(radioButton.isEnabled()) {
				String text=radioButton.getText();
				if(text.equals(buttonToSelect)) {
					if(!radioButton.isSelected()) {
						radioButton.click();
						break;
					}else {
						System.out.println("Radio button is selected by default");
					}
				}
			}else {
				System.out.println("The radio buttons are not enabled");
			}
		}
	}	
	
	/**
	 * A method that will select the specified date and verify that it was entered succesfully
	 * @param element
	 * @param dateToSelect
	 */
	
	public static void getDate(List<WebElement> element, String dateToSelect) {
	
	List <WebElement> cells=element;
	for (WebElement cell: cells) {
		String cellText=cell.getText();
			if (cellText.equals(dateToSelect)) {
				cell.click();
				 if(cellText.equals(dateToSelect)) {
					System.out.println("The date has been entered succesfully");
					break;
					}else {
						System.out.println("The date has not been entered succesfully");
}}}
	
	}	
		
/**
 * A method that will check if check boxes are enabled, selected and select the specified value
 * @param element
 * @param attribute
 * @param checkBoxValueToSelect
 * @throws InterruptedException 
 */

public static void checkBoxToSelect(List<WebElement> element, String attribute, String checkBoxValueToSelect) {	
List<WebElement> checkBoxes=element;
for(WebElement checkbox:checkBoxes ) {
	if(checkbox.isEnabled()) {
		if(checkbox.getAttribute(attribute).equals(checkBoxValueToSelect)) {
			if(!checkbox.isSelected()) {
				checkbox.click();
				break;
			}else {
				System.out.println("Checkbox is selected by default");
			}
		}
	}else {
		System.out.println("Checkbox is not enabled");
	}
}

}   						  			

/**
 * A method that will submit the button	
 * @param element
 */
		public static void submit(WebElement element) {
		element.submit();

		}
		
		/**
		 * Method that will verify if actualValue equals expectedValue
		 * @param actualValue
		 * @param expectedValue
		 */
		public static void verify(String actualValue, String expectedValue) {
	        if(!actualValue.equals(expectedValue)) {
	            System.out.println(expectedValue+" is displayed");  
	        }else {
	            System.out.println(expectedValue+" is not displayed");
	        }
	    }   		

   /**
	 * Method that will check if radio buttons are enabled and select the spedified radio buttons by value
	 * @param String nameValue, String attribute, String radioValueToSelect
	 */	
		public static void radioButtonToSelect(List<WebElement> element, String attribute, String checkBoxValueToSelect) {	
			List<WebElement> radioButtonList=element;
			for(WebElement radioButton:radioButtonList ) {
				if(radioButton.isEnabled()) {
					if(radioButton.getAttribute(attribute).equals(checkBoxValueToSelect)) {
						if(!radioButton.isSelected()) {
							radioButton.click();
							break;
						}else {
							System.out.println("Radio button is selected by default");
						}
					}
				}else {
					System.out.println("Radio button is not enabled");
				}
			}
			
		}
		}   			   
   