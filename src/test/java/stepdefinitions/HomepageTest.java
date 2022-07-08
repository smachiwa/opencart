package stepdefinitions;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.AccountPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.SamsungPage;
import pageobjects.SearchResultsPage;
import resources.Base;

public class HomepageTest extends Base {

	WebDriver driver;
	HomePage homePage = null;
	LoginPage loginPage = null;
	AccountPage accountPage = null;
	SearchResultsPage searchResultsPage = null;
	SamsungPage Samsungpage = null;
	

    @Given("^Open the Applications URL$")
    public void open_the_application_url() throws IOException  {
       
        driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		
    }

    @Then("^Click on OpenCart Logo$")
    public void click_on_opencart_logo()  {
    	HomePage homePage = new HomePage(driver);
        homePage.enterProuductIntoSearchBoxField(prop.getProperty("validproduct"));
        searchResultsPage = homePage.clickOnSearchButton();
        driver.quit();
    }

    @Then("^click on banner image$")
    public void click_on_banner_image() throws InterruptedException  {
    	
        
    }

    @Then("^Click on product in description page$")
    public void click_on_product_in_description_page()  {
    	HomePage homePage = new HomePage(driver);
        homePage.enterProuductIntoSearchBoxField(prop.getProperty("validproduct"));
        searchResultsPage = homePage.clickOnSearchButton();
        driver.quit();
    }

    @And("^click on tablet category field$")
    public void click_on_tablet_category_field()  {
        
    }

	
}
