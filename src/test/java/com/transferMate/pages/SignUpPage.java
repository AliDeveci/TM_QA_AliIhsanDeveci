package com.transferMate.pages;

import com.transferMate.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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


}
