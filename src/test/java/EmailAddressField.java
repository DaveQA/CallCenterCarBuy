import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.clickLinks.*;

public class EmailAddressField {

    private static WebDriver driver;

    public static boolean emailRequirementCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        typing_Input_MainLogin_Good(driver);
        clicking_MainLoginScreen_LoginButton();
        clickCallCodeButton();
        typing_FirstName();
        typing_LastName();
        clicking_Button_Next();
        clicking_Button_NewQuote();
        typing_Input_PrimaryPhoneNumber_Valid();
        clicking_Button_Next();
        boolean emailRequiredText = driver.findElements(By.cssSelector("#pro-wizard > div:nth-child(1) > div > div:nth-child(2) > div.form-group.has-error > div > p")).size() > 0;
        clickTheRefreshButton();
        clicking_LogoutButton();
        return emailRequiredText;
    }
}
