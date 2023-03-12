package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailsPage extends BasePage {
    public ProductDetailsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void waitForProductDetailsPage() {
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.id("cartModal")));
    }
    public WebElement getQuantityInput() {
        return driver.findElement(By.id("quantity"));
    }
    public WebElement getAddToCartButton() {
        return driver.findElement(By.xpath("//button[contains(@class, 'btn btn-default cart')]"));
    }
    public WebElement getReviewNameInput() {
        return driver.findElement(By.id("name"));
    }
    public WebElement getReviewEmailInput() {
        return driver.findElement(By.id("email"));
    }
    public WebElement getReviewSubmitButton() {
        return driver.findElement(By.id("button-review"));
    }
}
