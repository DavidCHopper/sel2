package pages;

import org.openqa.selenium.*;

public class BasePage {

    WebDriver driver;


    protected void fillFieldO(WebElement element, Object value) {
        if (value instanceof String){
            fillField(element, (String) value);
        }
        else if (value instanceof Keys)
            fillField(element, (Keys) value);
    }

    protected void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    protected void fillField(WebElement element,Keys key) {
        element.clear();
        element.sendKeys(key);
    }

    public void scrollDown() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}