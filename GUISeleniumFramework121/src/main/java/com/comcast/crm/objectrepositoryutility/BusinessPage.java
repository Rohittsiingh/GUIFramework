package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Rohitt
 * 
 * Contains Business page elements & business lib like login()
 *
 */
public class BusinessPage {
	
	WebDriver driver;
	@FindBy(xpath="//a [@href='sub-category.php?scid=13']")
	private WebElement stockInvestingMastermindcategory;

	public BusinessPage(WebElement stockInvestingMastermindcategory) {
		this.stockInvestingMastermindcategory = stockInvestingMastermindcategory;
		PageFactory.initElements(driver, this);
	}
	
}
