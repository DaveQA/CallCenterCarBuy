import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class carPartButtons {

    private static WebDriver driver;

    public static boolean pickingCarPartBatteryCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartBattery();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div:nth-child(2) > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return carPartRequiredText;
    }

    public static boolean pickingCarPartCatalyticConverterCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartCatalyticConverter();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div:nth-child(2) > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return carPartRequiredText;
    }

    public static boolean pickingCarPartEngineCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartEngine();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div:nth-child(2) > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return carPartRequiredText;
    }

    public static boolean pickingCarPartRadiatorCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartRadiator();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div:nth-child(2) > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return carPartRequiredText;
    }

    public static boolean pickingCarPartTiresCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartTires();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div:nth-child(2) > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return carPartRequiredText;
    }

    public static boolean pickingCarPartTransmissionCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartTransmission();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div:nth-child(2) > p")).size() > 0;
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return carPartRequiredText;
    }

    public static boolean pickingNoCarPartsCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.clickNextButton();
        boolean nextButtonEnableStatus = driver.findElement(By.cssSelector("#pro-wizard > div.step-wrapper.active > button:nth-child(3)")).isEnabled();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return nextButtonEnableStatus;
    }

    public static boolean pickingAllCarPartsCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartBattery();
        utilities.pickingCarPartCatalyticConverter();
        utilities.pickingCarPartEngine();
        utilities.pickingCarPartRadiator();
        utilities.pickingCarPartTires();
        utilities.pickingCarPartTransmission();
        boolean currentURL = driver.findElement(By.cssSelector("#pro-wizard > div.step-wrapper.active > button:nth-child(3)")).isEnabled();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return currentURL;
    }

    public static boolean pickingOnlyEngineTransmissionPartCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartEngine();
        utilities.pickingCarPartTransmission();
        utilities.clickNextButton();
                Thread.sleep(1000);
        boolean quoteOfferContainer = driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div > p")).getText().endsWith("buy your vehicle?");
        WebElement scrollToTopOfWizard = driver.findElement(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div > div > div.todo-content > div > div.portlet-title > div.caption"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToTopOfWizard);
                Thread.sleep(1000);
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return quoteOfferContainer;
    }
}
