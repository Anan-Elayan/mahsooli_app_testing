package pages;

import base_class.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CultivatedPlantPage {

    private final WebDriverWait wait;

    public CultivatedPlantPage(WebDriverWait wait) {
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

    public void createNewCultivatedPlant(AppiumDriver<MobileElement> driver, String plantName, String plantCategory, String landWidth, String landHeight, String cultivatedDate) {


        try{
            BaseClass.clickButton("//android.view.View[@content-desc='Home']");
            System.out.println("Home button clicked in cultivated plant!");


            BaseClass.clickButton("//android.widget.ImageView[@content-desc='أزرع الان']");
            System.out.println("Cultivated Now clicked after login!");

            BaseClass.clickButton("//android.widget.Button");
            System.out.println("Add button clicked after login!");



            BaseClass.clickButton("//android.view.View[@content-desc=\"اختر اسم النبتة \"]");
            System.out.println("the comboBox for plant name is clicked");
            if(plantName.isEmpty()){
                BaseClass.clickButton("(//android.view.View[@content-desc=\"اختر اسم النبتة \"])[2]");
                System.out.println("the comboBox for plant name is closed");
            }else {
                BaseClass.clickButton("//android.view.View[@content-desc='" + plantName + "']");
                System.out.println("Select the plantName from combobox");
            }

            BaseClass.clickButton("//android.view.View[@content-desc=\"اختر صنف النتة\"]");
            System.out.println("the comboBox for plant category is clicked");
            if(plantCategory.isEmpty()){
                BaseClass.clickButton("(//android.view.View[@content-desc=\"اختر صنف النتة\"])[2]");
                System.out.println("the comboBox for plant category is closed");
            }else {
                BaseClass.clickButton("//android.view.View[@content-desc='" + plantCategory + "']");
                System.out.println("Select the plantName from combobox");
            }

            BaseClass.enterText("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]", landHeight);
            System.out.println("the plant height is enter");
            BaseClass.hideKeyboardIfOpen(driver);
            BaseClass.enterText("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]", landWidth);
            System.out.println("the plant width is enter");
            BaseClass.hideKeyboardIfOpen(driver);


            WebElement calendar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]")));
            calendar.click();
            System.out.println("Calendar is displayed.");
            if(cultivatedDate.isEmpty()){
                BaseClass.clickButton("//android.widget.Button[@content-desc=\"الإلغاء\"]");
                System.out.println("Clicked on button cancel in calender");
            }else {
                String dateLocator = "//android.widget.Button[@content-desc='" + cultivatedDate + "']";
                try {
                    WebElement dateButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dateLocator)));
                    dateButton.click();
                    System.out.println("Date " + cultivatedDate + " selected successfully.");
                } catch (Exception e) {
                    System.out.println("Date " + cultivatedDate + " not found or not clickable.");
                    e.printStackTrace();
                }
                try {
                    WebElement confirmButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='حسنًا']")));
                    confirmButton.click();
                    System.out.println("'حسنًا' button clicked, calendar dialog closed.");
                } catch (Exception e) {
                    System.out.println("'حسنًا' button not found or not clickable.");
                    e.printStackTrace();
                }
                BaseClass.hideKeyboardIfOpen(driver);
            }

            BaseClass.clickButton("//android.view.View[@content-desc=\"التالي\"]");
            System.out.println("the Next button clicked ");

            boolean noErrors = true;

            noErrors &= validateError("//android.view.View[@content-desc='يجب ألا يكون فارغاً']", "Plant name is required");
            noErrors &= validateError("//android.view.View[@content-desc='الرجاء اختيار صنف المزروع']", "Plant category is required");
            noErrors &= validateError("//android.view.View[@content-desc=\"الرجاء إدخال الطول\"]", "Land height is required");

            noErrors &= validateError("//android.view.View[@content-desc=\"الرجاء إدخال العرض\"]", "Land width is required");
            noErrors &= validateError("//android.view.View[@content-desc=\"الرجاء إدخال تاريخ الزراعة\"]", "Cultivated date is required");
            noErrors &= validateError("//android.view.View[@content-desc=\"يجب الا يكون الطول صفر\"]", "the height is zero input");
            noErrors &= validateError("//android.view.View[@content-desc=\"يجب الا يكون العرض صفر\"]", "the width is zero input");

            if (noErrors) {
                System.out.println("No errors found. Checking for confirmation dialog...");
                BaseClass.clickButton("//android.view.View[@content-desc=\"التالي\"]");
                System.out.println("the Next button in seeds quantity clicked");


                clickDialogButton("//android.widget.Button[@content-desc=\"نعم\"]");
                System.out.println("the yes button dialog clicked");
                BaseClass.hideKeyboardIfOpen(driver);


                BaseClass.clickButton("//android.view.View[@content-desc=\"ازرع الان\"]");
                System.out.println("the Create now button clicked in final stage proses ");

                clickDialogButton("//android.widget.Button[@content-desc=\"حسنا\"]");
                System.out.println("the Button oky clicked Done process");

            } else {
                System.out.println("Registration failed due to input validation errors.");
            }
            System.out.println("Done! Test case executed successfully! 🎉");


        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error during the test execution.");
        }


    }


}
