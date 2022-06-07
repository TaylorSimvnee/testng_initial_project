package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(css = "a[data-linkname='header-sign-in']")
    public WebElement signInLink;



}
