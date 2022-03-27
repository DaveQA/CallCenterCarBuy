import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class MainLogin_Screen {

    private static WebDriver driver;

    public static String mainLoginAttempt_Empty(WebDriver driver1) {
        driver = driver1;
        typing_Input_MainLogin_Empty(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        goToLoginPage(driver);
        return driver.getCurrentUrl();
    }

    public static String mainLoginAttempt_Bad(WebDriver driver1) {
        driver = driver1;
        typing_Input_MainLogin_Bad(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        goToLoginPage(driver);
        return driver.getCurrentUrl();
    }

    public static String mainLoginAttempt_Fake(WebDriver driver1) {
        driver = driver1;
        typing_Input_MainLogin_Fake(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        goToLoginPage(driver);
        return driver.getCurrentUrl();
    }

    public static String mainLoginAttempt_WhiteSpace(WebDriver driver1) {
        driver = driver1;
        typing_Input_MainLogin_WhiteSpace(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        String currentURLAfterGoodInfoEntered = driver.getCurrentUrl();
        goToLoginPage(driver);
        return currentURLAfterGoodInfoEntered;
    }

    public static String mainLoginAttempt_JustUsername(WebDriver driver1) {
        driver = driver1;
        typing_Input_MainLogin_JustUsername(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        String currentURLAfterGoodInfoEntered = driver.getCurrentUrl();
        goToLoginPage(driver);
        return currentURLAfterGoodInfoEntered;
    }

    public static String mainLoginAttempt_JustPassword(WebDriver driver1) {
        driver = driver1;
        typing_Input_MainLogin_JustPassword(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        String currentURLAfterGoodInfoEntered = driver.getCurrentUrl();
        goToLoginPage(driver);
        return currentURLAfterGoodInfoEntered;
    }

    public static String mainLoginAttempt_Valid(WebDriver driver1) {
        driver = driver1;
        typing_Input_MainLogin_Good(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        clicking_Button_Skip();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        String currentURLAfterGoodInfoEntered = driver.getCurrentUrl();
//        loggingOutOfApp(driver);
        return currentURLAfterGoodInfoEntered;
    }
}
