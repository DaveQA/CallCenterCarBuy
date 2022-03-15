import ClickLinkUtilities.clickLinks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class approvedZipCodes {

    private static WebDriver driver;

    public static boolean enteringOutOfAreaZipCodeCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.enteringOutOfAreaZipCode();
        Thread.sleep(2000);
        boolean outOfAreaPeddleMessage = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div.form-horizontal > div > div:nth-child(5)")).size() > 0;
        clickLinks.clickTheRefreshButton();
        Thread.sleep(3000);
        clickLinks.logOutOfApplication();
        return outOfAreaPeddleMessage;
    }

    public static String enterApprovedBirminghamMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeBirminghamZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedMobileMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeMobileZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedMontgomeryMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeMontgomeryZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedTucsonMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeTucsonZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedAtlantaEastMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeAtlantaEastZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedAtlantaNorthMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeAtlantaNorthZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedAtlantaSouthMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeAtlantaSouthZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedAugustaMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeAugustaZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedIndianapolisMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeIndianapolisZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedLouisvilleMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeLouisvilleZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedBatonRougeMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeBatonRougeZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedLafayetteMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeLafayetteZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedNewOrleansWestMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeNewOrleansWestZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedJacksonMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeJacksonZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedCharlotteMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeCharlotteZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedWinstonSalemMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeWinstonSalemZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedAkronMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeAkronZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedCantonMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeCantonZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedClevelandKirbyAvenueMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeClevelandKirbyAvenueZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedClevelandWestMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeClevelandWestZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedColumbiaMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeColumbiaZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedKnoxvilleMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeKnoxvilleZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedMemphisMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeMemphisZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedNashvilleMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeNashvilleZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedCorpusChristiMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeCorpusChristiZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }

    public static String enterApprovedElPasoMarketZipCode(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        quoteWorkFlow.fillingOutFirstScreen(driver);
        clickLinks.clickSomething(By.cssSelector("#zipCode"));
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeElPasoZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys(randomZipCodeUsed);
        clickLinks.tabOnKeyBoard(By.cssSelector("#zipCode"));
        Thread.sleep(2000);
        String stateDropdownValue = driver.findElement(By.cssSelector("#sStates > option:nth-child(2)")).getText();
        clickLinks.clickTheRefreshButton();
        clickLinks.logOutOfApplication();
        return stateDropdownValue;
    }
}
