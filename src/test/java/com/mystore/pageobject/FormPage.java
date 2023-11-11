package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class FormPage {
	WebDriver driver;

	public FormPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(this.driver, 0), this);
	}
	
	@FindBy(id = "Email")
	WebElement emailBox;
	@FindBy(id = "Password")
	WebElement passwordBox;
	@FindBy(css = "button[type='submit']")
	WebElement btn;
	
	
	public void enterEmail(String email)
	{
		emailBox.clear();
		emailBox.sendKeys(email);;
	}
	public void enterPassword(String password)
	{
		passwordBox.clear();
		passwordBox.sendKeys(password);
	}
	public void clickOnButton()
	{
		btn.click();
	}

}
