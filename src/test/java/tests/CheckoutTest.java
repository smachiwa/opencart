package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.CheckoutPage;
import pageobjects.HomePage;
import pageobjects.HpPage;
import pageobjects.SearchResultsPage;
import resources.Base;

public class CheckoutTest extends Base {
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
	public void  Checkoutwithvaliddeliverydetails() throws InterruptedException {
		
		 HomePage homePage = new HomePage(driver);
         homePage.enterProuductIntoSearchBoxField(prop.getProperty("validproduct"));
         SearchResultsPage searchResultsPage = homePage.clickOnSearchButton();
         searchResultsPage.AddtocartButton();
         HpPage hppage = new HpPage(driver);
         hppage.AddtocartButtonhp();
         Thread.sleep(6000);
         hppage. Succesfulladded();
         hppage.Addtoshoppingcart();
         CheckoutPage  checkoutpage = new CheckoutPage(driver);
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
         Thread.sleep(5000);
         checkoutpage.Billerstate(prop.getProperty("state"));
         checkoutpage.Billcontinuestep3();
         checkoutpage.Billcontinuestep4();
         checkoutpage.termsandcondition(prop.getProperty("condition"));
         checkoutpage.Billcontinuestep5();
         checkoutpage.confirmorder();
         Thread.sleep(5000);


	}
	
	@Test(priority=2)
	public void CheckoutwithInvaliddeliverydetails() throws InterruptedException {
		
		 HomePage homePage = new HomePage(driver);
         homePage.enterProuductIntoSearchBoxField(prop.getProperty("validproduct"));
         SearchResultsPage searchResultsPage = homePage.clickOnSearchButton();
         searchResultsPage.AddtocartButton();
         HpPage hppage = new HpPage(driver);
         hppage.AddtocartButtonhp();
         Thread.sleep(6000);
         hppage. Succesfulladded();
         hppage.Addtoshoppingcart();
         CheckoutPage  checkoutpage = new CheckoutPage(driver);
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
         Thread.sleep(5000);
         checkoutpage.Billerstate(prop.getProperty("state"));
         checkoutpage.Billcontinuestep3();
         Thread.sleep(5000);
        
	}
	

	@Test(priority=3)
	public void Checkoutwithnofilledddeliverydetails() throws InterruptedException {
		
		 HomePage homePage = new HomePage(driver);
         homePage.enterProuductIntoSearchBoxField(prop.getProperty("validproduct"));
         SearchResultsPage searchResultsPage = homePage.clickOnSearchButton();
         searchResultsPage.AddtocartButton();
         HpPage hppage = new HpPage(driver);
         hppage.AddtocartButtonhp();
         Thread.sleep(5000);
         hppage. Succesfulladded();
         hppage.Addtoshoppingcart();
         CheckoutPage  checkoutpage = new CheckoutPage(driver);
         checkoutpage.Clickoncheckoutbutton();
         Thread.sleep(5000);//its compulsory sometime continuebutton not work
         checkoutpage.Guestuserbutton();
         checkoutpage.ClickonguestContinueButton();
         checkoutpage.Billcontinuestep3();
         Assert.assertEquals(checkoutpage.CheckdeliveryMessage(),prop.getProperty("pleasefillalldeliverydeatis"));
         
        
	}

	
	
}
