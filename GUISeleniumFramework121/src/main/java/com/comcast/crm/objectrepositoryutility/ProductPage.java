package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Rohitt
 * 
 * Contains Product page elements & business lib 
 *
 */
public class ProductPage {
	WebDriver driver;
	
	@FindBy(xpath="//a [@data-original-title='Wishlist']")
	private WebElement addToWishlistButton;
	
	@FindBy(xpath="//a[@class='btn btn-primary' and contains( text(), 'ADD TO CART')]")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//input [@type='text' and @value='1']")
	private WebElement enterQuantity;
	
	public ProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddToWishlistButton() {
		return addToWishlistButton;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getEnterQuantity() {
		return enterQuantity;
	}
	
}
