package test;

import base_class.BaseClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterValidTest {

    @Test
    public void testRegisterValid() {
        System.out.println("Register login method");

        BaseClass baseClass = new BaseClass();
        baseClass.setup();

        RegisterPage registerValidTest = new RegisterPage();

        // valid cradintial data
        registerValidTest.registerValid(baseClass.driver, baseClass.wait, "ali@gmail.com", "123456","0599112518","123456","nabluse");


        baseClass.teardown();
    }

}
