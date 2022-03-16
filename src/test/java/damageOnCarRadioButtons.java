import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class damageOnCarRadioButtons {

    private static WebDriver driver;

    public static boolean pickingNeitherRadioButtonIfThereIsDamage(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        enteringZipCodeStatic();
        clickNextButton();
        pickingYearOfCarStatic();
        pickingMakeOfCarStatic();
        pickingModelOfCarStatic();
        clickNextButton();
        clickNextButton();
        clickNextButton();
        boolean nextButtonEnableStatus = driver.findElement(By.cssSelector("#pro-wizard > div.step-wrapper.active > button:nth-child(3)")).isEnabled();
        clickTheRefreshButton();
        clicking_LogoutButton();
        return nextButtonEnableStatus;
    }

    public static boolean RadioButtonYesThereIsDamageOnCarCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        enteringZipCodeStatic();
        clickNextButton();
        pickingYearOfCarStatic();
        pickingMakeOfCarStatic();
        pickingModelOfCarStatic();
        clickNextButton();
        clickingYesRadioButtonIsThereDamageToCar();
        boolean typeOfDamageOptionsContainer = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div.form-horizontal > div > div > div")).size() > 0;
            Thread.sleep(1000);
        clickTheRefreshButton();
        clicking_LogoutButton();
        return  typeOfDamageOptionsContainer;
    }

    public static boolean radioButtonNoThereIsNotDamageOnCarCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        enteringZipCodeStatic();
        clickNextButton();
        pickingYearOfCarStatic();
        pickingMakeOfCarStatic();
        pickingModelOfCarStatic();
        clickNextButton();
        clickingNoRadioButtonIsThereDamageToCar();
        boolean typeOfDamageOptionContainer = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div.form-horizontal > div > div > div")).size() > 0;
        clickNextButton();
            Thread.sleep(1000);
        clickTheRefreshButton();
        clicking_LogoutButton();
        return typeOfDamageOptionContainer;
    }

    public static String pickingNeitherTypeOfDamageOptionCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        enteringZipCodeStatic();
        clickNextButton();
        pickingYearOfCarStatic();
        pickingMakeOfCarStatic();
        pickingModelOfCarStatic();
        clickNextButton();
        clickingYesRadioButtonIsThereDamageToCar();
        clickNextButton();
        String currentURL = driver.getCurrentUrl();
                Thread.sleep(1000);
        clickTheRefreshButton();
        clicking_LogoutButton();
        return currentURL;
    }

    public static boolean radioButtonYesToFireRolloverDamageOnCarCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        enteringZipCodeStatic();
        clickNextButton();
        pickingYearOfCarStatic();
        pickingMakeOfCarStatic();
        pickingModelOfCarStatic();
        clickNextButton();
        clickingYesRadioButtonIsThereDamageToCar();
        clickingYesFireFloodOrRolloverAccidentRadioButton();
        boolean sendToPeddleMessageDueToDamage = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div:nth-child(3) > p")).size() > 0;
                Thread.sleep(1000);
        clickTheRefreshButton();
        clicking_LogoutButton();
        return sendToPeddleMessageDueToDamage;
    }

    public static boolean thereIsNoFireFloodRolloverDamageRadioButtonCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        enteringZipCodeStatic();
        clickNextButton();
        pickingYearOfCarStatic();
        pickingMakeOfCarStatic();
        pickingModelOfCarStatic();
        clickNextButton();
        clickingYesRadioButtonIsThereDamageToCar();
        clickingNoFireFloodOrRolloverAccidentRadioButton();
        boolean detailDamageEditableTextField = driver.findElements(By.cssSelector("#detailDamage")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return  detailDamageEditableTextField;
    }

    public static boolean detailDamageNotesIsRequiredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        enteringZipCodeStatic();
        clickNextButton();
        pickingYearOfCarStatic();
        pickingMakeOfCarStatic();
        pickingModelOfCarStatic();
        clickNextButton();
        clickingYesRadioButtonIsThereDamageToCar();
        clickingNoFireFloodOrRolloverAccidentRadioButton();
        clickNextButton();
        clickNextButton();
        boolean detailDamageNotesRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div:nth-child(4) > p.text-danger")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return  detailDamageNotesRequiredText;
    }

    public static boolean checkingDetailDamageNotesContainerIsEditableCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        enteringZipCodeStatic();
        clickNextButton();
        pickingYearOfCarStatic();
        pickingMakeOfCarStatic();
        pickingModelOfCarStatic();
        clickNextButton();
        clickingYesRadioButtonIsThereDamageToCar();
        clickingNoFireFloodOrRolloverAccidentRadioButton();
        enteringDetailDamageNotes();
        clickNextButton();
        clickNextButton();
        boolean detailDamageNotesRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div:nth-child(4) > p.text-danger")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return detailDamageNotesRequiredText;
    }
}
