package pageObject.tests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pageObject.GeneralPage;
import pageObject.BasePage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    private WebDriver driver;

    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterTest
    public void closeWebDriver(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public BasePage getBasePage(){
        return new BasePage(getDriver());
    }

    public GeneralPage getGeneralPage(){
        return new GeneralPage(getDriver());
    }

}
