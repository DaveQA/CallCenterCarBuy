import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class CustomerInformationField_Validations {

    private static WebDriver driver;

    public static String primaryPhoneNumberFieldValidation_AlphaCharacters(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_AlphaCharacters();
        clicking_Button_Next();
        String primaryPhoneNumberRequiredRedText = driver.findElement(By.xpath("//p[contains(text(),'The phone field may only contain numeric character')]")).getText();
        loggingOutOfApp(driver);
        return primaryPhoneNumberRequiredRedText;
    }

    public static String primaryPhoneNumberFieldValidation_SpecialCharacters(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_SpecialCharacters();
        clicking_Button_Next();
        String primaryPhoneNumberRequiredRedText = driver.findElement(By.xpath("//p[contains(text(),'The phone field may only contain numeric character')]")).getText();
        loggingOutOfApp(driver);
        return primaryPhoneNumberRequiredRedText;
    }

    public static boolean primaryPhoneNumberFieldValidation_InComplete(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_InComplete();
        clicking_Button_Next();
        boolean primaryPhoneNumberRequiredRedText = driver.findElements(By.xpath("//p[contains(text(),'The phone field may only contain numeric character')]")).size() > 0;
        loggingOutOfApp(driver);
        return primaryPhoneNumberRequiredRedText;
    }

    public static String primaryPhoneNumberFieldValidation_TooMany(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_TooMany();
        clicking_Button_Next();
        String primaryPhoneNumberRequiredRedText = driver.findElement(By.xpath("//p[contains(text(),'The phone field may not be greater than 10 charact')]")).getText();
        loggingOutOfApp(driver);
        return primaryPhoneNumberRequiredRedText;
    }

    public static String emailAddressFieldValidation_Invalided(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Valid();
        typing_Input_Email_Invalided();
        clicking_Button_Next();
        String emailInvalid = driver.findElement(By.xpath("//p[contains(text(),'ZeroBounce status not valid, status:invalid')]")).getText();
        loggingOutOfApp(driver);
        return emailInvalid;
    }

    public static String emailAddressFieldValidation_Fake(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Valid();
        typing_Input_Email_Fake();
        clicking_Button_Next();
        String emailFake = driver.findElement(By.xpath("//p[contains(text(),'The email field must be a valid email.')]")).getText();
        loggingOutOfApp(driver);
        return emailFake;
    }
}
