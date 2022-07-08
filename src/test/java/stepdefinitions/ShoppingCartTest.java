package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AccountPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.SearchResultsPage;
import pageobjects.ShoppingCartPage;
import pageobjects.WishListPagePage;
import resources.Base;

public class ShoppingCartTest extends Base {
	WebDriver driver;
    HomePage homePage = null;
    LoginPage loginPage = null;
    AccountPage accountPage = null;
    ShoppingCartPage shoppingCartPage = null;
    SearchResultsPage searchResultsPage=null;
    WishListPagePage wishlistpage=null;


        @Given("^Visit the Application URL$")
        public void visit_the_application_url() throws IOException {
        	driver = initializeBrowser();
    		driver.get(prop.getProperty("url"));
        	
    		
        }

        @When("^Type valid products into search box$")
        public void type_valid_products_into_search_box() {
        	homePage = new HomePage(driver);
        	homePage.enterProuductIntoSearchBoxField(prop.getProperty("myproduct"));
        }

        @When("^Login to Account on login page$")
        public void login_to_account_on_login_page()  {

        	homePage = new HomePage(driver);
    		homePage.clickOnMyAccountDropMenu();
    		loginPage = homePage.selectLoginOption();
        	loginPage.enterEmailAddress(prop.getProperty("validemail"));
    		loginPage.enterPassword(prop.getProperty("validpassword"));
    	    accountPage = loginPage.clickOnLoginButton();
    		
        }

        @Then("^Verify user is able to navigate shopping Cart on ShoppingCart Page$")
        public void verify_user_is_able_to_navigate_shopping_cart_on_shoppingcart_page()  {
        	homePage.YourShoppingCartIsEmptyMessageonShoppingcartpage();
        }

        @Then("^Click on shopping Cart on the Search page$")
        public void click_on_shopping_cart_on_the_search_page()  {
        	searchResultsPage.ClickonshoppingCartOnSearcgPage();
        }

        @Then("^Click on Wishlist Option On the Search page$")
        public void click_on_wishlist_option_on_the_search_page() {
        	searchResultsPage = new  SearchResultsPage(driver);
        	 searchResultsPage.ClickOnToWishListonSearchPage();
	     		
        }

        @Then("^Verify the success message is Display as product add to Shopping cart on WishList Page$")
        public void verify_the_success_message_is_display_as_product_add_to_shopping_cart_on_wishlist_page()  {
        	   wishlistpage.issuccessmessDisplayasaddtoshoppingcartOnWishListpage();
        	   
        }

        @And("^Click on the Shopping cartButton which is on Homepage$")
        public void click_on_the_shopping_cartbutton_which_is_on_homepage()  {
        	homePage = new HomePage(driver);
    		homePage.ClickOnShoppingCartonHomePage();

        }

        @And("^Click on search button on homePage$")
        public void click_on_search_button_on_homepage()  {
			 searchResultsPage = homePage.clickOnSearchButton();

        }

        @And("^Verify the product is Display on Search Page$")
        public void verify_the_product_is_display_on_search_page() {
			Assert.assertTrue(searchResultsPage.isimacProductDisplayed());
			
        }

        @And("^Click on Add to CartOption on the search page$")
        public void click_on_add_to_cartoption_on_the_search_page()  {
		     searchResultsPage.ClickOnAddToCartonSearchPage();
		     

        }

        @And("^Click on add to Wishlist option on the Search Page$")
        public void click_on_add_to_wishlist_option_on_the_search_page() {
			 searchResultsPage.ClickOnAddToWishListonSearchPage();

        }

        @And("^Verify the success message is Display on search page as add to wishlist$")
        public void verify_the_success_message_is_display_on_search_page_as_add_to_wishlist() {
     		Assert.assertTrue(searchResultsPage.issuccessfullmessageasaddtowishlistisDisplayonSearchpage(),prop.getProperty("AddedToWishListMessage"));
     		
        }

        @And("^Click on the add to cart Option on the WishList page$")
        public void click_on_the_add_to_cart_option_on_the_wishlist_page() throws InterruptedException  {
        	wishlistpage = new WishListPagePage(driver);
        	Thread.sleep(1000);;
    		wishlistpage.clickonaddtocartOnWishListPage();
    		

        }
}