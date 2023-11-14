package com.mystore.testcases;

import org.testng.annotations.Test;
import com.mystore.pageobject.DashBoardPage;
import com.mystore.pageobject.FormPage;
import com.mystore.utilities.BaseClass;

public class TC_VerifyDashBoardpage extends BaseClass{

	
	@Test
	public void verifyDashboardPage() {
		FormPage page = new FormPage(driver);
		DashBoardPage dashpage = new DashBoardPage(driver);
		driver.get(url);
		page.enterEmail("admin@yourstore.com");
		page.enterPassword("admin");
		page.clickOnButton();
		System.out.println(dashpage.pageTitle());
	}
}
