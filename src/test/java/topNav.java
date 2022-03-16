import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static Utilities.clickLinks.*;

public class topNav {

    private static WebDriver driver;

    public static String clickTopNavDashboardLink(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        clickSomething(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(1) > a"));
                Thread.sleep(3000);
        String topNavDashboardLinkURL = driver.getCurrentUrl();
        clickLogoButton();
        clicking_LogoutButton();
        return topNavDashboardLinkURL;
    }

    public static String clickTopNavNotificationsLink(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        clickSomething(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(2) > a"));
                Thread.sleep(3000);
        String topNavNotificationLinkURL = driver.getCurrentUrl();
        clickLogoButton();
        clicking_LogoutButton();
        return topNavNotificationLinkURL;
    }

    public static String clickTopNavAdminAdvanceFeaturesQuoteLink(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > a")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(1) > a > i")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(1) > ul > li:nth-child(1) > a"))).click().build().perform();
                Thread.sleep(3000);
        String topNavAdminAdvanceFeaturesQuoteURL = driver.getCurrentUrl();
                Thread.sleep(7000);  //There is an onscreen error popup that is covering the logout button
        clickLogoButton();
        clicking_LogoutButton();
        return topNavAdminAdvanceFeaturesQuoteURL;
    }

    public static String clickTopNavAdminAdvanceFeaturesNotificationLink(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > a")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(1) > a > i")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(1) > ul > li:nth-child(2) > a"))).click().build().perform();
                Thread.sleep(3000);
        String topNavAdminAdvanceFeaturesNotificationURL = driver.getCurrentUrl();
        clickLogoButton();
        clicking_LogoutButton();
        return topNavAdminAdvanceFeaturesNotificationURL;
    }

    public static String clickTopNavAdminAdvanceFeaturesRestrictionsLink(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > a")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(1) > a > i")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(1) > ul > li:nth-child(3) > a"))).click().build().perform();
                Thread.sleep(3000);
        String topNavAdminAdvanceFeaturesRestrictionsURL = driver.getCurrentUrl();
        clickLogoButton();
        clicking_LogoutButton();
        return topNavAdminAdvanceFeaturesRestrictionsURL;
    }

    public static String clickTopNavAdminGeneralSettingsStateLawsLink(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > a")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(2) > a")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(2) > ul > li:nth-child(1) > a"))).click().build().perform();
                Thread.sleep(3000);
        String topNavAdminGeneralSettingStateLawsURL = driver.getCurrentUrl();
        clickLogoButton();
        clicking_LogoutButton();
        return topNavAdminGeneralSettingStateLawsURL;
    }

    public static String clickTopNavAdminGeneralSettingsDispositionsLink(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
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

    public static String clickTopNavAdminGeneralSettingCallCodesLink(WebDriver driver1) throws InterruptedException {
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

    public static String clickTopNavAdminGeneralSettingUsersLink(WebDriver driver1) throws InterruptedException {
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

    public static String adminGeneralSettingsNotificationPageComingSoonText(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > a")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(1) > a > i")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(1) > ul > li:nth-child(2) > a"))).click().build().perform();
                Thread.sleep(3000);
        String notificationPageCaptionText = driver.findElement(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div > div > div > div")).getText();
                Thread.sleep(2000);
        clickLogoButton();
        clicking_LogoutButton();
        return notificationPageCaptionText;
    }

    public static String adminGeneralSettingsRestrictionsPageComingSoonText(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        good_MainLoginScreenInformation(driver);
        clicking_MainLoginScreen_LoginButton();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > a")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(1) > a > i")))
            .moveToElement(driver.findElement(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-menu > div > div > ul > li:nth-child(3) > ul > li:nth-child(1) > ul > li:nth-child(3) > a"))).click().build().perform();
                Thread.sleep(3000);
        String restrictionsPageCaptionText = driver.findElement(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div.row > div > div > div")).getText();
                Thread.sleep(2000);
        clickLogoButton();
        clicking_LogoutButton();
        return restrictionsPageCaptionText;
    }
}
