package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Rohitt
 * 
 * Contains TrackOrder elements & business lib 
 *
 */
public class TrackOrderPage {
	WebDriver driver;
	@FindBy(xpath = "//input [@type=\'text\' and @ name='orderid']")
	private WebElement orderIdTextField;
	
	public WebElement getOrderIdTextField() {
		return orderIdTextField;
	}

	public void setOrderIdTextField(WebElement orderIdTextField) {
		this.orderIdTextField = orderIdTextField;
	}

	@FindBy(xpath = "//input [@type=\'email\' and @ name='email']")
	private WebElement registeredEmailField;
	
	@FindBy(xpath = "//button [@type='submit' and @ name='submit']")
	private WebElement submitButton;
	@FindBy(xpath="//td [contains(text(),'2024-07-08 14:49:55 ')]")
	private WebElement OrderDate;
	
	public WebElement getOrderDate() {
		return OrderDate;
	}

	public WebElement getRegisteredEmailField() {
		return registeredEmailField;
	}

	public TrackOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
}
