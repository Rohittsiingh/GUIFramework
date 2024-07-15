package com.shopping.ToysModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.MyAccountPage;
import com.comcast.crm.objectrepositoryutility.MyCartPage;
import com.comcast.crm.objectrepositoryutility.PaymentPage;
import com.comcast.crm.objectrepositoryutility.ProductPage;
import com.comcast.crm.objectrepositoryutility.ToysPage;
import com.comcast.crm.objectrepositoryutility.UserLoginPage;
import org.testng.asserts.*;

/**
 * 
 * @author Rohitt
 * 
 * Contains test case to order Car Product with COD
 *
 */
@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class OrderCarProductWithCod extends BaseClass{
	@Test
	public void orderCarProductWithCod() throws InterruptedException {
		/**
		 * Loading all the elements of the Home page
		 */
		HomePage homePage = new HomePage(driver);
		/**
		 * Step-1: click on the Toys Menu Link
		 */
		homePage.getToysLink().click();
		String expectedToysPage= "TOYS";
		String openedToysPage = driver.findElement(By.xpath("//div[contains(text(),'Toys')]")).getText();
		Assert.assertEquals(expectedToysPage, openedToysPage,"unable to open the Toys page");
		UtilityClassObject.getTest().log(Status.PASS, "ToysPage is displayed");
		Reporter.log("ToysPage is displayed", true);
		
		ToysPage toysPage = new ToysPage(driver);
		UtilityClassObject.getTest().log(Status.PASS, "Mens Metal car page displayed");
		Reporter.log("Metal car is displayed", true);
		/**
		 *  Step-2:Click on the desired product
		 */
		toysPage.getProduct().click();
		/**
		 * Loading all the elements of the Car Product Page
		 */
		ProductPage productPage = new ProductPage(driver);
		/**
		 *  Step-3:Click on the Add To Cart
		 */
		productPage.getAddToCartButton().click();
		/* 
		 * Validation
		 */
		UtilityClassObject.getTest().log(Status.PASS, "Product is added to the cart");
		Reporter.log("Product is added to the cart", true);
		
		/*
		 * Alert Assertion 
		 */
		UtilityClassObject.getTest().log(Status.PASS, "Alert is getting Displayed");
		driver.switchTo().alert().accept();
		Reporter.log("Alert is displayed", true);
		UtilityClassObject.getTest().log(Status.PASS, "Alert is handled");
		homePage.getMyCart().click();
		/**
		 * Loading all the elements of the Car Product Page
		 */
		MyCartPage myCartPage = new MyCartPage(driver);
		
		myCartPage.getProceedToCheckOut().click();
		Reporter.log("Checkout button is clicked", true);
		UtilityClassObject.getTest().log(Status.PASS, "checkout button is clicked");
		/**
		 * Step-4: Loading all the elements of the Car Payment Page
		 */
		PaymentPage paymentPage = new PaymentPage(driver);
		/**
		 *  Step-5:Click on the Submit Button
		 */		
		 paymentPage.getSubmitButton().click();
		 Reporter.log("Submit Button is clicked", true);
		 UtilityClassObject.getTest().log(Status.PASS, "Submit Button is clicked");
		 
		 /*
		  * Assertion to validate the test case
		  */
		 homePage.getMyAccount().click();
		 MyAccountPage myAccountPage = new MyAccountPage(driver);
		 myAccountPage.getOrderHistory().click();
		 String verifyProduct = "METAL CAR";
		 String orderedProduct = driver.findElement(By.xpath("//a[contains(text(),'Metal car')]")).getText();
		 Assert.assertEquals(verifyProduct, orderedProduct,"Error message: Product not found");
		 Reporter.log("Order Is varified form the Order History Page Button", true);
		 UtilityClassObject.getTest().log(Status.PASS, "Order Is varified form the Order History Page");
		 
	}
}
