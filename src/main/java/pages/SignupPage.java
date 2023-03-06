package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage extends BasePage {
    public SignupPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public String accountInformationText() {
        return driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
    }
    public void waitForAccountInformationPage() {
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//div[@class='login-form']/h2")));
    }
    public void waitForAccountCreatedPage() {
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//*[@data-qa='account-created']")));
    }
    public String getAccountCreatedText() {
        return driver.findElement(By.xpath("//*[@data-qa='account-created']")).getText();
    }
    public String getAccountDeletedText() {
        return driver.findElement(By.xpath("//*[@data-qa='account-deleted']")).getText();
    }
    public WebElement getMrTitleRadioInput() {
        return driver.findElement(By.id("id_gender1"));
    }
    public WebElement getMrsTitleRadioInput() {
        return driver.findElement(By.id("id_gender2"));
    }
    public WebElement getNameInput() {
        return driver.findElement(By.id("name"));
    }
    public WebElement getEmailInput() {
        return driver.findElement(By.id("email"));
    }
    public WebElement getPasswordInput() {
        return driver.findElement(By.id("password"));
    }
    public WebElement getDaySelect() {
        return driver.findElement(By.id("days"));
    }
    public WebElement getMonthSelect() {
        return driver.findElement(By.id("months"));
    }
    public WebElement getYearSelect() {
        return driver.findElement(By.id("years"));
    }
    public WebElement getNewsletterCheckbox() {
        return driver.findElement(By.id("newsletter"));
    }
    public WebElement getSpecialOffersCheckbox() {
        return driver.findElement(By.id("optin"));
    }
    public WebElement getFirstNameInput() {
        return driver.findElement(By.id("first_name"));
    }
    public WebElement getLastNameInput() {
        return driver.findElement(By.id("last_name"));
    }
    public WebElement getCompanyInput() {
        return driver.findElement(By.id("company"));
    }
    public WebElement getAddressInput() {
        return driver.findElement(By.id("address1"));
    }
    public WebElement getAddressSecondInput() {
        return driver.findElement(By.id("address2"));
    }
    public WebElement getCountrySelect() {
        return driver.findElement(By.id("country"));
    }
    public WebElement getStateInput() {
        return driver.findElement(By.id("state"));
    }
    public WebElement getCityInput() {
        return driver.findElement(By.id("city"));
    }
    public WebElement getZipcodeInput() {
        return driver.findElement(By.id("zipcode"));
    }
    public WebElement getMobileNumberInput() {
        return driver.findElement(By.id("mobile_number"));
    }
    public WebElement getCreateAccountButton() {
        return driver.findElement(By.xpath("//button[@data-qa='create-account']"));
    }
    public WebElement getFooter() {
        return driver.findElement(By.id("footer"));
    }
    public WebElement selectDay(int day) {
        return driver.findElement(By.xpath("//select[@id='days']/option[@value='"+day+"']"));
    }
    public WebElement selectMonth(int month) {
        return driver.findElement(By.xpath("//select[@id='months']/option[@value='"+month+"']"));
    }
    public WebElement selectYear(int year) {
        return driver.findElement(By.xpath("//select[@id='years']/option[@value='"+year+"']"));
    }
    public WebElement selectCountry(String countryName) {
        return driver.findElement
                (By.xpath("//select[@id='country']/option[@value='"+countryName+"']"));
    }
    public WebElement getContinueButton() {
        return driver.findElement(By.xpath("//a[@data-qa='continue-button']"));
    }

}
