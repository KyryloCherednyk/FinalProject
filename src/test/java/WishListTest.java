import org.pages.AddToWishList;
import org.pages.LogIn;
import org.pages.SearchAdd;
import org.pages.components.HeaderComponent;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WishListTest extends BaseTest{
    public HeaderComponent header;
    public AddToWishList wish;
    public LogIn logg;

    @BeforeMethod
    public void InitPage() {
        header = new HeaderComponent(driver);
        wish = new AddToWishList(driver, header);
        logg = new LogIn(driver);
    }

    @Test
    private void AddTest()
    {
        String acceptingResult = "Up to 3 hours of play at the Sky Mall bowling club";
        driver.get("https://pokupon.ua/en");
        header.loginButton.click();
        logg.fillLogin();
        logg.fillPassword();
        logg.submitButton.click();
        wish.addToWishList();
        header.wishList.click();
        var actualResult = wish.itemInWishList.getText();
        Assert.assertEquals(acceptingResult,actualResult,"Item didn't found");


    }
}
