package test;

import pages.LoginPage;
import org.testng.annotations.Test;
import base_class.BaseClass;

public class LoginTest {

    @Test
    public void testLogin() {
        BaseClass baseClass = new BaseClass();
        baseClass.setup();

        LoginPage loginPage = new LoginPage();


        // Test 1: valid data input
//        loginPage.login(baseClass.driver, BaseClass.wait, "ali@gmail.com", "123456");

        // Test 2: valid user but password not correct;
//        loginPage.login(baseClass.driver, BaseClass.wait, "ali@gmail.com", "1234566");

        // Test 3: all field is empty
        loginPage.login(baseClass.driver, BaseClass.wait, "", "");

        // Test 4: valid user but the writing email not correct
//        loginPage.login(baseClass.driver, BaseClass.wait, "ali$gmail.com", "123456");


        baseClass.teardown();
    }
}
