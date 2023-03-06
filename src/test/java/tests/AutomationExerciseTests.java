package tests;

import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationExerciseTests extends BasicTest {
    @Test(priority = 10)
    @Description("Test Case 1: Register User")
    public void registerUser() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/",
                "Wrong URL!");
        navPage.getLoginSignupLink().click();
        loginPage.waitForSignupLoginPage();
        Assert.assertTrue(loginPage.signupText().contains("New User Signup!"),
                "'New User Signup!' is not visible!");
        loginPage.getSignupNameInput().sendKeys("Goran");
        loginPage.getSignupEmailInput().sendKeys("goran01@goran.com");
        loginPage.getSignupButton().click();
        signupPage.waitForAccountInformationPage();
        Assert.assertTrue(signupPage.accountInformationText().contains("ENTER ACCOUNT INFORMATION"),
                "'ENTER ACCOUNT INFORMATION' is not visible!");
        signupPage.getMrTitleRadioInput().click();
        signupPage.getPasswordInput().sendKeys("pass12345");
        signupPage.getDaySelect().click();
        signupPage.selectDay(4).click();
        signupPage.getMonthSelect().click();
        signupPage.selectMonth(3).click();
        signupPage.getYearSelect().click();
        signupPage.selectYear(1991).click();
        signupPage.getNewsletterCheckbox().click();
        signupPage.getSpecialOffersCheckbox().click();
        new Actions(driver).scrollToElement(signupPage.getZipcodeInput()).perform();
        signupPage.getFirstNameInput().sendKeys("Goran");
        signupPage.getLastNameInput().sendKeys("Mitic");
        signupPage.getCompanyInput().sendKeys("IT Bootcamp");
        signupPage.getAddressInput().sendKeys("New Street, 96");
        signupPage.getAddressSecondInput().sendKeys("Another Street, 33");
        signupPage.getCountrySelect().click();
        signupPage.selectCountry("Canada").click();
        signupPage.getStateInput().sendKeys("New State");
        signupPage.getCityInput().sendKeys("New City");
        signupPage.getZipcodeInput().sendKeys("12300");
        new Actions(driver).scrollToElement(signupPage.getCreateAccountButton()).perform();
        signupPage.getMobileNumberInput().sendKeys("069555333");
        new Actions(driver).scrollToElement(signupPage.getFooter()).perform();
        signupPage.getCreateAccountButton().click();
        signupPage.waitForAccountCreatedPage();
        Assert.assertTrue(signupPage.getAccountCreatedText().contains("ACCOUNT CREATED!"),
                "'ACCOUNT CREATED!' is not visible!");
        signupPage.getContinueButton().click();
        Assert.assertTrue(navPage.getLoggedInText().contains("Logged in as Goran"),
                "'Logged in as username' is not visible!");
        navPage.getDeleteLink().click();
        Assert.assertTrue(signupPage.getAccountDeletedText().contains("ACCOUNT DELETED!"),
                "'ACCOUNT DELETED!' is not visible!");
        signupPage.getContinueButton().click();
    }
}
