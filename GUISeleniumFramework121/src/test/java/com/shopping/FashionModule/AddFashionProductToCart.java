package com.shopping.FashionModule;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.FashionPage;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.MyAccountPage;
import com.comcast.crm.objectrepositoryutility.ProductPage;
import com.comcast.crm.objectrepositoryutility.ToysPage;
import com.aventstack.extentreports.*;
/**
 * 
 * @author Rohitt
 * 
 * Contains Test case to add Fashion Product to the cart
 */
@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class AddFashionProductToCart extends BaseClass {
  
	@Test
	public void addFashionProductToCartTest() throws InterruptedException {
		/**
		 * Step-1: Loading all the elements of the Product Page
		 */
		HomePage homePage = new HomePage(driver);
		
		/**
		 *  Step-2:Click on the Fashion menu option
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
		 *  Step-4:Click on the MensFootWare Category button product
		 */
		fashionPage.getMensFootWareCategory().click();
		UtilityClassObject.getTest().log(Status.PASS, "Mens FootwarePage is Displayed is displayed");
		Reporter.log("Mens FootwarePage is displayed", true);
		
		/**
		 *  Step-5:Click on the add to Product
		 */
		fashionPage.getProduct().click();

		/**
		 * Step-6: Loading all the elements of the Product Page
		 */
		ProductPage productPage = new ProductPage(driver);
		/**
		 *  Step-7:Click on the add to Add to cart  button product
		 */
		productPage.getAddToCartButton().click();
		
		/**
		 *  Step-8:Click on the add to WishList button product
		 */
	    Reporter.log("Alert is displayed", true);
	    UtilityClassObject.getTest().log(Status.PASS, "Alert is getting Displayed");
		driver.switchTo().alert().accept();
		UtilityClassObject.getTest().log(Status.PASS, "Alert is handled");
		
		/**
		 *  Step-9:Click on the add to WishList button product
		 */
		homePage.getMyCart().click();
		Reporter.log("My cart Page is displayed", true);
		UtilityClassObject.getTest().log(Status.PASS, "My Cart Page is displayed");
		/*
		 * Assert validation
		 */


		homePage.getMyAccount().click();
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		myAccountPage.getOrderHistory().click();
		String verifyProduct = "METAL CAR";
		String orderedProduct = driver.findElement(By.xpath("//a[contains(text(),'Metal car')]")).getText();
		Assert.assertEquals(verifyProduct, orderedProduct,"Error message: Product not found");
		UtilityClassObject.getTest().log(Status.PASS, "Product is present in the my cart list");
		Reporter.log("Product is present in the my cart list", true);

	}
}
