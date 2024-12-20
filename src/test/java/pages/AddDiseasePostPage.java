package pages;

import base_class.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddDiseasePostPage {


    public void addNewPost(AppiumDriver<MobileElement> driver, WebDriverWait wait, String description, String image) {
        System.out.println("In addNewPost method");

        try {
            BaseClass.clickButton("//android.view.View[@content-desc='Home']");
            System.out.println("Home button clicked after login!");

            BaseClass.clickButton("//android.widget.ImageView[@content-desc=\"منشورات الأمراض\"]");
            System.out.println("Disease post button clicked after login!");

            BaseClass.clickButton("//android.view.View[@content-desc=\"منشور جديد\"]");
            System.out.println("Clicked in new post tab");

            if (!description.isEmpty()) {
                BaseClass.enterText("//android.widget.EditText", description);
                BaseClass.hideKeyboardIfOpen(driver);
                System.out.println("Input description");
            } else {
                Thread.sleep(3000);
                System.out.println("No description provided");
            }

            if (!image.isEmpty()) {
                BaseClass.clickButton("//android.view.View[@content-desc=\"إرفاق صورة\"]");
                System.out.println("Clicked on button to pick image from device");

                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@resource-id=\"com.android.documentsui:id/icon_thumb\"]")));

                MobileElement selectedImage = driver.findElement(By.xpath(image));
                selectedImage.click();
                System.out.println("Image selected from gallery");
            } else {
                Thread.sleep(3000);
                System.out.println("No image selected after opening gallery");
            }

            BaseClass.clickButton("//android.view.View[@content-desc=\"نشر الأن\"]");
            System.out.println("Clicked the 'Create' button");
            Thread.sleep(5000);//delay

            System.out.println("Done! Test case executed successfully! 🎉");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error during the test execution.");
        }
    }

}
