package com.transferMate.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BasePage {


    @FindBy(id = "menu_485_115_28617")
    public WebElement signUpButton;

    @FindBy (linkText = "https://transfermate.io/?lng=&usr_ctry=113")
    public WebElement transferMateButton;

}
