package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LogIn extends BasePage {
    @FindBy(xpath = "//input[@type='email']")
    public WebElement loginField;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordField;
    @FindBy(xpath = "//button[@class='submit-btn']")
    public WebElement submitButton;


    public LogIn fillLogin() {
        loginField.click();
        loginField.clear();
        loginField.sendKeys("krl.cherednik@gmail.com");
        return this;
    }

    public LogIn fillPassword() {
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys("16047906");
        return this;
    }

    public LogIn(WebDriver driver) {
        super(driver);
    }
}
