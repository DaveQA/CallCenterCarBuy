import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class Wizard_Screen_ProofOfOwnership_ID {

    private static WebDriver driver;

    public static boolean proofOfOwnership_RequirementCheck(WebDriver driver1){
        driver = driver1;
        gettingToThe_ProofOfOwnership_Question(driver);
        boolean nextButtonEnableStatus = driver.findElement(By.xpath("//button[contains(text(),'Next')]")).isEnabled();
        loggingOutOfApp(driver);
        return nextButtonEnableStatus;
    }

    public static boolean proofOfIdentification_RequirementCheck(WebDriver driver1){
        driver = driver1;
        gettingToThe_ProofOfOwnership_Question(driver);
        clicking_Input_ProofOwn_Title();
        clicking_Button_Next();
        boolean nextButtonEnableStatus = driver.findElement(By.xpath("//button[contains(text(),'Next')]")).isEnabled();
        loggingOutOfApp(driver);
        return nextButtonEnableStatus;
    }

    public static boolean proofOfOwnership_Question(WebDriver driver1) {
        driver = driver1;
        gettingToThe_ProofOfOwnership_Question(driver);
        boolean proofOwn_Options = driver.findElement(By.xpath("//label[contains(text(),'Title')]")).isDisplayed();
        loggingOutOfApp(driver);
        return proofOwn_Options;
    }

    public static boolean proofOfIdentification_Question(WebDriver driver1){
        driver = driver1;
        gettingToThe_ProofOfIdentification_Question(driver);
        clicking_Input_ProofIds_MilitaryID();
        boolean proofIds_Options = driver.findElement(By.xpath("//p[contains(text(),'What proof of identification do you have?')]")).isDisplayed();
        loggingOutOfApp(driver);
        return proofIds_Options;
    }

    public static void gettingToThe_ProofOfOwnership_Question(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Good();
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
    }

    public static void gettingToThe_ProofOfIdentification_Question(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Good();
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
    }
}
