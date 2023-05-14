package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrandsPage extends BasePage {
    public BrandsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement verifyBrandsTab() {
        return driver.findElement
                (By.xpath("//div[@class='left-sidebar']//h2[contains(text(), 'Brands')]"));
    }
    public WebElement getPoloBrandLink() {
        return driver.findElement(By.xpath("//a[@href='/brand_products/Polo']"));
    }
    public WebElement verifyPoloBrandPage() {
        return driver.findElement
                (By.xpath("//div[@class='features_items']/h2[contains(text(), 'Brand - Polo Products')]"));
    }
    public WebElement getMadameBrandLink() {
        return driver.findElement(By.xpath("//a[@href='/brand_products/Madame']"));
    }
    public WebElement verifyMadameBrandPage() {
        return driver.findElement
                (By.xpath("//div[@class='features_items']/h2[contains(text(), 'Brand - Madame Products')]"));
    }

}
