package com.mystore.testcases;

import org.testng.annotations.Test;

public class TC_UserData {

	
	@Test(groups = "regression")
	public void incorrectData() {
		System.out.println("incorrect data");
	}
	
	@Test(groups = "sanity")
	public void correctData() {
		System.out.println("correct data");
	}
	
	@Test(groups = "sanity")
	public void correctData1() {
		System.out.println("correct data");
	}
	
	@Test(groups = "sanity")
	public void correctData2() {
		System.out.println("correct data");
	}
}
