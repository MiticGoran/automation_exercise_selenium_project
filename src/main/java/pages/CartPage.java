package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getProceedToCheckoutButton() {
        return driver.findElement
                (By.xpath("//a[contains(text(), 'Proceed To Checkout')]"));
    }
    public WebElement getRegisterLoginLink() {
        return driver.findElement
                (By.xpath("//div[@id='checkoutModal']//a[@href='/login']"));
    }
}
