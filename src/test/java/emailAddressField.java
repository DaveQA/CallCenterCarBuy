import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static ClickLinkUtilities.clickLinks.*;

public class emailAddressField {

    private static WebDriver driver;

    public static boolean emailRequirementCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        enterGoodLoginInfo(driver);
        clickTheLoginButton();
        clickCallCodeButton();
        enterStaticFirstName();
        enterStaticLastName();
        clickNextButton();
        clickNewQuoteButton();
        enterGoodPhoneNumber();
        clickNextButton();
        boolean emailRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div.form-group.has-error > div > p")).size() > 0;
        clickTheRefreshButton();
        logOutOfApplication();
        return emailRequiredText;
    }

    public static String enteringInvalidEmailAddressInformationCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        enterGoodLoginInfo(driver);
        clickTheLoginButton();
        clickCallCodeButton();
        enterStaticFirstName();
        enterStaticLastName();
        clickNextButton();
        clickNewQuoteButton();
        enterGoodPhoneNumber();
        enteringInvalidEmailAddressInformation();
        clickNextButton();
        String emailInvalid = driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div.form-group.has-error > div > p")).getText();
                Thread.sleep(2000);
        clickTheRefreshButton();
        logOutOfApplication();
        return emailInvalid;
    }

    public static String enteringFakeEmailAddressInformationCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        enterGoodLoginInfo(driver);
        clickTheLoginButton();
        clickCallCodeButton();
        enterStaticFirstName();
        enterStaticLastName();
        clickNextButton();
        clickNewQuoteButton();
        enterGoodPhoneNumber();
        enteringFakeEmailAddressInformation();
        clickNextButton();
        String emailFake = driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div.form-group.has-error > div > p")).getText();
                Thread.sleep(2000);
        clickTheRefreshButton();
        logOutOfApplication();
        return emailFake;
    }
}
