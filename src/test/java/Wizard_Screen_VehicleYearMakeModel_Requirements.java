import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class Wizard_Screen_VehicleYearMakeModel_Requirements {

    private static WebDriver driver;

    public static boolean vehicleInformationOptionRequirement_Year(WebDriver driver1) {
        driver = driver1;
        gettingToThe_YearMakeModel_Question(driver);
        clicking_Button_Next();
        clicking_Input_VehicleInformationOption_Make();
        clicking_Input_VehicleInformationOption_Model();
        clicking_Button_Next();
        boolean vehicleOptionRequirementAlert = driver.findElements(By.xpath("//p[contains(text(),'The year value is not valid.')]")).size() > 0;
        loggingOutOfApp(driver);
        return vehicleOptionRequirementAlert;
    }

    public static boolean vehicleInformationOptionRequirement_Make(WebDriver driver1) {
        driver = driver1;
        gettingToThe_YearMakeModel_Question(driver);
        clicking_Button_Next();
        clicking_Input_VehicleInformationOption_Year();
        clicking_Button_Next();
        boolean vehicleOptionRequirementAlert = driver.findElements(By.xpath("//p[contains(text(),'The make value is not valid.')]")).size() > 0;
        loggingOutOfApp(driver);
        return vehicleOptionRequirementAlert;
    }

    public static boolean vehicleInformationOptionRequirement_Model(WebDriver driver1) {
        driver = driver1;
        gettingToThe_YearMakeModel_Question(driver);
        clicking_Button_Next();
        clicking_Input_VehicleInformationOption_Year();
        clicking_Input_VehicleInformationOption_Make();
        clicking_Button_Next();
        boolean vehicleOptionRequirementAlert = driver.findElements(By.xpath("//p[contains(text(),'The model value is not valid.')]")).size() > 0;
        loggingOutOfApp(driver);
        return vehicleOptionRequirementAlert;
    }

    public static boolean vehicleInformationOptionRequirement_YearMakeModel(WebDriver driver1) {
        driver = driver1;
        gettingToThe_YearMakeModel_Question(driver);
        clicking_Button_Next();
        clicking_Button_Next();
        boolean vehicleOptionRequirementAlert = driver.findElements(By.xpath("//p[contains(text(),'The year value is not valid.')]")).size() > 0 && driver.findElements(By.xpath("//p[contains(text(),'The make value is not valid.')]")).size() > 0 && driver.findElements(By.xpath("//p[contains(text(),'The model value is not valid.')]")).size() > 0;
        loggingOutOfApp(driver);
        return vehicleOptionRequirementAlert;
    }

    public static void gettingToThe_YearMakeModel_Question(WebDriver driver1) {
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
    }
}
