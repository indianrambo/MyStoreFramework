package com.mystore.testcases;

import com.mystore.pageobject.DashBoardPage;
import com.mystore.pageobject.FormPage;
import com.mystore.utilities.BaseClass;

public class TC_DashBoard extends BaseClass{

	DashBoardPage dashpage;
	
	public void verifyTitle() {
    
		FormPage page = new FormPage(driver);
		dashpage = new DashBoardPage(driver);
		driver.get(url);
		page.enterEmail("admin@yourstore.com");
		page.enterPassword("admin");
		page.clickOnButton();
		System.out.println(dashpage.pageTitle());
		;
	}
}
