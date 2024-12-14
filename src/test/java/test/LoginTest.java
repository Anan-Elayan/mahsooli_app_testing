package test;

import pages.LoginPage;
import org.testng.annotations.Test;
import base_class.BaseClass;

public class LoginTest {

    @Test
    public void testLogin() {
        System.out.println("Test login method");

        BaseClass baseClass = new BaseClass();
        baseClass.setup();

        LoginPage loginPage = new LoginPage();

        // valid cradintial data
        loginPage.login(baseClass.driver, baseClass.wait, "ali@gmail.com", "123456");


//        loginPage.login(baseClass.driver, baseClass.wait, "ali@gmail.com", "1234566");
        baseClass.teardown();
    }
}
