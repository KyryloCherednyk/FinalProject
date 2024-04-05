package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    @FindBy(xpath = "(//a[contains(@class, 'campaign-tile')])[1]")
    public WebElement coupon;

    @FindBy(xpath = "//div[@class='description-wrapper']")
    public WebElement couponDescription;
    @FindBy(xpath = "//a[@href='/en/pg/contacts']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//a[@href='/en/deals/kiev/new-offers']")
    public WebElement newOffers;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
