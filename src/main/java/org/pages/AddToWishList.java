package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.components.HeaderComponent;

public class AddToWishList extends BasePage {
    public HeaderComponent header;

    @FindBy(xpath = "(//button[contains(@class, 'favorite')])[1]")
    public WebElement elementForWishList;

    @FindBy(xpath = "//p[@class='title']")
    public WebElement itemInWishList;

    public AddToWishList addToWishList() {
        elementForWishList.click();
        return this;
    }

    public AddToWishList(WebDriver driver, HeaderComponent header) {
        super(driver);
        this.header = new HeaderComponent(driver);
    }
}

