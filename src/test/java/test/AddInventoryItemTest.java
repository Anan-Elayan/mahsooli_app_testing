package test;

import base_class.BaseClass;
import org.testng.annotations.Test;
import pages.AddInventoryItemPage;
import pages.LoginPage;

public class AddInventoryItemTest {

    @Test
    public void addInventoryItemTest() {
        BaseClass baseClass = new BaseClass();
        baseClass.setup();


        LoginPage loginPage = new LoginPage();
        loginPage.login(baseClass.driver, baseClass.wait, "ali@gmail.com", "123456");


        AddInventoryItemPage addInventoryItemPage = new AddInventoryItemPage();

        // valid input data
        addInventoryItemPage.addInventoryItem(
                baseClass.driver,
                baseClass.wait,
                "الفوسفاتية",
                "test_4",
                "3, الثلاثاء، ٣ ديسمبر ٢٠٢٤",
                "16, الاثنين، ١٦ ديسمبر ٢٠٢٤, تاريخ اليوم",
                "20",
                "test_4"
        );


        // Test with empty name
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



        // Test with negative quantity
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
    // TODO confirm the add inventory item all test is work correctly. and handle the login page
}
