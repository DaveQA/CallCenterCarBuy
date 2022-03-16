import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class mitelLoginScreen {

    private static WebDriver driver;

    public static String empty_InformationOnTheMitelLoginScreen(WebDriver driver1) {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        empty_MitelLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        driver.navigate().refresh();
        return driver.getCurrentUrl();
    }

    public static String bad_InformationOnTheMitelLoginScreen(WebDriver driver1) {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        bad_MitelLoginScreenInformation(driver);
        clicking_MitelLoginScreen_LoginButton();
        return driver.getCurrentUrl();
    }

    public static String fake_InformationOnTheMitelLoginScreen(WebDriver driver1) {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        fake_MitelLoginScreenInformation(driver);
        clicking_MitelLoginScreen_LoginButton();
        return driver.getCurrentUrl();
    }

    public static String good_InformationOnTheMitelLoginScreen(WebDriver driver1) {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        good_MitelLoginScreenInformation(driver);
        clicking_MitelLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        return driver.getCurrentUrl();
    }
}