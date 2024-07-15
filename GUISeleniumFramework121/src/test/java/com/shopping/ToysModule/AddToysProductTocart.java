package com.shopping.ToysModule;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import com.comcast.crm.objectrepositoryutility.ProductPage;
import com.comcast.crm.objectrepositoryutility.ToysPage;
/**
 * 
 * @author Rohitt
 * 
 * Contains test case to add Toys product to the Cart
 *
 */
@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class AddToysProductTocart extends BaseClass{

	@Test
	public void addToysProductToCart() throws InterruptedException {
		/**
		 * Step-1: Loading all the elements of the Home Page
		 */
		HomePage homePage = new HomePage(driver);
		/*
		 * Toys link is clicked 
		 */
		homePage.getToysLink().click();
		/*
		 * Assertion for the Toys page
		 */
		String expectedToysPage= "TOYS";
		String openedToysPage = driver.findElement(By.xpath("//div[contains(text(),'Toys')]")).getText();
		Assert.assertEquals(expectedToysPage, openedToysPage,"unable to open the Toys page");
		UtilityClassObject.getTest().log(Status.PASS, "ToysPage is displayed");
		Reporter.log("ToysPage is displayed", true);
		/**
		 * Step-3: Loading all the elements of the Toys Page
		 */
		ToysPage toysPage = new ToysPage(driver);
		toysPage.getProduct().click();
		UtilityClassObject.getTest().log(Status.PASS, "Metal car page displayed");
		Reporter.log("Metal car is displayed", true);
		/**
		 * Step-4: Loading all the elements of the Product Page
		 */
		ProductPage productPage = new ProductPage(driver);

		productPage.getAddToCartButton().click();
		UtilityClassObject.getTest().log(Status.PASS, "Product is added to the cart");
		Reporter.log("Product is added to the cart", true);
		/**
		 *  Step-5:Handle the Alert
		 */
		UtilityClassObject.getTest().log(Status.PASS, "Alert is getting Displayed");
		driver.switchTo().alert().accept();
		Reporter.log("Alert is displayed", true);
		UtilityClassObject.getTest().log(Status.PASS, "Alert is handled");
		/*
		 * Assert validation: Product is added to the cart
		 */
		String verifyProduct = "METAL CAR";
		String orderedProduct = driver.findElement(By.xpath("//h4[@class='cart-product-description']/"
				+ " a[contains(text(),'Metal car')]")).getText();
		Assert.assertEquals(verifyProduct, orderedProduct,"Error message: Product not found");
		Reporter.log("Product is present in the cart list", true);
		UtilityClassObject.getTest().log(Status.PASS, "Product is present in the cart list");
	}
}
