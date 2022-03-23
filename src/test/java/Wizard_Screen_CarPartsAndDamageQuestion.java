import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class Wizard_Screen_CarPartsAndDamageQuestion {

    private static WebDriver driver;

    public static boolean doesTheCarHaveAnyDamage_Option_Neither(WebDriver driver1) {
        driver = driver1;
        gettingToThe_VehicleDamage_Question(driver);
        boolean nextButtonEnableStatus = driver.findElement(By.xpath("//button[contains(text(),'Next')]")).isEnabled();
        loggingOutOfApp(driver);
        return nextButtonEnableStatus;
    }

    public static boolean doesTheCarHaveAnyDamage_Option_No(WebDriver driver1) {
        driver = driver1;
        gettingToThe_VehicleDamage_Question(driver);
        clicking_Input_DoesTheCarHaveAnyDamage_No();
        boolean nextButtonEnableStatus = driver.findElement(By.xpath("//button[contains(text(),'Next')]")).isEnabled();
        loggingOutOfApp(driver);
        return nextButtonEnableStatus;
    }

    public static boolean doesTheCarHaveAnyDamage_Option_Yes(WebDriver driver1) {
        driver = driver1;
        gettingToThe_VehicleDamage_Question(driver);
        clicking_Input_DoesTheCarHaveAnyDamage_Yes();
        boolean typeOfDamageQuestion = driver.findElement(By.id("disqualifyingDamage")).isEnabled();
        loggingOutOfApp(driver);
        return typeOfDamageQuestion;
    }

    public static void gettingToThe_VehicleDamage_Question(WebDriver driver1) {
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
    }
}
