package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


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

    public void waitForLoginPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginField));
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        wait.until(ExpectedConditions.visibilityOf(submitButton));
    }

    public void enterLogin(String login) {
        loginField.click();
        loginField.clear();
        loginField.sendKeys(login);
    }

    public void enterPassword(String password) {
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public LogIn(WebDriver driver) {
        super(driver);
    }
}
