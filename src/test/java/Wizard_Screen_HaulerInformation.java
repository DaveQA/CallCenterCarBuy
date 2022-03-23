import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import static Utilities.clickLinks.*;

public class Wizard_Screen_HaulerInformation {

    private static WebDriver driver;

    public static boolean haulerInformation_Requirement_PickUpDate(WebDriver driver1) {
        driver = driver1;
        gettingToThe_HaulerInformation_Screen(driver);
        clicking_Button_Next();
        boolean requiredRedText = driver.findElements(By.xpath("//p[contains(text(),'The pickupdate field is required.')]")).size() > 0;
        loggingOutOfApp(driver);
        return requiredRedText;
    }

    public static boolean haulerInformation_Requirement_Address1(WebDriver driver1) {
        driver = driver1;
        gettingToThe_HaulerInformation_Screen(driver);
        datePicker_HaulerInformation();
        clicking_Button_Next();
        boolean requiredRedText = driver.findElements(By.xpath("//p[contains(text(),'The pickupaddress1 field is required.')]")).size() > 0;
        loggingOutOfApp(driver);
        return requiredRedText;
    }

    public static boolean haulerInformation_Requirement_City(WebDriver driver1) {
        driver = driver1;
        gettingToThe_HaulerInformation_Screen(driver);
        datePicker_HaulerInformation();
        typing_Input_Address1_Good();
        clicking_Button_Next();
        boolean requiredRedText = driver.findElements(By.xpath("//p[contains(text(),'The pickupcity field is required.')]")).size() > 0;
        loggingOutOfApp(driver);
        return requiredRedText;
    }

    public static boolean haulerInformation_Requirement_ZpiCode(WebDriver driver1) {
        driver = driver1;
        gettingToThe_HaulerInformation_Screen(driver);
        datePicker_HaulerInformation();
        typing_Input_Address1_Good();
        typing_Input_City_Good();
        typing_Input_HaulerInformation_ZipCode_Empty();
        clicking_Button_Next();
        boolean requiredRedText = driver.findElements(By.xpath("//p[contains(text(),'The pickzipCode field is required.')]")).size() > 0;
        loggingOutOfApp(driver);
        return requiredRedText;
    }

    public static void gettingToThe_HaulerInformation_Screen(WebDriver driver1) {
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
        waitOnBothErrorMessageAndLoadingGif();
        clicking_Input_VehicleInformationOption_Make();
        waitOnBothErrorMessageAndLoadingGif();
        clicking_Input_VehicleInformationOption_Model();
        clicking_Button_Next();
        waitOnBothErrorMessageAndLoadingGif();
        clicking_Button_Next();//Next on the Offer Amount Screen
        clicking_Button_Next();//Next after the car parts list
        waitOnBothErrorMessageAndLoadingGif();
        clicking_Input_DoesTheCarHaveAnyDamage_No();
        clicking_Button_Next();
        waitOnBothErrorMessageAndLoadingGif();
        clicking_Input_DoesVehicleRun_Yes();
        clicking_Button_Next();
        clicking_Input_LocationPickUp_Business();
        clicking_Button_Next();
        waitOnBothErrorMessageAndLoadingGif();
        clicking_Input_ProofOwn_Title();
        clicking_Button_Next();
        clicking_Input_ProofIds_DL();
        clicking_Button_Next();
        waitOnBothErrorMessageAndLoadingGif();
    }
}
