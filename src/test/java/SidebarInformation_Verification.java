import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class SidebarInformation_Verification {

    private static WebDriver driver;

    public static String checkingSidebarInformation_FirstAndLastName(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        String sideBarCustomerInfoFirstNameLastName = driver.findElement(By.xpath("//div[@class='mt-list-container list-default']/ul/li[2]/div[2]/p[1]")).getText();
        loggingOutOfApp(driver);
        return sideBarCustomerInfoFirstNameLastName;
    }

    public static String checkingSidebarInformation_PrimaryPhoneNumber(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Good();
        String sideBarCustomerInfoPhoneName = driver.findElement(By.xpath("//div[@class='mt-list-container list-default']/ul/li[2]/div[2]/p[2]")).getText();
        loggingOutOfApp(driver);
        return sideBarCustomerInfoPhoneName;
    }

    public static String checkingSidebarInformation_AlternatePhoneNumber(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_AlternatePhoneNumber_Good();
        String sideBarCustomerInfoPhoneName = driver.findElement(By.xpath("//div[@class='mt-list-container list-default']/ul/li[2]/div[2]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sideBarCustomerInfoPhoneName;
    }

    public static String checkingSidebarInformation_EmailAddress(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_Email_Valid();
        String sideBarCustomerInfoPhoneName = driver.findElement(By.xpath("//div[@class='mt-list-container list-default']/ul/li[2]/div[2]/p[4]")).getText();
        loggingOutOfApp(driver);
        return sideBarCustomerInfoPhoneName;
    }

    public static String checkingSidebarInformation_Market_Birmingham_Alabama(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeBirminghamZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_Mobile_Alabama(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeMobileZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_Montgomery_Alabama(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeMontgomeryZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_Tucson_Arizona(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeTucsonZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_AtlantaEast_Georgia(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeAtlantaEastZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_AtlantaNorth_Georgia(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeAtlantaNorthZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_AtlantaSouth_Georgia(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeAtlantaSouthZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_Augusta_SouthCarolina(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeAugustaZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_Indianapolis_Indiana(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeIndianapolisZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_Louisville_Kentucky(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeLouisvilleZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_BatonRouge_Louisiana(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeBatonRougeZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_Lafayette_Louisiana(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeLafayetteZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_NewOrleansWest_Louisiana(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeNewOrleansWestZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_Jackson_Mississippi(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeJacksonZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_Charlotte_NorthCarolina(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeCharlotteZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_WinstonSalem_NorthCarolina(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeWinstonSalemZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_Akron_Ohio(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeAkronZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_Canton_Ohio(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeCantonZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_ClevelandKirbyAvenue_Ohio(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeClevelandKirbyAvenueZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_ClevelandWest_Ohio(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeClevelandWestZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_Columbia_SouthCarolina(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeColumbiaZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_Knoxville_Tennessee(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeKnoxvilleZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_Memphis_Tennessee(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeMemphisZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_Nashville_Tennessee(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeNashvilleZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_CorpusChristi_Texas(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeCorpusChristiZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_Market_ElPaso_Texas(WebDriver driver1) {
        driver = driver1;
        gettingToThe_Zipcode_Step(driver);
        waitOnBothErrorMessageAndLoadingGif();
        String randomZipCodeUsed = ListOfZipCodeNumbers.randomizeElPasoZipCode();
        System.out.println("Zipcode used " + randomZipCodeUsed);
        driver.findElement(By.name("zipCode")).sendKeys(randomZipCodeUsed, Keys.TAB);
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarMarketValue = driver.findElement(By.xpath("//li[@class='mt-list-item']/div[1]/p[3]")).getText();
        loggingOutOfApp(driver);
        return sidebarMarketValue;
    }

    public static String checkingSidebarInformation_OfferAmount(WebDriver driver1) {
        driver = driver1;
        gettingToThe_OfferAmount_Step(driver);
        System.out.println("so far so good");
        waitOnBothErrorMessageAndLoadingGif();
        clicking_Button_Next();
        waitOnBothErrorMessageAndLoadingGif();
        clicking_Button_Back();
        waitOnBothErrorMessageAndLoadingGif();
        String sidebarOfferAmount = driver.findElement(By.xpath("//div/div[@class='row']/div[1]/div[1]")).getAttribute("value");
        System.out.println(sidebarOfferAmount);
        return sidebarOfferAmount;
    }

    public static void gettingToThe_Zipcode_Step(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Good();
        typing_Input_Email_Valid();
        clicking_Button_Next();
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void gettingToThe_OfferAmount_Step(WebDriver driver1) {
        driver = driver1;
        loggingInToApp(driver);
        clicking_Link_CallCode_Peddle(driver);
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Good();
        typing_Input_Email_Valid();
        clicking_Button_Next();
        waitOnBothErrorMessageAndLoadingGif();
        typing_Input_ZipCode_Good();
        clicking_Button_Next();
        clicking_Input_VehicleInformationOption_Year();
        waitOnBothErrorMessageAndLoadingGif();
        clicking_Input_VehicleInformationOption_Make();
        waitOnBothErrorMessageAndLoadingGif();
        clicking_Input_VehicleInformationOption_Model();
        clicking_Button_Next();
        waitOnBothErrorMessageAndLoadingGif();
    }
}
