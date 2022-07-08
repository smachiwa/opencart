package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver;

    public CheckoutPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver,this);}
    
    
    @FindBy(css="a[class='btn btn-primary']")
    private WebElement Checkout;
   public void Clickoncheckoutbutton()
   {
  	 Checkout.click(); 
   }
   
   @FindBy(css="input[value='guest']")
   private WebElement Guestusercheckout;
  public void Guestuserbutton()
  {
	  Guestusercheckout.click(); 
  }
  @FindBy(css="#button-account")
  
  private WebElement Guestcontinuebutton;
  
  
 public void ClickonguestContinueButton()
 {
	 Guestcontinuebutton.click(); 
 }
 @FindBy(id="input-payment-firstname")
 
 private WebElement Billerfirstname;
 
public void Billerfirstname(String firstname)
{
	Billerfirstname.sendKeys(firstname);
}

@FindBy(id="input-payment-lastname")

private WebElement Billerlastname;

public void Billerlastname(String lastname)
{
	Billerlastname.sendKeys(lastname);
}
@FindBy(id="input-payment-email")

private WebElement Billeremail;

public void Billeremail(String email)
{
	Billeremail.sendKeys(email);
}

@FindBy(id="input-payment-telephone")

private WebElement Billertelephone;

public void Billertelephone(String telephone)
{
	Billertelephone.sendKeys(telephone);
	
	}
 
@FindBy(id="input-payment-address-1")
private WebElement Billeraddress1;

public void Billeraddress1(String address1)
{
	Billeraddress1.sendKeys(address1);
}
	
@FindBy(id="input-payment-city")
private WebElement Billercity;

public void Billercity(String city)
{
	Billercity.sendKeys(city);
}
	
@FindBy(id="input-payment-postcode")
private WebElement Billerpostcode;

public void Billerpostcode(String postcode)
{
	Billerpostcode.sendKeys(postcode);
}
 
@FindBy(id="input-payment-country")
private WebElement Billercountry;

public void  Billercountry(String country)
{
	Billercountry.sendKeys(country);
}
  
@FindBy(id="input-payment-zone")
private WebElement Billerstate;

public void  Billerstate(String state)
{
	Billerstate.sendKeys(state);
}

@FindBy(css="#button-guest ")
private WebElement Billcontinuestep3;

public void Billcontinuestep3()
{
	Billcontinuestep3.click();
}   

@FindBy(css="#button-shipping-method ")
private WebElement Billcontinuestep4;

public void Billcontinuestep4()
{
	Billcontinuestep4.click();
} 

@FindBy(name="agree")
private WebElement termsandcondition;

public void  termsandcondition(String condition)
{
	termsandcondition.click();
}

@FindBy(css="#button-payment-method ")
private WebElement Billcontinuestep5;

public void Billcontinuestep5()
{
	Billcontinuestep5.click();
}  

@FindBy(css="#button-confirm")
private WebElement confirmorder;

public void  confirmorder()
{
	confirmorder.click();
}


@FindBy(xpath="//div[normalize-space()='First Name must be between 1 and 32 characters!']")
private WebElement fillalldeliverydetails;


public String CheckdeliveryMessage() {
	
	return fillalldeliverydetails.getText();
	
}
}   
   