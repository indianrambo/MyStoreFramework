package com.mystore.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_LoginCredentialVerify {

	WebDriver driver;
	@Test(groups = "sanity")
	public void loginCredential() {
		System.out.println("incorrect login credentail"+ Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.close();
	}
	
	@Test(groups = "regression")
	public void validLogInCredentail() {
		System.out.println("correct login credential" + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.close();
	}
}
