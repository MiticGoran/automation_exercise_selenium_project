package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryPage extends BasePage {
    public CategoryPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement verifyCategoryTab() {
        return driver.findElement
                (By.xpath("//div[@class='left-sidebar']//h2[contains(text(), 'Category')]"));
    }
    public WebElement getWomenCategoryLink() {
        return driver.findElement(By.xpath("//a[@href='#Women']"));
    }
    public WebElement getDressCategoryLink() {
        return driver.findElement(By.xpath("//div[@id='Women']//a[contains(text(), 'Dress')]"));
    }
    public WebElement getTopsCategoryLink() {
        return driver.findElement(By.xpath("//div[@id='Women']//a[contains(text(), 'Tops')]"));
    }
    public WebElement getSareeCategoryLink() {
        return driver.findElement(By.xpath("//div[@id='Women']//a[contains(text(), 'Saree')]"));
    }
    public WebElement verifyDressCategoryPage() {
        return driver.findElement
                (By.xpath("//div[@class='features_items']/h2[contains(text(), 'Women - Dress Products')]"));
    }
    public WebElement getMenCategoryLink() {
        return driver.findElement(By.xpath("//a[@href='#Men']"));
    }
    public WebElement getTShirtsCategoryLink() {
        return driver.findElement(By.xpath("//div[@id='Men']//a[contains(text(), 'Tshirts')]"));
    }
    public WebElement getJeansCategoryLink() {
        return driver.findElement(By.xpath("//div[@id='Men']//a[contains(text(), 'Jeans')]"));
    }
    public WebElement verifyTShirtCategoryPage() {
        return driver.findElement
                (By.xpath("//div[@class='features_items']/h2[contains(text(), 'Men - Tshirts Products')]"));
    }
    public WebElement getKidsCategoryLink() {
        return driver.findElement(By.xpath("//a[@href='#Kids']"));
    }

}
