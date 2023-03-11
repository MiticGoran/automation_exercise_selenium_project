package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage extends BasePage {
    public ContactPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public String getGetInTouchText() {
        return driver.findElement(By.xpath("//div[@class='contact-form']/h2")).getText();
    }
    public WebElement getNameInput() {
        return driver.findElement(By.xpath("//input[@name='name']"));
    }
    public WebElement getEmailInput() {
        return driver.findElement(By.xpath("//input[@name='email']"));
    }
    public WebElement getSubjectInput() {
        return driver.findElement(By.xpath("//input[@name='subject']"));
    }
    public WebElement getYourMessageHereTextArea() {
        return driver.findElement(By.id("message"));
    }
    public WebElement getUploadFileInput() {
        return driver.findElement(By.xpath("//input[@name='upload_file']"));
    }
    public WebElement getSubmitButton() {
        return driver.findElement(By.xpath("//input[@name='submit']"));
    }
    public WebElement getHomeButton() {
        return driver.findElement(By.xpath("//div[@id='form-section']/a"));
    }
    public String getSuccessText() {
        return driver.findElement
                (By.xpath("//div[contains(@class, 'status alert alert-success')]")).getText();
    }
    public void switchToAlert(){
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
    }
}
