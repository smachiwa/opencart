package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamsungPage {
WebDriver driver;
	
	public SamsungPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);

}
	 @FindBy(xpath="//div[@class='swiper-slide text-center swiper-slide-duplicate swiper-slide-active']//img[@alt='iPhone 6']")
     private WebElement tablet;



         public String GalaxytabletText()  {

             return tablet.getText();
}
}