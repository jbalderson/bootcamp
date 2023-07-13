package com.tn.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	private WebElement logoutLink; 
	
	public WebDriver driver;
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);
		
	}
	
	public void verifyLoginLinkWasDisplayed() {
		boolean logoutDisplayStatus = logoutLink.isDisplayed();
		return logoutDisplayStatus; 
	}
	
	

}
