import org.pages.FoodPage;
import org.pages.components.HeaderComponent;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FilterTest extends BaseTest{
    public HeaderComponent header;
    public FoodPage foodPage;

    @BeforeMethod
    public void InitPage()
    {
        foodPage = new FoodPage(driver);
        header = new HeaderComponent(driver);
    }
    @Test
    public void ApplyFiltertest()
    {
        String acceptingResult = "Promotions and discounts";
        driver.get("https://pokupon.ua/en");
        header.filter.click();
        foodPage.applyFilter.click();
        var actualResult = foodPage.foodDeliveryResult.getText();
        Assert.assertEquals(actualResult,acceptingResult,"Filter did't apply");


    }
}
