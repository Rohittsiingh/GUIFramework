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
 * Contains Fashion page elements & business lib 
 *
 */
public class FashionPage {

	WebDriver driver;
	@FindBy(xpath="//a [@href='sub-category.php?scid=12']")
	private WebElement mensFootWareCategory;
	
	@FindBy(xpath="//a[@href='product-details.php?pid=19']")
	private WebElement product;

	public WebElement getProduct() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 250)");
		return product;
	}

	public FashionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMensFootWareCategory() {
		return mensFootWareCategory;
	}
	
	
	
	
	

}
