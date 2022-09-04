package com.transferMate.pages;

import com.transferMate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookiesPage {
    public CookiesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div/a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//div/a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinDeclineAll']")
    public WebElement declineCookies;

}
