import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class speedDailContainer {

    private static WebDriver driver;

    public static String clickCallCode_OnlineQuoteCallbackNumberOLD_Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        clickSomething(By.cssSelector("div.col-auto:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
        waitOnBothErrorMessageAndLoadingGif();
                Thread.sleep(1000);
        String callCodeCallBackNumberOldURL = driver.getCurrentUrl();
        clickTheRefreshButton();
        clicking_LogoutButton();
        return callCodeCallBackNumberOldURL;
    }

    public static String clickCallCode500Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        clickSomething(By.cssSelector("div.col-auto:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
                Thread.sleep(1000);
        String callCode500URL = driver.getCurrentUrl();
        clickTheRefreshButton();
        clicking_LogoutButton();
        return callCode500URL;
    }

    public static String clickCallCode501Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        clickSomething(By.cssSelector("div.col-auto:nth-child(3) > div:nth-child(1) > div:nth-child(1)"));
                Thread.sleep(1000);
        String callCode501URL = driver.getCurrentUrl();
        clickTheRefreshButton();
        clicking_LogoutButton();
        return callCode501URL;
    }

    public static String clickCallCode502Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        clickSomething(By.cssSelector("div.col-auto:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
                Thread.sleep(1000);
        String callCode502URL = driver.getCurrentUrl();
        clickTheRefreshButton();
        clicking_LogoutButton();
        return callCode502URL;
    }

    public static String clickCallCode503Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        clickSomething(By.cssSelector("div.col-auto:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
                Thread.sleep(1000);
        String callCode503URL = driver.getCurrentUrl();
        clickTheRefreshButton();
        clicking_LogoutButton();
        return callCode503URL;
    }

    public static String clickCallCode504Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        clickSomething(By.cssSelector("div.col-auto:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
                Thread.sleep(1000);
        String callCode504URL = driver.getCurrentUrl();
        clickTheRefreshButton();
        clicking_LogoutButton();
        return callCode504URL;
    }

    public static String clickCallCode510Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        clickSomething(By.cssSelector("div.col-auto:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
                Thread.sleep(1000);
        String callCode510URL = driver.getCurrentUrl();
        clickTheRefreshButton();
        clicking_LogoutButton();
        return callCode510URL;
    }

    public static String typingInGoodCallCodeCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        clickCallCodeInputFieldInSpeedDail();
        typeInGoodCallCodeStatic();
                Thread.sleep(1000);
        driver.findElement(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div.col-md-5 > div > div > div:nth-child(3) > div > span > button")).sendKeys(Keys.ENTER);
        String currentURL = driver.getCurrentUrl();
        clickTheRefreshButton();
        clicking_LogoutButton();
        return currentURL;
    }

    public static String typingInBadCallCodeCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        clickCallCodeInputFieldInSpeedDail();
        typingInBadCallCodeStatic();
        clickingCallCodeDashboardSearchButton();
        clickTheRefreshButton();
        clicking_LogoutButton();
        String currentURL = driver.getCurrentUrl();
        return currentURL;
    }

    public static String typingNothingInTheCallCodeContainerCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        clickCallCodeInputFieldInSpeedDail();
        clickingCallCodeDashboardSearchButton();
        String currentURL = driver.getCurrentUrl();
        clicking_LogoutButton();
        return currentURL;
    }
}
