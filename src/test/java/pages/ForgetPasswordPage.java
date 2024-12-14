package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgetPasswordPage {

    public void forgetPassword(AppiumDriver<MobileElement> driver, WebDriverWait wait, String email) {
        System.out.println("In forgetPassword method");

        try {

            WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.permissioncontroller:id/permission_allow_button")));
            el1.click();
            System.out.println("Permission allowed!");


            WebElement el2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc='تسجيل دخول']")));
            el2.click();
            System.out.println("Login button clicked!");


            WebElement el3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='نسيت كلمة المرور']")));
            el3.click();
            System.out.println("Forget Password button clicked!");


            WebElement el4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText")));
            el4.click();
            el4.clear();
            el4.sendKeys(email);
            System.out.println("Email entered!");

            driver.executeScript("mobile: hideKeyboard");

            WebElement el5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button")));
            el5.click();
            System.out.println("Submit button clicked!");


            WebElement el6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"موافق\"]")));
            el6.click();
            System.out.println("Email entered!");


            WebElement el7 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText")));
            el7.click();
            el7.clear();
            el7.sendKeys("ali@gmail.com");
            System.out.println("Correct email entered!");

            driver.executeScript("mobile: hideKeyboard");

            WebElement el8 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button")));
            el8.click();
            System.out.println("Submit button clicked for correct email!");


            WebElement el9 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.ScrollView/android.widget.EditText[1])")));
            el9.click();
            el9.clear();
            el9.sendKeys("1");


            WebElement el10 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.ScrollView/android.widget.EditText[2])")));
            el10.click();
            el10.clear();
            el10.sendKeys("2");



            WebElement el11 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.ScrollView/android.widget.EditText[3])")));
            el11.click();
            el11.clear();
            el11.sendKeys("3");


            WebElement el12 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.ScrollView/android.widget.EditText[4])")));
            el12.click();
            el12.clear();
            el12.sendKeys("4");


            driver.executeScript("mobile: hideKeyboard");

            WebElement el14 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"تأكيد\"]")));
            el14.click();
            el14.clear();
            System.out.println("clicked");


            System.out.println("Test case executed successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error during the test execution.");
        }
    }
}
