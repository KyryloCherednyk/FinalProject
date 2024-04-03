package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.components.HeaderComponent;

public class FoodPage extends BasePage {
    public HeaderComponent header;
    @FindBy(xpath = "//a[contains(@href, '/en/deals/kiev/dostavka_edy')]")
    public WebElement applyFilter;
    @FindBy(xpath = "//h1[@class=\"category-title\"]")
    public WebElement foodDeliveryResult;


    public FoodPage(WebDriver driver) {
        super(driver);
        this.header = new HeaderComponent(driver);
    }
}
