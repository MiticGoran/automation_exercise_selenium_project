package tests;

import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class AutomationExerciseTests extends BasicTest {
    @Test(priority = 10)
    @Description("Test Case 1: Register User")
    public void registerUser() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/",
                "Wrong URL!");
        navPage.getLoginSignupLink().click();
        loginPage.waitForSignupLoginPage();
        Assert.assertTrue(loginPage.getSignupText().contains("New User Signup!"),
                "'New User Signup!' is not visible!");
        loginPage.getSignupNameInput().sendKeys("Goran");
        loginPage.getSignupEmailInput().sendKeys(email);
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
        navPage.getLogoutLink().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"),
                "Wrong URL!");
//        navPage.getDeleteAccountLink().click();
//        signupPage.waitForAccountDeletedPage();
//        Assert.assertTrue(signupPage.getAccountDeletedText().contains("ACCOUNT DELETED!"),
//                "'ACCOUNT DELETED!' is not visible!");
//        signupPage.getContinueButton().click();
    }
    @Test(priority = 20)
    @Description("Test Case 2: Login User with correct email and password")
    public void loginWithCorrectData() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/",
                "Wrong URL!");
        navPage.getLoginSignupLink().click();
        loginPage.waitForSignupLoginPage();
        Assert.assertTrue(loginPage.getLoginText().contains("Login to your account"),
                "'Login to your account' is not visible!");
        loginPage.getLoginEmailInput().sendKeys(email);
        loginPage.getLoginPasswordInput().sendKeys("pass12345");
        loginPage.getLoginButton().click();
        Assert.assertTrue(navPage.getLoggedInText().contains("Logged in as Goran"),
                "'Logged in as username' is not visible!");
        navPage.getLogoutLink().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"),
                "Wrong URL!");
