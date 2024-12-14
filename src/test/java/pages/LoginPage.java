package pages;

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

            WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.permissioncontroller:id/permission_allow_button")));
            el1.click();
            System.out.println("Permission allowed!");


            WebElement el2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc='تسجيل دخول']")));
            el2.click();
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


            WebElement el6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.view.View[@content-desc='تسجيل الدخول'])[2]")));
            el6.click();
            System.out.println("Login button clicked!");


            WebElement el8 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='Home']")));
            el8.click();
            System.out.println("Home button clicked after login!");

            // Step 7: Handle the warning dialog and click the "فهمت" button
//            WebElement el9 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='فهمت']")));
//            el9.click();  // Click the "فهمت" button to dismiss the dialog
//            System.out.println("Clicked on 'فهمت' after warning dialog!");

            System.out.println("Test case executed successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error during the test execution.");
        }
    }
}
