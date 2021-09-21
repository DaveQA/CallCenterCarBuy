import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class quoteWorkFlow {

    private static WebDriver driver;

    public static void fillingOutFirstScreen(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        firstNameLastNameFields.enterStaticFirstName();
        firstNameLastNameFields.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        phoneNumberAlternateNumberFields.enterGoodPhoneNumber();
        emailAddressField.enterGoodEmailAddress();
        utilities.clickNextButton();
    }

    public static void gettingToCarPartListContainer(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarStatic();
        utilities.pickingMakeOfCarStatic();
        utilities.pickingModelOfCarStatic();
        utilities.clickNextButton();
        utilities.clickingNoRadioButtonIsThereDamageToCar();
        utilities.clickNextButton();
    }

    public static void passTheQuoteScreen (WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartEngine();
        utilities.pickingCarPartTransmission();
        utilities.clickNextButton();
                Thread.sleep(1000);
        WebElement scrollToTopOfWizard = driver.findElement(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div > div > div.todo-content > div > div.portlet-title > div.caption"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToTopOfWizard);
                Thread.sleep(1000);
        utilities.clickNextButton();
    }
}
