package com.transferMate.pages;

import com.transferMate.utilities.BrowserUtilities;
import com.transferMate.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.NoSuchElementException;

public class SignUpPage {
    public SignUpPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static WebElement radioButton(String buttonName) {

        if (buttonName.startsWith("I")) {
            buttonName = "individual";
        }
        buttonName = buttonName.toLowerCase();
        WebElement radioButton = Driver.getDriver().findElement(By.xpath("(//label[@for='account_type_" + buttonName + "'])[2]"));
        return radioButton;
    }

    public static void chooseCountry(WebElement dropdown, String countryName) {
        List<String> allCountries = BrowserUtilities.dropdownOptionsAsString(dropdown);

        if (!allCountries.contains(countryName)) {
            throw new NoSuchElementException("The dropdown does not contain " + countryName + ", that's why cannot be selected.");
        }

        Select select = new Select(dropdown);
        select.selectByVisibleText(countryName);

    }

    @FindBy(id = "country")
    public WebElement countryDrop;

    @FindBy(id = "first_name")
    public WebElement firstName;

    @FindBy(id = "last_name")
    public WebElement lastName;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "__pin_mobile_number_international_dialing_code")
    public WebElement phoneDrop;

    @FindBy(id = "__pin_mobile_number_mobile_phone")
    public WebElement mobilePhone;

    @FindBy(xpath = "(//div/label[@for='terms_of_use_agree'])[1]")
    public WebElement termsOfUse;

    @FindBy(id = "register_terms_of_use_agree_label_cell")
    public WebElement newsAndOffers;

    @FindBy(id="cal_captcha_f10_question")
    public WebElement captchaQuestion;

    @FindBy(xpath = "//div/input[@name='__calc_captcha_text']")
    public WebElement captchaResult;

    @FindBy(name = "button_subscribe")
    public WebElement openMyFreeAccount;

    @FindBy (className = "logo")
    public WebElement transferMateButton;

    @FindBy(id = "menu_485_115_28617")
    public WebElement signUpButton;




}
