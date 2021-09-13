import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class quoteWorkFlow {

    private static WebDriver driver;

    public static boolean firstNameRequirementCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        utilities.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean firstNameRequiredRedText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(1) > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return firstNameRequiredRedText;
    }

    public static boolean lastNameRequirementCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        utilities.enterStaticFirstName();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean lastNameRequiredRedText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return lastNameRequiredRedText;
    }

    public static boolean noNameRequirementCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean bothFirstNameAndLastNameRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return bothFirstNameAndLastNameRequiredText;
    }

    public static boolean phoneNumberRequirementCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        utilities.enterStaticFirstName();
        utilities.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        utilities.clickNextButton();
        boolean requiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return requiredText;
    }

    public static boolean phoneNumberAlphaCharacterFieldCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        utilities.enterStaticFirstName();
        utilities.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        utilities.enterAlphaCharactersInPhoneNumberField();
        boolean alphaNumbersEnterErrorText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return alphaNumbersEnterErrorText;
    }

    public static boolean emailRequirementCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        utilities.enterStaticFirstName();
        utilities.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        utilities.enterGoodPhoneNumber();
        utilities.clickNextButton();
        boolean emailRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div.form-group.has-error > div > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return emailRequiredText;
    }

    public static String enteringInvalidEmailAddressInformationCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        utilities.enterStaticFirstName();
        utilities.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        utilities.enterGoodPhoneNumber();
        utilities.enteringInvalidEmailAddressInformation();
        utilities.clickNextButton();
        String emailInvalid = driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div.form-group.has-error > div > p")).getText();
                Thread.sleep(2000);
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return emailInvalid;
    }

    public static String enteringFakeEmailAddressInformationCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        utilities.enterStaticFirstName();
        utilities.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        utilities.enterGoodPhoneNumber();
        utilities.enteringFakeEmailAddressInformation();
        utilities.clickNextButton();
        String emailFake = driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div.form-group.has-error > div > p")).getText();
                Thread.sleep(2000);
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return emailFake;
    }

    public static boolean yearIsRequiredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean yearRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-2 > p")).size() > 0;
                Thread.sleep(1000);
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return yearRequiredText;
    }

    public static boolean makeIsRequiredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarRandom();
        utilities.clickNextButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean makeRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-3 > p")).size() > 0;
                Thread.sleep(1000);
        return makeRequiredText;
    }

    public static boolean modelIsRequiredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarRandom();
        utilities.pickingMakeOfCarRandom();
        utilities.clickNextButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean modelRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-5 > p")).size() > 0;
                Thread.sleep(1000);
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return modelRequiredText;
    }

    public static boolean allYearMakeModelDropdownsAreRequired(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean nextButtonEnableStatus = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-2 > p")).size() > 0
                    && driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-3 > p")).size() > 0
                        && driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-5 > p")).size() > 0;
        return nextButtonEnableStatus;
    }

    public static boolean notPickingEitherOptionForDamageCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarStatic();
        utilities.pickingMakeOfCarStatic();
        utilities.pickingModelOfCarStatic();
        utilities.clickNextButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean nextButtonEnableStatus = driver.findElement(By.cssSelector("#pro-wizard > div.step-wrapper.active > button:nth-child(3)")).isEnabled();
        return nextButtonEnableStatus;
    }

    public static boolean pickingYesToDamageQuestionCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarStatic();
        utilities.pickingMakeOfCarStatic();
        utilities.pickingModelOfCarStatic();
        utilities.clickNextButton();
        utilities.clickingYesRadioButtonIsThereDamageToCar();
        boolean typeOfDamageOptionsContainer = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div.form-horizontal > div > div > div")).size() > 0;
        return  typeOfDamageOptionsContainer;
    }

    public static boolean pickingNoToDamageQuestionCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarStatic();
        utilities.pickingMakeOfCarStatic();
        utilities.pickingModelOfCarStatic();
        utilities.clickNextButton();
        utilities.clickingNoRadioButtonIsThereDamageToCar();
        boolean typeOfDamageOptionContainer = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div.form-horizontal > div > div > div")).size() > 0;
        utilities.clickNextButton();
        return typeOfDamageOptionContainer;
    }

    public static String pickingNeitherTypeOfDamageOptionCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarStatic();
        utilities.pickingMakeOfCarStatic();
        utilities.pickingModelOfCarStatic();
        utilities.clickNextButton();
        utilities.clickingYesRadioButtonIsThereDamageToCar();
        utilities.clickNextButton();
        String currentURL = driver.getCurrentUrl();
        return currentURL;
    }

    public static boolean pickingYesToFireRolloverDamageOnCar(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarStatic();
        utilities.pickingMakeOfCarStatic();
        utilities.pickingModelOfCarStatic();
        utilities.clickNextButton();
        utilities.clickingYesRadioButtonIsThereDamageToCar();
        boolean sendToPeddleMessageDueToDamage = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div:nth-child(3) > p")).size() > 0;
        return sendToPeddleMessageDueToDamage;
    }

    public static boolean pickingNoFireRollOverDamageOnCar(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarStatic();
        utilities.pickingMakeOfCarStatic();
        utilities.pickingModelOfCarStatic();
        utilities.clickNextButton();
        utilities.clickingNoRadioButtonIsThereDamageToCar();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean clickableCarPartList = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div")).size() > 0;
        return  clickableCarPartList;
    }
}
