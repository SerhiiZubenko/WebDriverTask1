package pageObject;

import org.openqa.selenium.WebDriver;

public class BasePage {

    private static final String URL = "https://pastebin.com/";
    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver =driver;
    }

    public void openUrl(WebDriver driver){
        driver.get(URL);
    }
}
