package pages;

import base_class.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

    private final WebDriverWait wait;

    public RegisterPage(WebDriverWait wait) {
        this.wait = wait;
    }

    private boolean validateError(String locator, String message) {
        try {
            WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
            System.out.println("Validation error: " + message + " - " + errorElement.getAttribute("content-desc"));
            return false;
        } catch (Exception e) {
            System.out.println("No validation error for: " + message);
            return true;
        }
    }

    private void clickDialogButton(String locator) {
        try {
            WebElement dialogButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
            System.out.println("Dialog is displayed. Clicking on 'موافق' button.");
            dialogButton.click();
        } catch (Exception e) {
            System.out.println("Dialog 'موافق' button not displayed.");
        }
    }

    public void register(AppiumDriver<MobileElement> driver, String email, String name, String phone, String password, String city) {
        BaseClass.clickButton("com.android.permissioncontroller:id/permission_allow_button");
        BaseClass.clickButton("//android.view.View[@content-desc='إنشاء حساب']");


        BaseClass.enterText("//android.widget.ScrollView/android.widget.EditText[1]", email);
        BaseClass.enterText("//android.widget.ScrollView/android.widget.EditText[2]", name);
        BaseClass.enterText("//android.widget.ScrollView/android.widget.EditText[3]", phone);
        BaseClass.enterText("//android.widget.ScrollView/android.widget.EditText[4]", password);
        BaseClass.enterText("//android.widget.ScrollView/android.widget.EditText[5]", city);

        BaseClass.hideKeyboardIfOpen(driver);

        BaseClass.clickButton("//android.view.View[@content-desc='انشاء']");

        boolean noErrors = true;

        noErrors &= validateError("//android.view.View[@content-desc='الرجاء إدخال بريد إلكتروني صحيح']", "Invalid Email");
        noErrors &= validateError("//android.view.View[@content-desc='رقم الهاتف يجب ان يكون من 10 خانات']", "Phone too short");
        noErrors &= validateError("//android.view.View[@content-desc='الرقم السري اقل من 6 خانات']", "Password too short");
        noErrors &= validateError("//android.view.View[@content-desc='حدث خط البريد الإلكتروني مستخدم بالفعل']", "Email already used");

        noErrors &= validateError("//android.view.View[@content-desc='ادخل الايميل من فضلك']", "Email is empty");
        noErrors &= validateError("//android.view.View[@content-desc='ادخل الاسم من فضلك']", "Name is empty");
        noErrors &= validateError("//android.view.View[@content-desc='ادخل رقم الهاتف من فضلك']", "Phone number is empty");
        noErrors &= validateError("//android.view.View[@content-desc='ادخل اسم المدينة من فضلك']", "City is empty");
        noErrors &= validateError("//android.view.View[@content-desc='ادخل الرقم السري من فضلك']", "Password is empty");

        if (noErrors) {
            System.out.println("No errors found. Checking for confirmation dialog...");
            clickDialogButton("//android.widget.Button[@content-desc='موافق']");
        } else {
            System.out.println("Registration failed due to input validation errors.");
        }
    }
}