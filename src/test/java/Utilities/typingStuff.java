//package Utilities;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class typingStuff {
//
//    private static WebDriver driver;
//
//    public static void typeSomething(By by, String value) {
//        driver.findElement(by).sendKeys(value);
//    }
//
//    public static void waitOnButtonToBeClickable(By by) {
//        WebDriverWait waitOnButtonToBeClickable = new WebDriverWait(driver, Duration.ofSeconds(10));
//        waitOnButtonToBeClickable.until(ExpectedConditions.elementToBeClickable(by));
//    }
//
//    public static void waitOnLoadingGif() {
//        WebDriverWait loadingGifWait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        loadingGifWait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#app > div.loading-container > div.loading")));
//    }
//
//    public static void waitOnErrorMessagePopup() {
//        WebDriverWait errorPopupWait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        errorPopupWait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#mini-toastr")));
//    }
//
//    public static void waitOnBothErrorMessageAndLoadingGif(WebDriver driver1) {
//        driver = driver1;
//        waitOnLoadingGif();
//        waitOnErrorMessagePopup();
//    }
//}
