import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class emailAddressField {

    private static WebDriver driver;

    public static boolean emailRequirementCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        firstNameLastNameFields.enterStaticFirstName();
        firstNameLastNameFields.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        phoneNumberAlternateNumberFields.enterGoodPhoneNumber();
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
        firstNameLastNameFields.enterStaticFirstName();
        firstNameLastNameFields.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        phoneNumberAlternateNumberFields.enterGoodPhoneNumber();
        enteringInvalidEmailAddressInformation();
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
        firstNameLastNameFields.enterStaticFirstName();
        firstNameLastNameFields.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        phoneNumberAlternateNumberFields.enterGoodPhoneNumber();
        enteringFakeEmailAddressInformation();
        utilities.clickNextButton();
        String emailFake = driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div.form-group.has-error > div > p")).getText();
        Thread.sleep(2000);
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return emailFake;
    }

    public static void enterGoodEmailAddress() throws InterruptedException {
        utilities.clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > div > input"));
        utilities.typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > div > input"),"vip1000682431@gmail.com");
        Thread.sleep(2000);
    }

    public static void enteringInvalidEmailAddressInformation() throws InterruptedException {
        utilities.clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > div > input"));
        utilities.typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > div > input"),"NotaRealEmail");
        Thread.sleep(2000);
    }

    public static void enteringFakeEmailAddressInformation() throws InterruptedException {
        utilities.clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > div > input"));
        utilities.typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > div > input"),"NotaRealEmail@nope.com");
        Thread.sleep(2000);
    }
}
