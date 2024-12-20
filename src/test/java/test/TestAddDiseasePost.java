package test;

import base_class.BaseClass;
import org.testng.annotations.Test;
import pages.AddDiseasePostPage;
import pages.AddInventoryItemPage;
import pages.LoginPage;

public class TestAddDiseasePost {

    @Test
    public void testAddDiseasePost() {
        BaseClass baseClass = new BaseClass();
        baseClass.setup();

        LoginPage loginPage = new LoginPage();
        loginPage.login(baseClass.driver, BaseClass.wait, "ali@gmail.com", "123456");

        AddDiseasePostPage addDiseasePostPage = new AddDiseasePostPage();


        // Test 2: valid input data when creat new disease post;
//        addDiseasePostPage.addNewPost(
//                baseClass.driver,
//                BaseClass.wait,
//                "this is first test valid input",
//                "(//android.widget.ImageView[@resource-id=\"com.android.documentsui:id/icon_thumb\"])[5]"
//        );


        // Test 3: all field is empty
                addDiseasePostPage.addNewPost(
                baseClass.driver,
                BaseClass.wait,
                "",
                ""
        );

        // Test 4: put description but without image
//        addDiseasePostPage.addNewPost(
//                baseClass.driver,
//                BaseClass.wait,
//                "text without image",
//                ""
//        );

        // Test 5: test with image but without description
//        addDiseasePostPage.addNewPost(
//                baseClass.driver,
//                BaseClass.wait,
//                "",
//                "(//android.widget.ImageView[@resource-id=\"com.android.documentsui:id/icon_thumb\"])[5]"
//        );

        baseClass.teardown();
    }
}
