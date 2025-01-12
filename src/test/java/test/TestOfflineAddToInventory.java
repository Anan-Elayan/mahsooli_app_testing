package test;

import base_class.BaseClass;
import org.testng.annotations.Test;
import pages.AddInventoryItemPage;
import pages.LoginPage;
import pages.OfflineAddToInventory;

public class TestOfflineAddToInventory {

    @Test
    public void offlineAddToInventoryTest() {
        BaseClass baseClass = new BaseClass();
        baseClass.setup();


        LoginPage loginPage = new LoginPage();
        loginPage.login(baseClass.driver, BaseClass.wait, "ali@gmail.com", "123456");


        OfflineAddToInventory offlineAddToInventory = new OfflineAddToInventory();

        // Test 1: valid input data
        offlineAddToInventory.offlineAddToInventory(
                baseClass.driver,
                BaseClass.wait,
                "الفوسفاتية",
                "test offline2",
                "8, الأربعاء، ٨ يناير ٢٠٢٥",
                "30, الخميس، ٣٠ يناير ٢٠٢٥",
                "20",
                "test offline3"
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
