import org.pages.CartPage;
import org.pages.DiscountOffersPage;
import org.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class QuantityOfProductsTest extends BaseTest {
    public CartPage cart;
    public HomePage home;
    public DiscountOffersPage discount;

    @BeforeMethod
    public void InitPage() {
        home = new HomePage(driver);
        discount = new DiscountOffersPage(driver);
        cart = new CartPage(driver);
    }

    @Test
    public void QuantityOfProductsTest() {
        driver.get("https://pokupon.ua/en");
        home.clickNewOffers();
        discount.clickDiscountCoupon();
        discount.clickChooseOne();
        discount.clickDiscountOffer();
        cart.clickCountOfCoupons();
        Assert.assertTrue(cart.totalPrice.isDisplayed(), "Total price is incorrect");
    }
}
