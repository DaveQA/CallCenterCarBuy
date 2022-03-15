import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static ClickLinkUtilities.clickLinks.*;

public class firstNameLastNameFields {

    private static WebDriver driver;

    public static boolean enteringOnlyLastNameCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        enterGoodLoginInfo(driver);
        clickTheLoginButton();
        clickCallCodeButton();
        enterStaticLastName();
        clickNextButton();
        clickNextButton();
        boolean firstNameRequiredRedText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(1) > p")).size() > 0;
        clickTheRefreshButton();
        logOutOfApplication();
        return firstNameRequiredRedText;
    }

    public static boolean enteringOnlyFirstNameCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        enterGoodLoginInfo(driver);
        clickTheLoginButton();
        clickCallCodeButton();
        enterStaticFirstName();
        clickNextButton();
        clickNextButton();
        boolean lastNameRequiredRedText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > p")).size() > 0;
        clickTheRefreshButton();
        logOutOfApplication();
        return lastNameRequiredRedText;
    }

    public static boolean enteringNeitherFirstNameNorLastNameCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        enterGoodLoginInfo(driver);
        clickTheLoginButton();
        clickCallCodeButton();
        clickNextButton();
        clickNextButton();
        boolean bothFirstNameAndLastNameRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(1) > p")).size() > 0
                && driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > p")).size() > 0;
        clickTheRefreshButton();
        logOutOfApplication();
        return bothFirstNameAndLastNameRequiredText;
    }
}
