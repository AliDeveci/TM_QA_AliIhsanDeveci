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
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        signUpPage.chooseCountry(signUpPage.countryDrop, "Ireland");
    }


    @And("user clicks First Name and enters {string}")
    public void userClicksFirstNameAndEnters(String arg0) {
        signUpPage.firstName.sendKeys("Jack");
    }

    @And("user clicks Last Name and enters {string}")
    public void userClicksLastNameAndEnters(String arg0) {
        signUpPage.lastName.sendKeys("Sparrow");
    }


    @And("user clicks Email address and enters email {string}")
    public void userClicksEmailAddressAndEnters(String arg0) {
        signUpPage.email.sendKeys(BrowserUtilities.emailCreation());
    }


    @And("user selects Ireland on Mobile Phone registration")
    public void userSelectsIrelandOnMobilePhoneRegistration() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(signUpPage.phoneDrop));
        Select phone = new Select(signUpPage.phoneDrop);
        phone.selectByValue("ie 353");
    }


    @And("user clicks Mobile Phone and enters {string}")
    public void userClicksMobilePhoneAndEnters(String arg0) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(signUpPage.mobilePhone));
        signUpPage.mobilePhone.sendKeys("12345678");
    }


    @And("user clicks Terms of Use and Privacy Policy checkbox")
    public void userClicksTermsOfUseAndPrivacyPolicyCheckbox() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(signUpPage.termsOfUse));
        signUpPage.termsOfUse.click();
    }


    @And("user clicks hear about news and offers checkbox")
    public void userClicksHearAboutNewsAndOffersCheckbox() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(signUpPage.newsAndOffers));
        signUpPage.newsAndOffers.click();
    }


    @And("user enters the captcha result")
    public void userEntersTheCaptchaResult() {

        /**   THIS CODE WAS WRITTEN TO HANDLE CAPTCHA, BUT SOMETIMES FAILS. SO SLEEP IS USED TO HANDLE CAPTCHA MANUALLY.
        String s = signUpPage.captchaQuestion.getAttribute("innerText");
        String[] res = s.split(" ");
        int result;
        if (res[1].equals("+")) {
            result = Integer.valueOf(res[0]) + Integer.valueOf(res[2]);
        } else if (res[1].equals("-")) {
            result = Integer.valueOf(res[0]) - Integer.valueOf(res[2]);
        } else {
            throw new RuntimeException("The operations are neither + nor -");
        }

        signUpPage.captchaResult.sendKeys("" + result);
        */

        BrowserUtilities.sleep(5);

    }


    @And("user clicks open my free account submit button")
    public void userClicksOpenMyFreeAccountSubmitButton() {


        signUpPage.openMyFreeAccount.click();
    }


    @Then("user lands on email and mobile number verification page")
    public void userLandsOnEmailAndMobileNumberVerificationPage() {
        String expectedTitle = "Email and Mobile Number Verification";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }


    @And("user selects Ireland on Nationality registration")
    public void userSelectsIrelandOnNationalityRegistration() {
        signUpPage.chooseCountry(signUpPage.countryDrop, "Ireland");
    }


    @And("user selects Ireland on Country of incorporation registration")
    public void userSelectsIrelandOnCountryOfIncorporationRegistration() {
        signUpPage.chooseCountry(signUpPage.countryDrop, "Ireland");
    }


    @Then("user sees please enter correct information message on incorrect blank")
    public void userSeesPleaseEnterCorrectInformationMessageOnIncorrectBlank() {

        String expectedValueOfAriaInvalidFirstName = "true";
        String expectedValueOfAriaInvalidlastName = "true";
        String expectedValueOfAriaInvalidEmail = "true";
        String expectedValueOfAriaInvalidMobilePhone = "true";


        Assert.assertTrue(signUpPage.firstName.getAttribute("aria-invalid").equals(expectedValueOfAriaInvalidFirstName));
        Assert.assertTrue(signUpPage.lastName.getAttribute("aria-invalid").equals(expectedValueOfAriaInvalidlastName));
        Assert.assertTrue(signUpPage.email.getAttribute("aria-invalid").equals(expectedValueOfAriaInvalidEmail));
        Assert.assertTrue(signUpPage.mobilePhone.getAttribute("aria-invalid").equals(expectedValueOfAriaInvalidMobilePhone));


    }


    @Then("user can not move forward")
    public void userCanNotMoveForward() {
        Assert.assertEquals("Sign up for your free TransferMate account", Driver.getDriver().getTitle());
    }

    @And("user clicks refresh button")
    public void userClicksRefreshButton() {
        Driver.getDriver().navigate().refresh();
        BrowserUtilities.sleep(2); //TO SHOW THE JAVASCRIPT ALERT
    }

    @Then("user sees a javascript alert")
    public void userSeesAJavascriptAlert() {
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        //alert.dismiss();
        BrowserUtilities.sleep(2); // TO SHOW THE REFRESHED PAGE

    }

    @When("user clicks on TransferMate button")
    public void userClicksOnTransferMateButton() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(signUpPage.transferMateButton));
        signUpPage.transferMateButton.click();
    }

    @And("user lands on home page")
    public void userLandsOnHomePage() {
        String expectedTitle = "International Money Transfers | Cross-Border Payments by TransferMate";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));

    }

    @And("user clicks on Sign up button")
    public void userClicksOnSignUpButton() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(signUpPage.signUpButton));
        signUpPage.signUpButton.click();
    }

    @Then("user lands on Sign up page")
    public void userLandsOnSignUpPage() {
        String expectedTitle = "Sign up for your free TransferMate account";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }


    @And("user clicks First Name and enters incorrect value as {string}")
    public void userClicksFirstNameAndEntersIncorrectInput(String firstName) {
        signUpPage.firstName.sendKeys(firstName);
    }

    @And("user clicks Last Name and enters incorrect value as {string}")
    public void userClicksLastNameAndEntersIncorrectInput(String lastName) {
        signUpPage.lastName.sendKeys(lastName);
    }

    @And("user clicks Email address and enters incorrect value as {string}")
    public void userClicksEmailAddressAndEntersIncorrectInput(String email) {
        signUpPage.email.sendKeys(email);
    }

    @And("user clicks Mobile Phone and enters incorrect value as {string}")
    public void userClicksMobilePhoneAndEntersIncorrectInput(String phone) {
        signUpPage.mobilePhone.sendKeys(phone);
        JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();
        jse.executeScript("scroll(0, 1000);");
        BrowserUtilities.sleep(2);
    }


}
