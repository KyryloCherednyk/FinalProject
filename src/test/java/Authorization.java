import org.pages.LogIn;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Authorization extends BaseTest{
    public LogIn logg;

    @BeforeMethod
    public void InitPage()
    {
        logg = new LogIn(driver);
    }

    @Test
    public void AuthorizationTest()
    {
        driver.get("https://pokupon.ua/en");

        logg.loginButton.click();
        logg.fillLogin();
        logg.fillPassword();
        logg.submitButton.click();

    }
}
