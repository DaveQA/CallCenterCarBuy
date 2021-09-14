import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _01_testCases {

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
    @DisplayName("Call code buttons - speed dail")
    class callCodeButtons{
        @Test
        @DisplayName("Checking call code 833 codeID")
        public void clickingTheCallCode833ButtonTest() throws InterruptedException {
            Assertions.assertEquals(callCodesChecks.clickCallCode833Button(driver),"https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=3","Call code ID did not match expected");
        }

        @Test
        @DisplayName("Checking call code 500 codeID")
        public void clickingCallCode500Button() throws InterruptedException {
            Assertions.assertEquals(callCodesChecks.clickCallCode500Button(driver),"https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=162","Call code ID did not match expected");
        }

        @Test
        @DisplayName("Checking call code 501 codeID")
        public void clickingCallCode501Button() throws InterruptedException {
            Assertions.assertEquals(callCodesChecks.clickCallCode501Button(driver),"https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=163","Call code ID did not match expected");
        }

        @Test
        @DisplayName("Checking call code 502 codeID")
        public void clickingCallCode502Button() throws InterruptedException {
            Assertions.assertEquals(callCodesChecks.clickCallCode502Button(driver),"https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=164","Call code ID did not match expected");
        }

        @Test
        @DisplayName("Checking call code 503 codeID")
        public void clickingCallCode503Button() throws InterruptedException {
            Assertions.assertEquals(callCodesChecks.clickCallCode503Button(driver),"https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=165","Call code ID did not match expected");
        }

        @Test
        @DisplayName("Checking call code 504 codeID")
        public void clickingCallCode504Button() throws InterruptedException {
            Assertions.assertEquals(callCodesChecks.clickCallCode504Button(driver),"https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=166","Call code ID did not match expected");
        }

        @Test
        @DisplayName("Checking call code 510 codeID")
        public void clickingCallCode510Button() throws InterruptedException {
            Assertions.assertEquals(callCodesChecks.clickCallCode510Button(driver),"https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=193","Call code ID did not match expected");
        }
    }

    @Nested
    @DisplayName("Checking top navigation links")
    class topNavLinks{
        @Test
        @DisplayName("Top nav link - Dashboard")
        public void topNavDashboardLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavDashboardLink(driver),"https://qa-carbuy.pullapart.com/#/dashboard","URL did not match expected");
        }

        @Test
        @DisplayName("Top nav link - Notification")
        public void topNavNotificationsLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavNotificationsLink(driver),"https://qa-carbuy.pullapart.com/#/notifications","URL did not match expected");
        }

        @Test
        @DisplayName("Top nav link - Admin Advance Features Quote")
        public void topNavAdminAdvanceFeaturesQuoteLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavAdminAdvanceFeaturesQuoteLink(driver),"https://qa-carbuy.pullapart.com/#/admin/quotes","URL did not match expected");
        }

        @Test
        @DisplayName("Top nav link - Admin Advance Features Notification")
        public void topNavAdminAdvanceFeaturesNotificationLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavAdminAdvanceFeaturesNotificationLink(driver),"https://qa-carbuy.pullapart.com/#/admin/notifications","URL did not match expected");
        }

        @Test
        @DisplayName("Top nav link - Admin Advance Features Restriction")
        public void topNavAdminAdvanceFeaturesRestrictionsLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavAdminAdvanceFeaturesRestrictionsLink(driver),"https://qa-carbuy.pullapart.com/#/admin/restrictions","URL did not match expected");
        }

        @Test
        @DisplayName("Top nav link - Admin General Settings State Laws")
        public void topNavAdminGeneralSettingsStateLawsLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavAdminGeneralSettingsStateLawsLink(driver),"https://qa-carbuy.pullapart.com/#/admin/statelaws","URL did not match expected");
        }

        @Test
        @DisplayName("Top nav link - Admin General Settings Dispositions")
        public void topNavAdminGeneralSettingsDispositionsLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavAdminGeneralSettingsDispositionsLink(driver),"https://qa-carbuy.pullapart.com/#/admin/dispositions","URL did not match expected");
        }

        @Test
        @DisplayName("Top nav link - Admin General Settings Call Codes")
        public void topNavAdminGeneralSettingsCallCodesLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavAdminGeneralSettingCallCodesLink(driver),"https://qa-carbuy.pullapart.com/#/admin/callcodes","URL did not match expected");
        }

        @Test
        @DisplayName("Top nav link - Admin General Settings Users")
        public void topNavAdminGeneralSettingsUsersLink() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.clickTopNavAdminGeneralSettingUsersLink(driver),"https://qa-carbuy.pullapart.com/#/admin/users","URL did not match expected");
        }
    }

    @Nested
    @DisplayName("Coming Soon pages")
    class comingSoonPages{
        @Test
        @DisplayName("Coming Soon Page - Notification Page")
        public void checkComingSoonTextOnNotificationsPageTest() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.adminGeneralSettingsNotificationPageComingSoonText(driver),"COMING SOON","Coming Soon text ");
        }

        @Test
        @DisplayName("Coming Soon Page - Restriction Page")
        public void checkComingSoonTextOnRestrictionsPageTest() throws InterruptedException {
            Assertions.assertEquals(topNavChecks.adminGeneralSettingsRestrictionsPageComingSoonText(driver),"COMING SOON");
        }
    }

    @Nested
    @DisplayName("Sidebar Checks")
    class sideBar{
        @Test
        @DisplayName("Sidebar matches information entered - Firstname and Lastname")
        public void customerSideBarInfoMatchesFirstLastNameEnteredTest() throws InterruptedException {
            Assertions.assertEquals(sideBarChecks.customerInfoSideBarMatchesFirstLastNameEnteredCheck(driver),"Name: John Doe");
        }

        @Test
        @DisplayName("Sidebar matches information entered - Phone number")
        public void customerSideBarInfoMatchesPhoneNumberEnteredTest() throws InterruptedException {
            Assertions.assertEquals(sideBarChecks.customerInfoSideBarMatchesPhoneNumberEnteredCheck(driver),"Phone: 5555555555");
        }

        @Test
        @DisplayName("Sidebar matches information entered - Alternate number")
        public void customerSideBarInfoMatchesAlternateNumberEnteredTest() throws InterruptedException {
            Assertions.assertEquals(sideBarChecks.customerInfoSideBarMatchesAlternateNumberEnteredCheck(driver),"Alt. Phone: 4444444444");
        }

        @Test
        @DisplayName("Sidebar matches information entered - Email address")
        public void customerSideBarInfoMatchesEmailEnteredTest() throws InterruptedException {
            Assertions.assertEquals(sideBarChecks.customerInfoSideBarMatchesEmailEnteredCheck(driver),"Email: vip1000682431@gmail.com");
        }
    }

    @Nested
    @DisplayName("Firstname and Lastname field checks")
    class firstNameField{
        @Test
        @DisplayName("Checking firstname field is required")
        public void firstNameLastNameRequirementTest() throws InterruptedException {
            Assertions.assertTrue(firstNameLastNameFields.enteringOnlyLastNameCheck(driver),"Was able to continue without a Firstname");
        }

        @Test
        @DisplayName("Checking lastname field is required")
        public void lastNameRequirementTest() throws InterruptedException {
            Assertions.assertTrue(firstNameLastNameFields.enteringOnlyFirstNameCheck(driver),"Was able to continue without entering a Lastname");
        }

        @Test
        @DisplayName("Checking both Firstname and Lastname fields are required")
        public void noNameRequirementTest() throws InterruptedException {
            Assertions.assertTrue(firstNameLastNameFields.enteringNeitherFirstNameNorLastNameCheck(driver),"Was able to continue without entering an Firstname and Lastname");
        }
    }

    @Nested
    @DisplayName("Phone number field checks")
    class phoneNumberField{
        @Test
        @DisplayName("Checking phone number field is required")
        public void phoneNumberFieldRequiredTest() throws InterruptedException {
            Assertions.assertTrue(phoneNumberAlternateNumberFields.enteringNothingInPhoneNumberFieldCheck(driver),"Was able to continue without a phone number");
        }

        @Test
        @DisplayName("Checking that alpha characters are not accepted in the phone number field")
        public void phoneNumberFieldAlphaCharacterTest() throws InterruptedException {
            Assertions.assertTrue(phoneNumberAlternateNumberFields.enteringAlphaCharactersInPhoneNumberFieldCheck(driver), "Was able continue with alpha characters in the phone number field");
        }

        @Test
        @DisplayName("Checking that special characters are not accepted in the phone number field")
        public void phoneNumberFieldSpecialCharacterTest() throws InterruptedException {
            Assertions.assertTrue(phoneNumberAlternateNumberFields.enteringSpecialCharactersInPhoneNumberFieldCheck(driver),"Was able to continue with special characters in the phone number field");
        }
    }

