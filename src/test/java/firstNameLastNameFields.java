import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class firstNameLastNameFields {

    private static WebDriver driver;

    public static boolean enteringOnlyLastNameCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        enterStaticLastName();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean firstNameRequiredRedText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(1) > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return firstNameRequiredRedText;
    }

    public static boolean enteringOnlyFirstNameCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        enterStaticFirstName();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean lastNameRequiredRedText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return lastNameRequiredRedText;
    }

    public static boolean enteringNeitherFirstNameNorLastNameCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.enterGoodLoginInfo(driver);
        utilities.clickTheLoginButton();
        utilities.clickCallCodeButton();
        utilities.clickNextButton();
        utilities.clickNextButton();
        boolean bothFirstNameAndLastNameRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(1) > p")).size() > 0
                && driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return bothFirstNameAndLastNameRequiredText;
    }

    public static void enterStaticFirstName() throws InterruptedException {
        utilities.typeSomething(By.cssSelector("#firstname"),"John");
        Thread.sleep(1000);
    }

    public static void enterStaticLastName() throws InterruptedException {
        utilities.typeSomething(By.cssSelector("#lastname"),"Doe");
        Thread.sleep(1000);
    }
}
