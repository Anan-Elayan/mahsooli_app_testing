package test;

import base_class.BaseClass;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class TestRegister extends BaseClass {

    @Test
    public void registrationTest() {
        RegisterPage registerPage = new RegisterPage(wait);

        // Test 1: Valid input
        registerPage.register(driver,"newTest@gmail.com", "newTest", "0599112518", "123456", "testCity");

        // Test 2: Valid input but the email already exist
//        registerPage.register(driver,"ali@gmail.com", "Ali", "0599112518", "123456", "Nablus");

        // Test 3: Invalid email
//        registerPage.register(driver,"ali$gmail.com", "ali", "0599112518", "123456", "Nablus");

        // Test 4: Empty fields
//        registerPage.register(driver,"", "", "", "", "");

        // Test 5: Password too short
//        registerPage.register(driver,"test@mail.com", "Ali", "0599112518", "123", "Nablus");

        // Test 6: Phone number too short
//        registerPage.register(driver,"test@mail.com", "Ali", "059", "123456", "Nablus");
    }
}
