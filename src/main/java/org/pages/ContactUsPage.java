package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {
    @FindBy(id = "name")
    public WebElement nameField;

    @FindBy(id = "message")
    public WebElement problemDescription;

    @FindBy(xpath = "//button[@class='form-submit']")
    public WebElement submitButton;

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
}
