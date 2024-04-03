package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.components.HeaderComponent;

public class HomePage extends BasePage {

    @FindBy(xpath = "(//a[contains(@class, 'campaign-tile')])[1]")
    public WebElement coupon;

    @FindBy(xpath = "//div[@class='description-wrapper']")
    public WebElement couponDescription;


    public HomePage(WebDriver driver) {
        super(driver);
    }
}
