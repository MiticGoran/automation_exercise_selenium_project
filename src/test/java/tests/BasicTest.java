package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.NavPage;
import pages.LoginPage;
import pages.SignupPage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

public abstract class BasicTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected String baseUrl = "http://automationexercise.com";
    protected NavPage navPage;
    protected LoginPage loginPage;
    protected SignupPage signupPage;
    protected ChromeOptions options;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        options = new ChromeOptions();
        // website is full of ads, adding ad blocker
        options.addArguments
                ("load-extension=C:\\Users\\Mita\\AppData\\Local\\Google\\Chrome" +
                        "\\User Data\\Default\\Extensions\\ggdpplfehdighdpleoegjefnpefgpgfh\\1.0.10_0");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        navPage = new NavPage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        signupPage = new SignupPage(driver, wait);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
    }

    @AfterMethod
    public void afterMethod(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            Date date = Calendar.getInstance().getTime();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
            String strDate = dateFormat.format(date);
            File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(f.toPath(), new File("screenshots/testfail-" + strDate + ".jpg").toPath());
        }
    }

    @AfterClass
    public void afterClass() throws InterruptedException, IOException {
        Thread.sleep(3000);
        driver.quit();
    }
}