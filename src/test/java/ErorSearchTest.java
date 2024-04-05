import org.pages.BasePage;
import org.pages.SearchAdd;
import org.pages.components.HeaderComponent;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ErorSearchTest extends BaseTest {
    public HeaderComponent header;
    public SearchAdd search;


    @BeforeMethod
    public void InitPage() {
        header = new HeaderComponent(driver);
        search = new SearchAdd(driver, header);
    }

    @Test
    private void ErrorSearchTest() {
        String searchValue = "21324215";
        String errorMessage = "Sorry, there are currently no offers at your request \"21324215\"";
        driver.get("https://pokupon.ua/en");
        header.searchField.click();
        header.searchField.sendKeys(searchValue);
        header.searchButton.click();

        var actionResult = search.errorSearch.getText();

        Assert.assertEquals(actionResult, errorMessage, "Message didn't found");

    }
}
