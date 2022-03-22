import org.openqa.selenium.*;

import static Utilities.clickLinks.*;

public class SpeedDailLinks_Verification {

    private static WebDriver driver;

    public static String clickCallCode_OnlineQuoteCallbackNumberOLD_Button(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        waitOnButtonToBeClickable(By.xpath("//div[@class='number'][contains(text(),'Online Quote Callback Number (OLD)')]"));
        WebElement scrollToButton = driver.findElement(By.xpath("//div[@class='number'][contains(text(),'Online Quote Callback Number (OLD)')]"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);" + "var elementTop = arguments[0].getBoundingClientRect().top;" + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToButton);
        clickingSomething(By.xpath("//div[@class='number'][contains(text(),'Online Quote Callback Number (OLD)')]"));
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[contains(text(),'Next')]"));
        String currentUrl = driver.getCurrentUrl();
        loggingOutOfApp(driver);
        return currentUrl;
    }

    public static String ClickingCallCode_500PartnerPeddleAll(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        waitOnButtonToBeClickable(By.xpath("//div[@class='number'][contains(text(),'500-Partner-Peddle-All')]"));
        WebElement scrollToButton = driver.findElement(By.xpath("//div[@class='number'][contains(text(),'500-Partner-Peddle-All')]"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);" + "var elementTop = arguments[0].getBoundingClientRect().top;" + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToButton);
        clickingSomething(By.xpath("//div[@class='number'][contains(text(),'500-Partner-Peddle-All')]"));
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[contains(text(),'Next')]"));
        String currentUrl = driver.getCurrentUrl();
        loggingOutOfApp(driver);
        return currentUrl;
    }

    public static String ClickingCallCode_501PartnerCarbrainAll(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        waitOnButtonToBeClickable(By.xpath("//div[@class='number'][contains(text(),'501-Partner-Carbrain-All')]"));
        WebElement scrollToButton = driver.findElement(By.xpath("//div[@class='number'][contains(text(),'501-Partner-Carbrain-All')]"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);" + "var elementTop = arguments[0].getBoundingClientRect().top;" + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToButton);
        clickingSomething(By.xpath("//div[@class='number'][contains(text(),'501-Partner-Carbrain-All')]"));
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[contains(text(),'Next')]"));
        String currentUrl = driver.getCurrentUrl();
        loggingOutOfApp(driver);
        return currentUrl;
    }

    public static String ClickingCallCode_502PartnerJunkCarBoysAll(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        waitOnButtonToBeClickable(By.xpath("//div[@class='number'][contains(text(),'502-Partner-Junk Car Boys-All')]"));
        WebElement scrollToButton = driver.findElement(By.xpath("//div[@class='number'][contains(text(),'502-Partner-Junk Car Boys-All')]"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);" + "var elementTop = arguments[0].getBoundingClientRect().top;" + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToButton);
        clickingSomething(By.xpath("//div[@class='number'][contains(text(),'502-Partner-Junk Car Boys-All')]"));
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[contains(text(),'Next')]"));
        String currentUrl = driver.getCurrentUrl();
        loggingOutOfApp(driver);
        return currentUrl;
    }

    public static String ClickingCallCode_503PartnerArsAll(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        waitOnButtonToBeClickable(By.xpath("//div[@class='number'][contains(text(),'503-Partner-Ars-All')]"));
        WebElement scrollToButton = driver.findElement(By.xpath("//div[@class='number'][contains(text(),'502-Partner-Junk Car Boys-All')]"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);" + "var elementTop = arguments[0].getBoundingClientRect().top;" + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToButton);
        clickingSomething(By.xpath("//div[@class='number'][contains(text(),'503-Partner-Ars-All')]"));
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[contains(text(),'Next')]"));
        String currentUrl = driver.getCurrentUrl();
        loggingOutOfApp(driver);
        return currentUrl;
    }

    public static String ClickingCallCode_504PartnerCarsAll(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        waitOnButtonToBeClickable(By.xpath("//div[@class='number'][contains(text(),'504-Partner-Cars-All')]"));
        WebElement scrollToButton = driver.findElement(By.xpath("//div[@class='number'][contains(text(),'502-Partner-Junk Car Boys-All')]"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);" + "var elementTop = arguments[0].getBoundingClientRect().top;" + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToButton);
        clickingSomething(By.xpath("//div[@class='number'][contains(text(),'504-Partner-Cars-All')]"));
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[contains(text(),'Next')]"));
        String currentUrl = driver.getCurrentUrl();
        loggingOutOfApp(driver);
        return currentUrl;
    }

    public static String ClickingCallCode_510PartnerJunkCarSolutionsAll(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        waitOnButtonToBeClickable(By.xpath("//div[@class='number'][contains(text(),'510-Partner-Junk Car Solutions-All')]"));
        WebElement scrollToButton = driver.findElement(By.xpath("//div[@class='number'][contains(text(),'502-Partner-Junk Car Boys-All')]"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);" + "var elementTop = arguments[0].getBoundingClientRect().top;" + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToButton);
        clickingSomething(By.xpath("//div[@class='number'][contains(text(),'510-Partner-Junk Car Solutions-All')]"));
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[contains(text(),'Next')]"));
        String currentUrl = driver.getCurrentUrl();
        loggingOutOfApp(driver);
        return currentUrl;
    }

    public static String filteringCallCodes_NumericCharacters(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        clickingSomething(By.xpath("//div[@class='portlet-body']/div/input[1]"));
        typeSomething(By.xpath("//div[@class='portlet-body']/div/input[1]"),"501");
        clickingSomething(By.xpath("//div[@class='number'][contains(text(),'501-Partner-Carbrain-All')]"));
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[contains(text(),'Next')]"));
        String currentURL = driver.getCurrentUrl();
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static String filteringCallCodes_AlphaCharacters(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        clickingSomething(By.xpath("//div[@class='portlet-body']/div/input[1]"));
        typeSomething(By.xpath("//div[@class='portlet-body']/div/input[1]"),"Carbrain");
        clickingSomething(By.xpath("//div[@class='number'][contains(text(),'501-Partner-Carbrain-All')]"));
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[contains(text(),'Next')]"));
        String currentURL = driver.getCurrentUrl();
        loggingOutOfApp(driver);
        return currentURL;
    }
}
