import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utilities.clickLinks.*;

public class quoteWorkFlow {

    private static WebDriver driver;

    public static void fillingOutFirstScreen(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        typing_Input_MainLogin_Good(driver);
        clicking_MainLoginScreen_LoginButton();
        clickCallCodeButton();
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Valid();
        typing_Input_Email_Valid();
        clicking_Button_Next();
    }

    public static void fillingOutSecondScreen(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        typing_Input_Zipcode_Good();
        clicking_Button_Next();
        clicking_Input_VehicleInformationOption_Year();
        clicking_Input_VehicleInformationOption_Make();
        clicking_Input_VehicleInformationOption_Model();
        clicking_Button_Next();
        clicking_Input_DoesTheCarHaveAnyDamage_No();
        clicking_Button_Next();
        pickingCarPartEngine();
        pickingCarPartTransmission();
        clicking_Button_Next();
    }

    public static void fillingOutQuoteOfferScreen(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        WebElement scrollToTopOfWizard = driver.findElement(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div > div > div.todo-content > div > div.portlet-title > div.caption"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToTopOfWizard);
        clicking_Button_Next();
    }

    public static void gettingToCarPartListContainer(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        typing_Input_Zipcode_Good();
        clicking_Button_Next();
        clicking_Input_VehicleInformationOption_Year();
        clicking_Input_VehicleInformationOption_Make();
        clicking_Input_VehicleInformationOption_Model();
        clicking_Button_Next();
        clicking_Input_DoesTheCarHaveAnyDamage_No();
        clicking_Button_Next();
    }

    public static void gettingToDoesTheVehicleRunQuestion(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        fillingOutFirstScreen(driver);
        fillingOutSecondScreen(driver);
        fillingOutQuoteOfferScreen(driver);
        clicking_Button_Next();
        doesVehicleRunRadioButton_Yes();
        whereIsVehicleParkedButton_Business();
        clicking_Button_Next();
        clicking_Button_Next();
        clicking_Button_Next();
        datePicker();
    }
}
