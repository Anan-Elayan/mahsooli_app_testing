package pages;
import base_class.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddInventoryItemPage {

    public void addInventoryItem(AppiumDriver<MobileElement> driver, WebDriverWait wait, String category, String name, String enterDate,String expireDate ,String quantity,String fertilizerName) {
        System.out.println("In add inventory item method");

        try {

            BaseClass.clickButton("//android.view.View[@content-desc='Home']");
            System.out.println("Home button clicked after login!");


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


            boolean validationFailed = false;

            try {
                WebElement CategoryError = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='الرجاء ادخل صنف السماد']")));
                System.out.println("Validation error for Category: " + CategoryError.getAttribute("content-desc"));
                validationFailed = true;
            } catch (Exception e) {
                System.out.println("No validation error for Category");
            }
            try {
                WebElement nameError = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='الرجاء ادخل اسم السماد']")));
                System.out.println("Validation error for Name: " + nameError.getAttribute("content-desc"));
                validationFailed = true;
            } catch (Exception e) {
                System.out.println("No validation error for Name");
            }
            try {
                WebElement quantityError = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='الرجاء ادخل كمية السماد']")));
                System.out.println("Validation error for Quantity: " + quantityError.getAttribute("content-desc"));
                validationFailed = true;
            } catch (Exception e) {
                System.out.println("No validation error for Quantity");
            }
            try {
                WebElement quantityError = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='الرجاء ادخل كمية السماد بالارقام']")));
                System.out.println("Validation error for Quantity: " + quantityError.getAttribute("content-desc"));
                validationFailed = true;
            } catch (Exception e) {
                System.out.println("No validation error for Quantity");
            }
            try {
                WebElement dateError = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='الرجاء ادخل تاريخ دخول السماد']")));
                System.out.println("Validation error for Date: " + dateError.getAttribute("content-desc"));
                validationFailed = true;
            } catch (Exception e) {
                System.out.println("No validation error for EnterDate");
            }
            try {
                WebElement dateError = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='الرجاء ادخل تاريخ الانتهاء']")));
                System.out.println("Validation error for Date: " + dateError.getAttribute("content-desc"));
                validationFailed = true;
            } catch (Exception e) {
                System.out.println("No validation error for ExpirationDate");
            }
            if (validationFailed) {
                System.out.println("Validation errors occurred. Terminating test. for some reason.!!");
                return;
            }
            BaseClass.clickButton("//android.view.View[@content-desc='"+fertilizerName+"']");

            BaseClass.clickButton("//android.widget.Button[@content-desc='عرض التفاصيل']");


            WebElement elDepositQuantity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[1]")));
            elDepositQuantity.click();
            elDepositQuantity.click();
            elDepositQuantity.click();

            BaseClass.clickButton("//android.view.View[@content-desc='حفظ']");
            System.out.println("Clicked in save button");


            BaseClass.clickButton("//android.widget.LinearLayout");
            System.out.println("return");

            BaseClass.clickButton("//android.widget.Button[@content-desc='رجوع']");
            System.out.println("clicked on back button");

            BaseClass.clickButton("//android.widget.ImageView[@content-desc='الأسمدة']");

            BaseClass.clickButton("//android.view.View[@content-desc='"+fertilizerName+"']");

            WebElement elShowDetail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='عرض التفاصيل']")));
            elShowDetail.click();


            WebElement elDelete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[5]")));
            elDelete.click();

            BaseClass.clickButton("//android.widget.Button[@content-desc='نعم']");


            BaseClass.clickButton("//android.widget.Button[@content-desc='رجوع']");
            System.out.println("clicked on back button");


            WebElement elReturnToFertilizersAfterDelete = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='الأسمدة']")));
            elReturnToFertilizersAfterDelete.click();

            System.out.println("WOOOOOOOW !! Test case executed successfully!");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error during the test execution.");
        }
    }
}
