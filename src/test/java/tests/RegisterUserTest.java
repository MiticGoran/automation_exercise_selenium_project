package tests;

import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterUserTest extends BasicTest {
    @Test(priority = 10)
    @Description("Test Case 1: Register User")
    public void visitTheSignupPage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/",
                "Wrong URL!");
        navPage.getLoginSignupLink().click();
        signupLoginPage.waitForSignupLoginPage();
        Assert.assertTrue(signupLoginPage.signupText().contains("New User Signup!"),
                "'New User Signup!' is not visible!");
        signupLoginPage.getSignupNameInput().sendKeys("Goran");
        signupLoginPage.getSignupEmailInput().sendKeys("goran@goran.com");
        signupLoginPage.getSignupButton().click();

    }
}
