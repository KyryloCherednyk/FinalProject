package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DiscountOffersPage extends BasePage {

    @FindBy(xpath = "(//div[@class='discount _blue ng-star-inserted'])[1]")
    public WebElement discountCoupon;

    @FindBy(xpath = "(//span[@class='benefit-title'])[1]")
    public WebElement currentDiscount;

    @FindBy(xpath = "//div[@class='enter-campaign-btn ng-star-inserted']")
    public WebElement chooseOne;

    @FindBy(xpath = "//a[contains(@href,'/759249')]")
    public WebElement discountOffer;

    public DiscountOffersPage(WebDriver driver) {
        super(driver);
    }

    public void clickDiscountCoupon() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(discountCoupon)).click();
    }

    public void clickChooseOne() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(chooseOne)).click();
    }

    public void clickDiscountOffer() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(discountOffer)).click();
    }

    public void clickCurrentDiscount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(currentDiscount)).click();
    }
}
