import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class yearMakeModelDropdowns {

    private static WebDriver driver;

    public static boolean yearIsRequiredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        typing_Input_Zipcode_Good();
        clicking_Button_Next();
        clicking_Button_Next();
        clicking_Button_Next();
        clicking_Button_Next();
        boolean yearRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-2 > p")).size() > 0;
        Thread.sleep(1000);
        clickTheRefreshButton();
        clicking_LogoutButton();
        return yearRequiredText;
    }

    public static boolean makeIsRequiredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        typing_Input_Zipcode_Good();
        clicking_Button_Next();
        pickingYearOfCarRandom();
        clicking_Button_Next();
        clicking_Button_Next();
        clicking_Button_Next();
        boolean makeRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-3 > p")).size() > 0;
                Thread.sleep(1000);
        clickTheRefreshButton();
        clicking_LogoutButton();
        return makeRequiredText;
    }

    public static boolean modelIsRequiredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        typing_Input_Zipcode_Good();
        clicking_Button_Next();
        pickingYearOfCarRandom();
        pickingMakeOfCarRandom();
        clicking_Button_Next();
        clicking_Button_Next();
        clicking_Button_Next();
        boolean modelRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-5 > p")).size() > 0;
                Thread.sleep(1000);
        clickTheRefreshButton();
        clicking_LogoutButton();
        return modelRequiredText;
    }

    public static boolean allYearMakeModelDropdownsAreRequired(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        typing_Input_Zipcode_Good();
        clicking_Button_Next();
        clicking_Button_Next();
        clicking_Button_Next();
        clicking_Button_Next();
        boolean nextButtonEnableStatus = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-2 > p")).size() > 0
            && driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-3 > p")).size() > 0
            && driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-5 > p")).size() > 0;
                Thread.sleep(1000);
        clickTheRefreshButton();
        clicking_LogoutButton();
        return nextButtonEnableStatus;
    }
}
