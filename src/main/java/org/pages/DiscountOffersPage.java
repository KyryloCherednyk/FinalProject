package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscountOffersPage extends BasePage {

    @FindBy(xpath = "//a[contains(@href,'/en/deals/item/758823')]")
    public WebElement discountCoupon;

    @FindBy(xpath = "//span[@class='benefit-value']")
    public WebElement currentDiscount;

    @FindBy(xpath = "//div[@class='enter-campaign-btn ng-star-inserted']")
    public WebElement chooseOne;

    @FindBy(xpath = "//a[contains(@href,'/758824')]")
    public WebElement discountOffer;

    public DiscountOffersPage(WebDriver driver) {
        super(driver);
    }
}
