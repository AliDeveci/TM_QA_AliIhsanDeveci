package com.transferMate.step_definitions;

import com.transferMate.pages.SignUpPage;
import com.transferMate.utilities.ConfigurationReader;
import com.transferMate.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SignUp_StepDefs {

    SignUpPage signUpPage= new SignUpPage();

    @Given("user is on the TransferMate Sign up page")
    public void userIsOnTheTransferMateSignUpPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("signUpPage"));
    }


    @When("user clicks {string} radio button")
    public void userClicksRadioButton(String accountType) {
        signUpPage.radioButton(accountType).click();

    }
}
