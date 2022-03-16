import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static Utilities.clickLinks.*;

public class topNav {

    private static WebDriver driver;

    public static String clicking_TopNavLink_Dashboard(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        clickingButton_Skip();
        waitOnButtonToBeClickable(By.linkText("Dashboard"));
        clickSomething(By.linkText("Dashboard"));
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//h1[contains(text(),'Dashboard')]"));
        clicking_LogoutButton();
        driver.switchTo().alert().accept();
        clicking_LogoutButton();
        return driver.getCurrentUrl();
    }

    public static String clicking_TopNavLink_Notifications(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        clickingButton_Skip();
        waitOnButtonToBeClickable(By.linkText("Notifications"));
        clickSomething(By.linkText("Notifications"));
        waitOnButtonToBeClickable(By.xpath("//div[@class='todo-head']"));
        String topNavNotificationLinkURL = driver.getCurrentUrl();
        clicking_LogoutButton();
        driver.switchTo().alert().accept();
        clicking_LogoutButton();
        return topNavNotificationLinkURL;
    }

    public static String clicking_TopNavLink_Admin_Quote(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        clickingButton_Skip();
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//img[@class='logo-default']"));
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Admin')]")))
            .moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Quotes')]"))).click().build().perform();
        waitOnButtonToBeClickable(By.xpath("//input[@type='email']"));
        String topNavAdminAdvanceFeaturesQuoteURL = driver.getCurrentUrl();
        clickLogoButton();
        clicking_LogoutButton();
        return topNavAdminAdvanceFeaturesQuoteURL;
    }

    public static String clicking_TopNavLink_Admin_Dispositions(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        clickingButton_Skip();
        waitOnBothErrorMessageAndLoadingGif();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > a")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(2) > a")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(2) > ul > li:nth-child(2) > a"))).click().build().perform();
                Thread.sleep(3000);
        String topNavAdminGeneralSettingDispositionsURL = driver.getCurrentUrl();
        clickLogoButton();
        clicking_LogoutButton();
        return topNavAdminGeneralSettingDispositionsURL;
    }

    public static String clicking_TopNavLink_Admin_CallCodes(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > a")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(2) > a")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(2) > ul > li:nth-child(3) > a"))).click().build().perform();
                Thread.sleep(3000);
        String topNavAdminGeneralSettingCallCodeURL = driver.getCurrentUrl();
        clickLogoButton();
        clicking_LogoutButton();
        return topNavAdminGeneralSettingCallCodeURL;
    }

    public static String clicking_TopNavLink_Admin_Users(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > a")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(2) > a")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(2) > ul > li:nth-child(4) > a"))).click().build().perform();
                Thread.sleep(3000);
        String topNavAdminGeneralSettingUsersURL = driver.getCurrentUrl();
        clickLogoButton();
        clicking_LogoutButton();
        return topNavAdminGeneralSettingUsersURL;
    }
}
