import org.pages.*;
import org.pages.components.HeaderComponent;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddCommentTest extends BaseTest {
    public HomePage home;
    public AddCommentPage addComment;
    public HeaderComponent header;
    public LogIn logg;

    @BeforeMethod
    public void InitPage() {
        addComment = new AddCommentPage(driver);
        home = new HomePage(driver);
        header = new HeaderComponent(driver);
        logg = new LogIn(driver);
    }


    @Test
    public void AddCommentTest() {
        driver.get("https://pokupon.ua/en");
        header.waitForHeader();
        header.clickLoginButton();
        logg.waitForLoginPage();
        logg.fillLogin();
        logg.fillPassword();
        logg.clickSubmit();
        home.coupon.click();
        addComment.comment.click();
        Assert.assertFalse(addComment.submitComment.isDisplayed(), "Submit button didn't appear");
    }
}
