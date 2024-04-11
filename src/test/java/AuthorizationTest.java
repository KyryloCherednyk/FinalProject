import org.pages.LogIn;
import org.pages.components.HeaderComponent;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AuthorizationTest extends BaseTest{
    public LogIn logg;
    public HeaderComponent header;

    @BeforeMethod
    public void InitPage()
    {
        logg = new LogIn(driver);
        header = new HeaderComponent(driver);
    }

    @Test
    public void AuthorizationTest()
    {
        driver.get("https://pokupon.ua/en");
        header.waitForHeader();
        header.clickLoginButton();
        logg.waitForLoginPage();
        logg.fillLogin();
        logg.fillPassword();
        logg.clickSubmit();

    }
}
