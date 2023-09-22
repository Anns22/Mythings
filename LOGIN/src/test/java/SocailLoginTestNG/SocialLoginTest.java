package SocailLoginTestNG;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SocialLoginTest {
    private AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0"); // Version is a string here
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554"); // Use the correct device name or emulator name
        dc.setCapability("autoGrantPermissions", "true");
        dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\ACS\\Downloads\\app-armeabi-v7a-release (1) (1).apk");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver(url, dc);
    }

    @Test
    public void testExampleApp() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Wait for the "Continue" button to be clickable
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]")));
        continueButton.click();

        // Wait for the "Continue with Google" button to be clickable
        WebElement continueWithGoogleButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@content-desc=\"Continue with Google\"]")));
        continueWithGoogleButton.click();

        // Add more test steps as needed
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            
        }
    }
}
