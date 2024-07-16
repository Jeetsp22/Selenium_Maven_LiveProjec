package com.Uaisel.selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageUI {
	
	@FindBy(name="username")WebElement txtUserName;
	@FindBy(name="password")WebElement txtPassword;
	@FindBy(xpath = "//button[@type='submit']") WebElement btnLogin;
	
	public PageUI(WebDriver driver) {
		PageFactory.initElements(driver,this);   //Initializing Elements
	}

	public void HRMLogin() {
		txtUserName.sendKeys("Admin");
		txtPassword.sendKeys("admin123");
		btnLogin.click();
	}

}
