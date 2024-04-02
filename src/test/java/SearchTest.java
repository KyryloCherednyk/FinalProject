
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pages.SearchAdd;
import org.pages.components.HeaderComponent;
import org.testng.Assert;
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
    public void SearchTest() {
        String searchValue = "50% Discount on Sushi Sets from Sushi Beach";
        driver.get("https://pokupon.ua/en");
        header.searchField.click();
        search.fillSearch();
        header.searchButton.click();
        var actualResult = search.searchResult.getText();
        Assert.assertEquals(searchValue, actualResult, "Search value is incorrect");
    }
}
