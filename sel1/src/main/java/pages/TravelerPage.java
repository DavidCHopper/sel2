package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;


public class TravelerPage extends BasePage {

    @FindBy(xpath = "//a/img[@src='/portalserver/content/atom/contentRepository/content/person/travel/banner-zashita-traveler.jpg?id=f6c836e1-5c5c-4367-b0d0-bbfb96be9c53']/..")
    WebElement iOnline;


    public TravelerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void checkTitle(String expected) {
        assertEquals(expected, driver.findElement(By.xpath("/html/head/title")).getText());
    }

    public void issueOnline(){
        iOnline.click();
    }
}