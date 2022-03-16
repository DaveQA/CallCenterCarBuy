import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utilities.clickLinks.*;

public class quoteWorkFlow {

    private static WebDriver driver;

    public static void fillingOutFirstScreen(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        clickCallCodeButton();
        enterStaticFirstName();
        enterStaticLastName();
        clickNextButton();
        clickNewQuoteButton();
        enterGoodPhoneNumber();
        enterGoodEmailAddress();
        clickNextButton();
    }

    public static void fillingOutSecondScreen(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        enteringZipCodeStatic();
        clickNextButton();
        pickingYearOfCarStatic();
        pickingMakeOfCarStatic();
        pickingModelOfCarStatic();
        clickNextButton();
        clickingNoRadioButtonIsThereDamageToCar();
        clickNextButton();
        pickingCarPartEngine();
        pickingCarPartTransmission();
        clickNextButton();
    }

    public static void fillingOutQuoteOfferScreen(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        WebElement scrollToTopOfWizard = driver.findElement(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div > div > div.todo-content > div > div.portlet-title > div.caption"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToTopOfWizard);
        clickNextButton();
    }

    public static void gettingToCarPartListContainer(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        enteringZipCodeStatic();
        clickNextButton();
        pickingYearOfCarStatic();
        pickingMakeOfCarStatic();
        pickingModelOfCarStatic();
        clickNextButton();
        clickingNoRadioButtonIsThereDamageToCar();
        clickNextButton();
    }

    public static void gettingToDoesTheVehicleRunQuestion(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        fillingOutFirstScreen(driver);
        fillingOutSecondScreen(driver);
        fillingOutQuoteOfferScreen(driver);
        clickNextButton();
        doesVehicleRunRadioButton_Yes();
        whereIsVehicleParkedButton_Business();
        clickNextButton();
        clickNextButton();
        clickNextButton();
        datePicker();
    }
}
