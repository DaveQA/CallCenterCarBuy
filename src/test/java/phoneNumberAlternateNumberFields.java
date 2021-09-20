import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class phoneNumberAlternateNumberFields {

    private static WebDriver driver;

    public static boolean enteringNothingInPhoneNumberFieldCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        firstNameLastNameFields.enterStaticFirstName();
        firstNameLastNameFields.enterStaticLastName();
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
        firstNameLastNameFields.enterStaticFirstName();
        firstNameLastNameFields.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        enterAlphaCharactersInPhoneNumberField();
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
        firstNameLastNameFields.enterStaticFirstName();
        firstNameLastNameFields.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        enterSpecialCharactersInPhoneNumberField();
        boolean specialCharactersEnterErrorText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return specialCharactersEnterErrorText;
    }

    public static boolean toManyNumbersEnteredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        firstNameLastNameFields.enterStaticFirstName();
        firstNameLastNameFields.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        enteringToManyNumbers();
        boolean toManyNumberEnterErrorText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return toManyNumberEnterErrorText;
    }

    public static void enterGoodPhoneNumber() throws InterruptedException {
        utilities.clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > input"));
        utilities.typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > input"),"5555555555");
        Thread.sleep(1000);
    }

    public static void enterAlphaCharactersInPhoneNumberField() throws InterruptedException {
        utilities.clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > input"));
        utilities.typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > input"),"Not a Phone Number");
        Thread.sleep(1000);
    }

    public static void enterSpecialCharactersInPhoneNumberField() throws InterruptedException {
        utilities.clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > input"));
        utilities.typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > input"),"@#$%^&*(");
        Thread.sleep(1000);
    }

    public static void enterAlternatePhoneNumber() throws InterruptedException {
        utilities.clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input"));
        utilities.typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input"),"4444444444");
        Thread.sleep(1000);
    }

    public static void enteringToManyNumbers(){
        utilities.typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > input"),"11122233440");
    }
}
