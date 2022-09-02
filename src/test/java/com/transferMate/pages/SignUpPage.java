package com.transferMate.pages;

import com.transferMate.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    public SignUpPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static WebElement radioButton(String buttonName){
        buttonName= buttonName.toLowerCase();
        WebElement radioButton = Driver.getDriver().findElement(By.xpath("(//label[@for='account_type_"+buttonName+"'])[2]"));
        return radioButton;
    }

    @FindBy(id="country")
    public WebElement countryDrop;

    @FindBy(id="first_name")
    public WebElement firstName;

    @FindBy(id="last_name")
    public WebElement lastName;

    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="__pin_mobile_number_international_dialing_code")
    public WebElement phoneDrop;

    @FindBy(id="__pin_mobile_number_mobile_phone")
    public WebElement mobilePhone;

    @FindBy(xpath = "(//div/label[@for='terms_of_use_agree'])[1]")
    public WebElement termsOfUse;

}
