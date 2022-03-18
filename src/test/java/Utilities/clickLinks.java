package Utilities;

import org.openqa.selenium.*;
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
        clicking_LogoutButton();
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();
            clicking_LogoutButton();
        } catch (Exception ignored) {
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////Clicking Stuff////////////////////////////////////////////////////////////////

    public static void clickSomething(By by) {
        driver.findElement(by).click();
    }

    public static void clicking_MainLoginScreen_LoginButton() {
        waitOnBothErrorMessageAndLoadingGif();
        clickSomething(By.xpath("//button[@type='submit']"));
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void clicking_MitelLoginScreen_LoginButton() {
        waitOnBothErrorMessageAndLoadingGif();
        clickSomething(By.xpath("//button[@type='submit']"));
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void clicking_LogoutButton() {
        waitOnButtonToBeClickable(By.xpath("//i[@class='icon-logout']"));
        waitOnBothErrorMessageAndLoadingGif();
        clickSomething(By.xpath("//i[@class='icon-logout']"));
    }

    public static void clicking_Button_Skip() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[@type='button']"));
        clickSomething(By.xpath("//button[@type='button']"));
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void clicking_Button_NewQuote() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[contains(text(),'New Quote')]"));
        clickSomething(By.xpath("//button[contains(text(),'New Quote')]"));
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void clicking_Button_Next() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[contains(text(),'Next')]"));
        WebElement scrollToButton = driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);" + "var elementTop = arguments[0].getBoundingClientRect().top;" + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToButton);
        clickSomething(By.xpath("//button[contains(text(),'Next')]"));
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void clicking_Link_CallCode_Peddle(WebDriver driver1) {
        driver = driver1;
        waitOnButtonToBeClickable(By.xpath("//div[@class='number'][contains(text(),'500-Partner-Peddle-All')]"));
        WebElement scrollToButton = driver.findElement(By.xpath("//div[@class='number'][contains(text(),'500-Partner-Peddle-All')]"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);" + "var elementTop = arguments[0].getBoundingClientRect().top;" + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToButton);
        clickSomething(By.xpath("//div[@class='number'][contains(text(),'500-Partner-Peddle-All')]"));
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.xpath("//button[contains(text(),'Next')]"));
    }

    public static void clickingYesRadioButtonIsThereDamageToCar() {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div.form-group > div > div > label:nth-child(2)"));
    }

    public static void clickingNoRadioButtonIsThereDamageToCar() {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div.form-group > div > div > label:nth-child(3)"));
    }

    public static void clickingYesFireFloodOrRolloverAccidentRadioButton() {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div.form-horizontal > div > div > div > label:nth-child(2)"));
    }

    public static void clickingNoFireFloodOrRolloverAccidentRadioButton() {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div.form-horizontal > div > div > div > label:nth-child(3)"));
    }

    public static void pickingYearOfCarStatic() {
        driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-2 > select > option:nth-child(16)")).click();
    }

    public static void pickingMakeOfCarStatic() throws InterruptedException {
        driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-3 > select > option:nth-child(35)")).click();
        Thread.sleep(1000);
    }

    public static void pickingModelOfCarStatic() {
        driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-5 > select > option:nth-child(6)")).click();
    }

    public static void pickingCarPartBattery() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div > label:nth-child(2)"));
        Thread.sleep(1000);
    }

    public static void pickingCarPartCatalyticConverter() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div > label:nth-child(3)"));
        Thread.sleep(1000);
    }

    public static void pickingCarPartEngine() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div > label:nth-child(4)"));
        Thread.sleep(1000);
    }

    public static void pickingCarPartRadiator() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div > label:nth-child(5)"));
        Thread.sleep(1000);
    }

    public static void pickingCarPartTires() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div > label:nth-child(6)"));
        Thread.sleep(1000);
    }

    public static void pickingCarPartTransmission() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div > label:nth-child(7)"));
        Thread.sleep(1000);
    }

    public static void doesVehicleRunRadioButton_Yes() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div > div > label:nth-child(2)"));
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div > div > label:nth-child(2)"));
    }

    public static void whereIsVehicleParkedButton_Business() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > label:nth-child(2)"));
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > label:nth-child(2)"));
    }

    public static void doesVehicleRunRadioButton_No() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div > div > label:nth-child(1)"));
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div > div > label:nth-child(1)"));
    }

    public static void clickingCallCodeDashboardSearchButton() throws InterruptedException {
        clickSomething(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div.col-md-5 > div > div > div:nth-child(3) > div > span > button"));
        Thread.sleep(1000);
    }

    public static void clickPhoneNumberField() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > input"));
        Thread.sleep(1000);
    }

    public static void whereIsVehicleParkedButton_Residence() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > label:nth-child(1) > span"));
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > label:nth-child(1) > span"));
    }

    public static void proofOfOwnership_Title() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div > div:nth-child(2) > label"));
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div > div:nth-child(2) > label"));
    }

    public static void proofOfOwnership_VehicleRegistration() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div > div:nth-child(3) > label"));
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div > div:nth-child(3) > label"));
    }

    public static void proofOfOwnership_BillOfSaleWithKeys() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div > div:nth-child(4) > label"));
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div > div:nth-child(4) > label"));
    }

    public static void proofOfOwnership_InsuranceCardWithKeys() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div > div:nth-child(5) > label"));
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div > div:nth-child(5) > label"));
    }

    public static void proofOfIdentification_DriversLicense() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > label"));
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > label"));
    }

    public static void proofOfIdentification_StateID() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > label"));
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > label"));
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void proofOfIdentification_Passport() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(4) > label"));
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(4) > label"));
    }

    public static void proofOfIdentification_MilitaryID() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(5) > label"));
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(5) > label"));
    }

    public static void clickOnDataPicker() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div.form-group > div > div:nth-child(1) > input"));
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div.form-group > div > div:nth-child(1) > input"));
        waitOnBothErrorMessageAndLoadingGif();
    }

    public static void clickTheRefreshButton() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div > div > div.todo-content > div > div.portlet-title > div.actions > a"));
        clickSomething(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div > div > div.todo-content > div > div.portlet-title > div.actions > a"));
    }

    public static void clickCallCodeButton() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div.col-md-5 > div > div > div.row.scrollingDiv > div > div:nth-child(2) > div > div.details > div.number"));
        clickSomething(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div.col-md-5 > div > div > div.row.scrollingDiv > div > div:nth-child(1) > div > div.details > div.number"));
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

    public static void typing_FirstName() {
        typeSomething(By.id("firstname"), "John");
    }

    public static void typing_LastName() {
        typeSomething(By.id("lastname"), "Doe");
    }

    public static void typing_Input_PrimaryPhoneNumber_Valid() {
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

    public static void typing_Input_AlternatePhoneNumber_Valid() {
        typeSomething(By.name("alternatephone"), "4444444");
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

    public static void typing_Input_Zipcode_OutOfArea() {
        driver.findElement(By.name("zipCode")).sendKeys("90210", Keys.TAB);
    }

    public static void typing_Input_Zipcode_Invalid() {
        driver.findElement(By.name("zipCode")).sendKeys("0", Keys.TAB);
    }

    public static void typing_Input_Zipcode_Good() {
        driver.findElement(By.name("zipCode")).sendKeys("30188", Keys.TAB);
    }

    public static void enteringDetailDamageNotes() {
        clickSomething(By.cssSelector("#detailDamage"));
        typeSomething(By.cssSelector("#detailDamage"), "Test Detail Damage Notes");
    }

    public static void enteringInvalidEmailAddressInformation() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > div > input"));
        typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > div > input"), "NotaRealEmail");
        Thread.sleep(2000);
    }

    public static void enteringFakeEmailAddressInformation() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > div > input"));
        typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > div > input"), "NotaRealEmail@nope.com");
        Thread.sleep(2000);
    }

    public static void enterAlternatePhoneNumber() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input"));
        typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input"), "4444444444");
        Thread.sleep(1000);
    }

    public static void enteringToManyNumbers() {
        typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > input"), "11122233440");
    }

    public static void tabOnKeyBoard(By by) {
        driver.findElement(by).sendKeys(Keys.TAB);
    }

    public static void haulerScreenAddress1Field() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(4) > form:nth-child(1) > div > input"));
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(4) > form:nth-child(1) > div > input"));
        typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(4) > form:nth-child(1) > div > input"), "Address 1 Field");
    }

    public static void haulerScreenAddress2Field() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(4) > form:nth-child(2) > div > input"));
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(4) > form:nth-child(2) > div > input"));
        typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(4) > form:nth-child(2) > div > input"), "Address 2 Field");
    }

    public static void haulerScreenCityField() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > form > div.form-group.col-md-6 > input"));
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > form > div.form-group.col-md-6 > input"));
        typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > form > div.form-group.col-md-6 > input"), "City Field");
    }

    public static void haulerScreenNotesField() {
        waitOnBothErrorMessageAndLoadingGif();
        waitOnButtonToBeClickable(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div > textarea"));
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div > textarea"));
        typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(6) > div > div > textarea"), "Hauler Notes Field");
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////// Dropdowns//////////////////////////////////////////////////////////////////

    public static void pickingYearOfCarRandom() {
        WebElement drpDwnList = driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-2 > select"));
        Select objSel = new Select(drpDwnList);
        List<WebElement> yearOptions = objSel.getOptions();
        int iCnt = yearOptions.size();
        Random num = new Random();
        int iSelect = num.nextInt(iCnt);
        objSel.selectByIndex(iSelect);
//        System.out.println(drpDwnList.getText());
    }

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

    public static void datePicker() {
        driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div.form-group > div > div:nth-child(1) > input")).click();
        String month = "Apr 2024";
        String day = "30";
        while (true) {
            String displayedMonthYear = driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div.form-group > div > div:nth-child(2) > header > span.day__month_btn.up")).getText();
            System.out.println(displayedMonthYear);
            if (displayedMonthYear.equals(month)) {
                break;
            } else {
                driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div.form-group > div > div:nth-child(2) > header > span.next")).click();
            }
        }
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
