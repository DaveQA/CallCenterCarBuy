import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.clickLinks.*;

public class TopNavLinks_Verification {

    static String currentURL = null;
    private static WebDriver driver;

    public static String clicking_TopNavLink_Dashboard(WebDriver driver1) {
        driver = driver1;
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        loggingInToApp(driver);
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//div//button[@type='button'][contains(text(),'Start Quote')]"));
        clickingSomething(By.linkText("Notifications"));
        wait.until(ExpectedConditions.urlContains("/notifications"));
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.linkText("Dashboard"));
        actions.moveToElement(driver.findElement(By.linkText("Dashboard"))).click().build().perform();
        waitOnButtonToBeClickable(By.xpath("//div//button[@type='button'][contains(text(),'Start Quote')]"));
        currentURL = driver.getCurrentUrl();
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static String clicking_TopNavLink_Notifications(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        clickingSomething(By.linkText("Notifications"));
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//span[@class='todo-red']"));
        String currentURL = driver.getCurrentUrl();
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static String clicking_TopNavLink_Admin_Quote(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Admin')]"))).build().perform();
        waitOnButtonToBeClickable(By.linkText("Quotes"));
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Quotes')]"))).click().build().perform();
        waitOnButtonToBeClickable(By.xpath("//input[@type='email']"));
        String currentURL = driver.getCurrentUrl();
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static String clicking_TopNavLink_Admin_Dispositions(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Admin')]"))).build().perform();
        waitOnButtonToBeClickable(By.linkText("Dispositions"));
        action.moveToElement(driver.findElement(By.linkText("Dispositions"))).click().build().perform();
        waitOnButtonToBeClickable(By.linkText("Add Disposition"));
        String currentURL = driver.getCurrentUrl();
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static String clicking_TopNavLink_Admin_CallCodes(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Admin')]"))).build().perform();
        waitOnButtonToBeClickable(By.linkText("Call Codes"));
        action.moveToElement(driver.findElement(By.linkText("Call Codes"))).click().build().perform();
        waitOnButtonToBeClickable(By.linkText("New Code"));
        String currentURL = driver.getCurrentUrl();
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static String clicking_TopNavLink_Admin_Users(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Admin')]"))).build().perform();
        waitOnButtonToBeClickable(By.linkText("Users"));
        action.moveToElement(driver.findElement(By.linkText("Users"))).click().build().perform();
        waitOnButtonToBeClickable(By.linkText("New User"));
        String currentURL = driver.getCurrentUrl();
        loggingOutOfApp(driver);
        return currentURL;
    }
}
