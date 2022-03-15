import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static ClickLinkUtilities.clickLinks.*;

public class mainLoginPage {

    private static WebDriver driver;

    public static String enteringNoUserInformationOnTheLoginPage(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        enterNoLoginInfo(driver);
        clickTheLoginButton();
        String currentURLAfterNoUserInfoEntered = driver.getCurrentUrl();
                Thread.sleep(1000);
        return currentURLAfterNoUserInfoEntered;
    }

    public static String enteringBadUserInformationOnTheLoginPage(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        enterBadLoginInfo(driver);
        goToLoginPage();
        String currentURLAfterBadUserInfoEntered = driver.getCurrentUrl();
                Thread.sleep(1000);
        return currentURLAfterBadUserInfoEntered;
    }

    public static String enteringGoodUserInformationOnTheLoginPage(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        enterGoodLoginInfo(driver);
        clickTheLoginButton();
        String currentURLAfterGoodInfoEntered = driver.getCurrentUrl();
        clickSkipButton();
        logOutOfApplication();
        logOutOfApplication();
        return currentURLAfterGoodInfoEntered;
    }
}
