package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AccountPage;
import pageobjects.CheckoutPage;
import pageobjects.HomePage;
import pageobjects.HpPage;
import pageobjects.LoginPage;
import pageobjects.SearchResultsPage;
import pageobjects.SuccessPage;
import resources.Base;

public class OrderingProductsTest extends Base {
	WebDriver driver;
	HomePage homePage = null;
	LoginPage loginPage = null;
	AccountPage accountPage = null;
	SearchResultsPage searchResultsPage = null;
	HpPage hppage = null;
	CheckoutPage  checkoutpage = null;
	SuccessPage successpage = null;

	    @Given("^types the url$")
	    public void type_the_url() throws IOException  {
		  driver = initializeBrowser();
	      driver.get(prop.getProperty("url"));
	    }

	    @When("^search the products add to cart$")
	    public void search_the_product_add_to_cart()  {
	    	homePage = new HomePage(driver);
	        homePage.enterProuductIntoSearchBoxField(prop.getProperty("validproduct"));
	        searchResultsPage = homePage.clickOnSearchButton();
	        searchResultsPage.AddtocartButton();
	        hppage = new HpPage(driver);
	        hppage.AddtocartButtonhp();
	    	
	    	
	    	
	    }

	    @Then("^click on checkoutbuttons and fill all delivery details order is placed$")
	    public void click_on_checkoutbutton_and_fill_all_delivery_details_order_is_placed() throws InterruptedException  {
	    	 hppage = new HpPage(driver);
	    	  
	         Thread.sleep(5000);
	         hppage. Succesfulladded();
	         hppage.Addtoshoppingcart();
	         checkoutpage = new CheckoutPage(driver);
	         checkoutpage.Clickoncheckoutbutton();
	         Thread.sleep(7000);//its compulsory sometime continuebutton not work
	         checkoutpage.Guestuserbutton();
	         checkoutpage.ClickonguestContinueButton();
	         checkoutpage.Billerfirstname(prop.getProperty("firstname"));
	         checkoutpage.Billerlastname(prop.getProperty("lastname"));
	         checkoutpage.Billeremail(prop.getProperty("validemail"));
	         checkoutpage.Billertelephone(prop.getProperty("telephone"));
	         checkoutpage.Billeraddress1(prop.getProperty("address1"));
	         checkoutpage.Billercity(prop.getProperty("city"));
	         checkoutpage.Billerpostcode(prop.getProperty("postcode"));
	         checkoutpage.Billercountry(prop.getProperty("country"));
	         Thread.sleep(5000);
	         checkoutpage.Billerstate(prop.getProperty("state"));
	         checkoutpage.Billcontinuestep3();
	         checkoutpage.Billcontinuestep4();
	         checkoutpage.termsandcondition(prop.getProperty("condition"));
	         checkoutpage.Billcontinuestep5();
	         checkoutpage.confirmorder();
	         successpage=new SuccessPage(driver);
	         successpage.isclickOncontinueButton();
	         
	    }

	    @Then("^click on the continues buttons$")
	    public void click_on_the_continue_buttons()  {
	        
	    }

	    @Then("^click on the Orders History buttons on Home Page$")
	    public void click_on_the_order_history_buttons_on_home_page()  {
	    	homePage.isclickOnviewyourOrderHistory();
	    }

	    @Then("^Ordering Product is Displayeds$")
	    public void ordering_products_is_displayeds()  {
	        driver.quit();
	    }
	    
	  
}

	