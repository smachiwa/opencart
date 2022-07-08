package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
	
	WebDriver driver;
	
	public SearchResultsPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(linkText="HP LP3065")
	private WebElement hpProduct;
	
	@FindBy(xpath="//div[@id='content']/p[2]")
	private WebElement noProductSearchMessage;
	
	
	
	public boolean isHPProductDisplayed() {
		
		return hpProduct.isDisplayed();
	}
	
	public String getSearchResultsMessage() {
		
		return noProductSearchMessage.getText();
		
	}

    

	/*public SearchResultsPage ClickonAddtoCartButton() {
	      
		return null;
	}*/
	@FindBy(css="div[class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12'] button:nth-child(1)")
    private WebElement AddtocartButton;
	
public void AddtocartButton() {
		
	AddtocartButton.click();
		
	}

@FindBy(xpath="//div[@class='caption']//a[contains(text(),'iMac')]")
private WebElement imacProduct;


public boolean isimacProductDisplayed() {
	
	return imacProduct.isDisplayed();
}
@FindBy(css="button[type='button'] span[class='hidden-xs hidden-sm hidden-md']")
private WebElement ClickOnAddToCartonSearchPage;

public void ClickOnAddToCartonSearchPage()
{
	ClickOnAddToCartonSearchPage.click();
}

@FindBy(linkText="shopping cart")
private WebElement clickonShopingCartOnSearchPage;

public void ClickonshoppingCartOnSearcgPage()
{
	clickonShopingCartOnSearchPage.click();
}




@FindBy(xpath="//button[@type='button']//i[@class='fa fa-heart']")
private WebElement ClickOnAddToWishListonSearchPage;

public void ClickOnAddToWishListonSearchPage()
{
	 ClickOnAddToWishListonSearchPage.click();
}
@FindBy(css=".alert.alert-success.alert-dismissible")
 private WebElement successfullmessageisDisplayonSearchpage;
 
public boolean issuccessfullmessageasaddtowishlistisDisplayonSearchpage()
{
	return successfullmessageisDisplayonSearchpage.isDisplayed();
}
@FindBy(linkText="wish list")
private WebElement ClickOnToWishLisonSearchPage;

public void ClickOnToWishListonSearchPage()
{
	ClickOnToWishLisonSearchPage.click();
}
}

	
	

