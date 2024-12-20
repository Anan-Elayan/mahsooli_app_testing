package test;

import base_class.BaseClass;
import org.testng.annotations.Test;
import pages.CultivatedPlantPage;
import pages.LoginPage;

import static base_class.BaseClass.wait;

public class CultivatedPlantTest {

    @Test
    public void addInventoryItemTest() {
        BaseClass baseClass = new BaseClass();
        baseClass.setup();

        LoginPage loginPage = new LoginPage();
        loginPage.login(baseClass.driver, wait, "ali@gmail.com", "123456");

        CultivatedPlantPage cultivatedPlantPage = new CultivatedPlantPage(wait);


        // Test 1: Valid input
        cultivatedPlantPage.createNewCultivatedPlant(
                baseClass.driver,
                "بندورة",
                "خضروات",
                "8",
                "5",
                "16, الاثنين، ١٦ ديسمبر ٢٠٢٤"
        );


        // Test 2: empty all field
//        cultivatedPlantPage.createNewCultivatedPlant(
//                baseClass.driver,
//                "",
//                "",
//                "",
//                "",
//                ""
//        );

        // Test 3: Negative width value
//        cultivatedPlantPage.createNewCultivatedPlant(
//                baseClass.driver,
//                "بندورة",
//                "خضروات",
//                "-8",
//                "1",
//                "16, الاثنين، ١٦ ديسمبر ٢٠٢٤"
//        );

        // Test 4: Zero's the height and width
//        cultivatedPlantPage.createNewCultivatedPlant(
//                baseClass.driver,
//                "بندورة",
//                "خضروات",
//                "0",
//                "0",
//                "16, الاثنين، ١٦ ديسمبر ٢٠٢٤"
//        );
    }

}


