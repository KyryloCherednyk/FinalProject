package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.components.HeaderComponent;

public class SearchAdd extends BasePage{
    public HeaderComponent header;
    public SearchAdd fillSearch()
    {
        header.searchField.click();
        header.searchButton.click();
        header.searchField.sendKeys("Sushi");
        return this;
    }
    @FindBy(xpath = "(//p[@class='title'])[1]")
    public WebElement searchResult;

    public SearchAdd(WebDriver driver, HeaderComponent header) {
        super(driver);
        this.header = new HeaderComponent(driver);
    }
}
