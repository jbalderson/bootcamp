package com.tn.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		public WebDriver driver;
		
		@FindBy(id = "input-email")
		private WebElement emailtextBoxField;
		
		@FindBy(id = "input-password")
		private WebElement passwordtextBoxField;
		
		@FindBy(id = "input.btn.btn-primary")
		private WebElement loginButton;
		
		@FindBy(xpath ="//div[contains(@class, 'alert-dismissible')]")
		private WebElement NoMatchPasswordWarningMessage;
		
		public LoginPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements( driver, this);
			
		}

		public void  enterEmailinEmailTextBoxField(String emailText) {
			emailtextBoxField.sendKeys(emailText);
		}
		
		public void enterPasswordinPasswordField(String passwordText) {
			passwordtextBoxField.sendKeys(passwordText);
		}
		
		public void clickOnLoginButton.click();
		

}
