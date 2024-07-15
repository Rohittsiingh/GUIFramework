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
 * Contains Toys page elements & business lib 
 *
 */
public class ToysPage {
	WebDriver driver;
	@FindBy(xpath="//a [@href='sub-category.php?scid=15']")
	private WebElement carCategory;
	
	@FindBy(xpath="//a [@href='sub-category.php?scid=17']")
	private WebElement remoteCarsCategory;

	public ToysPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='product-details.php?pid=22']")
	private WebElement product;
	
	
	public WebElement getCarCategory() {
		
		return carCategory;
	}


	public WebElement getRemoteCarsCategory() {
		return remoteCarsCategory;
	}


	public WebElement getProduct() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 250)");
		return product;
	}


	public void selectProduct() {
		product.click();
	}
}