//    @Nested
//    @DisplayName("Alternate Number Field")
//    class alternateNumberField{
//        @Test
//        @DisplayName("Checking that alpha characters are not accepted in the alternate number field")
//        public void badPhoneNumberTest(){}
//
//        @Test
//        @DisplayName("Checking that special characters are not accepted in the phone number field")
//        public void specialCharacterTest(){}
//    }

    @Nested
    @DisplayName("Checking requirements for the email address field")
    class emailAddress{
        @Test
        @DisplayName("Checking an email address is needed to continue")
        public void emailRequiredTest() throws InterruptedException {
            Assertions.assertTrue(emailAddressField.emailRequirementCheck(driver),"Was able to continue without entering an email address");
        }

        @Test
        @DisplayName("Checking that a valid email address is needed to continue")
        public void enteringInvalidEmailAddressInformationTest() throws InterruptedException {
            Assertions.assertEquals(emailAddressField.enteringInvalidEmailAddressInformationCheck(driver),"The email field must be a valid email.","Was able to continue with an invalid email address");
        }

        @Test
        @DisplayName("Checking a real email address is needed to continue")
        public void enteringFakeEmailAddressInformationCheck() throws InterruptedException {
            Assertions.assertEquals(emailAddressField.enteringFakeEmailAddressInformationCheck(driver),"ZeroBounce status not valid, status:invalid","Was able to continue with a fake email address");
        }
    }

    @Nested
    @DisplayName("Checking Zipcodes are linked to correct states")
    class zipCodeField {
        @Test
        @DisplayName("Trying an unapproved zipcode")
        public void enteringOutOfAreaZipCodeTest() throws InterruptedException {
            Assertions.assertTrue(zipCodesChecks.enteringOutOfAreaZipCodeCheck(driver),"Was able to enter an unapproved zipcode");
        }

        @Test
        @DisplayName("Entering a zipcode - Alabama")
        public void enteringRandomizedBirminghamMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedBirminghamMarketZipCode(driver),"Alabama","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Alabama")
        public void enteringRandomizedMobileMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedMobileMarketZipCode(driver),"Alabama","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Alabama")
        public void enterRandomizedMontgomeryMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedMontgomeryMarketZipCode(driver),"Alabama","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Arizona")
        public void enterRandomizedTucsonMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedTucsonMarketZipCode(driver),"Arizona","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Georgia")
        public void enterRandomizedAtlantaEastMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedAtlantaEastMarketZipCode(driver),"Georgia","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Georgia")
        public void enterRandomizedAtlantaNorthMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedAtlantaNorthMarketZipCode(driver),"Georgia","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Georgia")
        public void enterRandomizedAtlantaSouthMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedAtlantaSouthMarketZipCode(driver),"Georgia","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Georgia")
        public void enterRandomizedAugustaMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedAugustaMarketZipCode(driver),"Georgia","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Indiana")
        public void enterRandomizedIndianapolisMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedIndianapolisMarketZipCode(driver),"Indiana","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Kentucky")
        public void enterRandomizedLouisvilleMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedLouisvilleMarketZipCode(driver),"Kentucky","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Louisiana")
        public void enterRandomizedBatonRougeMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedBatonRougeMarketZipCode(driver),"Louisiana","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Louisiana")
        public void enterRandomizedLafayetteMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedLafayetteMarketZipCode(driver),"Louisiana","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Louisiana")
        public void enterRandomizedNewOrleansWestMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedNewOrleansWestMarketZipCode(driver),"Louisiana","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Mississippi")
        public void enterRandomizedJacksonMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedJacksonMarketZipCode(driver),"Mississippi","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - South Carolina")
        public void enterRandomizedCharlotteMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedCharlotteMarketZipCode(driver),"South Carolina","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - North Carolina")
        public void enterRandomizedWinstonSalemMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedWinstonSalemMarketZipCode(driver),"North Carolina","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Ohio")
        public void enterRandomizedAkronMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedAkronMarketZipCode(driver),"Ohio","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Ohio")
        public void enterRandomizedCantonMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedCantonMarketZipCode(driver),"Ohio","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Ohio")
        public void enterRandomizedClevelandKirbyAvenueMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedClevelandKirbyAvenueMarketZipCode(driver),"Ohio","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Ohio")
        public void enterRandomizedClevelandWestMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedClevelandWestMarketZipCode(driver),"Ohio","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - South Carolina")
        public void enterRandomizedColumbiaMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedColumbiaMarketZipCode(driver),"South Carolina","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Tennessee")
        public void enterRandomizedKnoxvilleMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedKnoxvilleMarketZipCode(driver),"Tennessee","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Tennessee")
        public void enterRandomizedMemphisMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedMemphisMarketZipCode(driver),"Tennessee","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Tennessee")
        public void enterRandomizedNashvilleMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedNashvilleMarketZipCode(driver),"Tennessee","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Texas")
        public void enterRandomizedCorpusChristiMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedCorpusChristiMarketZipCode(driver),"Texas","Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Texas")
        public void enterRandomizedElPasoMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(zipCodesChecks.enterApprovedElPasoMarketZipCode(driver),"Texas","Zipcode did not match state");
        }
    }

    @Nested
    @DisplayName("Checking Year Make Model dropdown requirements ")
    class makeModelYearDropdowns{
        @Test
        @DisplayName("Checking Year of car is required")
        public void yearIsRequiredTest() throws InterruptedException {
            Assertions.assertTrue(yearMakeModelDropdowns.yearIsRequiredCheck(driver),"Required on screen text was not displayed");
        }

        @Test
        @DisplayName("Checking Make of car is required")
        public void makeIsRequiredTest() throws InterruptedException {
            Assertions.assertTrue(yearMakeModelDropdowns.makeIsRequiredCheck(driver),"Required on screen text was not displayed");
        }

        @Test
        @DisplayName("Checking Model of car is required")
        public void modelIsRequiredTest() throws InterruptedException {
            Assertions.assertTrue(yearMakeModelDropdowns.modelIsRequiredCheck(driver),"Required on screen text was not displayed");
        }

        @Test
        @DisplayName("Checking Year, Make, Model of car are all required")
        public void allYearMakeModelDropdownsAreRequiredTest() throws InterruptedException {
            Assertions.assertTrue(yearMakeModelDropdowns.allYearMakeModelDropdownsAreRequired(driver),"Required on screen text was not displayed");
        }
    }

    @Nested
    @DisplayName("Damage radio buttons")
    class carDamageRadioButtons{
        @Test
        @DisplayName("Radio button picking damage - Neither")
        public void notPickingEitherOptionForDamageTest() throws InterruptedException {
            Assertions.assertFalse(damageOnCarRadioButtons.pickingNeitherRadioButtonIfThereIsDamage(driver),"Was able to continue without answering damage check");
        }

        @Test
        @DisplayName("Radio button picking damage - Yes")
        public void pickingYesToTheIsThereDamageQuestionTest() throws InterruptedException {
            Assertions.assertTrue(damageOnCarRadioButtons.RadioButtonYesThereIsDamageOnCarCheck(driver),"The type of damage options did not show on screen");
        }

        @Test
        @DisplayName("Radio button picking damage - No")
        public void pickingNoToTheIsThereDamageQuestionTest() throws InterruptedException {
            Assertions.assertFalse(damageOnCarRadioButtons.radioButtonNoThereIsNotDamageOnCarCheck(driver),"The type of damage options show on screen");
        }
    }

    @Nested
    @DisplayName("Filling out the type of damage section")
    class fillingOutTypeOfDamageSection {
        @Test //Will need to redo if depending on DEV response
        @DisplayName("Not picking Yes or No to type of damage option and clicking next button")
        public void pickingNeitherTypeOfDamageOptionTest() throws InterruptedException {
            Assertions.assertEquals(damageOnCarRadioButtons.pickingNeitherTypeOfDamageOptionCheck(driver),"https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=3");
        }

        @Test
        @DisplayName("Picking Yes there is Fire, Flood, Rollover damage")
        public void radioButtonYesToFireRolloverDamageOnCarWithNotesTest() throws InterruptedException {
            Assertions.assertTrue(damageOnCarRadioButtons.radioButtonYesToFireRolloverDamageOnCarCheck(driver),"The peddle response script was not displayed on screen");
        }

        @Test
        @DisplayName("Checking for detail damage notes contain shows")
        public void radioButtonYesToTypeOfDamageOptionWithNoNotesTest() throws InterruptedException {
            Assertions.assertTrue(damageOnCarRadioButtons.thereIsNoFireFloodRolloverDamageRadioButtonCheck(driver),"Detail Damage Notes container did not show on screen");
        }

        @Test
        @DisplayName("Picking No to type of damage without entering notes and clicking next button")
        public void detailDamageNotesIsRequiredTest() throws InterruptedException {
            Assertions.assertTrue(damageOnCarRadioButtons.detailDamageNotesIsRequiredCheck(driver),"Was able to continue without entering detail damage notes");
        }

        @Test
        @DisplayName("Checking Detail Damage container notes")
        public void checkingDetailDamageNotesContainerIsEditableTest() throws InterruptedException {
            Assertions.assertFalse(damageOnCarRadioButtons.checkingDetailDamageNotesContainerIsEditableCheck(driver),"Detail Damage Notes container may not have been editable");
        }
    }
}
