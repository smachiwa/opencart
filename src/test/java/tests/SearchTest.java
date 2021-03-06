package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.AccountPage;
import pageobjects.CheckoutPage;
import pageobjects.HomePage;
import pageobjects.HpPage;
import pageobjects.LoginPage;
import pageobjects.SearchResultsPage;
import pageobjects.ShoppingCartPage;
import resources.Base;

public class SearchTest extends Base {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() throws IOException {
		
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
	//Scenerio1Userunable to checkout product from with guest user
		@Test(priority=1)
		public void searchWithValidProduct() throws InterruptedException {
			
			HomePage homePage = new HomePage(driver);
			homePage.enterProuductIntoSearchBoxField(prop.getProperty("validproduct"));
			SearchResultsPage searchResultsPage = homePage.clickOnSearchButton();
			Assert.assertTrue(searchResultsPage.isHPProductDisplayed());
			
			    
			   
			    
			    
			   
		}
	
	

			

         
         
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test(priority=2)
	public void searchWithInValidProduct() {
		
		HomePage homePage = new HomePage(driver);
		homePage.enterProuductIntoSearchBoxField(prop.getProperty("invalidproduct"));
		SearchResultsPage searchResultsPage = homePage.clickOnSearchButton();
		Assert.assertEquals(searchResultsPage.getSearchResultsMessage(),prop.getProperty("noproductinsearchresultsmessage"));
	}
	
	@Test(priority=3)
	public void searchWithoutAnyProduct() {
		
		HomePage homePage = new HomePage(driver);
		homePage.enterProuductIntoSearchBoxField("");
		SearchResultsPage searchResultsPage = homePage.clickOnSearchButton();
		Assert.assertEquals(searchResultsPage.getSearchResultsMessage(),prop.getProperty("noproductinsearchresultsmessage"));
	}

}
