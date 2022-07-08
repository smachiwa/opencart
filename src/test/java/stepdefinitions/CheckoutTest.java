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
import resources.Base;

public class CheckoutTest extends Base {
    WebDriver driver;
   HomePage homePage = null;
   LoginPage loginPage = null;
   AccountPage accountPage = null;
   SearchResultsPage searchresultspage = null ;
   CheckoutPage checkoutpage = null;
   HpPage hppage = null;
   
 
   @Given("^type the url$")
   public void open_browser_and_enter_url_for_the_website() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		
   }

   @When("^search the product add to cart$")
   public void search_the_product_add_to_cart()  {
	    hppage = new HpPage(driver);
	    homePage = new HomePage(driver);
	     homePage.enterProuductIntoSearchBoxField(prop.getProperty("validproduct"));
	       searchresultspage = homePage.clickOnSearchButton();
	       searchresultspage.AddtocartButton();
	    
       
   }

   @Then("^click on checkoutbutton and fill all delivery details order is placed$")
   public void click_on_checkoutbutton_and_fill_all_delivery_details_order_is_placed() throws InterruptedException  {
	 
       hppage = new HpPage(driver);
       hppage.AddtocartButtonhp();
       hppage. Succesfulladded();
       hppage.AddtocartButtonhp();
       Thread.sleep(8000);
       hppage.Addtoshoppingcart();
       checkoutpage = new CheckoutPage(driver);
       checkoutpage.Clickoncheckoutbutton();
       Thread.sleep(5000);//its compulsory sometime continuebutton not work
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
       Thread.sleep(5000);//its compulsory sometime continuebutton not work
       checkoutpage.Billerstate(prop.getProperty("state"));
       checkoutpage.Billcontinuestep3();
       checkoutpage.Billcontinuestep4();
       checkoutpage.termsandcondition(prop.getProperty("condition"));
       checkoutpage.Billcontinuestep5();
       checkoutpage.confirmorder();
       driver.quit();
	   }
   @Then("^click on checkoutbutton and fill invalid delivery details order is placed$")
   public void click_on_checkoutbutton_and_fill_invalid_delivery_details_order_is_placed() throws InterruptedException  {
       
	   hppage = new HpPage(driver);
       hppage.AddtocartButtonhp();
       Thread.sleep(5000);
       hppage. Succesfulladded();
       hppage.AddtocartButtonhp();
       Thread.sleep(5000);
       hppage.Addtoshoppingcart();
       checkoutpage = new CheckoutPage(driver);
       checkoutpage.Clickoncheckoutbutton();
       Thread.sleep(5000);//its compulsory sometime continuebutton not work
       checkoutpage.Guestuserbutton();
       checkoutpage.ClickonguestContinueButton();
       checkoutpage.Billerfirstname(prop.getProperty("firstname"));
       checkoutpage.Billerlastname(prop.getProperty("lastname"));
       checkoutpage.Billeremail(prop.getProperty("validemail1"));
       checkoutpage.Billertelephone(prop.getProperty("telephone"));
       checkoutpage.Billeraddress1(prop.getProperty("address1"));
       checkoutpage.Billercity(prop.getProperty("city"));
       checkoutpage.Billerpostcode(prop.getProperty("postcode"));
       checkoutpage.Billercountry(prop.getProperty("country"));
       Thread.sleep(5000);//its compulsory sometime continuebutton not work
       checkoutpage.Billerstate(prop.getProperty("state"));
       checkoutpage.Billcontinuestep3();
       driver.quit();
      
	   }
   @Then("^click on checkoutbutton and no fill delivery details order is placed$")
   public void click_on_checkoutbutton_and_no_fill_delivery_details_order_is_placed() throws InterruptedException  {
	   hppage = new HpPage(driver);
       hppage.AddtocartButtonhp();
       Thread.sleep(5000);
       hppage. Succesfulladded();
       hppage.AddtocartButtonhp();
       Thread.sleep(5000);
       hppage.Addtoshoppingcart();
       checkoutpage = new CheckoutPage(driver);
       checkoutpage.Clickoncheckoutbutton();
       Thread.sleep(5000);//its compulsory sometime continuebutton not work
       checkoutpage.Guestuserbutton();
       checkoutpage.ClickonguestContinueButton();
       checkoutpage.Billcontinuestep3();
       driver.quit();
   }
   
   }
   
