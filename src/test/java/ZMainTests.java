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
        @DisplayName("Attempting to login - Empty")
        public void empty_InformationOnTheMainLoginScreen_Test() {
            Assertions.assertEquals(MainLoginScreen.empty_InformationOnTheMainLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/login", "Was able to login");
        }

        @Test
        @DisplayName("Attempting to login - Bad")
        public void bad_InformationOnTheMainLoginScreen_Test() {
            Assertions.assertEquals(MainLoginScreen.bad_InformationOnTheMainLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/login", "Was able to login");
        }

        @Test
        @DisplayName("Attempting to login - Fake")
        public void fake_InformationOnTheMainLoginScreen_Test() {
            Assertions.assertEquals(MainLoginScreen.fake_InformationOnTheMainLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/login", "Was able to login");
        }

        @Test
        @DisplayName("Attempting to login - Good")
        public void good_InformationOnTheMainLoginScreen_Test() {
            Assertions.assertEquals(MainLoginScreen.good_InformationOnTheMainLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/mitellogin", "Was not able to login");
        }
    }

    @Nested
    @DisplayName("Mitel Login Screen")
    class MitelLoginScreenTest {
        @Test
        @DisplayName("Empty - Try entering nothing and login")
        public void empty_InformationOnTheMitelLoginScreen_Test() {
            Assertions.assertEquals(MitelLoginScreen.empty_InformationOnTheMitelLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/mitellogin", "Not on Mitel Login screen");
        }

        @Test
        @DisplayName("Bad - Try entering bad user information and login")
        public void bad_InformationOnTheMitelLoginScreen_Test() {
            Assertions.assertEquals(MitelLoginScreen.bad_InformationOnTheMitelLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/mitellogin", "Not on the Mitel Login screen");
        }

        @Test
        @DisplayName("Fake - Try entering bad user information and login")
        public void fake_InformationOnTheMitelLoginScreen_Test() {
            Assertions.assertEquals(MitelLoginScreen.fake_InformationOnTheMitelLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/mitellogin", "Not on the Mitel Login screen");
        }

        @Test
        @DisplayName("Good - Try entering good user information and login")
// might be better to check the mitel status on the dashboard
        public void good_InformationOnTheMitelLoginScreen_Test() {
            Assertions.assertEquals(MitelLoginScreen.good_InformationOnTheMitelLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/dashboard", "Not on the Mitel Login screen");
        }
    }

    @Nested
    @DisplayName("Checking top navigation links")
    class TopNavLinksTests {
        @Test
        @DisplayName("Clicking on link in top nav - Dashboard")
        public void clicking_TopNavLink_Dashboard_Test() {
            Assertions.assertEquals(TopNavLinks_Verification.clicking_TopNavLink_Dashboard(driver), "https://qa-carbuy.pullapart.com/#/dashboard", "URL did not match expected");
        }

        @Test
        @DisplayName("Clicking on link in top nav - Notification")
        public void clicking_TopNavLink_Notifications_Test() {
            Assertions.assertEquals(TopNavLinks_Verification.clicking_TopNavLink_Notifications(driver), "https://qa-carbuy.pullapart.com/#/notifications", "URL did not match expected");
        }

        @Test
        @DisplayName("Clicking on link in top nav - Admin Advance Features Quote")
        public void clicking_TopNavLink_Admin_Quote_Test() {
            Assertions.assertEquals(TopNavLinks_Verification.clicking_TopNavLink_Admin_Quote(driver), "https://qa-carbuy.pullapart.com/#/admin/quotes", "URL did not match expected");
        }

        @Test
        @DisplayName("Clicking on link in top nav - Admin General Settings Dispositions")
        public void clicking_TopNavLink_Admin_Dispositions_Test() {
            Assertions.assertEquals(TopNavLinks_Verification.clicking_TopNavLink_Admin_Dispositions(driver), "https://qa-carbuy.pullapart.com/#/admin/dispositions", "URL did not match expected");
        }

        @Test
        @DisplayName("Clicking on link in top nav - Admin General Settings Call Codes")
        public void clicking_TopNavLink_Admin_CallCodes_Test() {
            Assertions.assertEquals(TopNavLinks_Verification.clicking_TopNavLink_Admin_CallCodes(driver), "https://qa-carbuy.pullapart.com/#/admin/callcodes", "URL did not match expected");
        }

        @Test
        @DisplayName("Clicking on link in top nav - Admin General Settings Users")
        public void clicking_TopNavLink_Admin_Users_Test() {
            Assertions.assertEquals(TopNavLinks_Verification.clicking_TopNavLink_Admin_Users(driver), "https://qa-carbuy.pullapart.com/#/admin/users", "URL did not match expected");
        }
    }

    @Nested
    @DisplayName("Clicking on call code links")
    class CallCodeButtonsTests {
        @Test
        @DisplayName("Clicking Call Code Link - Callback Number (OLD) button ID")
        public void clickCallCode_OnlineQuoteCallbackNumberOLD_Button_Test() {
            Assertions.assertEquals(SpeedDailLinks_Verification.clickCallCode_OnlineQuoteCallbackNumberOLD_Button(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=3&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=Online%20Quote%20Callback%20Number%20%28OLD%29", "Call code ID did not match expected");
        }

        @Test
        @DisplayName("Clicking Call Code Link - 500-Partner-Peddle-All")
        public void ClickingCallCode_500PartnerPeddleAll_Test() {
            Assertions.assertEquals(SpeedDailLinks_Verification.ClickingCallCode_500PartnerPeddleAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=162&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=500-Partner-Peddle-All", "Call code ID did not match expected");
        }

        @Test
        @DisplayName("Clicking Call Code Link - 501-Partner-Carbrain-All")
        public void ClickingCallCode_501PartnerCarbrainAll_Test() {
            Assertions.assertEquals(SpeedDailLinks_Verification.ClickingCallCode_501PartnerCarbrainAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=163&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=501-Partner-Carbrain-All", "Call code ID did not match expected");
        }

        @Test
        @DisplayName("Clicking Call Code Link - 502-Partner-Junk Car Boys-All")
        public void ClickingCallCode_502PartnerJunkCarBoysAll_Test() {
            Assertions.assertEquals(SpeedDailLinks_Verification.ClickingCallCode_502PartnerJunkCarBoysAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=164&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=502-Partner-Junk%20Car%20Boys-All", "Call code ID did not match expected");
        }

        @Test
        @DisplayName("Clicking Call Code Link - 503-Partner-Ars-All")
        public void ClickingCallCode_503PartnerArsAll_Test() {
            Assertions.assertEquals(SpeedDailLinks_Verification.ClickingCallCode_503PartnerArsAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=165&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=503-Partner-Ars-All", "Call code ID did not match expected");
        }

        @Test
        @DisplayName("Clicking Call Code Link - 504-Partner-Cars-All")
        public void ClickingCallCode_504PartnerCarsAll_Test() {
            Assertions.assertEquals(SpeedDailLinks_Verification.ClickingCallCode_504PartnerCarsAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=166&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=504-Partner-Cars-All", "Call code ID did not match expected");
        }

        @Test
        @DisplayName("Clicking Call Code Link - 510-Partner-Junk Car Solutions-All")
        public void ClickingCallCode_510PartnerJunkCarSolutionsAll_Test() {
            Assertions.assertEquals(SpeedDailLinks_Verification.ClickingCallCode_510PartnerJunkCarSolutionsAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=193&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=510-Partner-Junk%20Car%20Solutions-All", "Call code ID did not match expected");
        }

        @Test
        @DisplayName("Filtering call codes by entering numbers")
        public void filteringCallCodes_NumericCharacters_Test() {
            Assertions.assertEquals(SpeedDailLinks_Verification.filteringCallCodes_NumericCharacters(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=163&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=501-Partner-Carbrain-All", "Filtering function is not working as expected");
        }

        @Test
        @DisplayName("Filtering call codes by entering letters")
        public void filteringCallCodes_AlphaCharacters_Test() {
            Assertions.assertEquals(SpeedDailLinks_Verification.filteringCallCodes_AlphaCharacters(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=163&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=501-Partner-Carbrain-All", "Filtering function is not working as expected");
        }
    }

    @Nested
    @DisplayName("Sidebar Tests")
    class SideBarTests {
        @Test
        @DisplayName("Sidebar matches information entered - Firstname and Lastname")
        public void checkingSidebarInformation_FirstAndLastName_Test() {
            Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_FirstAndLastName(driver), "Name: John Doe", "Sidebar information does not match");
        }

        @Test
        @DisplayName("Sidebar matches information entered - Primary Phone number")
        public void checkingSidebarInformation_PrimaryPhoneNumber_Test() {
            Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_PrimaryPhoneNumber(driver), "Phone: 5555555", "Sidebar information does not match");
        }

        @Test
        @DisplayName("Sidebar matches information entered - Alternate number")
        public void checkingSidebarInformation_AlternatePhoneNumber_Test() {
            Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_AlternatePhoneNumber(driver), "Alt. Phone: 4444444", "Sidebar information does not match");
        }

        @Test
        @DisplayName("Sidebar matches information entered - Email address")
        public void customerSideBarInfoMatchesEmailEnteredTest() {
            Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_EmailAddress(driver), "Email: vip1000682431@gmail.com", "Sidebar information does not match");
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
                Assertions.assertEquals(CustomerInformationField_Validations.primaryPhoneNumberFieldValidation_AlphaCharacters(driver), "The phone field may only contain numeric characters.", "Validation check failed, please check application");
            }

            @Test
            @DisplayName("Checking Field Validation - Primary Phone Number - Special Characters")
            public void primaryPhoneNumberFieldValidation_SpecialCharacters_Test() {
                Assertions.assertEquals(CustomerInformationField_Validations.primaryPhoneNumberFieldValidation_SpecialCharacters(driver), "The phone field may only contain numeric characters.", "Validation check failed, please check application");
            }

            //Will need to redo after new validation is added to application
            @Test
            @DisplayName("Checking Field Validation - Primary Phone Number - Not enough numbers entered")
            public void primaryPhoneNumberFieldValidation_InCompletePhoneNumber_Test() {
                Assertions.assertTrue(CustomerInformationField_Validations.primaryPhoneNumberFieldValidation_InComplete(driver), "Validation check failed, please check application");
            }

            @Test
            @DisplayName("Checking Field Validation - Primary Phone Number - To many numbers entered")
            public void primaryPhoneNumberFieldValidation_TooManyNumericCharacters_Test() {
                Assertions.assertEquals(CustomerInformationField_Validations.primaryPhoneNumberFieldValidation_TooMany(driver), "The phone field may not be greater than 10 characters.", "Validation check failed, please check application");
            }
        }

        @Nested
        @DisplayName("Field Validation Checks - Email Address")
        class EmailAddressValidationTest {
            @Test
            @DisplayName("Checking Field Validation - Primary Phone Number - Invalided")
            public void emailAddressFieldValidation_Invalided_Test() {
                Assertions.assertEquals(CustomerInformationField_Validations.emailAddressFieldValidation_Invalided(driver), "ZeroBounce status not valid, status:invalid", "Validation check failed, please check application");
            }

            @Test
            @DisplayName("Checking Field Validation - Primary Phone Number - Fake")
            public void emailAddressFieldValidation_Fake_Test() {
                Assertions.assertEquals(CustomerInformationField_Validations.emailAddressFieldValidation_Fake(driver), "The email field must be a valid email.", "Validation check failed, please check application");
            }
        }
    }

    @Nested
    @DisplayName("Zipcode validation")
    class ZipCodeFieldTests {
        @Nested
        @DisplayName("Not Valid Tests")
        class NotValidTest {
            @Test
            @DisplayName("Zipcode validation - Out of area")
            public void typingInZipcode_OutOfArea_Test() {
                Assertions.assertTrue(Zipcode_Verification.typingInZipcode_OutOfArea(driver), "Unapproved zipcode accepted");
            }

            @Test
            @DisplayName("Zipcode validation - Invalid")
            public void typingInZipcode_Invalid_Test() {
                Assertions.assertTrue(Zipcode_Verification.typingInZipcode_Invalid(driver), "Unapproved zipcode accepted");
            }
        }

        @Nested
        @DisplayName("Alabama Zipcodes")
        class AlabamaZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Birmingham, Alabama")
            public void typingInZipcode_Birmingham_Alabama_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_Birmingham_Alabama(driver), "Select State\n" + "  Alabama", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Mobile, Alabama")
            public void typingInZipcode_Mobile_Alabama_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_Mobile_Alabama(driver), "Select State\n" + "  Alabama", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Montgomery, Alabama")
            public void typingInZipcode_Montgomery_Alabama_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_Montgomery_Alabama(driver), "Select State\n" + "  Alabama", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Arizona Zipcodes")
        class ArizonaZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Tucson, Arizona")
            public void typingInZipcode_Tucson_Arizona_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_Tucson_Arizona(driver), "Select State\n" + "  Arizona", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Carolina Zipcodes")
        class CarolinaZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Charlotte, North Carolina")
            public void typingInZipcode_Charlotte_NorthCarolina_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_Charlotte_NorthCarolina(driver), "Select State\n" + "  North Carolina", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Winston Salem, North Carolina")
            public void typingInZipcode_WinstonSalem_NorthCarolina_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_WinstonSalem_NorthCarolina(driver), "Select State\n" + "  North Carolina", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Columbia, South Carolina")
            public void typingInZipcode_Columbia_SouthCarolina_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_Columbia_SouthCarolina(driver), "Select State\n" + "  South Carolina", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - South Carolina")
            public void typingInZipcode_Augusta_SouthCarolina_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_Augusta_SouthCarolina(driver), "Select State\n" + "  South Carolina", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Georgia Zipcodes")
        class GeorgiaZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Georgia")
            public void typingInZipcode_AtlantaEast_Georgia_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_AtlantaEast_Georgia(driver), "Select State\n" + "  Georgia", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Georgia")
            public void typingInZipcode_AtlantaNorth_Georgia_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_AtlantaNorth_Georgia(driver), "Select State\n" + "  Georgia", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Georgia")
            public void typingInZipcode_AtlantaSouth_Georgia_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_AtlantaSouth_Georgia(driver), "Select State\n" + "  Georgia", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Indiana Zipcodes")
        class IndianaZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Indianapolis, Indiana")
            public void typingInZipcode_Indianapolis_Indiana_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_Indianapolis_Indiana(driver), "Select State\n" + "  Indiana", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Kentucky Zipcodes")
        class KentuckyZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Louisville, Kentucky")
            public void typingInZipcode_Louisville_Kentucky_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_Louisville_Kentucky(driver), "Select State\n" + "  Kentucky", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Louisiana Zipcodes")
        class LouisianaZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Baton Rouge, Louisiana")
            public void typingInZipcode_BatonRouge_Louisiana_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_BatonRouge_Louisiana(driver), "Select State\n" + "  Louisiana", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Lafayette, Louisiana")
            public void typingInZipcode_Lafayette_Louisiana_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_Lafayette_Louisiana(driver), "Select State\n" + "  Louisiana", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Louisiana")
            public void typingInZipcode_NewOrleansWest_Louisiana_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_NewOrleansWest_Louisiana(driver), "Select State\n" + "  Louisiana", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Mississippi Zipcodes")
        class MississippiZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Jackson, Mississippi")
            public void typingInZipcode_Jackson_Mississippi_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_Jackson_Mississippi(driver), "Select State\n" + "  Mississippi", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Ohio Zipcodes")
        class OhioZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Akron, Ohio")
            public void typingInZipcode_Akron_Ohio_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_Akron_Ohio(driver), "Select State\n" + "  Ohio", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Canton, Ohio")
            public void typingInZipcode_Canton_Ohio_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_Canton_Ohio(driver), "Select State\n" + "  Ohio", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Cleveland Kirby Avenue, Ohio")
            public void typingInZipcode_ClevelandKirbyAvenue_Ohio_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_ClevelandKirbyAvenue_Ohio(driver), "Select State\n" + "  Ohio", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Cleveland West, Ohio")
            public void typingInZipcode_ClevelandWest_Ohio_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_ClevelandWest_Ohio(driver), "Select State\n" + "  Ohio", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Tennessee Zipcodes")
        class TennesseeZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Knoxville, Tennessee")
            public void typingInZipcode_Knoxville_Tennessee_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_Knoxville_Tennessee(driver), "Select State\n" + "  Tennessee", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Memphis, Tennessee")
            public void typingInZipcode_Memphis_Tennessee_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_Memphis_Tennessee(driver), "Select State\n" + "  Tennessee", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Nashville, Tennessee")
            public void typingInZipcode_Nashville_Tennessee_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_Nashville_Tennessee(driver), "Select State\n" + "  Tennessee", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Texas Zipcodes")
        class TexasZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Corpus Christi, Texas")
            public void typingInZipcode_CorpusChristi_Texas_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_CorpusChristi_Texas(driver), "Select State\n" + "  Texas", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - El Paso, Texas")
            public void typingInZipcode_ElPaso_Texas_Test() {
                Assertions.assertEquals(Zipcode_Verification.typingInZipcode_ElPaso_Texas(driver), "Select State\n" + "  Texas", "Zipcode did not match state");
            }
        }
    }
//
//    @Nested
//    @DisplayName("Year Make Model Fields")
//    class makeModelYearDropdownsTests {
//        @Test
//        @DisplayName("Checking Year of car is required")
//        public void yearIsRequiredTest() throws InterruptedException {
//            Assertions.assertTrue(yearMakeModelDropdowns.yearIsRequiredCheck(driver), "Required on screen text was not displayed");
//        }
//
//        @Test
//        @DisplayName("Checking Make of car is required")
//        public void makeIsRequiredTest() throws InterruptedException {
//            Assertions.assertTrue(yearMakeModelDropdowns.makeIsRequiredCheck(driver), "Required on screen text was not displayed");
//        }
//
//        @Test
//        @DisplayName("Checking Model of car is required")
//        public void modelIsRequiredTest() throws InterruptedException {
//            Assertions.assertTrue(yearMakeModelDropdowns.modelIsRequiredCheck(driver), "Required on screen text was not displayed");
//        }
//
//        @Test
//        @DisplayName("Checking Year, Make, Model of car are all required")
//        public void allYearMakeModelDropdownsAreRequiredTest() throws InterruptedException {
//            Assertions.assertTrue(yearMakeModelDropdowns.allYearMakeModelDropdownsAreRequired(driver), "Required on screen text was not displayed");
//        }
//    }
//
//    @Nested
//    @DisplayName("Damage Radio Buttons")
//    class carDamageRadioButtonsTests {
//        @Test
//        @DisplayName("Radio button picking damage - Neither")
//        public void notPickingEitherOptionForDamageTest() throws InterruptedException {
//            Assertions.assertFalse(DamageOnCarRadioButtons.pickingNeitherRadioButtonIfThereIsDamage(driver), "Was able to continue without answering damage check");
//        }
//
//        @Test
//        @DisplayName("Radio button picking damage - Yes")
//        public void pickingYesToTheIsThereDamageQuestionTest() throws InterruptedException {
//            Assertions.assertTrue(DamageOnCarRadioButtons.RadioButtonYesThereIsDamageOnCarCheck(driver), "The type of damage options did not show on screen");
//        }
//
//        @Test
//        @DisplayName("Radio button picking damage - No")
//        public void pickingNoToTheIsThereDamageQuestionTest() throws InterruptedException {
//            Assertions.assertFalse(DamageOnCarRadioButtons.radioButtonNoThereIsNotDamageOnCarCheck(driver), "The type of damage options show on screen");
//        }
//    }
//
//    @Nested
//    @DisplayName("Fire Rollover Flood Damage Buttons")
//    class fillingOutTypeOfDamageSectionTests {
//        @Test //Will need to redo if depending on DEV response
//        @DisplayName("Not picking Yes or No to type of damage option and clicking next button")
//        public void pickingNeitherTypeOfDamageOptionTest() throws InterruptedException {
//            Assertions.assertEquals(DamageOnCarRadioButtons.pickingNeitherTypeOfDamageOptionCheck(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=3");
//        }
//
//        @Test
//        @DisplayName("Picking Yes there is Fire, Flood, Rollover damage")
//        public void radioButtonYesToFireRolloverDamageOnCarWithNotesTest() throws InterruptedException {
//            Assertions.assertTrue(DamageOnCarRadioButtons.radioButtonYesToFireRolloverDamageOnCarCheck(driver), "The peddle response script was not displayed on screen");
//        }
//
//        @Test
//        @DisplayName("Checking for detail damage notes contain shows")
//        public void radioButtonYesToTypeOfDamageOptionWithNoNotesTest() throws InterruptedException {
//            Assertions.assertTrue(DamageOnCarRadioButtons.thereIsNoFireFloodRolloverDamageRadioButtonCheck(driver), "Detail Damage Notes container did not show on screen");
//        }
//
//        @Test
//        @DisplayName("Picking No to type of damage without entering notes and clicking next button")
//        public void detailDamageNotesIsRequiredTest() throws InterruptedException {
//            Assertions.assertTrue(DamageOnCarRadioButtons.detailDamageNotesIsRequiredCheck(driver), "Was able to continue without entering detail damage notes");
//        }
//
//        @Test
//        @DisplayName("Checking Detail Damage container notes")
//        public void checkingDetailDamageNotesContainerIsEditableTest() throws InterruptedException {
//            Assertions.assertFalse(DamageOnCarRadioButtons.checkingDetailDamageNotesContainerIsEditableCheck(driver), "Detail Damage Notes container may not have been editable");
//        }
//    }
//
//    @Nested
//    @DisplayName("Car Part Buttons")
//    class carPartListTests {
//        @Test
//        @DisplayName("Clicking just the battery part button")
//        public void pickingCarPartBatteryTest() throws InterruptedException {
//            Assertions.assertTrue(CarPartButtons.pickingCarPartBatteryCheck(driver), "Battery button was not clicked");
//        }
//
//        @Test
//        @DisplayName("Clicking just the catalytic converter part button")
//        public void pickingCarPartCatalyticConverterTest() throws InterruptedException {
//            Assertions.assertTrue(CarPartButtons.pickingCarPartCatalyticConverterCheck(driver), "Catalytic Converter button was not clicked");
//        }
//
//        @Test
//        @DisplayName("Clicking just the Engine part button")
//        public void pickingCarPartEngineTest() throws InterruptedException {
//            Assertions.assertTrue(CarPartButtons.pickingCarPartEngineCheck(driver), "Engine button was not clicked");
//        }
//
//        @Test
//        @DisplayName("Clicking just the radiator part button")
//        public void pickingCarPartRadiatorTest() throws InterruptedException {
//            Assertions.assertTrue(CarPartButtons.pickingCarPartRadiatorCheck(driver), "Radiator button was not clicked");
//        }
//
//        @Test
//        @DisplayName("Clicking just the tires part button")
//        public void pickingCarPartTiresTest() throws InterruptedException {
//            Assertions.assertTrue(CarPartButtons.pickingCarPartTiresCheck(driver), "Tire button was not clicked");
//        }
//
//        @Test
//        @DisplayName("Clicking just the transmission part button")
//        public void pickingCarPartTransmissionTest() throws InterruptedException {
//            Assertions.assertTrue(CarPartButtons.pickingCarPartTransmissionCheck(driver), "Transmission button was not clicked");
//        }
//
//        @Test
//        @DisplayName("Not picking any car parts")
//        public void pickingNoCarPartsTest() throws InterruptedException {
//            Assertions.assertFalse(CarPartButtons.pickingNoCarPartsCheck(driver));
//        }
//
//        @Test
//        @DisplayName("Clicking all car parts")
//        public void pickingAllCarPartsTest() throws InterruptedException {
//            Assertions.assertTrue(CarPartButtons.pickingAllCarPartsCheck(driver), "Required text was displayed on screen");
//        }
//    }
//
//    @Nested
//    @DisplayName("Quote Amount Screen")
//    class quoteAmountScreen {
//        @Test
//        @DisplayName("Getting a quote amount")
//        public void pickingOnlyEngineTransmissionPartTest() throws InterruptedException {
//            Assertions.assertTrue(CarPartButtons.pickingOnlyEngineTransmissionPartCheck(driver));
//        }
//    }
//
//    @Nested
//    @DisplayName("Vehicle Run Buttons")
//    class passQuoteScreen {
//        @Test
//        @DisplayName("Clicking yes the vehicle runs")
//        public void vehicleRunYesTest() throws InterruptedException {
//            quoteWorkFlow.gettingToDoesTheVehicleRunQuestion(driver);
//        }
//    }
}
