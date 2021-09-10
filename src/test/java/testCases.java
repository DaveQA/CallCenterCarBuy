import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testCases {

    private static WebDriver driver;
    private static String prefix = "qa";
    private static String url;

    @BeforeAll
    public static void browserSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dholliday\\Desktop\\Automated Testing\\Selenium\\Selenium Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito", "--start-maximized");
        driver = new ChromeDriver(options);
        if (prefix.equals("qa")) {
            url = "https://qa-carbuy.pullapart.com/#/login";
        } else if (prefix.equals("uat")) {
            url = "";
        } else if (prefix.equals("prod")) {
            url = "";
        }
        driver.get(url);
    }

    @Nested
    @DisplayName("Checking the login page process")
    class loginPage{
        @Test
        @DisplayName("Tried entering nothing and login")
        public void enteringBadUserInformationOnLoginScreenTest() throws InterruptedException {
            Assertions.assertEquals(loginPageChecks.enteringBadUserInformationOnTheLoginPage(driver),"https://qa-carbuy.pullapart.com/#/login","Was able to login");
        }

        @Test
        @DisplayName("Tried entering bad user information and login")
        public void enteringNoLoginInformationOnTheLoginScreenTest() throws InterruptedException {
            Assertions.assertEquals(loginPageChecks.enteringNoUserInformationOnTheLoginPage(driver),"https://qa-carbuy.pullapart.com/#/login","Was able to login");
        }

        @Test
        @DisplayName("Tried entering good user information and login")
        public void enteringGoodLoginInformationOnTheLoginScreenTest() throws InterruptedException {
            Assertions.assertEquals(loginPageChecks.enteringGoodUserInformationOnTheLoginPage(driver),"https://qa-carbuy.pullapart.com/#/dashboard","Was able to login");
        }
    }

    @Nested
    class callCodeButtons{
        @Test
        public void clickingTheCallCode833ButtonTest() throws InterruptedException {
            Assertions.assertEquals(callCodesChecks.clickCallCode833Button(driver),"https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=3");
        }

        @Test
        public void clickingCallCode500Button() throws InterruptedException {
            Assertions.assertEquals(callCodesChecks.clickCallCode500Button(driver),"https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=162");
        }

        @Test
        public void clickingCallCode501Button() throws InterruptedException {
            Assertions.assertEquals(callCodesChecks.clickCallCode501Button(driver),"https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=163");
        }

        @Test
        public void clickingCallCode502Button() throws InterruptedException {
            Assertions.assertEquals(callCodesChecks.clickCallCode502Button(driver),"https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=164");
        }

        @Test
        public void clickingCallCode503Button() throws InterruptedException {
            Assertions.assertEquals(callCodesChecks.clickCallCode503Button(driver),"https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=165");
        }

        @Test
        public void clickingCallCode504Button() throws InterruptedException {
            Assertions.assertEquals(callCodesChecks.clickCallCode504Button(driver),"https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=166");
        }

        @Test
        public void clickingCallCode510Button() throws InterruptedException {
            Assertions.assertEquals(callCodesChecks.clickCallCode510Button(driver),"https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=193");
        }
    }

    @Nested
    class topNavLinks{

        @Test
        public void topNavDashboardLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavDashboardLink(driver),"https://qa-carbuy.pullapart.com/#/dashboard");
        }

        @Test
        public void topNavNotificationsLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavNotificationsLink(driver),"https://qa-carbuy.pullapart.com/#/notifications");
        }

        @Test
        public void topNavAdminAdvanceFeaturesQuoteLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavAdminAdvanceFeaturesQuoteLink(driver),"https://qa-carbuy.pullapart.com/#/admin/quotes");
        }

        @Test
        public void topNavAdminAdvanceFeaturesNotificationLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavAdminAdvanceFeaturesNotificationLink(driver),"https://qa-carbuy.pullapart.com/#/admin/notifications");
        }

        @Test
        public void topNavAdminAdvanceFeaturesRestrictionsLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavAdminAdvanceFeaturesRestrictionsLink(driver),"https://qa-carbuy.pullapart.com/#/admin/restrictions");
        }

        @Test
        public void topNavAdminGeneralSettingsStateLawsLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavAdminGeneralSettingsStateLawsLink(driver),"https://qa-carbuy.pullapart.com/#/admin/statelaws");
        }

        @Test
        public void topNavAdminGeneralSettingsDispositionsLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavAdminGeneralSettingsDispositionsLink(driver),"https://qa-carbuy.pullapart.com/#/admin/dispositions");
        }

        @Test
        public void topNavAdminGeneralSettingsCallCodesLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavAdminGeneralSettingCallCodesLink(driver),"https://qa-carbuy.pullapart.com/#/admin/callcodes");
        }

        @Test
        public void topNavAdminGeneralSettingsUsersLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavAdminGeneralSettingUsersLink(driver),"https://qa-carbuy.pullapart.com/#/admin/users");
        }
    }

    @Nested
    class comingSoonPages{
        @Test
        public void checkComingSoonTextOnNotificationsPageTest() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.adminGeneralSettingsNotificationPageComingSoonText(driver),"COMING SOON");
        }

        @Test
        public void checkComingSoonTextOnRestrictionsPageTest() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.adminGeneralSettingsRestrictionsPageComingSoonText(driver),"COMING SOON");
        }
    }

    @Nested
    class sideBar{
        @Test
        public void customerSideBarInfoMatchesFirstLastNameEnteredTest() throws InterruptedException {
            Assertions.assertEquals(sideBarChecks.customerInfoSideBarMatchesFirstLastNameEnteredCheck(driver),"Name: John Doe");
        }

        @Test
        public void customerSideBarInfoMatchesPhoneNumberEnteredTest() throws InterruptedException {
            Assertions.assertEquals(sideBarChecks.customerInfoSideBarMatchesPhoneNumberEnteredCheck(driver),"Phone: 5555555555");
        }

        @Test
        public void customerSideBarInfoMatchesAlternateNumberEnteredTest() throws InterruptedException {
            Assertions.assertEquals(sideBarChecks.customerInfoSideBarMatchesAlternateNumberEnteredCheck(driver),"Alt. Phone: 4444444444");
        }

        @Test
        public void customerSideBarInfoMatchesEmailEnteredTest() throws InterruptedException {
            Assertions.assertEquals(sideBarChecks.customerInfoSideBarMatchesEmailEnteredCheck(driver),"Email: vip1000682431@gmail.com");
        }
    }

    @Nested
    class firstNameField{
        @Test
        public void firstNameLastNameRequirementTest() throws InterruptedException {
            Assertions.assertTrue(quoteWorkFlow.firstNameRequirementCheck(driver));
        }

        @Test
        public void lastNameRequirementTest() throws InterruptedException {
            Assertions.assertTrue(quoteWorkFlow.lastNameRequirementCheck(driver));
        }

        @Test
        public void noNameRequirementTest() throws InterruptedException {
            Assertions.assertTrue(quoteWorkFlow.noNameRequirementCheck(driver));
        }
    }

    @Nested
    class phoneNumberField{
        @Test
        public void phoneNumberRequiredTest() throws InterruptedException {
            Assertions.assertTrue(quoteWorkFlow.phoneNumberRequirementCheck(driver));
        }

        @Test
        public void badPhoneNumberTest() throws InterruptedException {
            Assertions.assertTrue(quoteWorkFlow.phoneNumberAlphaCharacterFieldCheck(driver));
        }
    }

    @Nested
    @DisplayName("Checking requirements for the email address field")
    class emailAddressField{
        @Test
        @DisplayName("Checking an email address is needed to continue")
        public void emailRequiredTest() throws InterruptedException {
            Assertions.assertTrue(quoteWorkFlow.emailRequirementCheck(driver),"Was able to continue without entering an email address");
        }

        @Test
        @DisplayName("Checking that a valid email address is needed to continue")
        public void enteringInvalidEmailAddressInformationTest() throws InterruptedException {
            Assertions.assertEquals(quoteWorkFlow.enteringInvalidEmailAddressInformationCheck(driver),"The email field must be a valid email.","Was able to continue with an invalid email address");
        }

        @Test
        @DisplayName("Checking a real email address is needed to continue")
        public void enteringFakeEmailAddressInformationCheck() throws InterruptedException {
            Assertions.assertEquals(quoteWorkFlow.enteringFakeEmailAddressInformationCheck(driver),"ZeroBounce status not valid, status:invalid","Was able to continue with a fake email address");
        }
    }

    @Nested
    @DisplayName("Checking Zipcodes are linked to correct states")
    class zipCodeField {
        @Test
        public void enteringOutOfAreaZipCodeTest() throws InterruptedException {
            Assertions.assertTrue(zipCodesChecks.enteringOutOfAreaZipCodeCheck(driver),"Was able to enter an unapproved zipcode");
        }

        @Test
        public void enteringRandomizedBirminghamMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedBirminghamMarketZipCode(driver),"Alabama","Zipcode did not match state");
        }

        @Test
        public void enteringRandomizedMobileMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedMobileMarketZipCode(driver),"Alabama","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedMontgomeryMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedMontgomeryMarketZipCode(driver),"Alabama","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedTucsonMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedTucsonMarketZipCode(driver),"Arizona","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedAtlantaEastMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedAtlantaEastMarketZipCode(driver),"Georgia","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedAtlantaNorthMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedAtlantaNorthMarketZipCode(driver),"Georgia","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedAtlantaSouthMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedAtlantaSouthMarketZipCode(driver),"Georgia","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedAugustaMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedAugustaMarketZipCode(driver),"Georgia","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedIndianapolisMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedIndianapolisMarketZipCode(driver),"Indiana","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedLouisvilleMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedLouisvilleMarketZipCode(driver),"Kentucky","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedBatonRougeMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedBatonRougeMarketZipCode(driver),"Louisiana","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedLafayetteMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedLafayetteMarketZipCode(driver),"Louisiana","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedNewOrleansWestMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedNewOrleansWestMarketZipCode(driver),"Louisiana","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedJacksonMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedJacksonMarketZipCode(driver),"Mississippi","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedCharlotteMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedCharlotteMarketZipCode(driver),"South Carolina","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedWinstonSalemMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedWinstonSalemMarketZipCode(driver),"North Carolina","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedAkronMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedAkronMarketZipCode(driver),"Ohio","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedCantonMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedCantonMarketZipCode(driver),"Ohio","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedClevelandKirbyAvenueMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedClevelandKirbyAvenueMarketZipCode(driver),"Ohio","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedClevelandWestMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedClevelandWestMarketZipCode(driver),"Ohio","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedColumbiaMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedColumbiaMarketZipCode(driver),"South Carolina","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedKnoxvilleMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedKnoxvilleMarketZipCode(driver),"Tennessee","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedMemphisMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedMemphisMarketZipCode(driver),"Tennessee","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedNashvilleMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedNashvilleMarketZipCode(driver),"Tennessee","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedCorpusChristiMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedCorpusChristiMarketZipCode(driver),"Texas","Zipcode did not match state");
        }

        @Test
        public void enterRandomizedElPasoMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedElPasoMarketZipCode(driver),"Texas","Zipcode did not match state");
        }
    }

    @Nested
    @DisplayName("Checking Year Make Model dropdown requirements ")
    class makeModelYearDropdowns{
        @Test
        public void yearIsRequiredTest() throws InterruptedException {
            Assertions.assertTrue(quoteWorkFlow.yearIsRequiredCheck(driver),"Required on screen text was not displayed");
        }

        @Test
        public void makeIsRequiredTest() throws InterruptedException {
            Assertions.assertTrue(quoteWorkFlow.makeIsRequiredCheck(driver),"Required on screen text was not displayed");
        }

        @Test
        public void modelIsRequiredTest() throws InterruptedException {
            Assertions.assertTrue(quoteWorkFlow.modelIsRequiredCheck(driver),"Required on screen text was not displayed");
        }

        @Test
        public void allYearMakeModelDropdownsAreRequiredTest() throws InterruptedException {
            Assertions.assertTrue(quoteWorkFlow.allYearMakeModelDropdownsAreRequired(driver),"Required on screen text was not displayed");
        }
    }

    @Nested
    @DisplayName("Damage radio buttons")
    class carDamageRadioButtons{
        @Test
        @DisplayName("Next button disabled when neither damage radio button is selected")
        public void notPickingEitherOptionForDamageTest() throws InterruptedException {
            Assertions.assertFalse(quoteWorkFlow.notPickingEitherOptionForDamageCheck(driver),"Was able to continue without answering damage check");
        }

        @Test
        @DisplayName("Saying Yes to damage on car and damage options are shown")
        public void pickingYesToTheIsThereDamageQuestionTest() throws InterruptedException {
            Assertions.assertTrue(quoteWorkFlow.pickingYesToDamageQuestionCheck(driver),"The type of damage options did not show on screen");
        }

        @Test
        @DisplayName("Saying No to damage on car and damage options are not shown")
        public void pickingNoToTheIsThereDamageQuestionTest() throws InterruptedException {
            Assertions.assertFalse(quoteWorkFlow.pickingNoToDamageQuestionCheck(driver),"The type of damage options show on screen");
        }
    }

    @Nested
    @DisplayName("Filling out the type of damage section")
    class fillingOutTypeOfDamageSection {
        @Test //Will need to redo if depending on DEV response
        @DisplayName("Not picking Yes or No to type of damage option and clicking next button")
        public void pickingNeitherTypeOfDamageOptionTest() throws InterruptedException {
            Assertions.assertEquals(quoteWorkFlow.pickingNeitherTypeOfDamageOptionCheck(driver),"https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=3");
        }

        @Test
        @DisplayName("Picking Yes to type of damage and clicking next button")
        public void pickingYesTypeOfDamageOptionTest() throws InterruptedException {
            Assertions.assertTrue(quoteWorkFlow.pickingYesToFireRolloverDamageOnCar(driver),"The peddle response script was not displayed on screen");
        }

        @Test
        @DisplayName("Picking No to type of damage with notes and clicking next button")
        public void pickingNoTypeOfDamageOptionWithNotesTest(){}

        @Test
        @DisplayName("Picking No to type of damage without entering notes and clicking next button")
        public void pickingNoTypeOfDamageOptionNoNotesTest(){}

    }
}
