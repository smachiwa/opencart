package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(css="a[title='Shopping Cart'] span[class='hidden-xs hidden-sm hidden-md']")
     private WebElement ClickOnShoppingCart;

    public void isClickOnShoppingCart()
    {
        ClickOnShoppingCart.click();
    }
    @FindBy(xpath="//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]")
     private WebElement EmptyMessageDisplay;

    public String EmptymessageDisplay()
    {
        return EmptyMessageDisplay.getText();
    }
    @FindBy(name="search")
    private WebElement SearchproductTextField;

    public void Entertheproduct(String MyProduct)
    {
        SearchproductTextField.sendKeys(MyProduct);
    }
    @FindBy(css="button[class='btn btn-default btn-lg']")
    private WebElement SearthButton;

    public void ClickOnSearchButton()
    {
         SearthButton.click();
    }



    @FindBy(linkText="iMac")
    private WebElement ImacProduct;

   public boolean isImacProductDisplayed() {

        return ImacProduct.isDisplayed();
    }

   @FindBy(xpath="//button[@type='button']//i[@class='fa fa-heart']")
   private WebElement AddtoWishList;
   public void clickOnWishList()
   {
       AddtoWishList.click();
   }
   @FindBy(className="alert alert-success alert-dismissible")
   private WebElement Successmessage;
   public boolean isSuccessMessageDisplay()
   {
      return Successmessage.isDisplayed();
   }
   @FindBy(xpath="//span[normalize-space()='Wish List (1)']")
   private WebElement ClickOnWishList;

   public void IsClickonWishlist() {
       ClickOnWishList.click();
   }

   @FindBy(id="input-email")
    private WebElement emailAddressField;
   public void enterEmailAddress(String emailText) {

        emailAddressField.sendKeys(emailText);

    }

    @FindBy(id="input-password")
    private WebElement passwordField;

     public void enterPassword(String passwordText) {

        passwordField.sendKeys(passwordText);

    }

    @FindBy(css="input[value='Login']")
    private WebElement loginButton;

    public AccountPage clickOnLoginButton() {

        loginButton.click();

        return new AccountPage(driver);
    }
    @FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/button[1]/i[1]")
    private WebElement ClickAddToCartonWishListpage;

    public void isClickAddToCartonWishListpage()
    {
        ClickAddToCartonWishListpage.click();
    }
     @FindBy(css=".alert.alert-success.alert-dismissible")
     private WebElement messageAddtoCart;
     public String isMessageDisplay()
     {
         return messageAddtoCart.getText();
     }
     @FindBy(css="button[type='button'] span[class='hidden-xs hidden-sm hidden-md']")
      private WebElement ClickOnAddToCart;
     public void isClickOnAddToCart()
     {
         ClickOnAddToCart.click(); 
     }
      @FindBy(css=".alert.alert-success.alert-dismissible")
      private WebElement Verifymessage;

      public String ismessageVefyDisplay()
      {
          return Verifymessage.getText();
      }
     

      @FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]")
         private WebElement ProductInshoppingcartshown;
      
      public boolean isProductInshoppingcartshownonShoppingCartpage()
      {
   	 return ProductInshoppingcartshown.isDisplayed();
      }
     

      
      
      
     
     
      

}