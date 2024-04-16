package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage extends BasePage {

    @FindBy(xpath = "(//button[@class='inc quantity-btn'])[2]")
    public WebElement countOfCoupons;

    @FindBy(xpath = "(//p[@class='payment-info-item-value'])[3]")
    public WebElement totalPrice;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickCountOfCoupons() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(countOfCoupons)).click();
    }
}
