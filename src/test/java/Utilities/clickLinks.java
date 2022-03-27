package Utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class clickLinks {

    private static WebDriver driver;

    public static void goToLoginPage(WebDriver driver1) {
        driver = driver1;
        driver.get("https://qa-carbuy.pullapart.com/#/login");
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[@type='submit']"));
    }

    public static void loggingInToApp(WebDriver driver1) {
        driver = driver1;
        typing_Input_MainLogin_Good(driver);
        clicking_MainLoginScreen_LoginButton();
        waitOnBothErrorMessageAndLoadingGif();
        clicking_Button_Skip();
    }

    public static void loggingOutOfApp(WebDriver driver1) {
        driver = driver1;
        waitOnButtonToBeClickable(By.xpath("//i[@class='icon-logout']"));
        clicking_LogoutButton();
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
            clicking_LogoutButton();
        } catch (Exception ignored) {
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////Clicking Stuff////////////////////////////////////////////////////////////////

    public static void clickingSomething(By by) {
        driver.findElement(by).click();
    }

    public static void clicking_MainLoginScreen_LoginButton() {
        waitOnBothErrorMessageAndLoadingGif();
        clickingSomething(By.xpath("//button[@type='submit']"));
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void clicking_MitelLoginScreen_LoginButton() {
        waitOnBothErrorMessageAndLoadingGif();
        clickingSomething(By.xpath("//button[@type='submit']"));
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void clicking_LogoutButton() {
        waitOnButtonToBeClickable(By.xpath("//i[@class='icon-logout']"));
        waitOnBothErrorMessageAndLoadingGif();
        clickingSomething(By.xpath("//i[@class='icon-logout']"));
    }

    public static void clicking_Button_Skip() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[@type='button']"));
        clickingSomething(By.xpath("//button[@type='button']"));
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void clicking_Button_NewQuote() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[contains(text(),'New Quote')]"));
        clickingSomething(By.xpath("//button[contains(text(),'New Quote')]"));
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void clicking_Button_Next() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[contains(text(),'Next')]"));
        WebElement scrollToButton = driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);" + "var elementTop = arguments[0].getBoundingClientRect().top;" + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToButton);
        clickingSomething(By.xpath("//button[contains(text(),'Next')]"));
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void clicking_Button_Back() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[contains(text(),'Back')]"));
        WebElement scrollToButton = driver.findElement(By.xpath("//button[contains(text(),'Back')]"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);" + "var elementTop = arguments[0].getBoundingClientRect().top;" + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToButton);
        clickingSomething(By.xpath("//button[contains(text(),'Back')]"));
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void clicking_Button_CompleteQuote() {
        waitOnButtonToBeClickable(By.xpath("//button[contains(text(),'Complete Quote')]"));
        WebElement scrollToButton = driver.findElement(By.xpath("//button[contains(text(),'Complete Quote')]"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);" + "var elementTop = arguments[0].getBoundingClientRect().top;" + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToButton);
        clickingSomething(By.xpath("//button[contains(text(),'Complete Quote')]"));
    }

    public static void clicking_Link_CallCode_Peddle(WebDriver driver1) {
        driver = driver1;
        waitOnButtonToBeClickable(By.xpath("//div[@class='number'][contains(text(),'500-Partner-Peddle-All')]"));
        WebElement scrollToButton = driver.findElement(By.xpath("//div[@class='number'][contains(text(),'500-Partner-Peddle-All')]"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);" + "var elementTop = arguments[0].getBoundingClientRect().top;" + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToButton);
        clickingSomething(By.xpath("//div[@class='number'][contains(text(),'500-Partner-Peddle-All')]"));
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[contains(text(),'Next')]"));
    }

    public static void clicking_Input_VehicleInformationOption_Year() {
        waitOnBothErrorMessageAndLoadingGif();
        Select yearDropdownOption = new Select(driver.findElement(By.name("year")));
        yearDropdownOption.selectByValue("2007");//2020
    }

    public static void clicking_Input_VehicleInformationOption_Make() {
        waitOnBothErrorMessageAndLoadingGif();
        Select makeDropdownOption = new Select(driver.findElement(By.name("make")));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[contains(text(),'HONDA')]")));
        makeDropdownOption.selectByValue("27");//Honda
    }

    public static void clicking_Input_VehicleInformationOption_Model() {
        waitOnBothErrorMessageAndLoadingGif();
        Select modelDropdownOption = new Select(driver.findElement(By.name("model")));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[contains(@value,'277')]")));
        modelDropdownOption.selectByValue("277");//Civic
    }

    public static void clicking_Input_DoesTheCarHaveAnyDamage_Yes() {
        waitOnBothErrorMessageAndLoadingGif();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("damaged"))).build().perform();
        action.moveToElement(driver.findElement(By.name("damageYes"))).click().build().perform();
    }

    public static void clicking_Input_DoesTheCarHaveAnyDamage_No() {
        waitOnBothErrorMessageAndLoadingGif();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("damaged"))).build().perform();
        action.moveToElement(driver.findElement(By.name("damageNo"))).click().build().perform();
    }

    public static void clicking_Input_FireFloodOrRolloverAccident_No() {
        waitOnBothErrorMessageAndLoadingGif();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("disqualifyingDamage"))).build().perform();
        action.moveToElement(driver.findElement(By.name("disqualifyingDamageNo"))).click().build().perform();
    }

    public static void clicking_Input_FireFloodOrRolloverAccident_Yes() {
        waitOnBothErrorMessageAndLoadingGif();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("disqualifyingDamage"))).build().perform();
        action.moveToElement(driver.findElement(By.name("disqualifyingDamageYes"))).click().build().perform();
    }

    public static void clicking_Input_DoesVehicleRun_No() {
        waitOnBothErrorMessageAndLoadingGif();
        clickingSomething(By.xpath("//label[contains(text(),'No')]"));
    }

    public static void clicking_Input_DoesVehicleRun_Yes() {
        waitOnBothErrorMessageAndLoadingGif();
        clickingSomething(By.xpath("//label[contains(text(),'Yes')]"));
    }

    public static void clicking_Input_LocationPickUp_Residence() {
        waitOnBothErrorMessageAndLoadingGif();
        clickingSomething(By.xpath("//label[contains(text(),'Residence')]"));
    }

    public static void clicking_Input_LocationPickUp_Business() {
        waitOnBothErrorMessageAndLoadingGif();
        clickingSomething(By.xpath("//label[contains(text(),'Business')]"));
    }

    public static void clicking_Input_ProofOwn_Title() {
        waitOnBothErrorMessageAndLoadingGif();
        clickingSomething(By.xpath("//label[contains(text(),'Title')]"));
    }

    public static void clicking_Input_ProofOwn_VehicleRegistration() {
        waitOnBothErrorMessageAndLoadingGif();
        clickingSomething(By.xpath("//label[contains(text(),'Vehicle Registration')]"));
    }

    public static void clicking_Input_ProofOwn_BillOfSaleWithKeys() {
        waitOnBothErrorMessageAndLoadingGif();
        clickingSomething(By.xpath("//label[contains(text(),'Bill of Sale with Keys')]"));
    }

    public static void clicking_Input_ProofOwn_InsuranceCardWithKeys() {
        waitOnBothErrorMessageAndLoadingGif();
        clickingSomething(By.xpath("//label[contains(text(),'Insurance Card with Keys')]"));
    }

    public static void clicking_Input_ProofOwn_AlabamaIssuedApplicationForTitle() {
        waitOnBothErrorMessageAndLoadingGif();
        clickingSomething(By.xpath("//label[contains(text(),'Alabama Issued Application for Title')]"));
    }

    public static void clicking_Input_ProofIds_DL() {
        waitOnBothErrorMessageAndLoadingGif();
        clickingSomething(By.xpath("//div[@id='pro-wizard']/div/div/div[2]/div[1]"));
    }

    public static void clicking_Input_ProofIds_StateID() {
        waitOnBothErrorMessageAndLoadingGif();
        clickingSomething(By.xpath("//div[@id='pro-wizard']/div/div/div[2]/div[2]/label[1]"));
    }

    public static void clicking_Input_ProofIds_Passport() {
        waitOnBothErrorMessageAndLoadingGif();
        clickingSomething(By.xpath("//div[@id='pro-wizard']/div/div/div[2]/div[3]/label[1]"));
    }

    public static void clicking_Input_ProofIds_MilitaryID() {
        waitOnBothErrorMessageAndLoadingGif();
        clickingSomething(By.xpath("//div[@id='pro-wizard']/div/div/div[2]/div[4]/label[1]"));
    }

    public static void clicking_Input_ProofIds_MexicanConsulateCard() {
        waitOnBothErrorMessageAndLoadingGif();
        clickingSomething(By.xpath(""));
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////Typing Stuff///////////////////////////////////////////////////////////////

    public static void typeSomething(By by, String value) {
        driver.findElement(by).sendKeys(value);
    }

    public static void typing_Input_MainLogin_Empty(WebDriver driver1) {
        driver = driver1;
        typeSomething(By.name("username"), "");
        typeSomething(By.name("password"), "");
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void typing_Input_MainLogin_WhiteSpace(WebDriver driver1) {
        driver = driver1;
        typeSomething(By.name("username"), "");
        typeSomething(By.name("password"), "");
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void typing_Input_MainLogin_JustUsername(WebDriver driver1) {
        driver = driver1;
        typeSomething(By.name("username"), "");
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void typing_Input_MainLogin_JustPassword(WebDriver driver1) {
        driver = driver1;
        typeSomething(By.name("password"), "");
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void typing_Input_MainLogin_Bad(WebDriver driver1) {
        driver = driver1;
        typeSomething(By.name("username"), "mff");
        typeSomething(By.name("password"), "mff");
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void typing_Input_MainLogin_Fake(WebDriver driver1) {
        driver = driver1;
        typeSomething(By.name("username"), "THISISNOTTHEUSERNAME");
        typeSomething(By.name("password"), "THISISNOTTHEPASSWORD");
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void typing_Input_MainLogin_Good(WebDriver driver1) {
        driver = driver1;
        typeSomething(By.name("username"), "mf");
        typeSomething(By.name("password"), "mf");
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void typing_Input_MitelLogin_Empty(WebDriver driver1) {
        driver = driver1;
        typeSomething(By.name("username"), "");
        typeSomething(By.name("password"), "");
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void typing_Input_MitelLogin_Bad(WebDriver driver1) {
        driver = driver1;
        typeSomething(By.name("username"), "devuset");
        typeSomething(By.name("password"), "DevUser_2");
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void typing_Input_MitelLogin_Fake(WebDriver driver1) {
        driver = driver1;
        typeSomething(By.name("username"), "THISISNOTTHEUSERNAME");
        typeSomething(By.name("password"), "THISISNOTTHEPASSWORD");
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void typing_Input_MitelLogin_Good(WebDriver driver1) {
        driver = driver1;
        typeSomething(By.name("username"), "devuser");
        typeSomething(By.name("password"), "DevUser_1");
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void typing_Input_MitelLogin_WhiteSpace(WebDriver driver1) {
        driver = driver1;
        driver.findElement(By.name("username")).sendKeys(Keys.SPACE);
        driver.findElement(By.name("password")).sendKeys(Keys.SPACE);
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void typing_Input_MitelLogin_JustUsername(WebDriver driver1) {
        driver = driver1;
        driver.findElement(By.name("username")).sendKeys(Keys.SPACE);
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void typing_Input_MitelLogin_JustPassword(WebDriver driver1) {
        driver = driver1;
        driver.findElement(By.name("password")).sendKeys(Keys.SPACE);
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void typing_FirstName() {
        typeSomething(By.id("firstname"), "John");
    }

    public static void typing_LastName() {
        typeSomething(By.id("lastname"), "Doe");
    }

    public static void typing_Input_PrimaryPhoneNumber_Good() {
        typeSomething(By.name("phone"), "5555555");
    }

    public static void typing_Input_PrimaryPhoneNumber_AlphaCharacters() {
        typeSomething(By.name("phone"), "Not a Phone Number");
    }

    public static void typing_Input_PrimaryPhoneNumber_SpecialCharacters() {
        typeSomething(By.name("phone"), "@#$%^&*(");
    }

    public static void typing_Input_PrimaryPhoneNumber_InComplete() {
        typeSomething(By.name("phone"), "5");
    }

    public static void typing_Input_PrimaryPhoneNumber_TooMany() {
        typeSomething(By.name("phone"), "11111111111111111111");
    }

    public static void typing_Input_PrimaryPhoneNumber_WhiteSpace() {
        driver.findElement(By.name("phone")).sendKeys(Keys.SPACE);
    }

    public static void typing_Input_AlternatePhoneNumber_Good() {
        typeSomething(By.name("alternatephone"), "4444444");
    }

    public static void typing_Input_AlternatePhoneNumber_Short() {
        typeSomething(By.name("alternatephone"), "4");
    }

    public static void typing_Input_AlternatePhoneNumber_Long() {
        typeSomething(By.name("alternatephone"), "012345678901");
    }

    public static void typing_Input_AlternatePhoneNumber_SpecialCharacters() {
        typeSomething(By.name("alternatephone"), "@#$%!");
    }

    public static void typing_Input_AlternatePhoneNumber_AlphaCharacters() {
        typeSomething(By.name("alternatephone"), "asdf");
    }

    public static void typing_Input_Email_Valid() {
        typeSomething(By.name("email"), "vip1000682431@gmail.com");
    }

    public static void typing_Input_Email_Invalided() {
        typeSomething(By.name("email"), "PAPInvalidEmailAddressPAP@gmail.com");
    }

    public static void typing_Input_Email_Fake() {
        typeSomething(By.name("email"), "EmailOfFakeness");
    }

    public static void typing_Input_ZipCode_OutOfArea() {
        driver.findElement(By.name("zipCode")).sendKeys("90210", Keys.TAB);
    }

    public static void typing_Input_ZipCode_Invalid() {
        driver.findElement(By.name("zipCode")).sendKeys("0", Keys.TAB);
    }

    public static void typing_Input_ZipCode_Good() {
        driver.findElement(By.name("zipCode")).sendKeys("30188", Keys.TAB);
    }

    public static void typing_Input_Address1_Good() {
        waitOnButtonToBeClickable(By.name("pickupaddress1"));
        typeSomething(By.name("pickupaddress1"), "Address 1 Field");
    }

    public static void typing_Input_City_Good() {
        waitOnButtonToBeClickable(By.name("pickupcity"));
        typeSomething(By.name("pickupcity"), "City");
    }

    public static void typing_Input_HaulerInformation_ZipCode_Empty() {
        waitOnButtonToBeClickable(By.name("pickzipCode"));
        driver.findElement(By.name("pickzipCode")).sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
    }

    public static void typing_Input_HaulerInformationScreen_HaulerNotes() {
        waitOnButtonToBeClickable(By.xpath("//textarea[@class='form-control']"));
        typeSomething(By.xpath("//textarea[@class='form-control']"), "Test Hauler Screen Notes");
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////// Dropdowns//////////////////////////////////////////////////////////////////

//    public static void pickingYearOfCarRandom() {
//        WebElement drpDwnList = driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-2 > select"));
//        Select objSel = new Select(drpDwnList);
//        List<WebElement> yearOptions = objSel.getOptions();
//        int iCnt = yearOptions.size();
//        Random num = new Random();
//        int iSelect = num.nextInt(iCnt);
//        objSel.selectByIndex(iSelect);
////        System.out.println(drpDwnList.getText());
//    }

    public static void pickingMakeOfCarRandom() {
        WebElement drpDwnList = driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-3 > select"));
        Select objSel = new Select(drpDwnList);
        List<WebElement> makeOptions = objSel.getOptions();
        int iCnt = makeOptions.size();
        Random num = new Random();
        int iSelect = num.nextInt(iCnt);
        objSel.selectByIndex(iSelect);
//        System.out.println(drpDwnList.getText());
    }

    public static void pickingModelOfCarRandom() {
        WebElement drpDwnList = driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-5 > select"));
        Select objSel = new Select(drpDwnList);
        List<WebElement> modelOptions = objSel.getOptions();
        int iCnt = modelOptions.size();
        Random num = new Random();
        int iSelect = num.nextInt(iCnt);
        objSel.selectByIndex(iSelect);
//        System.out.println(drpDwnList.getText());
    }

    public static void datePicker_HaulerInformation() {
        String monthYear = "Apr 2024";
        driver.findElement(By.name("pickupdate")).click();
        while (true) {
            String displayedMonthYear = driver.findElement(By.xpath("//span[@class='day__month_btn up']")).getText();
            if (displayedMonthYear.equals(monthYear)) {
                break;
            } else {
                driver.findElement(By.xpath("//div[@class='vdp-datepicker']/div[2]/header[1]/span[3]")).click();
            }
        }
        clickingSomething(By.xpath("//span[contains(text(),'30')]"));
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////Waits//////////////////////////////////////////////////////////////////

    public static void waitOnButtonToBeClickable(By by) {
        WebDriverWait waitOnButtonToBeClickable = new WebDriverWait(driver, Duration.ofSeconds(20));
        waitOnButtonToBeClickable.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitOnLoadingGif() {
        WebDriverWait loadingGifWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        loadingGifWait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#app > div.loading-container > div.loading")));
    }

    public static void waitOnErrorMessagePopup() {
        WebDriverWait errorPopupWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        errorPopupWait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#mini-toastr")));
    }

    public static void waitOnBothErrorMessageAndLoadingGif() {
        waitOnLoadingGif();
        waitOnErrorMessagePopup();
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
