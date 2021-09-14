import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class sideBar {

    private static WebDriver driver;

    public static String customerInfoSideBarMatchesFirstLastNameEnteredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        utilities.enterStaticFirstName();
        utilities.enterStaticLastName();
        String sideBarCustomerInfoFirstNameLastName = driver.findElement(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div > div > div.todo-sidebar > div > div > div.mt-list-container.list-default > ul > li:nth-child(2) > div.list-item-content > p:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return sideBarCustomerInfoFirstNameLastName;
    }

    public static String customerInfoSideBarMatchesPhoneNumberEnteredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        utilities.enterStaticFirstName();
        utilities.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        utilities.enterGoodPhoneNumber();
        String sideBarCustomerInfoPhoneName = driver.findElement(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div > div > div.todo-sidebar > div > div > div.mt-list-container.list-default > ul > li:nth-child(2) > div.list-item-content > p:nth-child(3)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return sideBarCustomerInfoPhoneName;
    }

    public static String customerInfoSideBarMatchesAlternateNumberEnteredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        utilities.enterStaticFirstName();
        utilities.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        utilities.enterAlternatePhoneNumber();
        String sideBarCustomerInfoPhoneName = driver.findElement(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div > div > div.todo-sidebar > div > div > div.mt-list-container.list-default > ul > li:nth-child(2) > div.list-item-content > p:nth-child(4)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return sideBarCustomerInfoPhoneName;
    }

    public static String customerInfoSideBarMatchesEmailEnteredCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        utilities.enterStaticFirstName();
        utilities.enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNewQuoteButton();
        utilities.enterGoodEmailAddress();
        String sideBarCustomerInfoEmail = driver.findElement(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div > div > div.todo-sidebar > div > div > div.mt-list-container.list-default > ul > li:nth-child(2) > div.list-item-content > p:nth-child(5)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return sideBarCustomerInfoEmail;
    }
}
