import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class phoneNumberAlternateNumberFields {

    private static WebDriver driver;

    public static boolean enteringNothingInPhoneNumberFieldCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        typing_Input_MainLogin_Good(driver);
        clicking_MainLoginScreen_LoginButton();
        clickCallCodeButton();
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        clicking_Button_Next();
        boolean requiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > p")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return requiredText;
    }

    public static boolean enteringAlphaCharactersInPhoneNumberFieldCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        typing_Input_MainLogin_Good(driver);
        clicking_MainLoginScreen_LoginButton();
        clickCallCodeButton();
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_AlphaCharacters();
        boolean alphaCharactersEnterErrorText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > p")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return alphaCharactersEnterErrorText;
    }

    public static boolean enteringSpecialCharactersInPhoneNumberFieldCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        typing_Input_MainLogin_Good(driver);
        clicking_MainLoginScreen_LoginButton();
        clickCallCodeButton();
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_SpecialCharacters();
        boolean specialCharactersEnterErrorText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > p")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return specialCharactersEnterErrorText;
    }

    public static boolean toManyNumbersEnteredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        typing_Input_MainLogin_Good(driver);
        clicking_MainLoginScreen_LoginButton();
        clickCallCodeButton();
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        enteringToManyNumbers();
        boolean toManyNumberEnterErrorText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > p")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return toManyNumberEnterErrorText;
    }
}
