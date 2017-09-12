package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegionAppPage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Введите название региона']")
    WebElement regInput;



    public RegionAppPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void selectByTyping(List<Object> commands){
        for (Object el : commands)
        {
            fillFieldO(regInput, el);
        }
    }


}
