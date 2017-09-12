import org.junit.Test;
import org.openqa.selenium.Keys;
import pages.MainPage;
import pages.RegionAppPage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T1pages extends BaseTest {



    @Test
    public void testInsurance(){
        driver.get(baseUrl + '/');
        MainPage mainPage = new MainPage(driver);
        mainPage.selectRegion();

        RegionAppPage regp = new RegionAppPage(driver);
        List<Object> l = new ArrayList<Object>(Arrays.asList("Нижегородская область", Keys.DOWN,Keys.RETURN));
        regp.selectByTyping(l);

        mainPage.scrollDown();
        mainPage.checkForVisibility();

    }

}

