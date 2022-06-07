package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    @FindBy(css = ".sds-heading--1")
    public WebElement heading1;

    @FindBy(css = ".signup-block")
    public WebElement p1;

    @FindBy(id = "email")
    public WebElement emailInputBox;

    @FindBy(id = "password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//div[@class='password-help']//a")
    public WebElement forgotPasswordLink;

    @FindBy(css = ".sds-helper-text")
    public WebElement passwordWarning;

    @FindBy(css = "div[class='sds-disclaimer ']")
    public WebElement privacyStatementText;

    @FindBy(css = "button[class='sds-button']")
    public WebElement signInButton;

    @FindBy(css = ".social-title")
    public WebElement connectWithSocialHeading;

    @FindBy(css = ".facebook-button")
    public WebElement signInWithFBLinkText;

    @FindBy(css = ".google-button")
    public WebElement signInWithGoogleLinkText;

    @FindBy(css = ".apple-button")
    public WebElement signInWithAppleLinkText;

    @FindBy(css = ".sds-notification__title")
    public WebElement errorMessageLine1;

    @FindBy(css = ".sds-notification__desc")
    public WebElement errorMessageLine2;

}
