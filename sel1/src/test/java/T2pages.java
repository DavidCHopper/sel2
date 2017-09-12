import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T2pages extends BaseTest {



    @Test
    public void testInsurance(){
        driver.get(baseUrl + '/');
        MainPage mainPage = new MainPage(driver);
        mainPage.selectInsurance();
        mainPage.selectInsuranceItem();

        TravelerPage tpage = new TravelerPage(driver);
        tpage.checkTitle("«Сбербанк» - Страхование путешественников");
        tpage.issueOnline();

        RegPage regp = new RegPage(driver);
        regp.makeTwoClicks();

        RegPage2 regp2 = new RegPage2(driver);
        regp2.fillField(By.name("insured0_surname"),"ghj");
        regp2.fillField(By.name("insured0_name"),"wasd");
        regp2.fillField(By.name("insured0_birthDate"),"10.10.2010");
        regp2.fillField(By.name("surname"),"jhg");
        regp2.fillField(By.name("name"),"dsaw");
        regp2.fillField(By.name("middlename"),"qwerty");
        regp2.fillField(By.name("birthDate"),"10.10.2010");
        regp2.fillField(By.name("passport_series"),"0000");
        regp2.fillField(By.name("passport_number"),"000000");
        regp2.fillField(By.name("issueDate"),"10.10.2000");
        regp2.fillField(By.name("issuePlace"),"bla-bla-bla");
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
        regp2.hitContinue();
        regp2.checkWords();

    }

}

