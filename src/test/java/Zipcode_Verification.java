import Utilities.clickLinks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class Zipcode_Verification {

    private static WebDriver driver;

    public static boolean typingInZipcode_OutOfArea(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        typing_Input_Zipcode_OutOfArea();
        waitOnBothErrorMessageAndLoadingGif();
        boolean outOfAreaPeddleMessage = driver.findElements(By.xpath("//p[contains(text(),'Would you like to take your vehicle to Pull-A-Part')]")).size() > 0;
        loggingOutOfApp(driver);
        return outOfAreaPeddleMessage;
    }

    public static boolean typingInZipcode_Invalid(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        typing_Input_Zipcode_Invalid();
        waitOnBothErrorMessageAndLoadingGif();
        boolean outOfAreaPeddleMessage = driver.findElements(By.xpath("//p[contains(text(),'Would you like to take your vehicle to Pull-A-Part')]")).size() > 0;
        loggingOutOfApp(driver);
        return outOfAreaPeddleMessage;
    }

    public static String typingInZipcode_Birmingham_Alabama(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeBirminghamZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_Mobile_Alabama(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeMobileZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_Montgomery_Alabama(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeMontgomeryZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_Tucson_Arizona(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeTucsonZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_AtlantaEast_Georgia(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeAtlantaEastZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_AtlantaNorth_Georgia(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeAtlantaNorthZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_AtlantaSouth_Georgia(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeAtlantaSouthZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_Augusta_SouthCarolina(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeAugustaZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_Indianapolis_Indiana(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeIndianapolisZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_Louisville_Kentucky(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeLouisvilleZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_BatonRouge_Louisiana(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeBatonRougeZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_Lafayette_Louisiana(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeLafayetteZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_NewOrleansWest_Louisiana(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeNewOrleansWestZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_Jackson_Mississippi(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeJacksonZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_Charlotte_NorthCarolina(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeCharlotteZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_WinstonSalem_NorthCarolina(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeWinstonSalemZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_Akron_Ohio(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeAkronZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_Canton_Ohio(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeCantonZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_ClevelandKirbyAvenue_Ohio(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeClevelandKirbyAvenueZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_ClevelandWest_Ohio(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeClevelandWestZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_Columbia_SouthCarolina(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeColumbiaZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_Knoxville_Tennessee(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeKnoxvilleZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_Memphis_Tennessee(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeMemphisZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_Nashville_Tennessee(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeNashvilleZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_CorpusChristi_Texas(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeCorpusChristiZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static String typingInZipcode_ElPaso_Texas(WebDriver driver1) {
        driver = driver1;
        gettingToTheZipcodeStep(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = listOfZipCodeNumbers.randomizeElPasoZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed,Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String stateDropdownValue = driver.findElement(By.id("sStates")).getText();
        loggingOutOfApp(driver);
        return stateDropdownValue;
    }

    public static void gettingToTheZipcodeStep(WebDriver driver1){
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Valid();
        typing_Input_Email_Valid();
        clicking_Button_Next();
        waitOnBothErrorMessageAndLoadingGif();
    }
}
