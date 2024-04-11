package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCommentPage extends BasePage{

    @FindBy (xpath ="//form[@class='ng-untouched ng-pristine ng-valid ng-star-inserted']")
    public WebElement comment;

    @FindBy (xpath = "//div[@class='form-item question']")
    public WebElement commentField;

    @FindBy(xpath = "//input[@placeholder='Enter your name']")
    public WebElement nameField;

    @FindBy(xpath = "//button[@class='form-submit']")
    public WebElement submitComment;

    public AddCommentPage fillComment()
    {
        commentField.click();
        commentField.clear();
        commentField.sendKeys("Hello");
        return this;
    }

    public AddCommentPage fillName()
    {
        nameField.click();
        nameField.clear();
        nameField.sendKeys("Alex");
        return this;
    }

    public AddCommentPage(WebDriver driver) {
        super(driver);
    }
}
