import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;
import static Utilities.clickLinks.clicking_LogoutButton;

public class CustomerInformationField_Validations {

    private static WebDriver driver;

    public static boolean primaryPhoneNumberFieldValidation_AlphaCharacters(WebDriver driver1){
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_AlphaCharacters();
        clicking_Button_Next();
        boolean primaryPhoneNumberRequiredRedText = driver.findElements(By.xpath("//p[contains(text(),'The phone field may only contain numeric character')]")).size() > 0;
        loggingOutOfApp(driver);
        return primaryPhoneNumberRequiredRedText;
    }

    public static boolean primaryPhoneNumberFieldValidation_SpecialCharacters(WebDriver driver1){
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_SpecialCharacters();
        clicking_Button_Next();
        boolean primaryPhoneNumberRequiredRedText = driver.findElements(By.xpath("//p[contains(text(),'The phone field may only contain numeric character')]")).size() > 0;
        loggingOutOfApp(driver);
        return primaryPhoneNumberRequiredRedText;
    }

    public static String enteringInvalidEmailAddressInformationCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        typing_Input_MainLogin_Good(driver);
        clicking_MainLoginScreen_LoginButton();
        clickCallCodeButton();
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Valid();
        enteringInvalidEmailAddressInformation();
        clicking_Button_Next();
        String emailInvalid = driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div.form-group.has-error > div > p")).getText();
        Thread.sleep(2000);
        clickTheRefreshButton();
        clicking_LogoutButton();
        return emailInvalid;
    }

    public static String enteringFakeEmailAddressInformationCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        typing_Input_MainLogin_Good(driver);
        clicking_MainLoginScreen_LoginButton();
        clickCallCodeButton();
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Valid();
        enteringFakeEmailAddressInformation();
        clicking_Button_Next();
        String emailFake = driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div.form-group.has-error > div > p")).getText();
        Thread.sleep(2000);
        clickTheRefreshButton();
        clicking_LogoutButton();
        return emailFake;
    }

}
