package org.pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.BasePage;

public class HeaderComponent extends BasePage {
    @FindBy(xpath = "//div[@class='login ng-star-inserted']")
    public WebElement loginButton;
    @FindBy(xpath = "(//input[@role='searchbox'])[1]")
    public WebElement searchField;

    @FindBy(xpath = "//button[@class='p-element search-button p-button p-component p-button-icon-only']")
    public WebElement searchButton;
    @FindBy(xpath = "//a[@class='favorite']")
    public WebElement wishList;
    @FindBy(xpath = "")
    public WebElement homePage;

    public HeaderComponent(WebDriver webDriver) {
        super(webDriver);
    }
}
