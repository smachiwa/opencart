package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AccountSuccessPage;
import pageobjects.HomePage;
import pageobjects.RegisterPage;
import resources.Base;

public class RegisterTest extends Base {
	WebDriver driver;
	HomePage homePage = null;
	RegisterPage registerPage = null;
	AccountSuccessPage accountSuccessPage = null;
	
	@Given("^Enter the Application URL$")
    public void open_the_application_url() throws IOException  {
		
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		
    }
    @When("^User enter all mandatory fields$")
    public void user_enter_all_mandatory_fields()  {
    	homePage = new HomePage(driver);
  		homePage.clickOnMyAccountDropMenu();
  	    registerPage = homePage.selectRegisterOption();
  		registerPage.enterFirstName(prop.getProperty("firstname"));
  		registerPage.enterLastName(prop.getProperty("lastname"));
  		registerPage.enterEmailAddress("urmila"+generateTimeStamp()+"@gmail.com");
  		registerPage.enterTelephone(prop.getProperty("telephone"));
  		registerPage.enterPassword(prop.getProperty("validpassword"));
  		registerPage.enterPasswordConfirm(prop.getProperty("validpassword"));
        
        
    }

    @When("^User filled  All fields$")
    public void user_filled_all_fields()  {
    	homePage = new HomePage(driver);
		homePage.clickOnMyAccountDropMenu();
	    registerPage = homePage.selectRegisterOption();
		registerPage.enterFirstName(prop.getProperty("firstname"));
		registerPage.enterLastName(prop.getProperty("lastname"));
		registerPage.enterEmailAddress("urmila"+generateTimeStamp()+"@gmail.com");
		registerPage.enterTelephone(prop.getProperty("telephone"));
		registerPage.enterPassword(prop.getProperty("validpassword"));
		registerPage.enterPasswordConfirm(prop.getProperty("validpassword"));
		registerPage.selectYesOption();
		 
    }

    @When("^User put all mandatory fields$")
    public void user_put_all_mandatory_fields()  {
    	homePage = new HomePage(driver);
		homePage.clickOnMyAccountDropMenu();
	    registerPage = homePage.selectRegisterOption();
		registerPage.enterFirstName(prop.getProperty("firstname"));
		registerPage.enterLastName(prop.getProperty("lastname"));
		registerPage.enterEmailAddress(prop.getProperty("validemail"));
		registerPage.enterTelephone(prop.getProperty("telephone"));
		registerPage.enterPassword(prop.getProperty("validpassword"));
		registerPage.enterPasswordConfirm(prop.getProperty("validpassword"));
		
    }

    @Then("^clicks on checkbox button$")
    public void clicks_on_checkbox_button()  {
    	registerPage.selectAgreeCheckBoxField();
    }

    @Then("^clicks on Continue button$")
    public void clicks_on_continue_button()  {
    	accountSuccessPage = registerPage.clickOnContinueButton();
        
    }

    @Then("^Verify user is  successfully Registerd$")
    public void verify_user_is_successfully_registerd()  {
    	Assert.assertEquals(accountSuccessPage.getAccountCreatedMessage(),prop.getProperty("accountcreatedmessage"));
    	 driver.quit();

    }

    @Then("^Verify user is  warning informing displayed$")
    public void verify_user_is_warning_informing_displayed()  {
    	Assert.assertTrue(registerPage.isAccountNotWarningMessageIsDisplayed());
    	 driver.quit();

    }
}