//        navPage.getDeleteAccountLink().click();
//        Assert.assertTrue(signupPage.getAccountDeletedText().contains("ACCOUNT DELETED!"),
//                "'ACCOUNT DELETED!' is not visible!");
    }
    @Test(priority = 30)
    @Description("Test Case 3: Login User with incorrect email and password")
    public void loginWithIncorrectData() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/",
                "Wrong URL!");
        navPage.getLoginSignupLink().click();
        loginPage.waitForSignupLoginPage();
        Assert.assertTrue(loginPage.getLoginText().contains("Login to your account"),
                "'Login to your account' is not visible!");
        loginPage.getLoginEmailInput().sendKeys("incorrect@mita.com");
        loginPage.getLoginPasswordInput().sendKeys("incorrect123");
        loginPage.getLoginButton().click();
        Assert.assertTrue(loginPage.getIncorrectDataText().contains("Your email or password is incorrect!"),
                "'Your email or password is incorrect!' is not visible!");
    }
    @Test(priority = 40)
    @Description("Test Case 4: Logout User")
    public void logoutUser() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/",
                "Wrong URL!");
        navPage.getLoginSignupLink().click();
        loginPage.waitForSignupLoginPage();
        Assert.assertTrue(loginPage.getLoginText().contains("Login to your account"),
                "'Login to your account' is not visible!");
        loginPage.getLoginEmailInput().sendKeys(email);
        loginPage.getLoginPasswordInput().sendKeys("pass12345");
        loginPage.getLoginButton().click();
        Assert.assertTrue(navPage.getLoggedInText().contains("Logged in as Goran"),
                "'Logged in as username' is not visible!");
        navPage.getLogoutLink().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"),
                "Wrong URL!");
    }
    @Test(priority = 50)
    @Description("Test Case 5: Register User with existing email")
    public void registerUserWithExistingEmail() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/",
                "Wrong URL!");
        navPage.getLoginSignupLink().click();
        loginPage.waitForSignupLoginPage();
        Assert.assertTrue(loginPage.getSignupText().contains("New User Signup!"),
                "'New User Signup!' is not visible!");
        loginPage.getSignupNameInput().sendKeys("Mita");
        loginPage.getSignupEmailInput().sendKeys(email);
        loginPage.getSignupButton().click();
        Assert.assertTrue(signupPage.getEmailAlreadyExistText().contains("Email Address already exist!"),
                "'Email Address already exist!' notification is not visible!");
    }

    @Test(priority = 60)
    @Description("Test Case 6: Contact Us Form")
    public void contactUsForm() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/",
                "Wrong URL!");
        navPage.getContactUsLink().click();
        Assert.assertTrue(contactPage.getGetInTouchText().contains("GET IN TOUCH"),
                "'GET IN TOUCH' is not visible!");
        contactPage.getNameInput().sendKeys("Goran");
        contactPage.getEmailInput().sendKeys(email);
        contactPage.getSubjectInput().sendKeys("Test subject");
        contactPage.getYourMessageHereTextArea().sendKeys("Test text.");
        contactPage.getUploadFileInput().sendKeys(new File("data/randomimg2.jpg").getAbsolutePath());
        contactPage.getSubmitButton().click();
        contactPage.switchToAlert();
        Assert.assertTrue(contactPage.getSuccessText().contains("Success! Your details have been submitted successfully."),
                "'Success! Your details have been submitted successfully.' is not visible!");
        contactPage.getHomeButton().click();
    }

    @Test(priority = 70)
    @Description("Test Case 7: Verify Test Cases Page")
    public void verifyTestCasesPage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/",
                "Wrong URL!");
        navPage.getTestCasesLink().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/test_cases"),
                "Wrong URL! Not on Test Cases page!");
    }
    @Test(priority = 80)
    @Description("Test Case 8: Verify All Products and product detail page")
    public void verifyProductsAndProductDetailPage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/",
                "Wrong URL!");
        navPage.getProductsLink().click();
        productsPage.waitForProductsPage();
        Assert.assertTrue(driver.getCurrentUrl().contains("/products"),
                "Wrong URL! Not on All Products page!");
        Assert.assertTrue(productsPage.getProductList().isDisplayed(),
                "Product list is not visible!");
        productsPage.getViewProductButtonByNumber(1).click();
        productsPage.waitForProductDetailPage();
        Assert.assertTrue(driver.getCurrentUrl().contains("/product_details"),
                "Wrong URL! Not on 'Product Details' page!");
        Assert.assertTrue(productsPage.getProductDetails().isDisplayed());
    }
    @Test(priority = 90)
    @Description("Test Case 9: Search Product")
    public void searchProduct() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/",
                "Wrong URL!");
        navPage.getProductsLink().click();
        productsPage.waitForProductsPage();
        Assert.assertTrue(driver.getCurrentUrl().contains("/products"),
                "Wrong URL! Not on All Products page!");
        String searchProduct = "white";
        productsPage.getSearchInput().sendKeys(searchProduct);
        productsPage.getSearchButton().click();
        productsPage.waitForSearchedProductsPage();
        productsPage.productsRelateToSearch();
        for (int i = 0; i < productsPage.productsRelateToSearch().size(); i++) {
            Assert.assertTrue(productsPage.productsRelateToSearch().get(i).contains(searchProduct),
                    "Product does not contain " + searchProduct);
        }
    }
    @Test(priority = 100)
    @Description("Test Case 10: Verify Subscription in home page")
    public void verifySubscriptionInHomePage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/",
                "Wrong URL!");
        new Actions(driver).scrollToElement(homePage.getFooter()).perform();
        Assert.assertTrue(homePage.getSubscriptionText().contains("SUBSCRIPTION"),
                "'SUBSCRIPTION' text not visible!");
        homePage.getSubscrptionEmailInput().sendKeys(email);
        homePage.getSubscribeButton().click();
        Assert.assertTrue(homePage.getSuccessSubscriptionAlertText().contains("You have been successfully subscribed!"),
                "'You have been successfully subscribed!' is not visible!");
    }
    @Test(priority = 110)
    @Description("Test Case 11: Verify Subscription in Cart page")
    public void verifySubscriptionInCartPage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/",
                "Wrong URL!");
        navPage.getCartLink().click();
        new Actions(driver).scrollToElement(homePage.getFooter()).perform();
        Assert.assertTrue(homePage.getSubscriptionText().contains("SUBSCRIPTION"),
                "'SUBSCRIPTION' text not visible!");
        homePage.getSubscrptionEmailInput().sendKeys(email);
        homePage.getSubscribeButton().click();
        Assert.assertTrue(homePage.getSuccessSubscriptionAlertText().contains("You have been successfully subscribed!"),
                "'You have been successfully subscribed!' is not visible!");
    }
    @Test(priority = 120)
    @Description("Test Case 12: Add Products in Cart")
    public void addProductsInCart() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/",
                "Wrong URL!");
        navPage.getProductsLink().click();
        productsPage.getAddToCartButtonByNumber(1).click();
        productsPage.getContinueShoppingButton().click();
        productsPage.getAddToCartButtonByNumber(2).click();
        productsPage.getViewCartButton().click();
        productsPage.productsInCart();
        Assert.assertEquals(productsPage.productsInCart().size(), 2,
                "Number of items in the cart is not 2!");
        Assert.assertEquals(productsPage.getProductQuantityInCart(1), "1",
                "Wrong quantity");
        Assert.assertEquals(productsPage.getProductQuantityInCart(2), "1",
                "Wrong quantity!");
        Assert.assertEquals(productsPage.getProductPriceInCart(1), "Rs. 500",
                "Wrong price!");
        Assert.assertEquals(productsPage.getProductPriceInCart(2), "Rs. 400",
                "Wrong price!");
        Assert.assertEquals(productsPage.getProductTotalPriceInCart(1), "Rs. 500",
                "Wrong price!");
        Assert.assertEquals(productsPage.getProductTotalPriceInCart(2), "Rs. 400",
                "Wrong price!");
    }
    @Test(priority = 130)
    @Description("Test Case 13: Verify Product quantity in Cart")
    public void verifyProductQuanityInCart() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/",
                "Wrong URL!");
        navPage.getProductsLink().click();
        productsPage.getViewProductButtonByNumber(3).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/product_details"),
                "Wrong URL! Not on Product Details page!");
        productDetailsPage.getQuantityInput().clear();
        productDetailsPage.getQuantityInput().sendKeys("4");
        productDetailsPage.getAddToCartButton().click();
        productsPage.getViewCartButton().click();
        productsPage.productsInCart();
        Assert.assertEquals(productsPage.getProductQuantityInCart(3), "4",
                "Wrong quantity!");
    }
}
