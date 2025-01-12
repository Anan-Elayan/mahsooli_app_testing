package pages;

import base_class.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OfflineAddToInventory {


    public void offlineAddToInventory(AppiumDriver<MobileElement> driver, WebDriverWait wait, String category, String name, String enterDate, String expireDate , String quantity, String fertilizerName) {
        System.out.println("In add inventory item method");

        try {

            BaseClass.clickButton("//android.view.View[@content-desc='Home']");
            System.out.println("Home button clicked after login!");

            System.out.println("Switching to offline mode...");
            Runtime.getRuntime().exec("adb shell svc wifi disable");
            Runtime.getRuntime().exec("adb shell svc data disable");
            Thread.sleep(15000);


            BaseClass.clickButton("//android.widget.ImageView[@content-desc='الأسمدة']");
            System.out.println("Fertilizers button clicked after login!");



            WebElement elAdd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")));
            elAdd.click();
            System.out.println("Clicked in add button");


            BaseClass.clickButton("//android.view.View[@content-desc='اختر صنف السماد']");
            System.out.println("Clicked to open combobox category");

            BaseClass.clickButton("//android.view.View[@content-desc='" + category + "']");
            System.out.println("Select the category from combobox");

            WebElement el13 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]")));
            el13.click();
            el13.sendKeys(name);
            driver.executeScript("mobile: hideKeyboard");
            System.out.println("Enter Name");


            WebElement el14 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]")));
            el14.click();
            BaseClass.clickButton("//android.widget.Button[@content-desc='" + enterDate + "']");
            BaseClass.clickButton("//android.widget.Button[@content-desc='حسنًا']");
            System.out.println("Enter Enter Date");


            WebElement el15 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]")));
            el15.click();
            BaseClass.clickButton("//android.widget.Button[@content-desc='" + expireDate + "']");


            BaseClass.clickButton("//android.widget.Button[@content-desc='حسنًا']");
            System.out.println("Enter Expiration Date");


            WebElement el16 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[4]")));
            el16.click();
            el16.sendKeys(quantity);
            driver.executeScript("mobile: hideKeyboard");
            System.out.println("Enter Quantity");


            BaseClass.clickButton("//android.view.View[@content-desc='إضافة']");
            System.out.println("Clicked in add button");


            BaseClass.clickButton("//android.widget.Button[@content-desc='رجوع']");
            System.out.println("Switching to offline mode...");
            Runtime.getRuntime().exec("adb shell svc wifi enable");
            Runtime.getRuntime().exec("adb shell svc data enable");
            Thread.sleep(50000);

            BaseClass.clickButton("//android.widget.ImageView[@content-desc='الأسمدة']");
            System.out.println("Fertilizers button clicked after login!");


            System.out.println("WOOOOOOOW !! Test case executed offline successfully! 🎉");



        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error during the test execution.");
        }
    }

}
