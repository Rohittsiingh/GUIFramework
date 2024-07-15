package com.comcast.crm.objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author Rohit
 * 
 * Contains UserLogin elements & business lib 
 */  
public class UserLoginPage extends WebDriverUtility{    
	WebDriver driver;
	public UserLoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//input[@type='email' and @name='email']")
	private WebElement emailTextField;

	@FindBy(xpath="//input[@type='password' and @name='password']")
	private WebElement passwordTextField;

	@FindBy(xpath="//button[@type='submit' and@name='login']")
	private WebElement loginButton;



	/**
	 *  login to application based username , password 
	 * @param url
	 * @param username
	 * @param password
	 */
	public void userloginToapp(String username , String password) {

		emailTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 250)");
		loginButton.click();

	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
