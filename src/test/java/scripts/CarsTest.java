package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CarsTest extends Base{

    @Test(priority = 1, description = "TASK 1")
    public void testSignInPageForm() {

        driver.get("https://www.cars.com/");
        homePage.signInLink.click();
        Assert.assertTrue(signInPage.heading1.isDisplayed());
        Assert.assertTrue(signInPage.p1.isDisplayed());
        Assert.assertTrue(signInPage.emailInputBox.isDisplayed());
        Assert.assertTrue(signInPage.emailInputBox.isEnabled());
        Assert.assertEquals(signInPage.emailInputBox.getText(),"Email");
        Assert.assertTrue(signInPage.passwordInputBox.isDisplayed());
        Assert.assertTrue(signInPage.passwordInputBox.isEnabled());
        Assert.assertEquals(signInPage.passwordInputBox.getText(), "Password");
        Assert.assertTrue(signInPage.passwordWarning.isDisplayed());
        Assert.assertEquals(signInPage.passwordWarning.getText(), "Minimum of eight characters");
        Assert.assertTrue(signInPage.forgotPasswordLink.isDisplayed());
        Assert.assertTrue(signInPage.forgotPasswordLink.isEnabled());
        Assert.assertTrue(signInPage.privacyStatementText.isDisplayed());
        Assert.assertTrue(signInPage.signInButton.isDisplayed());
        Assert.assertTrue(signInPage.signInButton.isEnabled());
    }

    @Test(priority = 2, description = "TASK 2: Validate Cars.com Sign in page social media section")
    public void testSignInPageSocialMediaSection() {
        driver.get("https://www.cars.com/");
        homePage.signInLink.click();
        Assert.assertTrue(signInPage.connectWithSocialHeading.isDisplayed());
        Assert.assertEquals(signInPage.connectWithSocialHeading.getText(), "Connect with social");
        Assert.assertTrue(signInPage.signInWithFBLinkText.isDisplayed());
        Assert.assertTrue(signInPage.signInWithFBLinkText.isEnabled());
        Assert.assertTrue(signInPage.signInWithGoogleLinkText.isDisplayed());
        Assert.assertTrue(signInPage.signInWithGoogleLinkText.isEnabled());
        Assert.assertTrue(signInPage.signInWithAppleLinkText.isDisplayed());
        Assert.assertTrue(signInPage.signInWithAppleLinkText.isEnabled());

    }

    @Test(priority = 3, description = "TASK 2: Validate user cannot sign in to Cars.com with invalid credentials")
    public void testSignInInvalidCredential() {

        driver.get("https://www.cars.com/");
        homePage.signInLink.click();
        signInPage.emailInputBox.sendKeys("johndoe@gmail.com");
        signInPage.passwordInputBox.sendKeys("abcd1234");
        signInPage.signInButton.click();
        Assert.assertTrue(signInPage.errorMessageLine1.isDisplayed());
        Assert.assertEquals(signInPage.errorMessageLine1.getText(),"We were unable to sign you in.");
        Assert.assertTrue(signInPage.errorMessageLine2.isDisplayed());
        Assert.assertEquals(signInPage.errorMessageLine2.getText(),"Your email or password was not recognized. Try again soon");


    }

}
