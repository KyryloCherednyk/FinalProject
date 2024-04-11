package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.components.HeaderComponent;

public class SearchAdd extends BasePage {

    public HeaderComponent header;

    public SearchAdd fillSearch() {
        header.searchField.click();
        header.searchField.sendKeys("Sushi");
        header.searchButton.click();
        return this;
    }

    @FindBy(xpath = "//div[@class='no-result ng-star-inserted']")
    public WebElement errorSearch;

    public SearchAdd(WebDriver driver, HeaderComponent header) {
        super(driver);
        this.header = new HeaderComponent(driver);
    }
}
