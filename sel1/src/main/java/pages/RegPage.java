package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPage extends BasePage{

    @FindBy(xpath = "//span[text()='Оформить']")
    WebElement issue;

    @FindBy(xpath = "//div[text()='Минимальная']/../..")
    WebElement minimal;

    public RegPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void makeTwoClicks (){
        minimal.click();
        issue.click();
    }
}
