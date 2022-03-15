import org.openqa.selenium.WebDriver;

public class mainLoginPage {

    private static WebDriver driver;

    public static String enteringNoUserInformationOnTheLoginPage(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterNoLoginInfo(driver);
        utilities.clickTheLoginButton();
        String currentURLAfterNoUserInfoEntered = driver.getCurrentUrl();
                Thread.sleep(1000);
        return currentURLAfterNoUserInfoEntered;
    }

    public static String enteringBadUserInformationOnTheLoginPage(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterBadLoginInfo(driver);
        utilities.goToLoginPage();
        String currentURLAfterBadUserInfoEntered = driver.getCurrentUrl();
                Thread.sleep(1000);
        return currentURLAfterBadUserInfoEntered;
    }

    public static String enteringGoodUserInformationOnTheLoginPage(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        String currentURLAfterGoodInfoEntered = driver.getCurrentUrl();
                Thread.sleep(2000);
        utilities.clickSkipButton();
        utilities.logOutOfApplication();
        return currentURLAfterGoodInfoEntered;
    }
}
