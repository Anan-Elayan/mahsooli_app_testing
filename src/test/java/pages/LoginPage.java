package pages;

import base_class.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginPage {

    public void login(AppiumDriver<MobileElement> driver, WebDriverWait wait, String email, String password) {
        System.out.println("In login method");

        try {
            BaseClass.clickButton("com.android.permissioncontroller:id/permission_allow_button");
            System.out.println("Permission allowed!");

            BaseClass.clickButton("//android.view.View[@content-desc='تسجيل دخول']");
            System.out.println("Login button clicked!");


            WebElement el3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")));
            el3.click();
            el3.sendKeys(email);
            System.out.println("Email entered!");

            driver.executeScript("mobile: hideKeyboard");


            WebElement el4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")));
            el4.click();
            el4.sendKeys(password);
            System.out.println("Password entered!");

            driver.executeScript("mobile: hideKeyboard");


            boolean validationFailed = false;

            try {
                WebElement el6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.view.View[@content-desc='تسجيل الدخول'])[2]")));
                el6.click();
                System.out.println("Login button clicked!");
                driver.executeScript("mobile: hideKeyboard");
                validationFailed = true;
            } catch (Exception e) {
                System.out.println("No validation error for Category");
            }
            if (!validationFailed) {
                BaseClass.clickButton("//android.view.View[@content-desc='Home']");
                System.out.println("Home button clicked after login!");
            }


            System.out.println("Test case executed successfully! 🎉");


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error during the test execution.");
        }
    }
}
