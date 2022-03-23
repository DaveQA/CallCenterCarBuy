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
            Assertions.assertEquals(MainLogin_Screen.empty_InformationOnTheMainLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/login", "Was able to login");
        }

        @Test
        @DisplayName("Attempting to login - Bad")
        public void bad_InformationOnTheMainLoginScreen_Test() {
            Assertions.assertEquals(MainLogin_Screen.bad_InformationOnTheMainLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/login", "Was able to login");
        }

        @Test
        @DisplayName("Attempting to login - Fake")
        public void fake_InformationOnTheMainLoginScreen_Test() {
            Assertions.assertEquals(MainLogin_Screen.fake_InformationOnTheMainLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/login", "Was able to login");
        }

        @Test
        @DisplayName("Attempting to login - Good")
        public void good_InformationOnTheMainLoginScreen_Test() {
            Assertions.assertEquals(MainLogin_Screen.good_InformationOnTheMainLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/mitellogin", "Was not able to login");
        }
    }

    @Nested
    @DisplayName("Mitel Login Screen")
    class MitelLoginScreenTest {
        @Test
        @DisplayName("Empty - Try entering nothing and login")
        public void empty_InformationOnTheMitelLoginScreen_Test() {
            Assertions.assertEquals(MitelLogin_Screen.empty_InformationOnTheMitelLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/mitellogin", "Not on Mitel Login screen");
        }

        @Test
        @DisplayName("Bad - Try entering bad user information and login")
        public void bad_InformationOnTheMitelLoginScreen_Test() {
            Assertions.assertEquals(MitelLogin_Screen.bad_InformationOnTheMitelLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/mitellogin", "Not on the Mitel Login screen");
        }

        @Test
        @DisplayName("Fake - Try entering bad user information and login")
        public void fake_InformationOnTheMitelLoginScreen_Test() {
            Assertions.assertEquals(MitelLogin_Screen.fake_InformationOnTheMitelLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/mitellogin", "Not on the Mitel Login screen");
        }

        @Test
        @DisplayName("Good - Try entering good user information and login")
// might be better to check the mitel status on the dashboard
        public void good_InformationOnTheMitelLoginScreen_Test() {
            Assertions.assertEquals(MitelLogin_Screen.good_InformationOnTheMitelLoginScreen(driver), "https://qa-carbuy.pullapart.com/#/dashboard", "Not on the Mitel Login screen");
        }
    }

    @Nested
    @DisplayName("Verifying top navigation links")
    class TopNavLinksTests {
        //Will need to re work this test
//        @Test
//        @DisplayName("Verifying Top Nav Link - Dashboard")
//        public void clicking_TopNavLink_Dashboard_Test() {
//            Assertions.assertEquals(TopNavLinks_Verification.clicking_TopNavLink_Dashboard(driver), "https://qa-carbuy.pullapart.com/#/dashboard", "URL did not match expected");
//        }

        @Test
        @DisplayName("Verifying Top Nav Link - Notification")
        public void clicking_TopNavLink_Notifications_Test() {
            Assertions.assertEquals(TopNavLinks_Verification.clicking_TopNavLink_Notifications(driver), "https://qa-carbuy.pullapart.com/#/notifications", "URL did not match expected");
        }

        @Nested
        @DisplayName("Verifying Top Nav Admin Links")
        class AdminLinksTest {
            @Test
            @DisplayName("Verifying Top Nav Admin Link - Quote")
            public void clicking_TopNavLink_Admin_Quote_Test() {
                Assertions.assertEquals(TopNavLinks_Verification.clicking_TopNavLink_Admin_Quote(driver), "https://qa-carbuy.pullapart.com/#/admin/quotes", "URL did not match expected");
            }

            @Test
            @DisplayName("Verifying Top Nav Admin Link - Dispositions")
            public void clicking_TopNavLink_Admin_Dispositions_Test() {
                Assertions.assertEquals(TopNavLinks_Verification.clicking_TopNavLink_Admin_Dispositions(driver), "https://qa-carbuy.pullapart.com/#/admin/dispositions", "URL did not match expected");
            }

            @Test
            @DisplayName("Verifying Top Nav Admin Link - Call Codes")
            public void clicking_TopNavLink_Admin_CallCodes_Test() {
                Assertions.assertEquals(TopNavLinks_Verification.clicking_TopNavLink_Admin_CallCodes(driver), "https://qa-carbuy.pullapart.com/#/admin/callcodes", "URL did not match expected");
            }

            @Test
            @DisplayName("Verifying Top Nav Admin Link - Users")
            public void clicking_TopNavLink_Admin_Users_Test() {
                Assertions.assertEquals(TopNavLinks_Verification.clicking_TopNavLink_Admin_Users(driver), "https://qa-carbuy.pullapart.com/#/admin/users", "URL did not match expected");
            }
        }
    }

    @Nested
    @DisplayName("Verifying Call Code Links")
    class CallCodeButtonsTests {
        @Nested
        @DisplayName("Speed Dial Links")
        class SpeedDialLinksTest {
            @Test
            @DisplayName("Verifying link - Callback Number (OLD) button ID")
            public void clickCallCode_OnlineQuoteCallbackNumberOLD_Button_Test() {
                Assertions.assertEquals(SpeedDailLinks_Verification.clickCallCode_OnlineQuoteCallbackNumberOLD_Button(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=3&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=Online%20Quote%20Callback%20Number%20%28OLD%29", "Call code ID did not match expected");
            }

            @Test
            @DisplayName("Verifying link - 500-Partner-Peddle-All")
            public void ClickingCallCode_500PartnerPeddleAll_Test() {
                Assertions.assertEquals(SpeedDailLinks_Verification.ClickingCallCode_500PartnerPeddleAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=162&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=500-Partner-Peddle-All", "Call code ID did not match expected");
            }

            @Test
            @DisplayName("Verifying link - 501-Partner-Carbrain-All")
            public void ClickingCallCode_501PartnerCarbrainAll_Test() {
                Assertions.assertEquals(SpeedDailLinks_Verification.ClickingCallCode_501PartnerCarbrainAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=163&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=501-Partner-Carbrain-All", "Call code ID did not match expected");
            }

            @Test
            @DisplayName("Verifying link - 502-Partner-Junk Car Boys-All")
            public void ClickingCallCode_502PartnerJunkCarBoysAll_Test() {
                Assertions.assertEquals(SpeedDailLinks_Verification.ClickingCallCode_502PartnerJunkCarBoysAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=164&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=502-Partner-Junk%20Car%20Boys-All", "Call code ID did not match expected");
            }

            @Test
            @DisplayName("Verifying link - 503-Partner-Ars-All")
            public void ClickingCallCode_503PartnerArsAll_Test() {
                Assertions.assertEquals(SpeedDailLinks_Verification.ClickingCallCode_503PartnerArsAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=165&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=503-Partner-Ars-All", "Call code ID did not match expected");
            }

            @Test
            @DisplayName("Verifying link - 504-Partner-Cars-All")
            public void ClickingCallCode_504PartnerCarsAll_Test() {
                Assertions.assertEquals(SpeedDailLinks_Verification.ClickingCallCode_504PartnerCarsAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=166&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=504-Partner-Cars-All", "Call code ID did not match expected");
            }

            @Test
            @DisplayName("Verifying link - 510-Partner-Junk Car Solutions-All")
            public void ClickingCallCode_510PartnerJunkCarSolutionsAll_Test() {
                Assertions.assertEquals(SpeedDailLinks_Verification.ClickingCallCode_510PartnerJunkCarSolutionsAll(driver), "https://qa-carbuy.pullapart.com/#/quotes/create?thirdparty=true&callCodeId=193&mitelCallerName=N%2FA&mitelCallerNumber=&callCodeName=510-Partner-Junk%20Car%20Solutions-All", "Call code ID did not match expected");
            }
        }

        @Nested
        @DisplayName("Call Code Filter")
        class CallCodeFilterTest {
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
    }

    @Nested
    @DisplayName("Sidebar Tests")
    class SideBarTests {
        @Nested
        @DisplayName("Sidebar Fields - Customer Information")
        class CustomerInformationTest {

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
        @DisplayName("Sidebar Fields - Market")
        class SidebarFieldsMarketTest {
            @Nested
            @DisplayName("Alabama Markets")
            class AlabamaMarketsTest {
                @Test
                @DisplayName("Sidebar matches Market - Birmingham")
                public void checkingSidebarInformation_Market_Birmingham_Alabama_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_Birmingham_Alabama(driver), "Market: Birmingham", "Sidebar information does not match");
                }

                @Test
                @DisplayName("Sidebar matches Market - Mobile")
                public void checkingSidebarInformation_Market_Mobile_Alabama_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_Mobile_Alabama(driver), "Market: Mobile", "Sidebar information does not match");
                }

                @Test
                @DisplayName("Sidebar matches Market - Montgomery")
                public void checkingSidebarInformation_Market_Montgomery_Alabama_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_Montgomery_Alabama(driver), "Market: Montgomery", "Sidebar information does not match");
                }
            }

            @Nested
            @DisplayName("Arizona Markets")
            class ArizonaMarketsTest {
                @Test
                @DisplayName("Sidebar matches Market - Tucson")
                public void checkingSidebarInformation_Market_Tucson_Arizona_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_Tucson_Arizona(driver), "Market: Tucson", "Sidebar information does not match");
                }
            }

            @Nested
            @DisplayName("Georgia Markets")
            class GeorgiaMarketsTest {
                @Test
                @DisplayName("Sidebar matches Market - Atlanta East")
                public void checkingSidebarInformation_Market_AtlantaEast_Georgia_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_AtlantaEast_Georgia(driver), "Market: Atlanta", "Sidebar information does not match");
                }

                @Test
                @DisplayName("Sidebar matches Market - Atlanta North")
                public void checkingSidebarInformation_Market_AtlantaNorth_Georgia_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_AtlantaNorth_Georgia(driver), "Market: Atlanta", "Sidebar information does not match");
                }

                @Test
                @DisplayName("Sidebar matches Market - Atlanta South")
                public void checkingSidebarInformation_Market_AtlantaSouth_Georgia_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_AtlantaSouth_Georgia(driver), "Market: Atlanta", "Sidebar information does not match");
                }
            }

            @Nested
            @DisplayName("Carolina Markets")
            class CarolinaMarketsTest {
                @Test
                @DisplayName("Sidebar matches Market - Charlotte")
                public void checkingSidebarInformation_Market_Charlotte_NorthCarolina_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_Charlotte_NorthCarolina(driver), "Market: Charlotte", "Sidebar information does not match");
                }

                @Test
                @DisplayName("Sidebar matches Market - Winston Salem")
                public void checkingSidebarInformation_Market_WinstonSalem_NorthCarolina_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_WinstonSalem_NorthCarolina(driver), "Market: Winston-Salem", "Sidebar information does not match");
                }

                @Test
                @DisplayName("Sidebar matches Market - Augusta")
                public void checkingSidebarInformation_Market_Augusta_SouthCarolina_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_Augusta_SouthCarolina(driver), "Market: Augusta", "Sidebar information does not match");
                }

                @Test
                @DisplayName("Sidebar matches Market - Columbia")
                public void checkingSidebarInformation_Market_Columbia_SouthCarolina_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_Columbia_SouthCarolina(driver), "Market: Columbia", "Sidebar information does not match");
                }
            }

            @Nested
            @DisplayName("Indiana Markets")
            class IndianaMarketsTest {
                @Test
                @DisplayName("Sidebar matches Market - Indianapolis")
                public void checkingSidebarInformation_Market_Indianapolis_Indiana_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_Indianapolis_Indiana(driver), "Market: Indianapolis", "Sidebar information does not match");
                }
            }

            @Nested
            @DisplayName("Kentucky Markets")
            class KentuckyMarketsTest {
                @Test
                @DisplayName("Sidebar matches Market - Louisville")
                public void checkingSidebarInformation_Market_Louisville_Kentucky_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_Louisville_Kentucky(driver), "Market: Louisville", "Sidebar information does not match");
                }
            }

            @Nested
            @DisplayName("Louisiana Markets")
            class LouisianaMarketsTest {
                @Test
                @DisplayName("Sidebar matches Market - Baton Rouge")
                public void checkingSidebarInformation_Market_BatonRouge_Louisiana_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_BatonRouge_Louisiana(driver), "Market: Baton Rouge", "Sidebar information does not match");
                }

                @Test
                @DisplayName("Sidebar matches Market - Lafayette")
                public void checkingSidebarInformation_Market_Lafayette_Louisiana_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_Lafayette_Louisiana(driver), "Market: Lafayette", "Sidebar information does not match");
                }

                @Test
                @DisplayName("Sidebar matches Market - New Orleans West")
                public void checkingSidebarInformation_Market_NewOrleansWest_Louisiana_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_NewOrleansWest_Louisiana(driver), "Market: New Orleans West", "Sidebar information does not match");
                }
            }

            @Nested
            @DisplayName("Mississippi Markets")
            class MississippiMarketsTest {
                @Test
                @DisplayName("Sidebar matches Market - Jackson")
                public void checkingSidebarInformation_Market_Jackson_Mississippi_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_Jackson_Mississippi(driver), "Market: Jackson", "Sidebar information does not match");
                }
            }

            @Nested
            @DisplayName("Ohio Markets")
            class OhioMarketsTest {
                @Test
                @DisplayName("Sidebar matches Market - Akron")
                public void checkingSidebarInformation_Market_Akron_Ohio_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_Akron_Ohio(driver), "Market: Akron", "Sidebar information does not match");
                }

                @Test
                @DisplayName("Sidebar matches Market - Canton")
                public void checkingSidebarInformation_Market_Canton_Ohio_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_Canton_Ohio(driver), "Market: Canton", "Sidebar information does not match");
                }

                @Test
                @DisplayName("Sidebar matches Market - Cleveland Kirby Avenue")
                public void checkingSidebarInformation_Market_ClevelandKirbyAvenue_Ohio_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_ClevelandKirbyAvenue_Ohio(driver), "Market: Cleveland", "Sidebar information does not match");
                }

                @Test
                @DisplayName("Sidebar matches Market - Cleveland West")
                public void checkingSidebarInformation_Market_ClevelandWest_Ohio_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_ClevelandWest_Ohio(driver), "Market: Cleveland", "Sidebar information does not match");
                }
            }

            @Nested
            @DisplayName("Tennessee Markets")
            class TennesseeMarketsTest {
                @Test
                @DisplayName("Sidebar matches Market - Knoxville")
                public void checkingSidebarInformation_Market_Knoxville_Tennessee_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_Knoxville_Tennessee(driver), "Market: Knoxville", "Sidebar information does not match");
                }

                @Test
                @DisplayName("Sidebar matches Market - Memphis")
                public void checkingSidebarInformation_Market_Memphis_Tennessee_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_Memphis_Tennessee(driver), "Market: Memphis", "Sidebar information does not match");
                }

                @Test
                @DisplayName("Sidebar matches Market - Nashville")
                public void checkingSidebarInformation_Market_Nashville_Tennessee_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_Nashville_Tennessee(driver), "Market: Nashville", "Sidebar information does not match");
                }
            }

            @Nested
            @DisplayName("Texas Markets")
            class TexasMarketsTest {
                @Test
                @DisplayName("Sidebar matches Market - Corpus Christi")
                public void checkingSidebarInformation_Market_CorpusChristi_Texas_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_CorpusChristi_Texas(driver), "Market: Corpus Christi", "Sidebar information does not match");
                }

                @Test
                @DisplayName("Sidebar matches Market - El Paso")
                public void checkingSidebarInformation_Market_ElPaso_Texas_Test() {
                    Assertions.assertEquals(SidebarInformation_Verification.checkingSidebarInformation_Market_ElPaso_Texas(driver), "Market: El Paso", "Sidebar information does not match");
                }
            }
        }
    }

    @Nested
    @DisplayName("Wizard - Screen - Customer Information")
    class CustomerInformationFieldRequirementsTests {
        @Nested
        @DisplayName("Customer Information Fields")
        class CustomerInformationFieldsTest {
            @Nested
            @DisplayName("Customer Name")
            class CustomerNameTest {
                @Test
                @DisplayName("Verifying Field Required - First Name")
                public void enteringOnlyLastName_Test() {
                    Assertions.assertTrue(Wizard_Screen_CustomerInformation_FieldRequirements.enteringOnlyLastName(driver), "Field is required, check application");
                }

                @Test
                @DisplayName("Verifying Field Required - Last Name")
                public void enteringOnlyFirstName_Test() {
                    Assertions.assertTrue(Wizard_Screen_CustomerInformation_FieldRequirements.enteringOnlyFirstName(driver), "Field is required, check application");
                }

                @Test
                @DisplayName("Verifying Field Required - First and Last Name")
                public void leavingFirstAndLastNameFieldsBlank_Test() {
                    Assertions.assertTrue(Wizard_Screen_CustomerInformation_FieldRequirements.leavingFirstAndLastNameFieldsBlank(driver), "Field is required, check application");
                }
            }

            @Nested
            @DisplayName("Customer Contact Information - Primary Phone Number and Email Address")
            class CustomerContactInformationTest {
                @Test
                @DisplayName("Verifying Field Required - Primary Phone Number")
                public void leavingPrimaryPhoneNumberFieldBlank_Test() {
                    Assertions.assertTrue(Wizard_Screen_CustomerInformation_FieldRequirements.leavingPrimaryPhoneNumberFieldBlank(driver), "Field is required, check application");
                }

                @Test
                @DisplayName("Verifying Field Required - Email Address")
                public void leavingEmailAddressFieldBlank_Test() {
                    Assertions.assertTrue(Wizard_Screen_CustomerInformation_FieldRequirements.leavingEmailAddressFieldBlank(driver), "Was able to continue without entering an email address");
                }

                @Test
                @DisplayName("Verifying Field Required - Primary and Email Fields")
                public void leavingPrimaryAndEmailAddressFieldBlank_Test() {
                    Assertions.assertTrue(Wizard_Screen_CustomerInformation_FieldRequirements.leavingPrimaryAndEmailAddressFieldBlank(driver), "Was able to continue without entering an email address");
                }
            }
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
                Assertions.assertEquals(Wizard_Screen_CustomerInformation_FieldValidations.primaryPhoneNumberFieldValidation_AlphaCharacters(driver), "The phone field may only contain numeric characters.", "Validation check failed, please check application");
            }

            @Test
            @DisplayName("Checking Field Validation - Primary Phone Number - Special Characters")
            public void primaryPhoneNumberFieldValidation_SpecialCharacters_Test() {
                Assertions.assertEquals(Wizard_Screen_CustomerInformation_FieldValidations.primaryPhoneNumberFieldValidation_SpecialCharacters(driver), "The phone field may only contain numeric characters.", "Validation check failed, please check application");
            }

            //Will need to redo after new validation is added to application
            @Test
            @DisplayName("Checking Field Validation - Primary Phone Number - Not enough numbers entered")
            public void primaryPhoneNumberFieldValidation_InCompletePhoneNumber_Test() {
                Assertions.assertTrue(Wizard_Screen_CustomerInformation_FieldValidations.primaryPhoneNumberFieldValidation_InComplete(driver), "Validation check failed, please check application");
            }

            @Test
            @DisplayName("Checking Field Validation - Primary Phone Number - To many numbers entered")
            public void primaryPhoneNumberFieldValidation_TooManyNumericCharacters_Test() {
                Assertions.assertEquals(Wizard_Screen_CustomerInformation_FieldValidations.primaryPhoneNumberFieldValidation_TooMany(driver), "The phone field may not be greater than 10 characters.", "Validation check failed, please check application");
            }
        }

        @Nested
        @DisplayName("Field Validation Checks - Email Address")
        class EmailAddressValidationTest {
            @Test
            @DisplayName("Checking Field Validation - Primary Phone Number - Invalided")
            public void emailAddressFieldValidation_Invalided_Test() {
                Assertions.assertEquals(Wizard_Screen_CustomerInformation_FieldValidations.emailAddressFieldValidation_Invalided(driver), "ZeroBounce status not valid, status:invalid", "Validation check failed, please check application");
            }

            @Test
            @DisplayName("Checking Field Validation - Primary Phone Number - Fake")
            public void emailAddressFieldValidation_Fake_Test() {
                Assertions.assertEquals(Wizard_Screen_CustomerInformation_FieldValidations.emailAddressFieldValidation_Fake(driver), "The email field must be a valid email.", "Validation check failed, please check application");
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
                Assertions.assertTrue(Wizard_Screen_Zipcode_Verification.typingInZipcode_OutOfArea(driver), "Unapproved zipcode accepted");
            }

            @Test
            @DisplayName("Zipcode validation - Invalid")
            public void typingInZipcode_Invalid_Test() {
                Assertions.assertTrue(Wizard_Screen_Zipcode_Verification.typingInZipcode_Invalid(driver), "Unapproved zipcode accepted");
            }
        }

        @Nested
        @DisplayName("Alabama Zipcodes")
        class AlabamaZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Birmingham, Alabama")
            public void typingInZipcode_Birmingham_Alabama_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_Birmingham_Alabama(driver), "Select State\n" + "  Alabama", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Mobile, Alabama")
            public void typingInZipcode_Mobile_Alabama_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_Mobile_Alabama(driver), "Select State\n" + "  Alabama", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Montgomery, Alabama")
            public void typingInZipcode_Montgomery_Alabama_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_Montgomery_Alabama(driver), "Select State\n" + "  Alabama", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Arizona Zipcodes")
        class ArizonaZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Tucson, Arizona")
            public void typingInZipcode_Tucson_Arizona_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_Tucson_Arizona(driver), "Select State\n" + "  Arizona", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Carolina Zipcodes")
        class CarolinaZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Charlotte, North Carolina")
            public void typingInZipcode_Charlotte_NorthCarolina_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_Charlotte_NorthCarolina(driver), "Select State\n" + "  North Carolina", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Winston Salem, North Carolina")
            public void typingInZipcode_WinstonSalem_NorthCarolina_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_WinstonSalem_NorthCarolina(driver), "Select State\n" + "  North Carolina", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Columbia, South Carolina")
            public void typingInZipcode_Columbia_SouthCarolina_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_Columbia_SouthCarolina(driver), "Select State\n" + "  South Carolina", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - South Carolina")
            public void typingInZipcode_Augusta_SouthCarolina_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_Augusta_SouthCarolina(driver), "Select State\n" + "  South Carolina", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Georgia Zipcodes")
        class GeorgiaZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Georgia")
            public void typingInZipcode_AtlantaEast_Georgia_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_AtlantaEast_Georgia(driver), "Select State\n" + "  Georgia", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Georgia")
            public void typingInZipcode_AtlantaNorth_Georgia_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_AtlantaNorth_Georgia(driver), "Select State\n" + "  Georgia", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Georgia")
            public void typingInZipcode_AtlantaSouth_Georgia_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_AtlantaSouth_Georgia(driver), "Select State\n" + "  Georgia", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Indiana Zipcodes")
        class IndianaZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Indianapolis, Indiana")
            public void typingInZipcode_Indianapolis_Indiana_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_Indianapolis_Indiana(driver), "Select State\n" + "  Indiana", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Kentucky Zipcodes")
        class KentuckyZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Louisville, Kentucky")
            public void typingInZipcode_Louisville_Kentucky_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_Louisville_Kentucky(driver), "Select State\n" + "  Kentucky", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Louisiana Zipcodes")
        class LouisianaZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Baton Rouge, Louisiana")
            public void typingInZipcode_BatonRouge_Louisiana_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_BatonRouge_Louisiana(driver), "Select State\n" + "  Louisiana", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Lafayette, Louisiana")
            public void typingInZipcode_Lafayette_Louisiana_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_Lafayette_Louisiana(driver), "Select State\n" + "  Louisiana", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Louisiana")
            public void typingInZipcode_NewOrleansWest_Louisiana_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_NewOrleansWest_Louisiana(driver), "Select State\n" + "  Louisiana", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Mississippi Zipcodes")
        class MississippiZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Jackson, Mississippi")
            public void typingInZipcode_Jackson_Mississippi_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_Jackson_Mississippi(driver), "Select State\n" + "  Mississippi", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Ohio Zipcodes")
        class OhioZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Akron, Ohio")
            public void typingInZipcode_Akron_Ohio_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_Akron_Ohio(driver), "Select State\n" + "  Ohio", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Canton, Ohio")
            public void typingInZipcode_Canton_Ohio_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_Canton_Ohio(driver), "Select State\n" + "  Ohio", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Cleveland Kirby Avenue, Ohio")
            public void typingInZipcode_ClevelandKirbyAvenue_Ohio_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_ClevelandKirbyAvenue_Ohio(driver), "Select State\n" + "  Ohio", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Cleveland West, Ohio")
            public void typingInZipcode_ClevelandWest_Ohio_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_ClevelandWest_Ohio(driver), "Select State\n" + "  Ohio", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Tennessee Zipcodes")
        class TennesseeZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Knoxville, Tennessee")
            public void typingInZipcode_Knoxville_Tennessee_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_Knoxville_Tennessee(driver), "Select State\n" + "  Tennessee", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Memphis, Tennessee")
            public void typingInZipcode_Memphis_Tennessee_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_Memphis_Tennessee(driver), "Select State\n" + "  Tennessee", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - Nashville, Tennessee")
            public void typingInZipcode_Nashville_Tennessee_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_Nashville_Tennessee(driver), "Select State\n" + "  Tennessee", "Zipcode did not match state");
            }
        }

        @Nested
        @DisplayName("Texas Zipcodes")
        class TexasZipcodesTest {
            @Test
            @DisplayName("Zipcode validation - Corpus Christi, Texas")
            public void typingInZipcode_CorpusChristi_Texas_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_CorpusChristi_Texas(driver), "Select State\n" + "  Texas", "Zipcode did not match state");
            }

            @Test
            @DisplayName("Zipcode validation - El Paso, Texas")
            public void typingInZipcode_ElPaso_Texas_Test() {
                Assertions.assertEquals(Wizard_Screen_Zipcode_Verification.typingInZipcode_ElPaso_Texas(driver), "Select State\n" + "  Texas", "Zipcode did not match state");
            }
        }
    }

    @Nested
    @DisplayName("Year / Make / Model Field Requirement Checks")
    class YearMakeModelFieldRequirementChecksTest {
        @Test
        @DisplayName("Verifying Field Required - Year")
        public void vehicleInformationOptionRequirement_Year_Test() {
            Assertions.assertTrue(Wizard_Screen_VehicleYearMakeModel_Requirements.vehicleInformationOptionRequirement_Year(driver), "Field should be required, check application");
        }

        @Test
        @DisplayName("Verifying Field Required - Make")
        public void vehicleInformationOptionRequirement_Make_Test() {
            Assertions.assertTrue(Wizard_Screen_VehicleYearMakeModel_Requirements.vehicleInformationOptionRequirement_Make(driver), "Field should be required, check application");
        }

        @Test
        @DisplayName("Verifying Field Required - Model")
        public void vehicleInformationOptionRequirement_Model_Test() {
            Assertions.assertTrue(Wizard_Screen_VehicleYearMakeModel_Requirements.vehicleInformationOptionRequirement_Model(driver), "Field should be required, check application");
        }

        @Test
        @DisplayName("Verifying Field Required - Year Make Model")
        public void vehicleInformationOptionRequirement_YearMakeModel_Test() {
            Assertions.assertTrue(Wizard_Screen_VehicleYearMakeModel_Requirements.vehicleInformationOptionRequirement_YearMakeModel(driver), "Field should be required, check application");
        }
    }

    @Nested
    @DisplayName("Vehicle Damage Details")
    class VehicleDamageDetailsTest {
        @Nested
        @DisplayName("Is there damage question")
        class IsThereDamageQuestionTest {
            @Test
            @DisplayName("Radio button picking damage - Neither")
            public void doesTheCarHaveAnyDamage_Option_Neither_Test() {
                Assertions.assertFalse(Wizard_Screen_CarPartsAndDamageQuestion.doesTheCarHaveAnyDamage_Option_Neither(driver), "Next button enabled, check application");
            }

            @Test
            @DisplayName("Radio button picking damage - No")
            public void pickingNoToTheIsThereDamageQuestion_Test() {
                Assertions.assertTrue(Wizard_Screen_CarPartsAndDamageQuestion.doesTheCarHaveAnyDamage_Option_No(driver), "Next not button enabled, check application");
            }

            @Test
            @DisplayName("Radio button picking damage - Yes")
            public void pickingYesToTheIsThereDamageQuestion_Test() {
                Assertions.assertTrue(Wizard_Screen_CarPartsAndDamageQuestion.doesTheCarHaveAnyDamage_Option_Yes(driver), "Next not button enabled, check application");
            }
        }

        @Nested
        @DisplayName("Describing Vehicle Damage")
        class DescribingVehicleDamageTest {
            @Test
            @DisplayName("Radio button picking Disqualifying Damage - No")
            public void disqualifyingDamage_Option_No_Test() {
                Assertions.assertTrue(Wizard_Screen_VehicleHasDamageDetails.disqualifyingDamage_Option_No(driver), "Damage details container was not displayed, check application");
            }

            @Test
            @DisplayName("Radio button picking Disqualifying Damage - Yes")
            public void disqualifyingDamage_Option_Yes_Test() {
                Assertions.assertTrue(Wizard_Screen_VehicleHasDamageDetails.disqualifyingDamage_Option_Yes(driver), "Refer to Peddle message not displayed, check application");
            }

            //Checking for on screen redText - would be better to check for Next button status.  Will pass onto DEV team, application will need update
            @Test
            @DisplayName("Verifying Field Required - detailDamage")
            public void disqualifyingDamage_Detail_RequirementCheck_Test() {
                Assertions.assertTrue(Wizard_Screen_VehicleHasDamageDetails.disqualifyingDamage_Detail_RequirementCheck(driver), "Damage details container should be required, check application");
            }
        }
    }

    @Nested
    @DisplayName("Does Vehicle Run Questions")
    class DoesVehicleRunQuestionsTest {
        //Question has a default answer and cannot test for requirements - confirming that either choice takes user to the location pickup question
        @Test
        @DisplayName("Does Vehicle Run - No")
        public void doesVehicleRun_No_Test() {
            Assertions.assertTrue(Wizard_Screen_VehicleRun.doesVehicleRun_No(driver), "Vehicle Pickup location question not displayed, check application");
        }

        //Question has a default answer and cannot test for requirements - confirming that either choice takes user to the location pickup question
        @Test
        @DisplayName("Does Vehicle Run - Yes")
        public void doesVehicleRun_Yes_Test() {
            Assertions.assertTrue(Wizard_Screen_VehicleRun.doesVehicleRun_Yes(driver), "Vehicle Pickup location question not displayed, check application");
        }
    }

    @Nested
    @DisplayName("Vehicle Pickup Location Question")
    class VehiclePickupLocationQuestionTest {
        //Next button starts out enabled, checking for red text
        @Test
        @DisplayName("Vehicle Pickup Location - Neither")
        public void vehiclePickUpLocation_Neither_Test() {
            Assertions.assertTrue(Wizard_Screen_VehiclePickUpLocation.vehiclePickUpLocation_Neither(driver), "Next button enabled, check application");
        }

        //Checking for the Title Proof of Ownership option is displayed
        @Test
        @DisplayName("Vehicle Pickup Location - Residence")
        public void vehiclePickUpLocation_Residence_Test() {
            Assertions.assertTrue(Wizard_Screen_VehiclePickUpLocation.vehiclePickUpLocation_Residence(driver), "Proof of Ownership options where not displayed, check application");
        }

        //Checking for the Title Proof of Ownership option is displayed
        @Test
        @DisplayName("Vehicle Pickup Location - Business")
        public void vehiclePickUpLocation_Business_Test() {
            Assertions.assertTrue(Wizard_Screen_VehiclePickUpLocation.vehiclePickUpLocation_Business(driver), "Proof of Ownership options where not displayed, check application");
        }
    }

    @Nested
    @DisplayName("Proof Of Ownership And Identification Section")
    class ProofOfOwnershipAndIdentificationSectionTest {
        @Test
        @DisplayName("Proof of Ownership Question Displayed")
        public void proofOfOwnership_Question_Test() {
            Assertions.assertTrue(Wizard_Screen_ProofOfOwnership_ID.proofOfOwnership_Question(driver), "Proof of Ownership question was not displayed, check application");
        }

        @Test
        @DisplayName("Proof of Identification Question Displayed")
        public void proofOfIdentification_Question_Test() {
            Assertions.assertTrue(Wizard_Screen_ProofOfOwnership_ID.proofOfIdentification_Question(driver), "Proof of Identification question was not displayed, check application");
        }

        @Nested
        @DisplayName("Proof Of Ownership And Identification Requirements")
        class ProofOfOwnershipAndIdentificationRequirementsTest {
            @Test
            @DisplayName("Verifying Field Required - Proof of Ownership")
            public void proofOfOwnership_RequirementCheck_Test() {
                Assertions.assertFalse(Wizard_Screen_ProofOfOwnership_ID.proofOfOwnership_RequirementCheck(driver), "Fields should be required, check application");
            }

            @Test
            @DisplayName("Verifying Field Required - Proof of ID")
            public void proofOfIdentification_RequirementCheck_Test() {
                Assertions.assertFalse(Wizard_Screen_ProofOfOwnership_ID.proofOfIdentification_RequirementCheck(driver), "Fields should be required, check application");
            }
        }
    }

    @Nested
    @DisplayName("Hauler Information Section")
    class HaulerInformationSectionTest {
        //screen loads with the Next button enabled - checking for required red text after the Next button click
        @Nested
        @DisplayName("Hauler Information Field Requirements")
        class HaulerInformationFieldRequirementsTest {
            @Test
            @DisplayName("Verifying Field Required - Hauler Information - Pickup Date")
            public void haulerInformation_Requirement_PickUpDate_Test() {
                Assertions.assertTrue(Wizard_Screen_HaulerInformation.haulerInformation_Requirement_PickUpDate(driver), "Fields should be required, check application");
            }

            @Test
            @DisplayName("Verifying Field Required - Hauler Information - Address 1")
            public void haulerInformation_Requirement_Address1_Test() {
                Assertions.assertTrue(Wizard_Screen_HaulerInformation.haulerInformation_Requirement_Address1(driver), "Fields should be required, check application");
            }

            @Test
            @DisplayName("Verifying Field Required - Hauler Information - City")
            public void haulerInformation_Requirement_City_Test() {
                Assertions.assertTrue(Wizard_Screen_HaulerInformation.haulerInformation_Requirement_City(driver), "Fields should be required, check application");
            }

            @Test
            @DisplayName("Verifying Field Required - Hauler Information - Zip Code")
            public void haulerInformation_Requirement_ZpiCode_Test() {
                Assertions.assertTrue(Wizard_Screen_HaulerInformation.haulerInformation_Requirement_ZpiCode(driver), "Fields should be required, check application");
            }
        }
    }

    @Nested
    @DisplayName("Terms Of Agreement Screen")
    class TermsOfAgreementScreenTest{
        @Test
        @DisplayName("Getting to Terms of Agreement Step One")
        public void termsOfAgreement(){
            Wizard_Screen_TermsOfAgreement.termsOfAgreement(driver);
        }
        @Test
        @DisplayName("Completing a quote")
        public void completeQuote(){
            Wizard_Screen_TermsOfAgreement.completeQuote(driver);
        }
    }
}
