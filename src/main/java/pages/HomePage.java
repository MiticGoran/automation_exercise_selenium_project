package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getFooter() {
        return driver.findElement(By.id("footer"));
    }
    public String getSubscriptionText() {
        return driver.findElement(By.xpath("//*[@class='single-widget']/h2")).getText();
    }
    public WebElement getSubscrptionEmailInput() {
        return driver.findElement(By.id("susbscribe_email"));
    }
    public WebElement getSubscribeButton() {
        return driver.findElement(By.id("subscribe"));
    }
    public String getSuccessSubscriptionAlertText() {
        return driver.findElement(By.xpath("//div[@id='success-subscribe']/div")).getText();
    }
}
