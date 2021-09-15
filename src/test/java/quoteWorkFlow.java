import org.openqa.selenium.WebDriver;

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
        utilities.pickingYearOfCarRandom();
        utilities.pickingModelOfCarRandom();
        utilities.pickingMakeOfCarRandom();
        utilities.clickNextButton();
        utilities.clickingNoRadioButtonIsThereDamageToCar();
        utilities.clickNextButton();
    }
}
