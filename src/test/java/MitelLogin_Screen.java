import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class MitelLogin_Screen {

    private static WebDriver driver;

    public static String mitelLoginAttempt_Empty(WebDriver driver1) {
        driver = driver1;
        getToThe_MitelLoginScreen(driver);
        typing_Input_MitelLogin_Empty(driver);
        clicking_MainLoginScreen_LoginButton();
        String currentURL = driver.getCurrentUrl();
        clicking_Button_Skip();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static String mitelLoginAttempt_Bad(WebDriver driver1) {
        driver = driver1;
        getToThe_MitelLoginScreen(driver);
        typing_Input_MitelLogin_Bad(driver);
        clicking_MitelLoginScreen_LoginButton();
        String currentURL = driver.getCurrentUrl();
        clicking_Button_Skip();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static String mitelLoginAttempt_Fake(WebDriver driver1) {
        driver = driver1;
        getToThe_MitelLoginScreen(driver);
        typing_Input_MitelLogin_Fake(driver);
        clicking_MitelLoginScreen_LoginButton();
        String currentURL = driver.getCurrentUrl();
        clicking_Button_Skip();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static String mitelLoginAttempt_Valid(WebDriver driver1) {
        driver = driver1;
        getToThe_MitelLoginScreen(driver);
        typing_Input_MitelLogin_Good(driver);
        clicking_MitelLoginScreen_LoginButton();
        String currentURL = driver.getCurrentUrl();
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        waitOnBothErrorMessageAndLoadingGif();
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static String mitelLoginAttempt_WhiteSpace(WebDriver driver1) {
        driver = driver1;
        getToThe_MitelLoginScreen(driver);
        typing_Input_MitelLogin_WhiteSpace(driver);
        clicking_MitelLoginScreen_LoginButton();
        String currentURL = driver.getCurrentUrl();
        clicking_Button_Skip();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static String mitelLoginAttempt_JustUsername(WebDriver driver1) {
        driver = driver1;
        getToThe_MitelLoginScreen(driver);
        typing_Input_MitelLogin_JustUsername(driver);
        clicking_MitelLoginScreen_LoginButton();
        String currentURL = driver.getCurrentUrl();
        clicking_Button_Skip();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static String mitelLoginAttempt_JustPassword(WebDriver driver1) {
        driver = driver1;
        getToThe_MitelLoginScreen(driver);
        typing_Input_MitelLogin_JustPassword(driver);
        clicking_MitelLoginScreen_LoginButton();
        String currentURL = driver.getCurrentUrl();
        clicking_Button_Skip();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static void getToThe_MitelLoginScreen(WebDriver driver1){
        driver = driver1;
        typing_Input_MainLogin_Good(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
    }
}