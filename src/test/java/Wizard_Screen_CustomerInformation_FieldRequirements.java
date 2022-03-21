import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class Wizard_Screen_CustomerInformation_FieldRequirements {

    private static WebDriver driver;

    public static boolean enteringOnlyLastName(WebDriver driver1) {
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

    public static boolean enteringOnlyFirstName(WebDriver driver1) {
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

    public static boolean leavingPrimaryPhoneNumberFieldBlank(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        clicking_Button_Next();
        boolean primaryPhoneNumberRequiredRedText = driver.findElements(By.xpath("//p[contains(text(),'The phone field is required.')]")).size() > 0;
        loggingOutOfApp(driver);
        return primaryPhoneNumberRequiredRedText;
    }

    public static boolean leavingEmailAddressFieldBlank(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Valid();
        clicking_Button_Next();
        boolean primaryPhoneNumberRequiredRedText = driver.findElements(By.xpath("//p[contains(text(),'The email field is required.')]")).size() > 0;
        loggingOutOfApp(driver);
        return primaryPhoneNumberRequiredRedText;
    }

    public static boolean leavingPrimaryAndEmailAddressFieldBlank(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        clicking_Button_Next();
        boolean primaryPhoneNumberRequiredRedText = driver.findElements(By.xpath("//p[contains(text(),'The phone field is required.')]")).size() > 0 && driver.findElements(By.xpath("//p[contains(text(),'The email field is required.')]")).size() > 0;
        loggingOutOfApp(driver);
        return primaryPhoneNumberRequiredRedText;
    }
}
