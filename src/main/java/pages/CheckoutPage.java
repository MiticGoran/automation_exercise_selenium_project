package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getDeliveryStreet1() {
        return driver.findElement
                (By.xpath("//ul[@id='address_delivery']//li[4]"));
    }
    public WebElement getDeliveryStreet2() {
        return driver.findElement
                (By.xpath("//ul[@id='address_delivery']//li[5]"));
    }
    public WebElement getDeliveryCityAndStateInfo() {
        return driver.findElement
                (By.xpath("//ul[@id='address_delivery']//li[6]"));
    }
    public WebElement getDeliveryCountry() {
        return driver.findElement
                (By.xpath("//ul[@id='address_delivery']//li[7]"));
    }
    public WebElement getDeliveryPhoneNumber() {
        return driver.findElement
                (By.xpath("//ul[@id='address_delivery']//li[8]"));
    }

    public WebElement getBillingStreet1() {
        return driver.findElement
                (By.xpath("//ul[@id='address_invoice']//li[4]"));
    }
    public WebElement getBillingStreet2() {
        return driver.findElement
                (By.xpath("//ul[@id='address_invoice']//li[5]"));
    }
    public WebElement getBillingCityAndStateInfo() {
        return driver.findElement
                (By.xpath("//ul[@id='address_invoice']//li[6]"));
    }
    public WebElement getBillingCountry() {
        return driver.findElement
                (By.xpath("//ul[@id='address_invoice']//li[7]"));
    }
    public WebElement getBillingPhoneNumber() {
        return driver.findElement
                (By.xpath("//ul[@id='address_invoice']//li[8]"));
    }
    public WebElement getCommentTextArea() {
        return driver.findElement(By.name("message"));
    }
    public WebElement getPlaceOrderButton() {
        return driver.findElement
                (By.xpath("//a[contains(text(), 'Place Order')]"));
    }
    public WebElement getNameOnCardInput() {
        return driver.findElement(By.name("name_on_card"));
    }
    public WebElement getCardNumberInput() {
        return driver.findElement(By.name("card_number"));
    }
    public WebElement getCVCInput() {
        return driver.findElement(By.name("cvc"));
    }
    public WebElement getExpirationMonthInput() {
        return driver.findElement(By.name("expiry_month"));
    }
    public WebElement getExpirationYearInput() {
        return driver.findElement(By.name("expiry_year"));
    }
    public WebElement getPayAndConfirmButton() {
        return driver.findElement(By.id("submit"));
    }
    public String getOrderConfirmedText() {
        return driver.findElement
                (By.xpath("//div[@class='col-sm-9 col-sm-offset-1']/p")).getText();
    }
    public WebElement getDownloadInvoiceButton() {
        return driver.findElement(By.xpath("/a[contains(@class, 'btn btn-default check_out')]"));
    }
    public WebElement getContinueButton() {
        return driver.findElement(By.xpath("//a[@data-qa='continue-button']"));
    }
}
