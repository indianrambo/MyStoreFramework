package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class DashBoardPage {
	WebDriver driver;
	 public DashBoardPage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(new AjaxElementLocatorFactory(this.driver, 10), this);
	 }
	 
	 @FindBy(xpath = "//div[@class='content-header']")
	 WebElement title;
	 
	 public String pageTitle() {
		 return title.getText();
	 }

}
