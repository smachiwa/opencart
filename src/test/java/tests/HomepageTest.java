package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.SamsungPage;
import pageobjects.SearchResultsPage;
import resources.Base;

public class HomepageTest extends Base {
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
	    public void Verifynavigatinghomepagelogo() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
        homePage.enterProuductIntoSearchBoxField(prop.getProperty("validproduct"));
        SearchResultsPage searchResultsPage = homePage.clickOnSearchButton();
	}
	
	@Test(priority=2)
	    public void Verifybannerimage() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
        homePage.bannerImage();
        SamsungPage Samsungpage = new SamsungPage(driver);
        Samsungpage.GalaxytabletText();
	}
	
	
	
	
	
}
