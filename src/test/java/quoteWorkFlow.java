import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class quoteWorkFlow {

    private static WebDriver driver;

    public static boolean enteringOnlyLastNameCheck(WebDriver driver1) throws InterruptedException {
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

    public static boolean enteringOnlyFirstNameCheck(WebDriver driver1) throws InterruptedException {
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

    public static boolean enteringNeitherFirstNameNorLastNameCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean bothFirstNameAndLastNameRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(1) > p")).size() > 0
                && driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return bothFirstNameAndLastNameRequiredText;
    }

    public static boolean enteringNothingInPhoneNumberFieldCheck(WebDriver driver1) throws InterruptedException {
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

    public static boolean enteringAlphaCharactersInPhoneNumberFieldCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        utilities.enterStaticFirstName();
        utilities.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        utilities.enterAlphaCharactersInPhoneNumberField();
        boolean alphaCharactersEnterErrorText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return alphaCharactersEnterErrorText;
    }

    public static boolean enteringSpecialCharactersInPhoneNumberFieldCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        utilities.enterStaticFirstName();
        utilities.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        utilities.enterSpecialCharactersInPhoneNumberField();
        boolean specialCharactersEnterErrorText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return specialCharactersEnterErrorText;
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
}
