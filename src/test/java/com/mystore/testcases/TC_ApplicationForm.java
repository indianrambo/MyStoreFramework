package com.mystore.testcases;

import org.testng.annotations.Test;

import com.mystore.pageobject.FormPage;
import com.mystore.utilities.BaseClass;

public class TC_ApplicationForm extends BaseClass {
	
	FormPage page;
	
	
	@Test
	public void verifyForm() {
		FormPage page = new FormPage(driver);
		driver.get(url);
		//logger.info("opened url");
		page.enterEmail("admin@yourstore.com");
		page.enterPassword("admin");
		page.clickOnButton();
	}
}
