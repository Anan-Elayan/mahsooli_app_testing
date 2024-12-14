package test;

import base_class.BaseClass;
import org.testng.annotations.Test;
import pages.ForgetPasswordPage;

public class ForgetPasswordTest {

    @Test
    public void forgetPassword() {
        System.out.println("Testing forget password functionality");


        BaseClass baseClass = new BaseClass();
        baseClass.setup();

        ForgetPasswordPage forgetPasswordPage = new ForgetPasswordPage();
        forgetPasswordPage.forgetPassword(baseClass.driver, baseClass.wait, "abs@gmail.com");  // Wrong email

        baseClass.teardown();
    }
}
