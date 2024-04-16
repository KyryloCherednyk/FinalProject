import org.pages.SearchAdd;
import org.pages.components.HeaderComponent;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SearchTest extends BaseTest {
    public HeaderComponent header;
    public SearchAdd search;


    @BeforeMethod
    public void InitPage() {
        header = new HeaderComponent(driver);
        search = new SearchAdd(driver, header);
    }

    @Test
    private void SearchTest() {

        driver.get("https://pokupon.ua/en");
        header.searchField.click();
        search.fillSearch();
        header.searchButton.click();

    }
}
