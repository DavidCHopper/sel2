package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{

    @FindBy(xpath = "//div[@class='region-list']/a[@class='kit-link kit-link_color_black region-list__toggler']")
    WebElement regionsel;

    @FindBy(xpath = "//a[@href='https://www.facebook.com/bankdruzey']/..")
    WebElement facebook;

    @FindBy(xpath = "//a[@class='kit-link kit-link_pseudo kit-link_color_black alt-menu-collapser__link']")
    WebElement selfinsurance;

    @FindBy(xpath = "//a[@class='kit-link kit-link_color_black alt-menu-list__link alt-menu-list__link_level_1']")
    WebElement insureTraveler;

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void selectRegion(){
        regionsel.click();
    }

    public void checkForVisibility(){
        Assert.assertTrue(facebook.isDisplayed());
    }

    public void selectInsurance(){
        selfinsurance.click();
    }

    /*public void selectInsuranceItem(String itemName){
        selfinsurance.findElement(By.xpath(".//li[contains(@class,'alt-menu')]//a[contains(text(),'"+itemName+"')]")).click();
    }*/

    public void selectInsuranceItem(){
        insureTraveler.click();
    }
}
