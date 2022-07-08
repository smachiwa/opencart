package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.AccountPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.SearchResultsPage;
import pageobjects.ShoppingCartPage;
import pageobjects.WishListPagePage;
import resources.Base;

public class ShoppingcartTest extends Base {
	
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
	@Test(priority=1)
	 public void AsacustomerIwanttonavigatetoShoppingcartpage()
	    {   
			HomePage homePage = new HomePage(driver);
			homePage.ClickOnShoppingCartonHomePage();
			homePage.YourShoppingCartIsEmptyMessageonShoppingcartpage();
			
			
	
	}
	@Test(priority=2)
	 public void  AsacustomerIwanttoAddtheproducttoShoppingcart() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);
	 	   
				homePage.enterProuductIntoSearchBoxField(prop.getProperty("myproduct"));
				SearchResultsPage searchResultsPage = homePage.clickOnSearchButton();
				Assert.assertTrue(searchResultsPage.isimacProductDisplayed());
			     searchResultsPage.ClickOnAddToCartonSearchPage();
			     Thread.sleep(2000);
			     searchResultsPage.ClickonshoppingCartOnSearcgPage();
			     
	}
	@Test(priority=3)
	 public void  AsacustomerIwanttoAddtheproductFromWishListtoShoppingCart() throws InterruptedException 
	{
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMyAccountDropMenu();
		LoginPage loginPage = homePage.selectLoginOption();
		
		loginPage.enterEmailAddress(prop.getProperty("validemail"));
		loginPage.enterPassword(prop.getProperty("validpassword"));
		AccountPage accountPage = loginPage.clickOnLoginButton();
		homePage.enterProuductIntoSearchBoxField(prop.getProperty("myproduct"));
		SearchResultsPage searchResultsPage = homePage.clickOnSearchButton();
		Assert.assertTrue(searchResultsPage.isimacProductDisplayed());
		 searchResultsPage.ClickOnAddToWishListonSearchPage();
     		Assert.assertTrue(searchResultsPage.issuccessfullmessageasaddtowishlistisDisplayonSearchpage(),prop.getProperty("AddedToWishListMessage"));
     		Thread.sleep(4000); 
     		searchResultsPage.ClickOnToWishListonSearchPage();
    		WishListPagePage wishlistpage= new WishListPagePage(driver);
    		wishlistpage.clickonaddtocartOnWishListPage() ;                    
            wishlistpage.issuccessmessDisplayasaddtoshoppingcartOnWishListpage();
    	
					
	}
}