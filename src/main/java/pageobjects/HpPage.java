package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HpPage {
	WebDriver driver;

    public HpPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver,this);

    }
    
    @FindBy(css="#button-cart")
    private WebElement AddtocartButtonhp;
	
public void AddtocartButtonhp() {
		
	AddtocartButtonhp.click();
		
	}



@FindBy(css=".alert.alert-success.alert-dismissible")
private WebElement successalert;

public void Succesfulladded() {
	
	successalert.isDisplayed();
	
}

@FindBy(linkText="shopping cart")
private WebElement Clickonshoppingcart;

public void Addtoshoppingcart() {
	
	Clickonshoppingcart.click();
	
}
    
    
    
    
    
    
    
    
    
    
    
}
