import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class DamageOnCarRadioButtons {

    private static WebDriver driver;

    public static boolean doesTheCarHaveAnyDamage_Option_Neither(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStepDamageQuestion(driver);
        boolean nextButtonEnableStatus = driver.findElement(By.xpath("//button[contains(text(),'Next')]")).isEnabled();
//        loggingOutOfApp(driver);
        return nextButtonEnableStatus;
    }

    public static boolean doesTheCarHaveAnyDamage_Option_Yes(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStepDamageQuestion(driver);
        clicking_Input_DoesTheCarHaveAnyDamage_Yes();
        boolean nextButtonEnableStatus = driver.findElement(By.xpath("//button[contains(text(),'Next')]")).isEnabled();
//        loggingOutOfApp(driver);
        return nextButtonEnableStatus;
    }

    public static boolean radioButtonNoThereIsNotDamageOnCarCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        typing_Input_Zipcode_Good();
        clicking_Button_Next();
        clicking_Input_VehicleInformationOption_Year();
        clicking_Input_VehicleInformationOption_Make();
        clicking_Input_VehicleInformationOption_Model();
        clicking_Button_Next();
        clicking_Input_DoesTheCarHaveAnyDamage_No();
        boolean typeOfDamageOptionContainer = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div.form-horizontal > div > div > div")).size() > 0;
        clicking_Button_Next();
            Thread.sleep(1000);
        clickTheRefreshButton();
        clicking_LogoutButton();
        return typeOfDamageOptionContainer;
    }

    public static String pickingNeitherTypeOfDamageOptionCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        typing_Input_Zipcode_Good();
        clicking_Button_Next();
        clicking_Input_VehicleInformationOption_Year();
        clicking_Input_VehicleInformationOption_Make();
        clicking_Input_VehicleInformationOption_Model();
        clicking_Button_Next();
        clicking_Input_DoesTheCarHaveAnyDamage_Yes();
        clicking_Button_Next();
        String currentURL = driver.getCurrentUrl();
                Thread.sleep(1000);
        clickTheRefreshButton();
        clicking_LogoutButton();
        return currentURL;
    }

    public static boolean radioButtonYesToFireRolloverDamageOnCarCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        typing_Input_Zipcode_Good();
        clicking_Button_Next();
        clicking_Input_VehicleInformationOption_Year();
        clicking_Input_VehicleInformationOption_Make();
        clicking_Input_VehicleInformationOption_Model();
        clicking_Button_Next();
        clicking_Input_DoesTheCarHaveAnyDamage_Yes();
        clickingYesFireFloodOrRolloverAccidentRadioButton();
        boolean sendToPeddleMessageDueToDamage = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div:nth-child(3) > p")).size() > 0;
                Thread.sleep(1000);
        clickTheRefreshButton();
        clicking_LogoutButton();
        return sendToPeddleMessageDueToDamage;
    }

    public static boolean thereIsNoFireFloodRolloverDamageRadioButtonCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        typing_Input_Zipcode_Good();
        clicking_Button_Next();
        clicking_Input_VehicleInformationOption_Year();
        clicking_Input_VehicleInformationOption_Make();
        clicking_Input_VehicleInformationOption_Model();
        clicking_Button_Next();
        clicking_Input_DoesTheCarHaveAnyDamage_Yes();
        clickingNoFireFloodOrRolloverAccidentRadioButton();
        boolean detailDamageEditableTextField = driver.findElements(By.cssSelector("#detailDamage")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return  detailDamageEditableTextField;
    }

    public static boolean detailDamageNotesIsRequiredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        typing_Input_Zipcode_Good();
        clicking_Button_Next();
        clicking_Input_VehicleInformationOption_Year();
        clicking_Input_VehicleInformationOption_Make();
        clicking_Input_VehicleInformationOption_Model();
        clicking_Button_Next();
        clicking_Input_DoesTheCarHaveAnyDamage_Yes();
        clickingNoFireFloodOrRolloverAccidentRadioButton();
        clicking_Button_Next();
        clicking_Button_Next();
        boolean detailDamageNotesRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div:nth-child(4) > p.text-danger")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return  detailDamageNotesRequiredText;
    }

    public static boolean checkingDetailDamageNotesContainerIsEditableCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        typing_Input_Zipcode_Good();
        clicking_Button_Next();
        clicking_Input_VehicleInformationOption_Year();
        clicking_Input_VehicleInformationOption_Make();
        clicking_Input_VehicleInformationOption_Model();
        clicking_Button_Next();
        clicking_Input_DoesTheCarHaveAnyDamage_Yes();
        clickingNoFireFloodOrRolloverAccidentRadioButton();
        enteringDetailDamageNotes();
        clicking_Button_Next();
        clicking_Button_Next();
        boolean detailDamageNotesRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div:nth-child(4) > p.text-danger")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return detailDamageNotesRequiredText;
    }

    public static void gettingToTheZipcodeStepDamageQuestion(WebDriver driver1){
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
        clicking_Input_VehicleInformationOption_Make();
        clicking_Input_VehicleInformationOption_Model();
        clicking_Button_Next();
        clicking_Button_Next();//Next on the Offer Amount Screen
        clicking_Button_Next();//Next after the car parts list
    }
}
