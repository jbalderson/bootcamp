package com.tn.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public WebDriver driver;
	
	@FindBy( id = "input-firstname")
	private WebElement firstNameTextBoxField;
	
	@FindBy( id = "input-lastname")
	private WebElement lastNameTextBoxField;
	
	@FindBy( id = "input-email")
	private WebElement emailTextBoxField;
	
	@FindBy( id = "input-telephone")
	private WebElement telephoneTextBoxField;
	
	@FindBy( id = "input-password")
	private WebElement passwordTextBoxField;
	
	@FindBy(id = "radio-inline")
	private WebElement newsLetterYesButton;
	
	
	
	
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);
	}
		
		public void enterFirstNameInFirstNameTextBoxField(String firstNameText) {
			firstNameTextBoxField.sendKeys(firstNameText);
	
}
		
		public void enterLastNameInFirstNameTextBoxField(String lastNameText) {
			lastNameTextBoxField.sendKeys(lastNameText);
	
}
		

		public void enterEmailInFirstNameTextBoxField(String emailText) {
			emailTextBoxField.sendKeys(emailText);
			
		}
		
		public void enterTelephoneInFirstNameTextBoxField(String telephoneText) {
			telephoneTextBoxField.sendKeys(telephoneText);
	
}
		
		public void selectYesForNewsLetterRadioButton() {
		newsLetterYesButton.click();
		}
}
