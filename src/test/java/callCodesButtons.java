import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class callCodesButtons {

    private static WebDriver driver;

    public static String clickCallCode833Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickSomething(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div.col-md-5 > div > div > div.row.scrollingDiv > div > div:nth-child(1) > div > div.details > div.number"));
                Thread.sleep(3000);
        String callCode833URL = driver.getCurrentUrl();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return callCode833URL;
    }

    public static String clickCallCode500Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickSomething(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div.col-md-5 > div > div > div.row.scrollingDiv > div > div:nth-child(2) > div > div.details > div.number"));
                Thread.sleep(3000);
        String callCode500URL = driver.getCurrentUrl();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return callCode500URL;
    }

    public static String clickCallCode501Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickSomething(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div.col-md-5 > div > div > div.row.scrollingDiv > div > div:nth-child(3) > div > div.details > div.number"));
                Thread.sleep(4000);
        String callCode501URL = driver.getCurrentUrl();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return callCode501URL;
    }

    public static String clickCallCode502Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickSomething(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div.col-md-5 > div > div > div.row.scrollingDiv > div > div:nth-child(4) > div > div.details > div.number"));
                Thread.sleep(3000);
        String callCode502URL = driver.getCurrentUrl();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return callCode502URL;
    }

    public static String clickCallCode503Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickSomething(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div.col-md-5 > div > div > div.row.scrollingDiv > div > div:nth-child(5) > div > div.details > div.number"));
                Thread.sleep(3000);
        String callCode503URL = driver.getCurrentUrl();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return callCode503URL;
    }

    public static String clickCallCode504Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickSomething(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div.col-md-5 > div > div > div.row.scrollingDiv > div > div:nth-child(6) > div > div.details > div.number"));
                Thread.sleep(3000);
        String callCode504URL = driver.getCurrentUrl();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return callCode504URL;
    }

    public static String clickCallCode510Button(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickSomething(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div.col-md-5 > div > div > div.row.scrollingDiv > div > div:nth-child(7) > div > div.details > div.number"));
                Thread.sleep(3000);
        String callCode510URL = driver.getCurrentUrl();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return callCode510URL;
    }
}
