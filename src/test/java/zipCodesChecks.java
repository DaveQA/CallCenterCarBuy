import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class zipCodesChecks {
    private static WebDriver driver;

    public static boolean enteringOutOfAreaZipCodeCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.enteringOutOfAreaZipCode();
                Thread.sleep(2000);
        boolean outOfAreaPeddleMessage = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div.form-horizontal > div > div:nth-child(5)")).size() > 0;
        utilities.clickTheRefreshButton();
                Thread.sleep(3000);
        utilities.logOutOfApplication();
        return outOfAreaPeddleMessage;
    }

    public static String enterApprovedBirminghamMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeBirminghamZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedMobileMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeMobileZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedMontgomeryMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeMontgomeryZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedTucsonMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeTucsonZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedAtlantaEastMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeAtlantaEastZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedAtlantaNorthMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeAtlantaNorthZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedAtlantaSouthMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeAtlantaSouthZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedAugustaMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeAugustaZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedIndianapolisMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeIndianapolisZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedLouisvilleMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeLouisvilleZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedBatonRougeMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeBatonRougeZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedLafayetteMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeLafayetteZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedNewOrleansWestMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeNewOrleansWestZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedJacksonMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeJacksonZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedCharlotteMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeCharlotteZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedWinstonSalemMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeWinstonSalemZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedAkronMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeAkronZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedCantonMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeCantonZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedClevelandKirbyAvenueMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeClevelandKirbyAvenueZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedClevelandWestMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeClevelandWestZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedColumbiaMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeColumbiaZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedKnoxvilleMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeKnoxvilleZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedMemphisMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeMemphisZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedNashvilleMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeNashvilleZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedCorpusChristiMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeCorpusChristiZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedElPasoMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        utilities.fillingOutFirstScreen(driver);
        utilities.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = approvedZipCodes.randomizeElPasoZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        utilities.tabOnKeyBoard(By.cssSelector("#zipCode"));
                Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        utilities.clickTheRefreshButton();
        utilities.logOutOfApplication();
        return stateDropdownValue;
    }
}
