import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class utilities {

    private static WebDriver driver;

    public static void enterGoodLoginInfo(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        typeSomething(By.cssSelector("#app > div > div.content > form > div:nth-child(3) > input"),"mf");
        typeSomething(By.cssSelector("#app > div > div.content > form > div:nth-child(4) > input"),"mf");
                Thread.sleep(2000);
    }

    public static void enterBadLoginInfo(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        typeSomething(By.cssSelector("#app > div > div.content > form > div:nth-child(3) > input"),"THISISNOTTHEUSERNAME");
        typeSomething(By.cssSelector("#app > div > div.content > form > div:nth-child(4) > input"),"THISISNOTTHEPASSWORD");
                Thread.sleep(2000);
    }

    public static void enterNoLoginInfo(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        typeSomething(By.cssSelector("#app > div > div.content > form > div:nth-child(3) > input"),"");
        typeSomething(By.cssSelector("#app > div > div.content > form > div:nth-child(4) > input"),"");
                Thread.sleep(2000);
    }

    public static void clickTheLoginButton() throws InterruptedException {
        clickSomething(By.cssSelector("#app > div > div.content > form > div.form-actions > button"));
                Thread.sleep(2000);
    }

    public static void logOutOfApplication() throws InterruptedException {
        clickSomething(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-top > div > div.top-menu > ul > li.dropdown.dropdown-extended.quick-sidebar-toggler > i"));
                Thread.sleep(2000);
    }

    public static void goToLoginPage() throws InterruptedException {
        driver.get("https://qa-carbuy.pullapart.com/#/login");
                Thread.sleep(2000);
    }

    public static void clickLogoButton() throws InterruptedException {
        clickSomething(By.cssSelector("#app > div > div:nth-child(1) > div > div > div.page-header-top > div > div.page-logo > a"));
                Thread.sleep(2000);
    }

    public static void clickTheRefreshButton() throws InterruptedException {
        clickSomething(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div > div > div.todo-content > div > div.portlet-title > div.actions > a > i"));
                Thread.sleep(2000);
    }

    public static void clickSomething(By by){
        driver.findElement(by).click();
    }

    public static void typeSomething(By by, String value){
        driver.findElement(by).sendKeys(value);
    }

    public static void tabOnKeyBoard(By by){
        driver.findElement(by).sendKeys(Keys.TAB);
    }

    public static void enterStaticFirstName() throws InterruptedException {
        typeSomething(By.cssSelector("#firstname"),"John");
                Thread.sleep(1000);
    }

    public static void enterStaticLastName() throws InterruptedException {
        typeSomething(By.cssSelector("#lastname"),"Doe");
                Thread.sleep(1000);
    }

    public static void clickCallCodeButton() throws InterruptedException {
        clickSomething(By.cssSelector("#app > div > div.page-wrapper-row.full-height > div > div > div > div.page-content > div > div > div > div > div.col-md-5 > div > div > div.row.scrollingDiv > div > div:nth-child(1) > div > div.details > div.number"));
                Thread.sleep(2000);
    }

    public static void clickNextButton() throws InterruptedException {
        WebElement scrollToButton = driver.findElement(By.cssSelector("#pro-wizard > div.step-wrapper.active > button:nth-child(3)"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, scrollToButton);
                Thread.sleep(1000);
        clickSomething(By.cssSelector("#pro-wizard > div.step-wrapper.active > button:nth-child(3)"));
                Thread.sleep(1500);
    }

    public static void clickNewQuoteButton() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div:nth-child(3) > button"));
                Thread.sleep(1000);
    }

    public static void enterGoodPhoneNumber() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > input"));
        typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > input"),"5555555555");
                Thread.sleep(1000);
    }

    public static void enterAlphaCharactersInPhoneNumberField() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > input"));
        typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > input"),"Not a Phone Number");
                Thread.sleep(1000);
    }

    public static void enterSpecialCharactersInPhoneNumberField() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > input"));
        typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > input"),"@#$%^&*(");
                Thread.sleep(1000);
    }

    public static void enterAlternatePhoneNumber() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input"));
        typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input"),"4444444444");
                Thread.sleep(1000);
    }

    public static void enterGoodEmailAddress() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > div > input"));
        typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > div > input"),"vip1000682431@gmail.com");
                Thread.sleep(2000);
    }

    public static void enteringInvalidEmailAddressInformation() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > div > input"));
        typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > div > input"),"NotaRealEmail");
                Thread.sleep(2000);
    }

    public static void enteringFakeEmailAddressInformation() throws InterruptedException {
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > div > input"));
        typeSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(3) > div > input"),"NotaRealEmail@nope.com");
                Thread.sleep(2000);
    }

    public static void enteringOutOfAreaZipCode() throws InterruptedException {
        clickSomething(By.cssSelector("#zipCode"));
        driver.findElement(By.cssSelector("#zipCode")).sendKeys("0",Keys.TAB);
                Thread.sleep(2000);
    }

    public static void fillingOutFirstScreen(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        enterGoodLoginInfo(driver);
        clickTheLoginButton();
        clickCallCodeButton();
        enterStaticFirstName();
        enterStaticLastName();
        clickNextButton();
        clickNewQuoteButton();
        enterGoodPhoneNumber();
        enterGoodEmailAddress();
        clickNextButton();
    }

    public static String randomizeFirstName() {
        String[] firstNameOptions;
        firstNameOptions = new String[10];
        firstNameOptions[0] = "FirstName1";
        firstNameOptions[1] = "FirstName2";
        firstNameOptions[2] = "FirstName3";
        firstNameOptions[3] = "FirstName4";
        firstNameOptions[4] = "FirstName5";
        firstNameOptions[5] = "FirstName6";
        firstNameOptions[6] = "FirstName7";
        firstNameOptions[7] = "FirstName8";
        firstNameOptions[8] = "FirstName9";
        firstNameOptions[9] = "FirstName10";
        int randomFirstName = (int) (Math.random() * firstNameOptions.length);
        return firstNameOptions[randomFirstName];
    }

    public static String randomizeLastName() {
        String[] lastNameOptions;
        lastNameOptions = new String[10];
        lastNameOptions[0] = "LastName1";
        lastNameOptions[1] = "LastName2";
        lastNameOptions[2] = "LastName3";
        lastNameOptions[3] = "LastName4";
        lastNameOptions[4] = "LastName5";
        lastNameOptions[5] = "LastName6";
        lastNameOptions[6] = "LastName7";
        lastNameOptions[7] = "LastName8";
        lastNameOptions[8] = "LastName9";
        lastNameOptions[9] = "LastName10";
        int randomLastName = (int) (Math.random() * lastNameOptions.length);
        return lastNameOptions[randomLastName];
    }

    public static void pickingYearOfCarRandom(){
        WebElement drpDwnList = driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-2 > select"));
        Select objSel = new Select(drpDwnList);
        List<WebElement> yearOptions = objSel.getOptions();
        int iCnt = yearOptions.size();
        Random num = new Random();
        int iSelect = num.nextInt(iCnt);
        objSel.selectByIndex(iSelect);
//        System.out.println(drpDwnList.getText());
    }

    public static void pickingMakeOfCarRandom(){
        WebElement drpDwnList = driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-3 > select"));
        Select objSel = new Select(drpDwnList);
        List<WebElement> makeOptions = objSel.getOptions();
        int iCnt = makeOptions.size();
        Random num = new Random();
        int iSelect = num.nextInt(iCnt);
        objSel.selectByIndex(iSelect);
//        System.out.println(drpDwnList.getText());
    }

    public static void pickingModelOfCarRandom(){
        WebElement drpDwnList = driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-5 > select"));
        Select objSel = new Select(drpDwnList);
        List<WebElement> modelOptions = objSel.getOptions();
        int iCnt = modelOptions.size();
        Random num = new Random();
        int iSelect = num.nextInt(iCnt);
        objSel.selectByIndex(iSelect);
//        System.out.println(drpDwnList.getText());
    }

    public static void clickingYesRadioButtonIsThereDamageToCar(){
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div.form-group > div > div > label:nth-child(2)"));
    }

    public static void clickingNoRadioButtonIsThereDamageToCar(){
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div.form-group > div > div > label:nth-child(3)"));
    }

    public static void clickingYesFireFloodOrRolloverAccidentRadioButton(){
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div.form-horizontal > div > div > div > label:nth-child(2)"));
    }

    public static void enteringDetailDamageNotes(){
        clickSomething(By.cssSelector("#detailDamage"));
        typeSomething(By.cssSelector("#detailDamage"),"Test Detail Damage Notes");
    }

    public static void  clickingNoFireFloodOrRolloverAccidentRadioButton(){
        clickSomething(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(5) > div.form-horizontal > div > div > div > label:nth-child(3)"));
    }

    public static void enteringZipCodeStatic(){
        driver.findElement(By.cssSelector("#zipCode")).sendKeys("30188",Keys.TAB);
    }

    public static void pickingYearOfCarStatic(){
        driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-2 > select > option:nth-child(16)")).click();
    }

    public static void pickingMakeOfCarStatic() throws InterruptedException {
        driver.findElement(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div > div.col-md-3 > select > option:nth-child(35)")).click();
                Thread.sleep(1000);
    }

    public static void pickingModelOfCarStatic(){
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
}
