import org.openqa.selenium.WebDriver;

public class carPartButtons {

    private static WebDriver driver;

    public static void pickingCarPartBattery(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);

    }

    public static void pickingCarPartCatalyticConverter(){}

    public static void pickingCarPartEngine(){}

    public static void pickingCarPartRadiator(){}

    public static void pickingCarPartTires(){}

    public static void pickingCarPartTransmission(){}
}
