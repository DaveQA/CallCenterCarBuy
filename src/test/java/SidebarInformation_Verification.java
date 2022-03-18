import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class SidebarInformation_Verification {

    private static WebDriver driver;

    public static String checkingSidebarInformation_FirstAndLastName(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        String sideBarCustomerInfoFirstNameLastName = driver.findElement(By.xpath("//div[@class='mt-list-container list-default']/ul/li[2]/div[2]/p[1]")).getText();
        loggingOutOfApp(driver);
        return sideBarCustomerInfoFirstNameLastName;
    }

    public static String checkingSidebarInformation_PrimaryPhoneNumber(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Valid();
        String sideBarCustomerInfoPhoneName = driver.findElement(By.xpath("//div[@class='mt-list-container list-default']/ul/li[2]/div[2]/p[2]")).getText();
        loggingOutOfApp(driver);
        return sideBarCustomerInfoPhoneName;
    }

    public static String checkingSidebarInformation_AlternatePhoneNumber(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_AlternatePhoneNumber_Valid();
        String sideBarCustomerInfoPhoneName = driver.findElement(By.xpath("//div[@class='mt-list-container list-default']/ul/li[2]/div[2]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sideBarCustomerInfoPhoneName;
    }

    public static String checkingSidebarInformation_EmailAddress(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_Email_Valid();
        String sideBarCustomerInfoPhoneName = driver.findElement(By.xpath("//div[@class='mt-list-container list-default']/ul/li[2]/div[2]/p[4]")).getText();
        loggingOutOfApp(driver);
        return sideBarCustomerInfoPhoneName;
    }

    public static String checkingSidebarInformation_Market_Birmingham(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeBirminghamZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//p[contains(text(),'Birmingham')]")).getText();
//        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static void gettingToTheZipcodeStep(WebDriver driver1){
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
    }
}
