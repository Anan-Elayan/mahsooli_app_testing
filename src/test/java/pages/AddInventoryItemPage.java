package pages;
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
            WebElement elEnterDateValue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='" + enterDate + "']")));
            elEnterDateValue.click();
            WebElement elEnterDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='حسنًا']")));
            elEnterDate.click();
            System.out.println("Enter Enter Date");


            WebElement el15 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]")));
            el15.click();
            WebElement elExpDateValue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='" + expireDate + "']")));
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


            // Validate errors for multiple conditions
            boolean validationFailed = false;

            // Check if Name is empty or invalid
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


            // Check if Quantity is invalid
            try {
                WebElement quantityError = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='الرجاء ادخل كمية السماد']")));
                System.out.println("Validation error for Quantity: " + quantityError.getAttribute("content-desc"));
                validationFailed = true;
            } catch (Exception e) {
                System.out.println("No validation error for Quantity");
            }

            // Additional validations for other fields (e.g., Date)
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

            // validation failed, terminate test.
            if (validationFailed) {
                System.out.println("Validation errors occurred. Terminating test. for some reason.!!");
                return;
            }


            WebElement el18 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='"+fertilizerName+"']")));
            el18.click();


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


//            WebElement elRefresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='رجوع']")));
//            elRefresh.click();
//            System.out.println("clicked on back button");

//            WebElement elRefresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.LinearLayout")));
//            elRefresh.click();


            System.out.println("WOOOOOOOW !! Test case executed successfully!");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error during the test execution.");
        }
    }

}
