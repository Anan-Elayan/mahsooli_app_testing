package pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddInventoryItemPage {

    public void addInventoryItem(AppiumDriver<MobileElement> driver, WebDriverWait wait, String category, String name, String enterDate,String expireDate ,String quantity,String fertilizerName) {
        System.out.println("In forgetPassword method");

        try {

            WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.permissioncontroller:id/permission_allow_button")));
            el1.click();
            System.out.println("Permission allowed!");


            WebElement el2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc='تسجيل دخول']")));
            el2.click();
            System.out.println("Login button clicked!");


            WebElement el3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")));
            el3.click();
            el3.sendKeys("ali@gmail.com");
            System.out.println("Email entered!");

            driver.executeScript("mobile: hideKeyboard");


            WebElement el4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")));
            el4.click();
            el4.sendKeys("123456");
            System.out.println("Password entered!");

            driver.executeScript("mobile: hideKeyboard");


            WebElement el6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.view.View[@content-desc='تسجيل الدخول'])[2]")));
            el6.click();
            System.out.println("Login button clicked!");


            WebElement el8 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='Home']")));
            el8.click();
            System.out.println("Home button clicked after login!");


            WebElement el9 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='الأسمدة']")));
            el9.click();
            System.out.println("Fertilizers button clicked after login!");

            WebElement elAdd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")));
            elAdd.click();
            System.out.println("Clicked in add button");


            WebElement el10 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='اختر صنف السماد']")));
            el10.click();
            System.out.println("Clicked to open combobox category");


            WebElement el11 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='" + category + "']")));
            el11.click();
            System.out.println("Select the category from combobox");


            WebElement el13 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]")));
            el13.click();
            el13.sendKeys(name);
            driver.executeScript("mobile: hideKeyboard");
            System.out.println("Enter Name");



            WebElement el14 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]")));
            el14.click();
            WebElement elEnterDateValue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='"+enterDate+"']")));
            elEnterDateValue.click();
            WebElement elEnterDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='حسنًا']")));
            elEnterDate.click();
            System.out.println("Enter Enter Date");




            WebElement el15 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]")));
            el15.click();
            WebElement elExpDateValue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='"+expireDate+"']")));
            elExpDateValue.click();
            WebElement elExpDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='حسنًا']")));
            elExpDate.click();
            System.out.println("Enter Expiration Date");



            WebElement el16 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[4]")));
            el16.click();
            el16.sendKeys(quantity);
            driver.executeScript("mobile: hideKeyboard");
            System.out.println("Enter Quantity");


            WebElement el17 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='إضافة']")));
            el17.click();
            System.out.println("Clicked in add button");


            WebElement el18 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='"+fertilizerName+"']")));
            el18.click();

//            scrollDown(driver);

            WebElement elShowDetails = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='عرض التفاصيل']")));
            elShowDetails.click();


            WebElement elDepositQuantity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[1]")));
            elDepositQuantity.click();
            elDepositQuantity.click();
            elDepositQuantity.click();



            WebElement elSave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='حفظ']")));
            elSave.click();
            System.out.println("Clicked in save button");


            WebElement elAfterSave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.LinearLayout")));
            elAfterSave.click();
            System.out.println("return");

            WebElement elBack = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='رجوع']")));
            elBack.click();
            System.out.println("clicked on back button");


            WebElement elReturnToFertilizers = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='الأسمدة']")));
            elReturnToFertilizers.click();



            WebElement elOpenElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='"+fertilizerName+"']")));
            elOpenElement.click();
            WebElement elShowDetail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='عرض التفاصيل']")));
            elShowDetail.click();


            WebElement elDelete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[5]")));
            elDelete.click();
            WebElement elDeleteOk = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='نعم']")));
            elDeleteOk.click();


            WebElement elBackAfterDelete = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='رجوع']")));
            elBackAfterDelete.click();
            System.out.println("clicked on back button");


            WebElement elReturnToFertilizersAfterDelete = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='الأسمدة']")));
            elReturnToFertilizersAfterDelete.click();

            WebElement elRefresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.LinearLayout")));
            elRefresh.click();



            System.out.println("WOOOOOOOW !! Test case executed successfully!");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error during the test execution.");
        }
    }
    // Method to scroll down the screen
    private void scrollDown(AppiumDriver<MobileElement> driver) {
        try {
            int screenWidth = driver.manage().window().getSize().width;
            int screenHeight = driver.manage().window().getSize().height;

            int startX = screenWidth / 2;
            int startY = (int) (screenHeight * 0.8);
            int endY = (int) (screenHeight * 0.2);

            driver.executeScript("mobile: swipe", ImmutableMap.of(
                    "direction", "up",
                    "element", driver.findElement(By.xpath("//android.view.View"))));

            System.out.println("Scrolled down.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error during scrolling.");
        }
    }
}
