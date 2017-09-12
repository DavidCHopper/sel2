package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class RegPage2 extends BasePage{

    @FindBy(xpath = "//span[text()='Продолжить']")
    WebElement continueb;

    @FindBy(xpath = "//div[text()='Заполнены не все обязательные поля']")
    WebElement message;

    public RegPage2(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void fillField(By locator, String value){
        super.fillField(driver.findElement(locator), value);
    }

    public void hitContinue (){
        continueb.click();
    }

    public void checkWords(){
        Assert.assertTrue(message.isDisplayed());
    }

}
