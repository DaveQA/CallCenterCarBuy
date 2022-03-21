import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class Wizard_Screen_VehicleRun {

    private static WebDriver driver;

    public static boolean doesVehicleRun_No(WebDriver driver1) {
        driver = driver1;
        gettingToThe_DoesVehicleRun_Question(driver);
        clicking_Input_DoesVehicleRun_No();
        clicking_Button_Next();
        boolean vehiclePickUpLocationQuestion = driver.findElement(By.xpath("//p[contains(text(),'Where will the vehicle be picked up?')]")).isDisplayed();
        loggingOutOfApp(driver);
        return vehiclePickUpLocationQuestion;
    }

    public static boolean doesVehicleRun_Yes(WebDriver driver1) {
        driver = driver1;
        gettingToThe_DoesVehicleRun_Question(driver);
        clicking_Input_DoesVehicleRun_Yes();
        clicking_Button_Next();
        boolean vehiclePickUpLocationQuestion = driver.findElement(By.xpath("//p[contains(text(),'Where will the vehicle be picked up?')]")).isDisplayed();
        loggingOutOfApp(driver);
        return vehiclePickUpLocationQuestion;
    }

    public static void gettingToThe_DoesVehicleRun_Question(WebDriver driver1) {
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
        typing_Input_Zipcode_Good();
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
    }
}
