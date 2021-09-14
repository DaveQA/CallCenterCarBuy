import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class quoteWorkFlow {

    private static WebDriver driver;

    public static void fillingOutFirstScreen(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        utilities.enterStaticFirstName();
        utilities.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        phoneNumberAlternateNumberFields.enterGoodPhoneNumber();
        emailAddressField.enterGoodEmailAddress();
        utilities.clickNextButton();
    }
}
