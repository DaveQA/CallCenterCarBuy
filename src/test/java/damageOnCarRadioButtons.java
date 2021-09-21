import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class damageOnCarRadioButtons {

    private static WebDriver driver;

    public static boolean pickingNeitherRadioButtonIfThereIsDamage(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarStatic();
        utilities.pickingMakeOfCarStatic();
        utilities.pickingModelOfCarStatic();
        utilities.clickNextButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean nextButtonEnableStatus = driver.findElement(By.cssSelector("#pro-wizard > div.step-wrapper.active > button:nth-child(3)")).isEnabled();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return nextButtonEnableStatus;
    }

    public static boolean RadioButtonYesThereIsDamageOnCarCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarStatic();
        utilities.pickingMakeOfCarStatic();
        utilities.pickingModelOfCarStatic();
        utilities.clickNextButton();
        utilities.clickingYesRadioButtonIsThereDamageToCar();
        boolean typeOfDamageOptionsContainer = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div.form-horizontal > div > div > div")).size() > 0;
            Thread.sleep(1000);
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return  typeOfDamageOptionsContainer;
    }

    public static boolean radioButtonNoThereIsNotDamageOnCarCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarStatic();
        utilities.pickingMakeOfCarStatic();
        utilities.pickingModelOfCarStatic();
        utilities.clickNextButton();
        utilities.clickingNoRadioButtonIsThereDamageToCar();
        boolean typeOfDamageOptionContainer = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div.form-horizontal > div > div > div")).size() > 0;
        utilities.clickNextButton();
            Thread.sleep(1000);
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return typeOfDamageOptionContainer;
    }

    public static String pickingNeitherTypeOfDamageOptionCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarStatic();
        utilities.pickingMakeOfCarStatic();
        utilities.pickingModelOfCarStatic();
        utilities.clickNextButton();
        utilities.clickingYesRadioButtonIsThereDamageToCar();
        utilities.clickNextButton();
        String currentURL = driver.getCurrentUrl();
                Thread.sleep(1000);
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return currentURL;
    }

    public static boolean radioButtonYesToFireRolloverDamageOnCarCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarStatic();
        utilities.pickingMakeOfCarStatic();
        utilities.pickingModelOfCarStatic();
        utilities.clickNextButton();
        utilities.clickingYesRadioButtonIsThereDamageToCar();
        utilities.clickingYesFireFloodOrRolloverAccidentRadioButton();
        boolean sendToPeddleMessageDueToDamage = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div:nth-child(3) > p")).size() > 0;
                Thread.sleep(1000);
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return sendToPeddleMessageDueToDamage;
    }

    public static boolean thereIsNoFireFloodRolloverDamageRadioButtonCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarStatic();
        utilities.pickingMakeOfCarStatic();
        utilities.pickingModelOfCarStatic();
        utilities.clickNextButton();
        utilities.clickingYesRadioButtonIsThereDamageToCar();
        utilities.clickingNoFireFloodOrRolloverAccidentRadioButton();
        boolean detailDamageEditableTextField = driver.findElements(By.cssSelector("#detailDamage")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return  detailDamageEditableTextField;
    }

    public static boolean detailDamageNotesIsRequiredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarStatic();
        utilities.pickingMakeOfCarStatic();
        utilities.pickingModelOfCarStatic();
        utilities.clickNextButton();
        utilities.clickingYesRadioButtonIsThereDamageToCar();
        utilities.clickingNoFireFloodOrRolloverAccidentRadioButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean detailDamageNotesRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div:nth-child(4) > p.text-danger")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return  detailDamageNotesRequiredText;
    }

    public static boolean checkingDetailDamageNotesContainerIsEditableCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarStatic();
        utilities.pickingMakeOfCarStatic();
        utilities.pickingModelOfCarStatic();
        utilities.clickNextButton();
        utilities.clickingYesRadioButtonIsThereDamageToCar();
        utilities.clickingNoFireFloodOrRolloverAccidentRadioButton();
        utilities.enteringDetailDamageNotes();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean detailDamageNotesRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div:nth-child(4) > p.text-danger")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return detailDamageNotesRequiredText;
    }
}
