import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class firstNameLastNameFields {

    private static WebDriver driver;

    public static boolean enteringOnlyLastNameCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        clickCallCodeButton();
        enterStaticLastName();
        clickNextButton();
        clickNextButton();
        boolean firstNameRequiredRedText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(1) > p")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return firstNameRequiredRedText;
    }

    public static boolean enteringOnlyFirstNameCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        clickCallCodeButton();
        enterStaticFirstName();
        clickNextButton();
        clickNextButton();
        boolean lastNameRequiredRedText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > p")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return lastNameRequiredRedText;
    }

    public static boolean enteringNeitherFirstNameNorLastNameCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        clickCallCodeButton();
        clickNextButton();
        clickNextButton();
        boolean bothFirstNameAndLastNameRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(1) > p")).size() > 0
                && driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > p")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return bothFirstNameAndLastNameRequiredText;
    }
}
