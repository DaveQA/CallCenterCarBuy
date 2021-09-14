import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class yearMakeModelDropdowns {

    private static WebDriver driver;

    public static boolean yearIsRequiredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean yearRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-2 > p")).size() > 0;
        Thread.sleep(1000);
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return yearRequiredText;
    }

    public static boolean makeIsRequiredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarRandom();
        utilities.clickNextButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean makeRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-3 > p")).size() > 0;
        Thread.sleep(1000);
        return makeRequiredText;
    }

    public static boolean modelIsRequiredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.pickingYearOfCarRandom();
        utilities.pickingMakeOfCarRandom();
        utilities.clickNextButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean modelRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-5 > p")).size() > 0;
        Thread.sleep(1000);
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return modelRequiredText;
    }

    public static boolean allYearMakeModelDropdownsAreRequired(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        utilities.enteringZipCodeStatic();
        utilities.clickNextButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean nextButtonEnableStatus = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-2 > p")).size() > 0
                && driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-3 > p")).size() > 0
                && driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-5 > p")).size() > 0;
        return nextButtonEnableStatus;
    }
}
