package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getSignupNameInput() {
        return driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
    }
    public WebElement getSignupEmailInput() {
        return driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
    }
    public WebElement getLoginEmailInput() {
        return driver.findElement(By.xpath("//input[@data-qa='login-email']"));
    }
    public WebElement getLoginPasswordInput() {
        return driver.findElement(By.xpath("//input[@data-qa='login-password']"));
    }
    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("//button[@data-qa='login-button']"));
    }
    public WebElement getSignupButton() {
        return driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
    }
    public void waitForSignupLoginPage() {
        wait.until(ExpectedConditions
            .visibilityOfElementLocated(By.className("signup-form")));
    }
    public String getSignupText() {
        return driver.findElement(By.xpath("//div[@class='signup-form']/h2")).getText();
    }
    public String getLoginText() {
        return driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
    }
}
