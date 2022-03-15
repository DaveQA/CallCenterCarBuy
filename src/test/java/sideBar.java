import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static ClickLinkUtilities.clickLinks.*;

public class sideBar {

    private static WebDriver driver;

    public static String customerInfoSideBarMatchesFirstLastNameEnteredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        enterGoodLoginInfo(driver);
        clickTheLoginButton();
        clickCallCodeButton();
        enterStaticFirstName();
        enterStaticLastName();
        String sideBarCustomerInfoFirstNameLastName = driver.findElement(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div > div > div.todo-sidebar > div > div > div.mt-list-container.list-default > ul > li:nth-child(2) > div.list-item-content > p:nth-child(2)")).getText();
        clickTheRefreshButton();
        logOutOfApplication();
        return sideBarCustomerInfoFirstNameLastName;
    }

    public static String customerInfoSideBarMatchesPhoneNumberEnteredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        enterGoodLoginInfo(driver);
        clickTheLoginButton();
        clickCallCodeButton();
        enterStaticFirstName();
        enterStaticLastName();
        clickNextButton();
        clickNewQuoteButton();
        enterGoodPhoneNumber();
        String sideBarCustomerInfoPhoneName = driver.findElement(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div > div > div.todo-sidebar > div > div > div.mt-list-container.list-default > ul > li:nth-child(2) > div.list-item-content > p:nth-child(3)")).getText();
        clickTheRefreshButton();
        logOutOfApplication();
        return sideBarCustomerInfoPhoneName;
    }

    public static String customerInfoSideBarMatchesAlternateNumberEnteredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        enterGoodLoginInfo(driver);
        clickTheLoginButton();
        clickCallCodeButton();
        enterStaticFirstName();
        enterStaticLastName();
        clickNextButton();
        clickNewQuoteButton();
        enterAlternatePhoneNumber();
        String sideBarCustomerInfoPhoneName = driver.findElement(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div > div > div.todo-sidebar > div > div > div.mt-list-container.list-default > ul > li:nth-child(2) > div.list-item-content > p:nth-child(4)")).getText();
        clickTheRefreshButton();
        logOutOfApplication();
        return sideBarCustomerInfoPhoneName;
    }

    public static String customerInfoSideBarMatchesEmailEnteredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        enterGoodLoginInfo(driver);
        clickTheLoginButton();
        clickCallCodeButton();
        enterStaticFirstName();
        enterStaticLastName();
        clickNextButton();
        clickNewQuoteButton();
        enterGoodEmailAddress();
        String sideBarCustomerInfoEmail = driver.findElement(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div > div > div.todo-sidebar > div > div > div.mt-list-container.list-default > ul > li:nth-child(2) > div.list-item-content > p:nth-child(5)")).getText();
        clickTheRefreshButton();
        logOutOfApplication();
        return sideBarCustomerInfoEmail;
    }
}
