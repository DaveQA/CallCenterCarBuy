import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class mainLoginScreen {

    private static WebDriver driver;

    public static String empty_InformationOnTheMainLoginScreen(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        typing_Input_MainLogin_Empty(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        goToLoginPage(driver);
        return driver.getCurrentUrl();
    }

    public static String bad_InformationOnTheMainLoginScreen(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        typing_Input_MainLogin_Bad(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        goToLoginPage(driver);
        return driver.getCurrentUrl();
    }

    public static String fake_InformationOnTheMainLoginScreen(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        typing_Input_MainLogin_Fake(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        goToLoginPage(driver);
        return driver.getCurrentUrl();
    }

    public static String good_InformationOnTheMainLoginScreen(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        typing_Input_MainLogin_Good(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        String currentURLAfterGoodInfoEntered = driver.getCurrentUrl();
        // The following is used until the driver quit is re-enabled
                clicking_Button_Skip();
                waitOnBothErrorMessageAndLoadingGif();
                clicking_LogoutButton();
                driver.switchTo().alert().accept();
                clicking_LogoutButton();
        waitOnBothErrorMessageAndLoadingGif();
        goToLoginPage(driver);
        return currentURLAfterGoodInfoEntered;
    }
}
