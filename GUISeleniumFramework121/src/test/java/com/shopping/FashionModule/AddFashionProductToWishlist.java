package com.shopping.FashionModule;
import com.comcast.crm.objectrepositoryutility.*;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
/**
 * 
 * @author Rohitt
 * 
 * Contains test case to add Fashion product to Wishlist
 *
 */
@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class AddFashionProductToWishlist extends BaseClass {

	/* read testScritp data from Excel file*/
	//String lastName = eLib.getDataFromExcel("contact", 1, 2) + jLib.getRandomNumber();		
	@Test(groups = {"smokeTest"})	
	public void addFashionProductToWishlistTest() throws InterruptedException {
		/**
		 * Step-1: Loading all the elements of the Home Page
		 */
		HomePage homePage = new HomePage(driver);
		/**
		 *  Step-2:Click on the desired Fashion product
		 */
		homePage.getFashionLink().click();
		String expectedFashionPage= "FASHION";
		String openedFashionPage = driver.findElement(By.xpath("//div[contains(text(),'Fashion')]")).getText();
		Assert.assertEquals(expectedFashionPage, openedFashionPage,"unable to openthe fashion page");
		UtilityClassObject.getTest().log(Status.PASS, "FashionPage is displayed");
		Reporter.log("FashionPage is displayed", true);
		/**
		 * Step-3: Loading all the elements of the Fashion Page
		 */
		FashionPage fashionPage = new FashionPage(driver);
		/**
		 *  Step-4:Click on the MensFootWare category product
		 */
		fashionPage.getMensFootWareCategory().click();
		UtilityClassObject.getTest().log(Status.PASS, "Mens FootwarePage is Displayed is displayed");
		Reporter.log("Mens FootwarePage is displayed", true);
		/**
		 *  Step-5:Click on the desired product
		 */
		fashionPage.getProduct().click();
		UtilityClassObject.getTest().log(Status.PASS, "Mens FootwarePage is Displayed is displayed");
		Reporter.log("Mens FootwarePage is displayed", true);
		/**
		 * Step-6: Loading all the elements of the Product Page
		 */
		ProductPage productPage = new ProductPage(driver);
		/**
		 *  Step-7:Click on the add to WishList button product
		 */
		productPage.getAddToWishlistButton().click();
		/*
		 * Assert validation
		 */
		homePage.getMyAccount().click();
		/*
		 * Assertion : Validate that Product is added into the webPage
		 */
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		myAccountPage.getOrderHistory().click();
		String verifyProduct = "METAL CAR";
		String orderedProduct = driver.findElement(By.xpath("//a[contains(text(),'Metal car')]")).getText();
		Assert.assertEquals(verifyProduct, orderedProduct,"Error message: Product not found");
	}
}
