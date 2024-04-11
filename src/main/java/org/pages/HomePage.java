package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage extends BasePage {

    @FindBy(xpath = "(//a[contains(@class, 'campaign-tile')])[1]")
    public WebElement coupon;

    @FindBy(xpath = "//div[@class='description-wrapper']")
    public WebElement couponDescription;

    @FindBy(xpath = "//a[@href='/en/pg/contacts']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//a[@href='/en/deals/kiev/new-offers']")
    public WebElement newOffers;

    @FindBy(xpath = "//a[contains(@href,'/dostavka_edy')]")
    public WebElement foodDelivery;

    @FindBy(xpath = "//div[@class='social youtube ng-star-inserted']")
    public WebElement youTube;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickNewOffers() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(newOffers)).click();
    }
}
