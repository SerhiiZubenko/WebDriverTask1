package pageObject.tests;

import org.testng.annotations.Test;

public class GeneralPageTests extends BaseTest{

    private static final String TEXT = "Hello from WebDriver";
    private static final String NAME = "helloWeb";

    @Test
    public void createNewPast() {
        getBasePage().openUrl(getDriver());
        getGeneralPage().enterText(TEXT);
        getGeneralPage().clickSetExpiration();
        getGeneralPage().enterPastName(NAME);
        getGeneralPage().clickCreateNewPasteButton();
    }
}
