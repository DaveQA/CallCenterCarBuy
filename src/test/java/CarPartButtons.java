import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utilities.clickLinks.*;

public class CarPartButtons {

    private static WebDriver driver;

    public static boolean pickingCarPartBatteryCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        pickingCarPartBattery();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div:nth-child(2) > p")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return carPartRequiredText;
    }

    public static boolean pickingCarPartCatalyticConverterCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        pickingCarPartCatalyticConverter();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div:nth-child(2) > p")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return carPartRequiredText;
    }

    public static boolean pickingCarPartEngineCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        pickingCarPartEngine();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div:nth-child(2) > p")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return carPartRequiredText;
    }

    public static boolean pickingCarPartRadiatorCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        pickingCarPartRadiator();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div:nth-child(2) > p")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return carPartRequiredText;
    }

    public static boolean pickingCarPartTiresCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        pickingCarPartTires();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div:nth-child(2) > p")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return carPartRequiredText;
    }

    public static boolean pickingCarPartTransmissionCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        pickingCarPartTransmission();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div:nth-child(2) > p")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return carPartRequiredText;
    }

    public static boolean pickingNoCarPartsCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        clicking_Button_Next();
        boolean nextButtonEnableStatus = driver.findElement(By.cssSelector("#pro-wizard > div.step-wrapper.active > button:nth-child(3)")).isEnabled();
        clickTheRefreshButton();
        clicking_LogoutButton();
        return nextButtonEnableStatus;
    }

    public static boolean pickingAllCarPartsCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        pickingCarPartBattery();
        pickingCarPartCatalyticConverter();
        pickingCarPartEngine();
        pickingCarPartRadiator();
        pickingCarPartTires();
        pickingCarPartTransmission();
        boolean currentURL = driver.findElement(By.cssSelector("#pro-wizard > div.step-wrapper.active > button:nth-child(3)")).isEnabled();
        clickTheRefreshButton();
        clicking_LogoutButton();
        return currentURL;
    }

    public static boolean pickingOnlyEngineTransmissionPartCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        pickingCarPartEngine();
        pickingCarPartTransmission();
        clicking_Button_Next();
                Thread.sleep(1000);
        boolean quoteOfferContainer = driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div > p")).getText().endsWith("buy your vehicle?");
        WebElement scrollToTopOfWizard = driver.findElement(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div > div > div.todo-content > div > div.portlet-title > div.caption"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToTopOfWizard);
                Thread.sleep(1000);
        clickTheRefreshButton();
        clicking_LogoutButton();
        return quoteOfferContainer;
    }
}
