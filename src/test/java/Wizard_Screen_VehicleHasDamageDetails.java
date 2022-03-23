import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class Wizard_Screen_VehicleHasDamageDetails {

    private static WebDriver driver;

    public static boolean disqualifyingDamage_Option_No(WebDriver driver1) {
        driver = driver1;
        gettingToThe_VehicleDamageDetails_Question(driver);
        clicking_Input_FireFloodOrRolloverAccident_No();
        boolean detailDamageContainer = driver.findElement(By.name("detailDamage")).isDisplayed();
        loggingOutOfApp(driver);
        return detailDamageContainer;
    }

    public static boolean disqualifyingDamage_Option_Yes(WebDriver driver1) {
        driver = driver1;
        gettingToThe_VehicleDamageDetails_Question(driver);
        clicking_Input_FireFloodOrRolloverAccident_Yes();
        boolean referToPeddleMessage = driver.findElement(By.xpath("//p[contains(text(),'Unfortunately, Pull-A-Part does not purchase vehic')]")).isDisplayed();
        loggingOutOfApp(driver);
        return referToPeddleMessage;
    }

    public static boolean disqualifyingDamage_Detail_RequirementCheck(WebDriver driver1) {
        driver = driver1;
        gettingToThe_VehicleDamageDetails_Question(driver);
        clicking_Input_DoesTheCarHaveAnyDamage_Yes();
        clicking_Input_FireFloodOrRolloverAccident_No();
        clicking_Button_Next();
        boolean requiredRedText = driver.findElement(By.xpath("//p[@class='text-danger']")).isDisplayed();
        loggingOutOfApp(driver);
        return requiredRedText;
    }

    public static void gettingToThe_VehicleDamageDetails_Question(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Valid();
        typing_Input_Email_Valid();
        clicking_Button_Next();
        waitOnBothErrorMessageAndLoadingGif();
        typing_Input_ZipCode_Good();
        clicking_Button_Next();
        clicking_Input_VehicleInformationOption_Year();
        clicking_Input_VehicleInformationOption_Make();
        clicking_Input_VehicleInformationOption_Model();
        clicking_Button_Next();
        clicking_Button_Next();//Next on the Offer Amount Screen
        clicking_Button_Next();//Next after the car parts list
        waitOnBothErrorMessageAndLoadingGif();
        clicking_Input_DoesTheCarHaveAnyDamage_Yes();
    }
}