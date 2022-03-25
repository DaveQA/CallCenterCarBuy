import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class Wizard_Screen_VehiclePickUpLocation {

    private static WebDriver driver;

    public static boolean vehiclePickUpLocation_Neither(WebDriver driver1) {
        driver = driver1;
        gettingToThe_VehiclePickUpLocation_Question(driver);
        clicking_Button_Next();
        clicking_Button_Next();
        boolean nextButtonStatus = driver.findElement(By.xpath("//p[@class='text-danger']")).isDisplayed();
        loggingOutOfApp(driver);
        return nextButtonStatus;
    }

    public static boolean vehiclePickUpLocation_Residence(WebDriver driver1) {
        driver = driver1;
        gettingToThe_VehiclePickUpLocation_Question(driver);
        clicking_Button_Next();
        clicking_Input_LocationPickUp_Residence();
        clicking_Button_Next();
        boolean proofOfOwnershipOptions = driver.findElement(By.xpath("//div[@class='mt-radio']")).isDisplayed();
        loggingOutOfApp(driver);
        return proofOfOwnershipOptions;
    }

    public static boolean vehiclePickUpLocation_Business(WebDriver driver1) {
        driver = driver1;
        gettingToThe_VehiclePickUpLocation_Question(driver);
        clicking_Button_Next();
        clicking_Input_LocationPickUp_Business();
        clicking_Button_Next();
        boolean proofOfOwnershipOptions = driver.findElement(By.xpath("//div[@class='mt-radio']")).isDisplayed();
        loggingOutOfApp(driver);
        return proofOfOwnershipOptions;
    }

    public static void gettingToThe_VehiclePickUpLocation_Question(WebDriver driver1) {
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
    }
}