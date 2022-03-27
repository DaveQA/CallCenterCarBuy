import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Year;
import java.util.List;
import java.util.Random;

import static Utilities.clickLinks.*;

public class StateLaws {

    private static WebDriver driver;

    public static void StateLaws_Alabama_YearNewerThan(WebDriver driver1) {
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
        driver.findElement(By.name("zipCode")).sendKeys("35004", Keys.TAB);
        clicking_Button_Next();
        pickingYearOfCar_Alabama_TitleAge_LessThan();
//        clicking_Input_VehicleInformationOption_Make();
//        clicking_Input_VehicleInformationOption_Model();
//        clicking_Button_Next();//next on the year make model step
//        clicking_Button_Next();//next on the offer amount step
//        clicking_Button_Next();//next on the car part step
//        clicking_Input_DoesTheCarHaveAnyDamage_No();
//        clicking_Button_Next();// does the vehicle have damage
//        clicking_Button_Next();//does vehicle run
//        clicking_Input_LocationPickUp_Residence();
//        clicking_Button_Next();//next after picking pickup location
    }


//    public static void pickingYearOfCar_Alabama_NewerThan_10() {
//        int currentYear = Year.now().getValue();
//        System.out.println("current year is "+ currentYear);
//        WebElement drpDwnList = driver.findElement(By.name("year"));
//        for (int i = currentYear - 10; i <= currentYear; i++) {
//            Select objSel = new Select(drpDwnList);
//            System.out.println(objSel);
//            List<WebElement> yearOptions = objSel.getOptions();
//            int iCnt = yearOptions.size();
//            Random num = new Random();
//            int iSelect = num.nextInt(iCnt);
//            objSel.selectByIndex(iSelect);
//            System.out.println(drpDwnList.getText());
//        }
//    }

    public static void pickingYearOfCar_Alabama_OlderThanTitleAge() {
        int currentYear = Year.now().getValue();
        WebElement drpDwnList = driver.findElement(By.name("year"));
        Select objSel = new Select(drpDwnList);
        List<WebElement> yearOptions = objSel.getOptions();
        int iCnt = yearOptions.size();
        for(int i = currentYear; i  <= currentYear; i++){
            Random num = new Random();
            int iSelect = num.nextInt(iCnt);
            objSel.selectByIndex(iSelect);
            System.out.println(iSelect);
        }
//        System.out.println(drpDwnList.getText());
    }

    public static void pickingYearOfCar_Alabama_TitleAge_LessThan() {
        int currentYear = Year.now().getValue();
        int titleAgeYear = currentYear - 22;
//        System.out.println("title age year "+ titleAgeYear);
        WebElement drpDwnList = driver.findElement(By.name("year"));
        Select objSel = new Select(drpDwnList);
//        System.out.println("year options"+ drpDwnList);
        List<WebElement> yearOptions = objSel.getOptions();
        int iCnt = yearOptions.size();
//        System.out.println("year options"+ yearOptions);
        for(int i = titleAgeYear; i  <= titleAgeYear; i++){
            Random num = new Random();
            int iSelect = num.nextInt(iCnt);
            objSel.selectByIndex(iSelect);
//            System.out.println(iSelect);
//            System.out.println(num);
        }
//        System.out.println(drpDwnList.getText());
    }
}
