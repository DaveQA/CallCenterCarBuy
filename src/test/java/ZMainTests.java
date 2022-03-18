import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZMainTests {

    private static WebDriver driver;

    @BeforeAll
    public static void browserSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dholliday\\Desktop\\QA Resources\\Selenium Project Items\\WebDrivers\\Chrome\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito", "--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://qa-carbuy.pullapart.com/#/login");
    }

    @Nested
    @DisplayName("Testing the main login page")
    class MainLoginScreenTest {
        @Test
        @DisplayName("Empty - Try entering nothing and login")
        public void empty_InformationOnTheMainLoginScreen_Test() throws InterruptedException {
            Assertions.assertEquals(mainLoginScreen.empty_InformationOnTheMainLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/login", "Was able to login");
        }

        @Test
        @DisplayName("Bad - Try entering bad user information and login")
        public void bad_InformationOnTheMainLoginScreen_Test() throws InterruptedException {
            Assertions.assertEquals(mainLoginScreen.bad_InformationOnTheMainLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/login", "Was able to login");
        }

        @Test
        @DisplayName("Fake - Try entering bad user information and login")
        public void fake_InformationOnTheMainLoginScreen_Test() throws InterruptedException {
            Assertions.assertEquals(mainLoginScreen.fake_InformationOnTheMainLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/login", "Was able to login");
        }

        @Test
        @DisplayName("Good - Try entering good user information and login")
        public void good_InformationOnTheMainLoginScreen_Test() throws InterruptedException {
            Assertions.assertEquals(mainLoginScreen.good_InformationOnTheMainLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/mitellogin", "Was able to login");
        }
    }

    @Nested
    @DisplayName("Mitel Login Screen")
    class MitelLoginScreenTest {
        @Test
        @DisplayName("Empty - Try entering nothing and login")
        public void empty_InformationOnTheMitelLoginScreen_Test() {
            Assertions.assertEquals(mitelLoginScreen.empty_InformationOnTheMitelLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/mitellogin", "Not on Mitel Login screen");
        }

        @Test
        @DisplayName("Bad - Try entering bad user information and login")
        public void bad_InformationOnTheMitelLoginScreen_Test() {
            Assertions.assertEquals(mitelLoginScreen.bad_InformationOnTheMitelLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/mitellogin", "Not on the Mitel Login screen");
        }

        @Test
        @DisplayName("Fake - Try entering bad user information and login")
        public void fake_InformationOnTheMitelLoginScreen_Test() {
            Assertions.assertEquals(mitelLoginScreen.fake_InformationOnTheMitelLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/mitellogin", "Not on the Mitel Login screen");
        }

        @Test
        @DisplayName("Good - Try entering good user information and login")
// might be better to check the mitel status on the dashboard
        public void good_InformationOnTheMitelLoginScreen_Test() {
            Assertions.assertEquals(mitelLoginScreen.good_InformationOnTheMitelLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/dashboard", "Not on the Mitel Login screen");
        }
    }

    @Nested
    @DisplayName("Checking top navigation links")
    class TopNavLinksTests {
        @Test
        @DisplayName("Clicking on link in top nav - Dashboard")
        public void clicking_TopNavLink_Dashboard_Test() {
            Assertions.assertEquals(topNav.clicking_TopNavLink_Dashboard(driver), "https://qa-carbuy.pullapart.com/#/dashboard", "URL did not match expected");
        }

        @Test
        @DisplayName("Clicking on link in top nav - Notification")
        public void clicking_TopNavLink_Notifications_Test() {
            Assertions.assertEquals(topNav.clicking_TopNavLink_Notifications(driver), "https://qa-carbuy.pullapart.com/#/notifications", "URL did not match expected");
        }

        @Test
        @DisplayName("Clicking on link in top nav - Admin Advance Features Quote")
        public void clicking_TopNavLink_Admin_Quote_Test() {
            Assertions.assertEquals(topNav.clicking_TopNavLink_Admin_Quote(driver), "https://qa-carbuy.pullapart.com/#/admin/quotes", "URL did not match expected");
        }

        @Test
        @DisplayName("Clicking on link in top nav - Admin General Settings Dispositions")
        public void clicking_TopNavLink_Admin_Dispositions_Test() {
            Assertions.assertEquals(topNav.clicking_TopNavLink_Admin_Dispositions(driver), "https://qa-carbuy.pullapart.com/#/admin/dispositions", "URL did not match expected");
        }

        @Test
        @DisplayName("Clicking on link in top nav - Admin General Settings Call Codes")
        public void clicking_TopNavLink_Admin_CallCodes_Test() {
            Assertions.assertEquals(topNav.clicking_TopNavLink_Admin_CallCodes(driver), "https://qa-carbuy.pullapart.com/#/admin/callcodes", "URL did not match expected");
        }

        @Test
        @DisplayName("Clicking on link in top nav - Admin General Settings Users")
        public void clicking_TopNavLink_Admin_Users_Test() {
            Assertions.assertEquals(topNav.clicking_TopNavLink_Admin_Users(driver), "https://qa-carbuy.pullapart.com/#/admin/users", "URL did not match expected");
        }
    }

    @Nested
    @DisplayName("Clicking on call code links")
    class CallCodeButtonsTests {
        @Test
        @DisplayName("Clicking Call Code Link - Callback Number (OLD) button ID")
        public void clickCallCode_OnlineQuoteCallbackNumberOLD_Button_Test() {
            Assertions.assertEquals(speedDailContainer.clickCallCode_OnlineQuoteCallbackNumberOLD_Button(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=3&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=Online%20Quote%20Callback%20Number%20%28OLD%29", "Call code ID did not match expected");
        }

        @Test
        @DisplayName("Clicking Call Code Link - 500-Partner-Peddle-All")
        public void ClickingCallCode_500PartnerPeddleAll_Test() {
            Assertions.assertEquals(speedDailContainer.ClickingCallCode_500PartnerPeddleAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=162&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=500-Partner-Peddle-All", "Call code ID did not match expected");
        }

        @Test
        @DisplayName("Clicking Call Code Link - 501-Partner-Carbrain-All")
        public void ClickingCallCode_501PartnerCarbrainAll_Test() {
            Assertions.assertEquals(speedDailContainer.ClickingCallCode_501PartnerCarbrainAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=163&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=501-Partner-Carbrain-All", "Call code ID did not match expected");
        }

        @Test
        @DisplayName("Clicking Call Code Link - 502-Partner-Junk Car Boys-All")
        public void ClickingCallCode_502PartnerJunkCarBoysAll_Test() {
            Assertions.assertEquals(speedDailContainer.ClickingCallCode_502PartnerJunkCarBoysAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=164&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=502-Partner-Junk%20Car%20Boys-All", "Call code ID did not match expected");
        }

        @Test
        @DisplayName("Clicking Call Code Link - 503-Partner-Ars-All")
        public void ClickingCallCode_503PartnerArsAll_Test() {
            Assertions.assertEquals(speedDailContainer.ClickingCallCode_503PartnerArsAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=165&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=503-Partner-Ars-All", "Call code ID did not match expected");
        }

        @Test
        @DisplayName("Clicking Call Code Link - 504-Partner-Cars-All")
        public void ClickingCallCode_504PartnerCarsAll_Test() {
            Assertions.assertEquals(speedDailContainer.ClickingCallCode_504PartnerCarsAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=166&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=504-Partner-Cars-All", "Call code ID did not match expected");
        }

        @Test
        @DisplayName("Clicking Call Code Link - 510-Partner-Junk Car Solutions-All")
        public void ClickingCallCode_510PartnerJunkCarSolutionsAll_Test() {
            Assertions.assertEquals(speedDailContainer.ClickingCallCode_510PartnerJunkCarSolutionsAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=193&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=510-Partner-Junk%20Car%20Solutions-All", "Call code ID did not match expected");
        }

        @Test
        @DisplayName("Filtering call codes by entering numbers")
        public void filteringCallCodes_NumericCharacters_Test() {
            Assertions.assertEquals(speedDailContainer.filteringCallCodes_NumericCharacters(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=163&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=501-Partner-Carbrain-All", "Filtering function is not working as expected");
        }

        @Test
        @DisplayName("Filtering call codes by entering letters")
        public void filteringCallCodes_AlphaCharacters_Test() {
            Assertions.assertEquals(speedDailContainer.filteringCallCodes_AlphaCharacters(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=163&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=501-Partner-Carbrain-All", "Filtering function is not working as expected");
        }
    }

    @Nested
    @DisplayName("Sidebar Tests")
    class SideBarTests {
        @Test
        @DisplayName("Sidebar matches information entered - Firstname and Lastname")
        public void checkingSidebarInformation_FirstAndLastName_Test() {
            Assertions.assertEquals(sideBar.checkingSidebarInformation_FirstAndLastName(driver), "Name: John Doe", "Sidebar information does not match");
        }

        @Test
        @DisplayName("Sidebar matches information entered - Primary Phone number")
        public void checkingSidebarInformation_PrimaryPhoneNumber_Test() {
            Assertions.assertEquals(sideBar.checkingSidebarInformation_PrimaryPhoneNumber(driver), "Phone: 5555555", "Sidebar information does not match");
        }

        @Test
        @DisplayName("Sidebar matches information entered - Alternate number")
        public void checkingSidebarInformation_AlternatePhoneNumber_Test() {
            Assertions.assertEquals(sideBar.checkingSidebarInformation_AlternatePhoneNumber(driver), "Alt. Phone: 4444444", "Sidebar information does not match");
        }

        @Test
        @DisplayName("Sidebar matches information entered - Email address")
        public void customerSideBarInfoMatchesEmailEnteredTest() {
            Assertions.assertEquals(sideBar.checkingSidebarInformation_EmailAddress(driver), "Email: vip1000682431@gmail.com", "Sidebar information does not match");
        }
    }

    @Nested
    @DisplayName("Customer Information Requirement Checks")
    class CustomerInformationFieldRequirementsTests {
        @Test
        @DisplayName("Checking Field Required - First Name")
        public void enteringOnlyLastName_Test() {
            Assertions.assertTrue(CustomerInformationField_Requirements.enteringOnlyLastName(driver), "Field is required, check application");
        }

        @Test
        @DisplayName("Checking Field Required - Last Name")
        public void enteringOnlyFirstName_Test() {
            Assertions.assertTrue(CustomerInformationField_Requirements.enteringOnlyFirstName(driver), "Field is required, check application");
        }

        @Test
        @DisplayName("Checking Field Required - First and Last Name")
        public void leavingFirstAndLastNameFieldsBlank_Test() {
            Assertions.assertTrue(CustomerInformationField_Requirements.leavingFirstAndLastNameFieldsBlank(driver), "Field is required, check application");
        }

        @Test
        @DisplayName("Checking Field Required - Primary Phone Number")
        public void leavingPrimaryPhoneNumberFieldBlank_Test() {
            Assertions.assertTrue(CustomerInformationField_Requirements.leavingPrimaryPhoneNumberFieldBlank(driver), "Field is required, check application");
        }

        @Test
        @DisplayName("Checking Field Required - Email Address")
        public void leavingEmailAddressFieldBlank_Test() {
            Assertions.assertTrue(CustomerInformationField_Requirements.leavingEmailAddressFieldBlank(driver), "Was able to continue without entering an email address");
        }

        @Test
        @DisplayName("Checking Field Required - Primary and Email Fields")
        public void leavingPrimaryAndEmailAddressFieldBlank_Test() {
            Assertions.assertTrue(CustomerInformationField_Requirements.leavingPrimaryAndEmailAddressFieldBlank(driver), "Was able to continue without entering an email address");
        }
    }

    @Nested
    @DisplayName("Customer Information Field Validation Checks")
    class CustomerInformationFieldValidationsTest {
        @Nested
        @DisplayName("Field Validation Checks - Primary Phone Number")
        class PrimaryPhoneValidationTest {
            @Test
            @DisplayName("Checking Field Validation - Primary Phone Number - Alpha Characters")
            public void phoneNumberFieldAlphaCharacter_Test() {
                Assertions.assertTrue(CustomerInformationField_Validations.primaryPhoneNumberFieldValidation_AlphaCharacters(driver), "Validation check failed, please check application");
            }

            @Test
            @DisplayName("Checking Field Validation - Primary Phone Number - Special Characters")
            public void phoneNumberFieldSpecialCharacterTest() {
                Assertions.assertTrue(CustomerInformationField_Validations.primaryPhoneNumberFieldValidation_SpecialCharacters(driver), "Validation check failed, please check application");
            }

            @Test
            @DisplayName("Not enough numbers entered")
            public void notEnoughNumbersEnteredTest() {
            }

            @Test
            @DisplayName("To many numbers entered")
            public void toManyNumbersEnteredTest() {
            }
        }
        @Nested
        @DisplayName("Field Validation Checks - Email Address")
        class EmailAddressValidationTest {
            @Test
            @DisplayName("Checking Field Validation - Primary Phone Number - Invalided")
            public void enteringInvalidEmailAddressInformationTest() {
            }

            @Test
            @DisplayName("Checking Field Validation - Primary Phone Number - Fake")
            public void enteringFakeEmailAddressInformationCheck() {
            }
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
//
//        @Test
//        @DisplayName("Not enough numbers entered")
//        public void toFewNumbersTest(){}
//
//        @Test
//        @DisplayName("To many numbers entered")
//        public void toManyNumbersTest(){}
//    }

//    @Nested
//    @DisplayName("Email Address Field")
//    class emailAddressTests {
//    }

    @Nested
    @DisplayName("Zip Code Field")
    class zipCodeFieldTests {
        @Test
        @DisplayName("Trying an unapproved zipcode")
        public void enteringOutOfAreaZipCodeTest() throws InterruptedException {
            Assertions.assertTrue(approvedZipCodes.enteringOutOfAreaZipCodeCheck(driver), "Was able to enter an unapproved zipcode");
        }

        @Test
        @DisplayName("Entering a zipcode - Alabama")
        public void enteringRandomizedBirminghamMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedBirminghamMarketZipCode(driver), "Alabama", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Alabama")
        public void enteringRandomizedMobileMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedMobileMarketZipCode(driver), "Alabama", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Alabama")
        public void enterRandomizedMontgomeryMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedMontgomeryMarketZipCode(driver), "Alabama", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Arizona")
        public void enterRandomizedTucsonMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedTucsonMarketZipCode(driver), "Arizona", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Georgia")
        public void enterRandomizedAtlantaEastMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedAtlantaEastMarketZipCode(driver), "Georgia", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Georgia")
        public void enterRandomizedAtlantaNorthMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedAtlantaNorthMarketZipCode(driver), "Georgia", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Georgia")
        public void enterRandomizedAtlantaSouthMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedAtlantaSouthMarketZipCode(driver), "Georgia", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Georgia")
        public void enterRandomizedAugustaMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedAugustaMarketZipCode(driver), "Georgia", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Indiana")
        public void enterRandomizedIndianapolisMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedIndianapolisMarketZipCode(driver), "Indiana", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Kentucky")
        public void enterRandomizedLouisvilleMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedLouisvilleMarketZipCode(driver), "Kentucky", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Louisiana")
        public void enterRandomizedBatonRougeMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedBatonRougeMarketZipCode(driver), "Louisiana", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Louisiana")
        public void enterRandomizedLafayetteMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedLafayetteMarketZipCode(driver), "Louisiana", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Louisiana")
        public void enterRandomizedNewOrleansWestMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedNewOrleansWestMarketZipCode(driver), "Louisiana", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Mississippi")
        public void enterRandomizedJacksonMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedJacksonMarketZipCode(driver), "Mississippi", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - South Carolina")
        public void enterRandomizedCharlotteMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedCharlotteMarketZipCode(driver), "South Carolina", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - North Carolina")
        public void enterRandomizedWinstonSalemMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedWinstonSalemMarketZipCode(driver), "North Carolina", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Ohio")
        public void enterRandomizedAkronMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedAkronMarketZipCode(driver), "Ohio", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Ohio")
        public void enterRandomizedCantonMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedCantonMarketZipCode(driver), "Ohio", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Ohio")
        public void enterRandomizedClevelandKirbyAvenueMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedClevelandKirbyAvenueMarketZipCode(driver), "Ohio", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Ohio")
        public void enterRandomizedClevelandWestMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedClevelandWestMarketZipCode(driver), "Ohio", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - South Carolina")
        public void enterRandomizedColumbiaMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedColumbiaMarketZipCode(driver), "South Carolina", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Tennessee")
        public void enterRandomizedKnoxvilleMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedKnoxvilleMarketZipCode(driver), "Tennessee", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Tennessee")
        public void enterRandomizedMemphisMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedMemphisMarketZipCode(driver), "Tennessee", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Tennessee")
        public void enterRandomizedNashvilleMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedNashvilleMarketZipCode(driver), "Tennessee", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Texas")
        public void enterRandomizedCorpusChristiMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedCorpusChristiMarketZipCode(driver), "Texas", "Zipcode did not match state");
        }

        @Test
        @DisplayName("Entering a zipcode - Texas")
        public void enterRandomizedElPasoMarketZipCodeTest() throws InterruptedException {
            Assertions.assertEquals(approvedZipCodes.enterApprovedElPasoMarketZipCode(driver), "Texas", "Zipcode did not match state");
        }
    }

    @Nested
    @DisplayName("Year Make Model Fields")
    class makeModelYearDropdownsTests {
        @Test
        @DisplayName("Checking Year of car is required")
        public void yearIsRequiredTest() throws InterruptedException {
            Assertions.assertTrue(yearMakeModelDropdowns.yearIsRequiredCheck(driver), "Required on screen text was not displayed");
        }

        @Test
        @DisplayName("Checking Make of car is required")
        public void makeIsRequiredTest() throws InterruptedException {
            Assertions.assertTrue(yearMakeModelDropdowns.makeIsRequiredCheck(driver), "Required on screen text was not displayed");
        }

        @Test
        @DisplayName("Checking Model of car is required")
        public void modelIsRequiredTest() throws InterruptedException {
            Assertions.assertTrue(yearMakeModelDropdowns.modelIsRequiredCheck(driver), "Required on screen text was not displayed");
        }

        @Test
        @DisplayName("Checking Year, Make, Model of car are all required")
        public void allYearMakeModelDropdownsAreRequiredTest() throws InterruptedException {
            Assertions.assertTrue(yearMakeModelDropdowns.allYearMakeModelDropdownsAreRequired(driver), "Required on screen text was not displayed");
        }
    }

    @Nested
    @DisplayName("Damage Radio Buttons")
    class carDamageRadioButtonsTests {
        @Test
        @DisplayName("Radio button picking damage - Neither")
        public void notPickingEitherOptionForDamageTest() throws InterruptedException {
            Assertions.assertFalse(DamageOnCarRadioButtons.pickingNeitherRadioButtonIfThereIsDamage(driver), "Was able to continue without answering damage check");
        }

        @Test
        @DisplayName("Radio button picking damage - Yes")
        public void pickingYesToTheIsThereDamageQuestionTest() throws InterruptedException {
            Assertions.assertTrue(DamageOnCarRadioButtons.RadioButtonYesThereIsDamageOnCarCheck(driver), "The type of damage options did not show on screen");
        }

        @Test
        @DisplayName("Radio button picking damage - No")
        public void pickingNoToTheIsThereDamageQuestionTest() throws InterruptedException {
            Assertions.assertFalse(DamageOnCarRadioButtons.radioButtonNoThereIsNotDamageOnCarCheck(driver), "The type of damage options show on screen");
        }
    }

    @Nested
    @DisplayName("Fire Rollover Flood Damage Buttons")
    class fillingOutTypeOfDamageSectionTests {
        @Test //Will need to redo if depending on DEV response
        @DisplayName("Not picking Yes or No to type of damage option and clicking next button")
        public void pickingNeitherTypeOfDamageOptionTest() throws InterruptedException {
            Assertions.assertEquals(DamageOnCarRadioButtons.pickingNeitherTypeOfDamageOptionCheck(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=3");
        }

        @Test
        @DisplayName("Picking Yes there is Fire, Flood, Rollover damage")
        public void radioButtonYesToFireRolloverDamageOnCarWithNotesTest() throws InterruptedException {
            Assertions.assertTrue(DamageOnCarRadioButtons.radioButtonYesToFireRolloverDamageOnCarCheck(driver), "The peddle response script was not displayed on screen");
        }

        @Test
        @DisplayName("Checking for detail damage notes contain shows")
        public void radioButtonYesToTypeOfDamageOptionWithNoNotesTest() throws InterruptedException {
            Assertions.assertTrue(DamageOnCarRadioButtons.thereIsNoFireFloodRolloverDamageRadioButtonCheck(driver), "Detail Damage Notes container did not show on screen");
        }

        @Test
        @DisplayName("Picking No to type of damage without entering notes and clicking next button")
        public void detailDamageNotesIsRequiredTest() throws InterruptedException {
            Assertions.assertTrue(DamageOnCarRadioButtons.detailDamageNotesIsRequiredCheck(driver), "Was able to continue without entering detail damage notes");
        }

        @Test
        @DisplayName("Checking Detail Damage container notes")
        public void checkingDetailDamageNotesContainerIsEditableTest() throws InterruptedException {
            Assertions.assertFalse(DamageOnCarRadioButtons.checkingDetailDamageNotesContainerIsEditableCheck(driver), "Detail Damage Notes container may not have been editable");
        }
    }

    @Nested
    @DisplayName("Car Part Buttons")
    class carPartListTests {
        @Test
        @DisplayName("Clicking just the battery part button")
        public void pickingCarPartBatteryTest() throws InterruptedException {
            Assertions.assertTrue(CarPartButtons.pickingCarPartBatteryCheck(driver), "Battery button was not clicked");
        }

        @Test
        @DisplayName("Clicking just the catalytic converter part button")
        public void pickingCarPartCatalyticConverterTest() throws InterruptedException {
            Assertions.assertTrue(CarPartButtons.pickingCarPartCatalyticConverterCheck(driver), "Catalytic Converter button was not clicked");
        }

        @Test
        @DisplayName("Clicking just the Engine part button")
        public void pickingCarPartEngineTest() throws InterruptedException {
            Assertions.assertTrue(CarPartButtons.pickingCarPartEngineCheck(driver), "Engine button was not clicked");
        }

        @Test
        @DisplayName("Clicking just the radiator part button")
        public void pickingCarPartRadiatorTest() throws InterruptedException {
            Assertions.assertTrue(CarPartButtons.pickingCarPartRadiatorCheck(driver), "Radiator button was not clicked");
        }

        @Test
        @DisplayName("Clicking just the tires part button")
        public void pickingCarPartTiresTest() throws InterruptedException {
            Assertions.assertTrue(CarPartButtons.pickingCarPartTiresCheck(driver), "Tire button was not clicked");
        }

        @Test
        @DisplayName("Clicking just the transmission part button")
        public void pickingCarPartTransmissionTest() throws InterruptedException {
            Assertions.assertTrue(CarPartButtons.pickingCarPartTransmissionCheck(driver), "Transmission button was not clicked");
        }

        @Test
        @DisplayName("Not picking any car parts")
        public void pickingNoCarPartsTest() throws InterruptedException {
            Assertions.assertFalse(CarPartButtons.pickingNoCarPartsCheck(driver));
        }

        @Test
        @DisplayName("Clicking all car parts")
        public void pickingAllCarPartsTest() throws InterruptedException {
            Assertions.assertTrue(CarPartButtons.pickingAllCarPartsCheck(driver), "Required text was displayed on screen");
        }
    }

    @Nested
    @DisplayName("Quote Amount Screen")
    class quoteAmountScreen {
        @Test
        @DisplayName("Getting a quote amount")
        public void pickingOnlyEngineTransmissionPartTest() throws InterruptedException {
            Assertions.assertTrue(CarPartButtons.pickingOnlyEngineTransmissionPartCheck(driver));
        }
    }

    @Nested
    @DisplayName("Vehicle Run Buttons")
    class passQuoteScreen {
        @Test
        @DisplayName("Clicking yes the vehicle runs")
        public void vehicleRunYesTest() throws InterruptedException {
            quoteWorkFlow.gettingToDoesTheVehicleRunQuestion(driver);
        }
    }
}
