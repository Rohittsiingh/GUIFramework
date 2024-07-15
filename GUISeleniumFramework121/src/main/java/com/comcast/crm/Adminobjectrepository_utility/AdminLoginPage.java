package com.comcast.crm.Adminobjectrepository_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage {

	WebDriver driver;

	public AdminLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "inputEmail")
	private WebElement emailTextField;

	@FindBy(id = "inputPassword")
	private WebElement passwordTextField;

	@FindBy(name = "submit")
	private WebElement loginButton;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	/*
	 * business utility
	 */
	public void logintoadmin() {

		emailTextField.sendKeys("admin");
		passwordTextField.sendKeys("Test@123");
		loginButton.click();
	}

}
