import org.pages.ContactUsPage;
import org.pages.HomePage;
import org.pages.SearchAdd;
import org.pages.components.HeaderComponent;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactUsTest extends BaseTest {
    public ContactUsPage contactUsPage;
    public HomePage home;

    @BeforeMethod
    public void InitPage() {
        contactUsPage = new ContactUsPage(driver);
        home = new HomePage(driver);
    }

    @Test
    public void ContactUsTest() {
        String input = "123123";
        driver.get("https://pokupon.ua/en");
        home.contactUsButton.click();
        contactUsPage.nameField.click();
        contactUsPage.nameField.sendKeys(input);
        contactUsPage.problemDescription.click();
        contactUsPage.problemDescription.sendKeys(input);
        contactUsPage.submitButton.click();
    }
}
