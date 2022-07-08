package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import pageobjects.SearchResultsPage;
import resources.Base;

public class SearchTest extends Base {
	
	WebDriver driver;
	HomePage homePage = null;
	SearchResultsPage searchResultsPage = null;
	
	
	@Given("^Type the Application URL$")
    public void Enter_the_application_url() throws IOException  {
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		
    }
	  @When("^User enter valid products into search box field$")
	    public void user_enter_valid_products_into_search_box_field()  {
		   homePage = new HomePage(driver);
			homePage.enterProuductIntoSearchBoxField(prop.getProperty("validproduct"));	
		  }

	    @When("^User type invalid products into search box field$")
	    public void user_type_invalid_products_into_search_box_field()  {
	    	HomePage homePage = new HomePage(driver);
			homePage.enterProuductIntoSearchBoxField(prop.getProperty("invalidproduct"));
		
	    }

	    @When("^User type empty products into search box field$")
	    public void user_type_empty_products_into_search_box_field()  {
	    	HomePage homePage = new HomePage(driver);
			homePage.enterProuductIntoSearchBoxField("");
			 }

	    @Then("^clicks on search button$")
	    public void clicks_on_search_button()  {
	    	homePage = new HomePage(driver);
	    	 searchResultsPage = homePage.clickOnSearchButton();
	    	 
	    }

	    @Then("^hp products is displayed$")
	    public void hp_products_is_displayed()  {
	    	homePage = new HomePage(driver);
	    	Assert.assertTrue(searchResultsPage.isHPProductDisplayed());
	    	driver.quit();
	    	 
	    }
	    @Then("^Verify a warning informing user to invalid product$")
	    public void verify_a_warning_informing_user_to_invalid_product()  {
	    	Assert.assertEquals(searchResultsPage.getSearchResultsMessage(),prop.getProperty("noproductinsearchresultsmessage"));
	    	driver.quit();
	    }

	    @Then("^Verify a warning informing user to no products is matching$")
	    public void verify_a_warning_informing_user_to_no_products_is_matching()  {
	    	Assert.assertEquals(searchResultsPage.getSearchResultsMessage(),prop.getProperty("noproductinsearchresultsmessage"));
	    	driver.quit();
	    }

	    
}
	    
	
	

