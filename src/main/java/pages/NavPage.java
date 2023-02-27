package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavPage extends BasePage {
    public NavPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getHomeLink() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Home')]"));
    }
    public WebElement getProductsLink() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Products')]"));
    }
    public WebElement getCartLink() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Cart')]"));
    }
    public WebElement getLoginSignupLink() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Login')]"));
    }
    public WebElement getLogoutLink() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Logout')]"));
    }
    public WebElement getDeleteLink() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Delete Account')]"));
    }
    public String getLoggedInText() {
        return driver.findElement(By.xpath("//a[contains(text(), ' Logged in as ')]")).getText();
    }
}
