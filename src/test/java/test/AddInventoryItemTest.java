package test;

import base_class.BaseClass;
import org.testng.annotations.Test;
import pages.AddInventoryItemPage;
import pages.LoginPage;

public class AddInventoryItemTest {

    @Test
    public void addInventoryItemTest() {
        System.out.println("Test login method");
        BaseClass baseClass = new BaseClass();
        baseClass.setup();

        AddInventoryItemPage addInventoryItemPage = new AddInventoryItemPage();
        addInventoryItemPage.addInventoryItem(
                baseClass.driver,
                baseClass.wait,
                "الفوسفاتية",
                "test_4",
                "3, الثلاثاء، ٣ ديسمبر ٢٠٢٤",
                "14, السبت، ١٤ ديسمبر ٢٠٢٤, تاريخ اليوم",
                "20",
                "test_4"
        );

        baseClass.teardown();
    }
}
