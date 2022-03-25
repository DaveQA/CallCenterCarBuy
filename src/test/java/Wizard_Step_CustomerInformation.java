import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class Wizard_Step_CustomerInformation {

    private static WebDriver driver;

    public static String customerInformationField_PrimaryPhoneNumber_Blank(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        clicking_Button_Next();
        String primaryPhoneNumberRequiredRedText = driver.findElement(By.xpath("//p[contains(text(),'The phone field is required.')]")).getText();
        loggingOutOfApp(driver);
        return primaryPhoneNumberRequiredRedText;
    }

    public static String customerInformationField_PrimaryPhoneNumber_AlphaCharacters(WebDriver driver1) {
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

    public static String customerInformationField_PrimaryPhoneNumber_SpecialCharacters(WebDriver driver1) {
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

    public static boolean customerInformationField_PrimaryPhoneNumber_Short(WebDriver driver1) {
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

    public static String customerInformationField_PrimaryPhoneNumber_Long(WebDriver driver1) {
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

    public static String customerInformationField_PrimaryPhoneNumber_WhiteSpace(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_WhiteSpace();
        clicking_Button_Next();
        String primaryPhoneNumberRequiredRedText = driver.findElement(By.xpath("//p[contains(text(),'The phone field is required.')]")).getText();
        loggingOutOfApp(driver);
        return primaryPhoneNumberRequiredRedText;
    }

    public static String customerInformationField_EmailAddress_Invalided(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Good();
        typing_Input_Email_Invalided();
        clicking_Button_Next();
        String emailInvalid = driver.findElement(By.xpath("//p[contains(text(),'ZeroBounce status not valid, status:invalid')]")).getText();
        loggingOutOfApp(driver);
        return emailInvalid;
    }

    public static String customerInformationField_EmailAddress_Fake(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Good();
        typing_Input_Email_Fake();
        clicking_Button_Next();
        String emailFake = driver.findElement(By.xpath("//p[contains(text(),'The email field must be a valid email.')]")).getText();
        loggingOutOfApp(driver);
        return emailFake;

    }

    public static boolean customerInformationField_LastName(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        boolean firstNameRequiredRedText = driver.findElements(By.xpath("//p[contains(text(),'The firstname field is required.')]")).size() > 0;
        loggingOutOfApp(driver);
        return firstNameRequiredRedText;
    }

    public static boolean customerInformationField_FirstName(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        boolean lastNameRequiredRedText = driver.findElements(By.xpath("//p[contains(text(),'The lastname field is required.')]")).size() > 0;
        loggingOutOfApp(driver);
        return lastNameRequiredRedText;
    }

    public static boolean leavingFirstAndLastNameFieldsBlank(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        clicking_Button_Next();
        clicking_Button_NewQuote();
        boolean bothFirstNameAndLastNameRequiredText = driver.findElements(By.xpath("//p[contains(text(),'The firstname field is required.')]")).size() > 0 && driver.findElements(By.xpath("//p[contains(text(),'The lastname field is required.')]")).size() > 0;
        loggingOutOfApp(driver);
        return bothFirstNameAndLastNameRequiredText;
    }

    public static boolean customerInformationField_EmailAddress_Blank(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Good();
        clicking_Button_Next();
        boolean primaryPhoneNumberRequiredRedText = driver.findElements(By.xpath("//p[contains(text(),'The email field is required.')]")).size() > 0;
        loggingOutOfApp(driver);
        return primaryPhoneNumberRequiredRedText;
    }

    public static boolean customerInformationField_AlternatePhone_Short(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_AlternatePhoneNumber_Short();
        clicking_Button_Next();
        boolean primaryPhoneNumberRequiredRedText = driver.findElements(By.xpath("//p[contains(text(),'The phone field may only contain numeric character')]")).size() > 0;
        loggingOutOfApp(driver);
        return primaryPhoneNumberRequiredRedText;
    }

    public static String customerInformationField_AlternatePhone_Long(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_AlternatePhoneNumber_Long();
        clicking_Button_Next();
        String primaryPhoneNumberRequiredRedText = driver.findElement(By.xpath("//p[contains(text(),'The alternatephone field may not be greater than 1')]")).getText();
        loggingOutOfApp(driver);
        return primaryPhoneNumberRequiredRedText;
    }

    public static String customerInformationField_AlternatePhone_SpecialCharacter(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_AlternatePhoneNumber_SpecialCharacters();
        clicking_Button_Next();
        String primaryPhoneNumberRequiredRedText = driver.findElement(By.xpath("//p[contains(text(),'The alternatephone field may only contain numeric ')]")).getText();
        loggingOutOfApp(driver);
        return primaryPhoneNumberRequiredRedText;
    }

    public static String customerInformationField_AlternatePhone_AlphaCharacter(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_AlternatePhoneNumber_AlphaCharacters();
        clicking_Button_Next();
        String primaryPhoneNumberRequiredRedText = driver.findElement(By.xpath("//p[contains(text(),'The alternatephone field may only contain numeric ')]")).getText();
        loggingOutOfApp(driver);
        return primaryPhoneNumberRequiredRedText;
    }
}
