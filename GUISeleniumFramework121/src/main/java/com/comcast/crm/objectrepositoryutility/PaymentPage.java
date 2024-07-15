package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Rohitt
 * 
 * Contains Payment page elements & business lib 
 *
 */
public class PaymentPage {
	WebDriver driver;
	
	@FindBy(xpath="//input [@type='submit' and @value='submit']")
	private WebElement submitButton;

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public PaymentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
