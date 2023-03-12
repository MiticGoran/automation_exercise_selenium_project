package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getSearchInput() {
        return driver.findElement(By.id("search_product"));
    }
    public WebElement getSearchButton() {
        return driver.findElement(By.id("submit_search"));
    }
    public WebElement getProductList() {
        return driver.findElement(By.className("features_items"));
    }
    public String getAllProductsText() {
        return driver.findElement(By.xpath("//h2[contains(@class, 'title text-center')]")).getText();
    }
    public void waitForProductsPage() {
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'All Products')]")));
    }
    public void waitForProductDetailPage() {
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.className("product-information")));
    }
    public WebElement getProductDetails() {
        return driver.findElement(By.className("product-information"));
    }
    public WebElement getAddToCartButtonByNumber(int productNumber) {
        return driver.findElement
                (By.xpath("//a[@data-product-id='"+productNumber+"']"));
    }
    public WebElement getViewProductButtonByNumber(int productNumber) {
        return driver.findElement
                (By.xpath("//a[@href='/product_details/"+productNumber+"']"));
    }
    public String getProductName() {
        return driver.findElement
                (By.xpath("//div[contains(@class, 'productinfo text-center')]/p")).getText();
    }
    public String getSearchedProductsText() {
        return driver.findElement(By.xpath("//h2[contains(@class, 'title text-center')]")).getText();
    }
    public void waitForSearchedProductsPage() {
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Searched Products')]")));
    }
    public ArrayList<String> productsRelateToSearch() {
        List<WebElement> listOfProducts = driver.findElements(
                By.xpath("//div[@class='features_items']//div[contains(@class, 'productinfo')]/p"));
        ArrayList<String> nameOfProducts = new ArrayList<>();
        for (int i = 0; i < listOfProducts.size(); i++) {
            nameOfProducts.add(listOfProducts.get(i).getText().toLowerCase());
        }
        return nameOfProducts;
    }
}
