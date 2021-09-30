import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class speedDailContainer {

    private static WebDriver driver;

    public static String clickCallCode_OnlineQuoteCallbackNumberOLD_Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickSomething(By.cssSelector("div.col-auto:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
        utilities.waitOnBothErrorMessageAndLoadingGif();
                Thread.sleep(1000);
        String callCodeCallBackNumberOldURL = driver.getCurrentUrl();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return callCodeCallBackNumberOldURL;
    }

    public static String clickCallCode500Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickSomething(By.cssSelector("div.col-auto:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
                Thread.sleep(1000);
        String callCode500URL = driver.getCurrentUrl();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return callCode500URL;
    }

    public static String clickCallCode501Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickSomething(By.cssSelector("div.col-auto:nth-child(3) > div:nth-child(1) > div:nth-child(1)"));
                Thread.sleep(1000);
        String callCode501URL = driver.getCurrentUrl();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return callCode501URL;
    }

    public static String clickCallCode502Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickSomething(By.cssSelector("div.col-auto:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
                Thread.sleep(1000);
        String callCode502URL = driver.getCurrentUrl();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return callCode502URL;
    }

    public static String clickCallCode503Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickSomething(By.cssSelector("div.col-auto:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
                Thread.sleep(1000);
        String callCode503URL = driver.getCurrentUrl();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return callCode503URL;
    }

    public static String clickCallCode504Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickSomething(By.cssSelector("div.col-auto:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
                Thread.sleep(1000);
        String callCode504URL = driver.getCurrentUrl();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return callCode504URL;
    }

    public static String clickCallCode510Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickSomething(By.cssSelector("div.col-auto:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
                Thread.sleep(1000);
        String callCode510URL = driver.getCurrentUrl();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return callCode510URL;
    }

    public static String typingInGoodCallCodeCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeInputFieldInSpeedDail();
        utilities.typeInGoodCallCodeStatic();
                Thread.sleep(1000);
        driver.findElement(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div.col-md-5 > div > div > div:nth-child(3) > div > span > button")).sendKeys(Keys.ENTER);
//        utilities.clickingCallCodeDashboardSearchButton();
        String currentURL = driver.getCurrentUrl();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return currentURL;
    }

    public static String typingInBadCallCodeCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeInputFieldInSpeedDail();
        utilities.typingInBadCallCodeStatic();
        utilities.clickingCallCodeDashboardSearchButton();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        String currentURL = driver.getCurrentUrl();
        return currentURL;
    }

    public static String typingNothingInTheCallCodeContainerCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeInputFieldInSpeedDail();
        utilities.clickingCallCodeDashboardSearchButton();
        String currentURL = driver.getCurrentUrl();
        utilities.logOutOfApplication();
        return currentURL;
    }
}
