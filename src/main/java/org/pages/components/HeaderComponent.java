package org.pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.BasePage;

import java.time.Duration;

public class HeaderComponent extends BasePage {

    @FindBy(xpath = "//div[@class='login ng-star-inserted']")
    public WebElement loginButton;

    @FindBy(xpath = "(//input[@role='searchbox'])[1]")
    public WebElement searchField;

    @FindBy(xpath = "//button[@class='p-element search-button p-button p-component p-button-icon-only']")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@class='favorite']")
    public WebElement wishList;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
    public WebElement homePage;

    @FindBy(xpath = "(//a[contains(@href, '/en/deals/kiev/eda_i_restorany')])[1]")
    public WebElement filter;

    @FindBy(xpath = "//div[@class='current']")
    public WebElement language;

    @FindBy(xpath = "//a[@href='/uk']")
    public WebElement changeLanguage;

    public void waitForHeader() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginButton));
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public HeaderComponent(WebDriver webDriver) {
            super(webDriver);
    }
}
