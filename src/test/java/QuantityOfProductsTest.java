import org.pages.CartPage;
import org.pages.DiscountOffersPage;
import org.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class QuantityOfProductsTest extends BaseTest{
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
    public void QuantityOfProductsTest()
    {
        driver.get("https://pokupon.ua/en");
        home.newOffers.click();
        discount.discountCoupon.click();
        discount.chooseOne.click();
        discount.discountOffer.click();
        cart.countOfCoupons.click();
        Assert.assertTrue(cart.totalPrice.isDisplayed(),"Total price is incorrect");

    }
}
