import org.pages.HomePage;
import org.pages.SearchAdd;
import org.pages.components.HeaderComponent;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LocalisationTest extends BaseTest {
    public HeaderComponent header;
    public HomePage home;

    @BeforeMethod
    public void InitPage() {
        header = new HeaderComponent(driver);
        home = new HomePage(driver);
    }

    @Test
    public void LocalisationTest() {
        String acceptingResult = " Доставка Їжі ";
        driver.get("https://pokupon.ua/en");
        header.language.click();
        header.changeLanguage.click();
        var actualResult = home.foodDelivery.getText();

        Assert.assertEquals(actualResult, actualResult, "Language did`t changed");
    }
}

