package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {


    public void registerValid(AppiumDriver<MobileElement> driver, WebDriverWait wait, String email, String name,String phoneNumber,String password,String city) {
        System.out.println("In login method");

        try {
            // Step 1: Allow permission (if applicable)
            WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.permissioncontroller:id/permission_allow_button")));
            el1.click();
            System.out.println("Permission allowed!");

            // Step 2: Click on login button
            WebElement el2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc='إنشاء حساب']")));
            el2.click();
            System.out.println("Register button clicked!");

            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ScrollView/android.widget.EditText[1]")));
            emailField.click();
            emailField.sendKeys(email);
            System.out.println("emailField interr");


            WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ScrollView/android.widget.EditText[2]")));
            nameField.click();
            nameField.sendKeys(name);
            System.out.println("nameField interr");


            WebElement phone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ScrollView/android.widget.EditText[3]")));
            phone.click();
            phone.sendKeys(phoneNumber);
            System.out.println("phone interr");


            WebElement registerPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ScrollView/android.widget.EditText[4]")));
            registerPassword.click();
            registerPassword.sendKeys(password);
            System.out.println("registerPassword interr");


            WebElement registerCity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ScrollView/android.widget.EditText[5]")));
            registerCity.click();
            registerCity.sendKeys(city);
            System.out.println("registerCity interr");


            WebElement register = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='انشاء']")));
            register.click();
            System.out.println("Register button clicked!");

            WebElement okay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='موافق']")));
            okay.click();
            System.out.println("okay button clicked!");



            System.out.println("Test case executed successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error during the test execution.");
        }
    }

}
