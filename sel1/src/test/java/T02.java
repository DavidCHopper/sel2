import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import pages.BasePage;

public class T02 extends BaseTest{
    /*private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "drv/geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "http://www.sberbank.ru/ru/person";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }*/

    @Test
    public void testInsurance() throws Exception {
        driver.get(baseUrl + "/");
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        /*wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.xpath("//div[@class='region-list']/a[@class='kit-link kit-link_color_black region-list__toggler']"))));*/
        driver.findElement(By.xpath("//a[@class='kit-link kit-link_pseudo kit-link_color_black alt-menu-collapser__link']")).click();
        driver.findElement(By.xpath("//a[@class='kit-link kit-link_color_black alt-menu-list__link alt-menu-list__link_level_1']")).click();
        //System.out.println(driver.findElement(By.xpath("//h1")).getText());
        assertEquals("«Сбербанк» - Страхование путешественников", driver.findElement(By.xpath("/html/head/title")).getText());
        driver.findElement(By.xpath("//a/img[@src='/portalserver/content/atom/contentRepository/content/person/travel/banner-zashita-traveler.jpg?id=f6c836e1-5c5c-4367-b0d0-bbfb96be9c53']/..")).click();
        driver.findElement(By.xpath("//div[text()='Минимальная']/../..")).click();
        driver.findElement(By.xpath("//span[text()='Оформить']")).click();
        fillField(By.name("insured0_surname"),"ghj");
        fillField(By.name("insured0_name"),"wasd");
        fillField(By.name("insured0_birthDate"),"10.10.2010");
        fillField(By.name("surname"),"jhg");
        fillField(By.name("name"),"dsaw");
        fillField(By.name("middlename"),"qwerty");
        fillField(By.name("birthDate"),"10.10.2010");
        fillField(By.name("passport_series"),"0000");
        fillField(By.name("passport_number"),"000000");
        fillField(By.name("issueDate"),"10.10.2000");
        fillField(By.name("issuePlace"),"bla-bla-bla");
        checkFillField("ghj",By.name("insured0_surname"));
        checkFillField("wasd",By.name("insured0_name"));
        checkFillField("10.10.2010",By.name("insured0_birthDate"));
        checkFillField("jhg",By.name("surname"));
        checkFillField("dsaw",By.name("name"));
        checkFillField("qwerty",By.name("middlename"));
        checkFillField("10.10.2000",By.name("birthDate"));
        checkFillField("0000",By.name("passport_series"));
        checkFillField("000000",By.name("passport_number"));
        checkFillField("10.10.2010",By.name("issueDate"));
        checkFillField("bla-bla-bla",By.name("issuePlace"));

        driver.findElement(By.xpath("//span[text()='Продолжить']")).click();
        assertSame(true,driver.findElement(By.xpath("//div[text()='Заполнены не все обязательные поля']")).isDisplayed());
        /*wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.xpath("//input[@class='kit-input__control']"))));


        */
    }

    /*@After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }*/


}
