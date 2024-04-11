import org.pages.DiscountOffersPage;
import org.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DiscountTest extends BaseTest {
    public DiscountOffersPage discount;
    public HomePage home;

    @BeforeMethod
    public void InitPage() {
        home = new HomePage(driver);
        discount = new DiscountOffersPage(driver);
    }

    @Test
    public void DiscountOffersTest()
    {
        String discountValue = "DISCOUNT";
        driver.get("https://pokupon.ua/en");
        home.coupon.click();
        discount.clickCurrentDiscount();
        var actualResult = discount.currentDiscount.getText();

        Assert.assertEquals(actualResult, discountValue, "Discount dosn't apply");
    }
}
