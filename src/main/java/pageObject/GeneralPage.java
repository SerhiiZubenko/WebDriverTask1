package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeneralPage extends BasePage {

    private static final String SEARCH_FIELD = "//textarea[@id='postform-text']";
    private static final String EXPIRATION_FIELD = "//span[@title='Never']";
    private static final String SET_EXPIRATION = "//li[text()='10 Minutes']";
    private static final String INPUT_PAST_NAAME = "//input[@id = 'postform-name']";
    private static final String CREATE_NEW_PAST = "//div//button[text() = 'Create New Paste']";

    public GeneralPage(WebDriver driver) {
        super(driver);
    }

    public void enterText(String text){
        driver.findElement(By.xpath(SEARCH_FIELD)).sendKeys(text);
    }

    public void clickSetExpiration() {
        driver.findElement(By.xpath(EXPIRATION_FIELD)).click();
        driver.findElement(By.xpath(SET_EXPIRATION)).click();
    }

    public void enterPastName (String name){
        driver.findElement(By.xpath(INPUT_PAST_NAAME)).sendKeys(name);
    }

    public void clickCreateNewPasteButton(){
        driver.findElement(By.xpath(CREATE_NEW_PAST)).click();
    }
}
