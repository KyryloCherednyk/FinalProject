import org.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CouponDescriptionTest extends BaseTest {
    public HomePage homePage;

    @BeforeMethod
    public void InitPage() {
        homePage = new HomePage(driver);
    }

    @Test
    public void couponDescriptionTest() {
        String acceptingResult = "The ice rink in the DREAM/DREAM yellow Shopping Center is one of the best in the capital thanks to the modern technologies used in its equipment.\n" +
                "The spacious area of the hall allows guests to move without restrictions in maneuvers, because the rink is designed for simultaneous visits by up to 120 people.";
        driver.get("https://pokupon.ua/en");
        homePage.coupon.click();
        var actualResult = homePage.couponDescription.getText();
        Assert.assertEquals(acceptingResult, actualResult, "Descripton did't found");
    }

}
