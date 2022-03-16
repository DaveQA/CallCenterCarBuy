import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class mainLoginScreen {

    private static WebDriver driver;

    public static String empty_InformationOnTheMainLoginScreen(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        empty_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        goToLoginPage(driver);
        return driver.getCurrentUrl();
    }

    public static String bad_InformationOnTheMainLoginScreen(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        bad_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        goToLoginPage(driver);
        return driver.getCurrentUrl();
    }

    public static String fake_InformationOnTheMainLoginScreen(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        fake_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        goToLoginPage(driver);
        return driver.getCurrentUrl();
    }

    public static String good_InformationOnTheMainLoginScreen(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        String currentURLAfterGoodInfoEntered = driver.getCurrentUrl();
        // The following is used until the driver quit is re-enabled
                clickingButton_Skip();
                waitOnBothErrorMessageAndLoadingGif();
                clicking_LogoutButton();
                driver.switchTo().alert().accept();
                clicking_LogoutButton();
        waitOnBothErrorMessageAndLoadingGif();
        goToLoginPage(driver);
        return currentURLAfterGoodInfoEntered;
    }
}
