package com.tn.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	//1.Creation of Objects:
	
	@FindBy(linkText = "My Account")
	private WebElement MyAccountLink;
	
	@FindBy(linkText = "Login")
	private WebElement loginOption;
	
	//this must be set as private because the WebElement "My Account" is native to a given page (e.g. locating a dining table/WebElement in the kitchen/Page)
	
	//2.Initializing the Objects:
	//Then create a constructor of this page:
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		//PageFactory.initElements(driver, HomePage.class);
	}

	//3.Actions performed by those Objects:
	public void clickOnMyAccountLink() {
		MyAccountLink.click();
		
	}
}
