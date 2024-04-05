package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "//button[@class='inc quantity-btn']")
    public WebElement countOfCoupons;

    @FindBy(xpath = "(//p[@class='payment-info-item-value'])[3]")
    public WebElement totalPrice;

    public CartPage(WebDriver driver){
        super(driver);
    }
}
