package base_class;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class BaseClass {

    public AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;

    @BeforeTest
    public void setup() {
        try {
            // Initialize capabilities
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "320085804e8116f3");
            caps.setCapability(MobileCapabilityType.UDID, "320085804e8116f3");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3600);
            caps.setCapability(MobileCapabilityType.APP, "D:\\university\\4year\\First Semester\\COMP4300 Graduation Project\\last verstion\\build\\app\\outputs\\flutter-apk\\app-release.apk");
            caps.setCapability("appium:automationName", "UiAutomator2");
            caps.setCapability("appium:connectHardwareKeyboard", true);

            // Initialize the Appium Driver
            URL url = new URL("http://172.24.224.1:4723/");
            driver = new AndroidDriver<>(url, caps);

            // Initialize WebDriverWait with the driver
            wait = new WebDriverWait(driver, 10); // 10 seconds timeout
            System.out.println("Driver and WebDriverWait initialized successfully!");
        } catch (Exception exp) {
            System.out.println("Cause is: " + exp.getCause());
            System.out.println("Message is: " + exp.getMessage());
            exp.printStackTrace();
        }
    }

    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver quit successfully.");
        }
    }
}
