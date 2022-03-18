import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static Utilities.clickLinks.*;

public class TopNavLinks_Verification {

    private static WebDriver driver;

    public static String clicking_TopNavLink_Dashboard(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        clickSomething(By.linkText("Notifications"));
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//a[contains(text(),'Dashboard')]"));
        clickSomething(By.xpath("//a[contains(text(),'Dashboard')]"));
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//a[contains(text(),'Dashboard')]"));
        String currentURL = driver.getCurrentUrl();
        waitOnBothErrorMessageAndLoadingGif();
//        clicking_LogoutButton();
//        driver.switchTo().alert().accept();
//        clicking_LogoutButton();
        loggingOutOfApp(driver);
        return currentURL;
    }

    public static String clicking_TopNavLink_Notifications(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        clickSomething(By.linkText("Notifications"));
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
