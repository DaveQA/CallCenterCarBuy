import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class mitelLoginScreen {

    private static WebDriver driver;

    public static String empty_InformationOnTheMitelLoginScreen(WebDriver driver1) {
        driver = driver1;
        getToMitelLoginScreen(driver);
        typing_Input_MitelLogin_Empty(driver);
        clicking_MainLoginScreen_LoginButton();
        String currentURL = driver.getCurrentUrl();
        clicking_Button_Skip();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static String bad_InformationOnTheMitelLoginScreen(WebDriver driver1) {
        driver = driver1;
        getToMitelLoginScreen(driver);
        typing_Input_MitelLogin_Bad(driver);
        clicking_MitelLoginScreen_LoginButton();
        String currentURL = driver.getCurrentUrl();
        clicking_Button_Skip();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static String fake_InformationOnTheMitelLoginScreen(WebDriver driver1) {
        driver = driver1;
        getToMitelLoginScreen(driver);
        typing_Input_MitelLogin_Fake(driver);
        clicking_MitelLoginScreen_LoginButton();
        String currentURL = driver.getCurrentUrl();
        clicking_Button_Skip();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static String good_InformationOnTheMitelLoginScreen(WebDriver driver1) {
        driver = driver1;
        getToMitelLoginScreen(driver);
        typing_Input_MitelLogin_Good(driver);
        clicking_MitelLoginScreen_LoginButton();
        String currentURL = driver.getCurrentUrl();
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static void getToMitelLoginScreen(WebDriver driver1){
        driver = driver1;
        typing_Input_MainLogin_Good(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
    }
}