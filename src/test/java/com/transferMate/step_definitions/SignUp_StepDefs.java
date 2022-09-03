package com.transferMate.step_definitions;

import com.transferMate.pages.SignUpPage;
import com.transferMate.utilities.BrowserUtilities;
import com.transferMate.utilities.ConfigurationReader;
import com.transferMate.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class SignUp_StepDefs {

    SignUpPage signUpPage = new SignUpPage();

    @Given("user is on the TransferMate Sign up page")
    public void userIsOnTheTransferMateSignUpPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("signUpPage"));
    }


    @When("user clicks {string} radio button")
    public void userClicksRadioButton(String accountType) {
        signUpPage.radioButton(accountType).click();

    }


    @And("user selects Ireland on Country registration")
    public void userSelectsIrelandOnCountryRegistration() {
        Select country = new Select(signUpPage.countryDrop);
        signUpPage.countryDrop.click();
        country.selectByValue("113");
    }


    @And("user clicks First Name and enters {string}")
    public void userClicksFirstNameAndEnters(String arg0) {
        signUpPage.firstName.sendKeys("Jack");

    }


    @And("user clicks Last Name and enters {string}")
    public void userClicksLastNameAndEnters(String arg0) {
        signUpPage.lastName.sendKeys("Sparrow");
    }


    @And("user clicks Email address and enters {string}")
    public void userClicksEmailAddressAndEnters(String arg0) {
        signUpPage.email.sendKeys("jacksparrow@happy.com", Keys.TAB);
    }


    @And("user selects Ireland on Mobile Phone registration")
    public void userSelectsIrelandOnMobilePhoneRegistration() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(signUpPage.phoneDrop));
        Select phone = new Select(signUpPage.phoneDrop);
        signUpPage.phoneDrop.click();
        phone.selectByValue("ie 353");
    }


    @And("user clicks Mobile Phone and enters {string}")
    public void userClicksMobilePhoneAndEnters(String arg0) {
        signUpPage.mobilePhone.sendKeys("12345678", Keys.TAB);
    }


    @And("user clicks Terms of Use and Privacy Policy checkbox")
    public void userClicksTermsOfUseAndPrivacyPolicyCheckbox() {
        signUpPage.termsOfUse.click();
    }


    @And("user clicks hear about news and offers checkbox")
    public void userClicksHearAboutNewsAndOffersCheckbox() {

        signUpPage.newsAndOffers.click();

    }


    @And("user enters the captcha result")
    public void userEntersTheCaptchaResult() {
        BrowserUtilities.sleep(7);
    }


    @And("user clicks open my free account submit button")
    public void userClicksOpenMyFreeAccountSubmitButton() {
        signUpPage.openMyFreeAccount.click();
    }


    @Then("user lands on email and mobile number verification page")
    public void userLandsOnEmailAndMobileNumberVerificationPage() {

    }


    @And("user selects Ireland on Nationality registration")
    public void userSelectsIrelandOnNationalityRegistration() {
        signUpPage.chooseCountry(signUpPage.countryDrop, "Ireland");
    }

    @Ignore
    @And("user does not click hear about news and offers checkbox")
    public void userDoesNotClickHearAboutNewsAndOffersCheckbox() {
        System.err.println("Bu kodun çıkarılması lazım!");

    }


    @And("user selects Ireland on Country of incorporation registration")
    public void userSelectsIrelandOnCountryOfIncorporationRegistration() {
        signUpPage.chooseCountry(signUpPage.countryDrop, "Ireland");

    }


    @Then("user sees please enter correct information message on incorrect blank")
    public void userSeesPleaseEnterCorrectInformationMessageOnIncorrectBlank() {

    }

    @Ignore
    @And("user does not click Terms of Use and Privacy Policy checkbox")
    public void userDoesNotClickTermsOfUseAndPrivacyPolicyCheckbox() {
        System.err.println("Bu kodun çıkarılması lazım!");

    }

    @Then("user sees red lined check box and can not move forward")
    public void userSeesRedLinedCheckBoxAndCanNotMoveForward() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(signUpPage.termsOfUse).perform();

    }

    @And("user clicks refresh button")
    public void userClicksRefreshButton() {
        Driver.getDriver().navigate().refresh();

    }

    @Then("user sees a javascript alert")
    public void userSeesAJavascriptAlert() {

    }

    @And("user clicks close button")
    public void userClicksCloseButton() {

    }

    @When("user clicks on TransferMate button")
    public void userClicksOnTransferMateButton() {
        signUpPage.transferMateButton.click();
    }

    @And("user lands on home page")
    public void userLandsOnHomePage() {
        String expectedTitle = "International Money Transfers | Cross-Border Payments by TransferMate";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));

    }

    @And("user clicks on Sign up button")
    public void userClicksOnSignUpButton() {
        signUpPage.signUpButton.click();
    }

    @Then("user lands on Sign up page")
    public void userLandsOnSignUpPage() {
        String expectedTitle= "Sign up for your free TransferMate account";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }

}
