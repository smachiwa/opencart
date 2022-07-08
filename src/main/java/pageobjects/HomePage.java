package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver,this);

    }

    @FindBy(css="a[title='My Account']")
    private WebElement myAccountDropMenu;

    @FindBy(linkText="Login")
    private WebElement loginOption;

    @FindBy(linkText="Register")
    private WebElement registerOption;

    @FindBy(name="search")
    private WebElement searchBoxField;

    @FindBy(css="button[class='btn btn-default btn-lg']")
    private WebElement searchButton;

    @FindBy(xpath="//a[normalize-space()='Tablets']")
    private WebElement tabletField;

    @FindBy(xpath="//a[normalize-space()='Your Store']")
    private WebElement appLogo;

    @FindBy(xpath="//a[normalize-space()='Your Store']")
    private WebElement Bannerimage;


    public void clickOnMyAccountDropMenu() {

        myAccountDropMenu.click();

    }

    public LoginPage selectLoginOption() {

        loginOption.click();

        return new LoginPage(driver);

    }

    public RegisterPage selectRegisterOption() {

        registerOption.click();

        return new RegisterPage(driver);

    }

    public void enterProuductIntoSearchBoxField(String productText) {

        searchBoxField.sendKeys(productText);

    }

    public SearchResultsPage clickOnSearchButton() {

        searchButton.click();

        return new SearchResultsPage(driver);
    }

    public void tabletField(){
        tabletField.click();    

    }

    public SearchResultsPage appLogo() {
        appLogo.click();
        return  appLogo();

    }
    public void bannerImage() {
    	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	//WebElement banner;
    	//banner = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='swiper-slide text-center swiper-slide-active']//img[@alt='iPhone 6']")));
    	Bannerimage.click();
    }
    @FindBy(css="a[title='Shopping Cart'] span[class='hidden-xs hidden-sm hidden-md']")
   private WebElement ClickonShoppingCart;
    public void ClickOnShoppingCartonHomePage()
    {
    	ClickonShoppingCart.click();
    }
    @FindBy(xpath="//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]")
    private WebElement YourShoppingCartIsEmptyMessageonShoppingcartpage;
    
    public String YourShoppingCartIsEmptyMessageonShoppingcartpage()
         {
	         return YourShoppingCartIsEmptyMessageonShoppingcartpage.getText();
          }
	
    
    @FindBy(xpath="//ul[@class='list-unstyled']//a[normalize-space()='Order History']")
	private WebElement viewyourOrderHistory;
	
	public void isclickOnviewyourOrderHistory() {
		viewyourOrderHistory.click();


	}		
}