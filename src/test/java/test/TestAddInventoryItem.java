package test;

import base_class.BaseClass;
import org.testng.annotations.Test;
import pages.AddInventoryItemPage;
import pages.LoginPage;

public class TestAddInventoryItem {

    @Test
    public void addInventoryItemTest() {
        BaseClass baseClass = new BaseClass();
        baseClass.setup();


        LoginPage loginPage = new LoginPage();
        loginPage.login(baseClass.driver, BaseClass.wait, "ali@gmail.com", "123456");


        AddInventoryItemPage addInventoryItemPage = new AddInventoryItemPage();

        // Test 1: valid input data
        addInventoryItemPage.addInventoryItem(
                baseClass.driver,
                baseClass.wait,
                "الفوسفاتية",
                "test_4",
                "3, الثلاثاء، ٣ ديسمبر ٢٠٢٤",
                "16, الاثنين، ١٦ ديسمبر ٢٠٢٤",
                "20",
                "test_4"
        );


        // Test 2: with empty name
//        addInventoryItemPage.addInventoryItem(
//                baseClass.driver,
//                baseClass.wait,
//                "الفوسفاتية",
//                "",
//                "3, الثلاثاء، ٣ ديسمبر ٢٠٢٤",
//                "16, الاثنين، ١٦ ديسمبر ٢٠٢٤, تاريخ اليوم",
//                "10",
//                ""
//        );



        // Test 3: with negative quantity
//        addInventoryItemPage.addInventoryItem(
//                baseClass.driver,
//                baseClass.wait,
//                "الفوسفاتية",
//                "test_invalid",
//                "3, الثلاثاء، ٣ ديسمبر ٢٠٢٤",
//                "16, الاثنين، ١٦ ديسمبر ٢٠٢٤",
//                "-5",
//                "test_invalid"
//        );
        baseClass.teardown();
    }
}
