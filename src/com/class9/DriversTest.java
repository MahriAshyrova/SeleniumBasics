package com.class9;

import utils.CommonMethods;

public class DriversTest extends CommonMethods {

	public static void main(String[] args) {
		
		setUpDriver("chrome", "http://google.com");
		driver.quit();

	}

}
