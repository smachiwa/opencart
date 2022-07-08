package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TabletFieldPage {
	WebDriver driver;

    public  TabletFieldPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver,this);

}
    @FindBy(css="ul[class='thumbnails'] li:nth-child(1) a:nth-child(1)")
    private WebElement tablet;

    public boolean tabletisDisplayed() {
        tablet.isDisplayed();
        return (tabletisDisplayed());
   }
}
