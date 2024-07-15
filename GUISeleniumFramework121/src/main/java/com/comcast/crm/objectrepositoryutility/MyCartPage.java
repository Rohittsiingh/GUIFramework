package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Rohitt
 * 
 * Contains MyCart page elements & business lib
 *
 */
public class MyCartPage {
	WebDriver driver;
	
	@FindBy(xpath="//button [@type='submit' and @name='ordersubmit']")
	private WebElement proceedToCheckOut;
	
	
	@FindBy(xpath="//textarea [@class='form-control unicase-form-control "
			+ "text-input' and @name='billingaddress']")
	private WebElement billingTextField;
	
	@FindBy(xpath="//textarea [@class='form-control unicase-form-control "
			+ "text-input' and @name='billingaddress']")
	private WebElement billingState;
	
	
	@FindBy(xpath="//textarea [@class='form-control unicase-form-control "
			+ "text-input' and @name='billingaddress']")
	private WebElement billingCity;
	
	@FindBy(xpath="//textarea [@class='form-control unicase-form-control "
			+ "text-input' and @name='billingaddress']")
	private WebElement billingPinCode;
	
	@FindBy(xpath="//textarea [@class='form-control unicase-form-control "
			+ "text-input' and @name='billingaddress']")
	private WebElement shippingTextField;
	
	@FindBy(xpath="//textarea [@class='form-control unicase-form-control "
			+ "text-input' and @name='billingaddress']")
	private WebElement shippingState;
	
	@FindBy(xpath="//textarea [@class='form-control unicase-form-control "
			+ "text-input' and @name='billingaddress']")
	private WebElement shippingCity;
	
	@FindBy(xpath="//textarea [@class='form-control unicase-form-control "
			+ "text-input' and @name='billingaddress']")
	private WebElement shippingPincode;
	
	public MyCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProceedToCheckOut() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 250)");
		return proceedToCheckOut;
	}

	public WebElement getBillingTextField() {
		return billingTextField;
	}

	public WebElement getBillingState() {
		return billingState;
	}

	public WebElement getBillingCity() {
		return billingCity;
	}

	public WebElement getBillingPinCode() {
		return billingPinCode;
	}

	public WebElement getShippingTextField() {
		return shippingTextField;
	}

	public WebElement getShippingState() {
		return shippingState;
	}

	public WebElement getShippingCity() {
		return shippingCity;
	}

	public WebElement getShippingPincode() {
		return shippingPincode;
	}
	
}
