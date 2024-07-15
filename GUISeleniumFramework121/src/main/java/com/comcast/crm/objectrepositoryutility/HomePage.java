package com.comcast.crm.objectrepositoryutility;

import java.time.Duration;
import org.checkerframework.checker.interning.qual.FindDistinct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author Rohitt
 * 
 * Contains HomePage elements & business lib
 *
 */  
public class HomePage extends WebDriverUtility{                             
          
	WebDriver driver;
	@FindBy(xpath="//a [@href='login.php']")
	private WebElement userLoginLink;

	@FindBy(xpath="//a[text()='Admin Login']")
	private WebElement adminLoginLink;
	
	@FindBy(xpath="//a[@href='my-cart.php']")
	private WebElement wishlist;
	
	@FindBy(xpath="//a[@href='my-account.php']")
	private WebElement myAccount;
	
	@FindBy(xpath="//span[@class='key' and text()='Track Order']")
	private WebElement trackOrder;
	
	@FindBy(xpath="//input[@class='search-field']")
	private WebElement searchBox;
	
	@FindBy(xpath="//a [text()=' Fashion']")
	private WebElement fashionLink;
	
	@FindBy(xpath="//a [text()=' Business']")
	private WebElement businessLink;
	
	@FindBy(xpath="//a [text()=' Toys']")
	private WebElement ToysLink;
	
	@FindBy(xpath="//a[@href='logout.php']")
	private WebElement logOutButton;

	@FindBy(xpath="//a [@href='my-cart.php']")
	private WebElement myCart;
	
	public WebElement getMyCart() {
		return myCart;
	}

	public WebElement getUserLoginLink() {
		return userLoginLink;
	}

	public WebElement getAdminLoginLink() {
		return adminLoginLink;
	}

	public WebElement getWishlist() {
		return wishlist;
	}

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getTrackOrder() {
		return trackOrder;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getFashionLink() {
		return fashionLink;
	}

	public WebElement getBusinessLink() {
		return businessLink;
	}

	public WebElement getToysLink() {
		return ToysLink;
	}

	public WebElement getLogOutButton() {
		return logOutButton;
	}

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getlaunchTheApp(String url) {
		driver.get(url);
		//homePage.
		
		
	}
}