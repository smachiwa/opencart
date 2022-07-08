

	package pageobjects;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class WishListPagePage {
	WebDriver driver;

	    public WishListPagePage(WebDriver driver) {

	        this.driver = driver;
	        PageFactory.initElements(driver,this);

	    }
	    
	    
	    @FindBy(xpath="//a[normalize-space()='wish list']")
	   private WebElement clickonaddtocartOnWishListPage;
	    
	   public AccountPage clickonaddtocartOnWishListPage() 
	    {
	    	clickonaddtocartOnWishListPage.click();
	    	
	    return new AccountPage(driver);
	    }
	    
	    @FindBy(xpath="//tbody/tr[1]/td[6]/button[1]/i[1]")
	    private WebElement successmessDisplayOnWishListpage;
	    
	    public String issuccessmessDisplayasaddtoshoppingcartOnWishListpage()
	    {
	    	return successmessDisplayOnWishListpage.getText();
	    }
	}


