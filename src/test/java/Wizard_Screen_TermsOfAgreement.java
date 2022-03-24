import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;
import static Utilities.clickLinks.waitOnBothErrorMessageAndLoadingGif;

public class Wizard_Screen_TermsOfAgreement {

    private static WebDriver driver;

    public static void termsOfAgreement(WebDriver driver1){
        driver = driver1;
        gettingToThe_TermsOfAgreement_Screen(driver);
        loggingOutOfApp(driver);
    }

    public static void completeQuote(WebDriver driver1){
        driver = driver1;
        gettingToThe_TermsOfAgreement_Screen(driver);
        clicking_Button_Next();
        clicking_Button_Next();
        clicking_Button_CompleteQuote();
        loggingOutOfApp(driver);
    }

    public static void gettingToThe_TermsOfAgreement_Screen(WebDriver driver1) {
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
        datePicker_HaulerInformation();
        typing_Input_Address1_Good();
        typing_Input_City_Good();
        clicking_Button_Next();
    }
}
