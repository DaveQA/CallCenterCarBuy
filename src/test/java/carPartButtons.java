import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class carPartButtons {

    private static WebDriver driver;

    public static boolean pickingCarPartBatteryCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartBattery();
        utilities.clickNextButton();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("")).size() > 0;
        return carPartRequiredText;
    }

    public static boolean pickingCarPartCatalyticConverterCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartCatalyticConverter();
        utilities.clickNextButton();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("")).size() > 0;
        return carPartRequiredText;
    }

    public static boolean pickingCarPartEngineCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartEngine();
        utilities.clickNextButton();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("")).size() > 0;
        return carPartRequiredText;
    }

    public static boolean pickingCarPartRadiatorCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartRadiator();
        utilities.clickNextButton();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("")).size() > 0;
        return carPartRequiredText;
    }

    public static boolean pickingCarPartTiresCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartTires();
        utilities.clickNextButton();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("")).size() > 0;
        return carPartRequiredText;
    }

    public static boolean pickingCarPartTransmissionCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartTransmission();
        utilities.clickNextButton();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("")).size() > 0;
        return carPartRequiredText;
    }

    public static boolean pickingNoCarPartsCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartTransmission();
        utilities.clickNextButton();
        boolean carPartRequiredText = driver.findElements(By.cssSelector("")).size() > 0;
        return carPartRequiredText;
    }

    public static String pickingAllCarPartsCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartTransmission();
        utilities.clickNextButton();
        String currentURL = driver.getCurrentUrl();
        return currentURL;
    }

    public static String pickingOnlyEngineTransmissionPartCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.gettingToCarPartListContainer(driver);
        utilities.pickingCarPartEngine();
        utilities.pickingCarPartTransmission();
        utilities.clickNextButton();
        String currentURL = driver.getCurrentUrl();
        return currentURL;
    }
}
