package com.jc.core.oop.encapsulation;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SignupTest {

    @Test
    public void testSignupCreation() {
        // Create a Signup object
        Signup signup = new Signup("Jagadeesh C", "jc@gmail.com");

        // Verify that the Signup object is not null
        Assert.assertNotNull(signup);

        // Verify that the name and email are set correctly
        Assert.assertEquals(signup.getName(), "Jagadeesh C");
        Assert.assertEquals(signup.getEmail(), "jc@gmail.com");
    }

    @Test
    public void testGetName() {
        Signup signup = new Signup("Jagadeesh C", "jc@gmail.com");
        String name = signup.getName();
        Assert.assertEquals(name, "Jagadeesh C");
    }

    @Test
    public void testGetEmail() {
        Signup signup = new Signup("Jagadeesh C", "jc@gmail.com");
        String email = signup.getEmail();
        Assert.assertEquals(email, "jc@gmail.com");
    }

//    @Test
//    public void testGetNameWhenNoName() {
//        Signup signup = new Signup(null, "jc@gmail.com");
//        String name = signup.getName();
//        Assert.assertEquals(name, "No name.");
//    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void testGetNameWhenNoName() {
        Signup signup = new Signup(null, "jc@example.com");
        signup.getName();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetEmailWhenNoEmail() {
        Signup signup = new Signup("Jagadeesh C", null);
        signup.getEmail();
    }

    @Test
    public void testSetName() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Signup signup = new Signup("Jagadeesh C", "jc@gmail.com");

        // Use reflection to access the private setName() method
        Method setNameMethod = Signup.class.getDeclaredMethod("setName", String.class);
        setNameMethod.setAccessible(true);
        setNameMethod.invoke(signup, "Jane");

        String name = signup.getName();
        Assert.assertEquals(name, "Jane");
    }

    @Test
    public void testSetEmail() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Signup signup = new Signup("Jagadeesh C", "jc@gmail.com");

        // Use reflection to access the private setEmail() method
        Method setEmailMethod = Signup.class.getDeclaredMethod("setEmail", String.class);
        setEmailMethod.setAccessible(true);
        setEmailMethod.invoke(signup, "jane@example.com");

        String email = signup.getEmail();
        Assert.assertEquals(email, "jane@example.com");
    }

    /**
     * In this test case, we use reflection to access the private isValidEmailFormat() method in the Signup class.
     * We obtain a reference to the method using Signup.class.getDeclaredMethod(), passing the name of the method and its parameter types.
     * Then, we set the method accessible using isValidEmailFormatMethod.setAccessible(true) to bypass the private access restriction.
     * Finally, we invoke the private method using isValidEmailFormatMethod.invoke(), passing the signup instance and the test inputs as arguments.
     * We cast the returned value to a boolean and assert the expected outcome using Assert.assertTrue() and Assert.assertFalse().
     * <p>
     * Please note that testing private methods directly through reflection is generally discouraged in unit testing.
     * It is recommended to focus on testing the public API of a class. However, if it's necessary to test private methods, this approach can be used with caution.
     */
    @Test
    public void testIsValidEmailFormat() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, IllegalArgumentException {
        Signup signup = new Signup("Jagadeesh C", "jc@example.com");

        // Use reflection to access the private isValidEmailFormat() method
        Method isValidEmailFormatMethod = Signup.class.getDeclaredMethod("isValidEmailFormat", String.class);
        isValidEmailFormatMethod.setAccessible(true);

        // Call the private isValidEmailFormat() method with test inputs
        boolean validEmail = (boolean) isValidEmailFormatMethod.invoke(signup, "jc@example.com");
        Assert.assertTrue(validEmail);

        boolean invalidEmail = (boolean) isValidEmailFormatMethod.invoke(signup, "invalid_email");
        Assert.assertFalse(invalidEmail);

        // Invalid email format with missing @ symbol
        boolean invalidEmail1 = (boolean) isValidEmailFormatMethod.invoke(signup, "jcexample.com");
        Assert.assertFalse(invalidEmail1);

        // Invalid email format with multiple @ symbols
        boolean invalidEmail2 = (boolean) isValidEmailFormatMethod.invoke(signup, "jc@example@test.com");
        Assert.assertFalse(invalidEmail2);

        // Invalid email format with missing domain part
        boolean invalidEmail3 = (boolean) isValidEmailFormatMethod.invoke(signup, "jc@");
        Assert.assertFalse(invalidEmail3);

        // Invalid email format with missing local part
        boolean invalidEmail4 = (boolean) isValidEmailFormatMethod.invoke(signup, "@example.com");
        Assert.assertFalse(invalidEmail4);

        // Invalid email format with special characters
        boolean invalidEmail5 = (boolean) isValidEmailFormatMethod.invoke(signup, "jc!@example.com");
        Assert.assertFalse(invalidEmail5);

        // Invalid email format with leading or trailing spaces
        boolean invalidEmail6 = (boolean) isValidEmailFormatMethod.invoke(signup, " jc@example.com ");
        Assert.assertFalse(invalidEmail6);

        // Invalid email format with null email
//        boolean invalidEmail7 = (boolean) isValidEmailFormatMethod.invoke(signup, null);
//        Assert.assertFalse(invalidEmail7);

        // Valid email format with numbers in domain part
        boolean validEmail8 = (boolean) isValidEmailFormatMethod.invoke(signup, "jc123@example123.com");
        Assert.assertTrue(validEmail8);

        // Valid email format with special characters in local and domain part
//        boolean validEmail9 = (boolean) isValidEmailFormatMethod.invoke(signup, "j+ohn@exa_mple.com");
//        Assert.assertTrue(validEmail9);

        // Valid email format with subdomain
        boolean validEmail10 = (boolean) isValidEmailFormatMethod.invoke(signup, "jc@example.co.uk");
        Assert.assertTrue(validEmail10);

        // Invalid email format with leading/trailing spaces
        boolean invalidEmail11 = (boolean) isValidEmailFormatMethod.invoke(signup, " jc@example.com ");
        Assert.assertFalse(invalidEmail11);

        // Invalid email format with missing local part
        boolean invalidEmail12 = (boolean) isValidEmailFormatMethod.invoke(signup, "@example.com");
        Assert.assertFalse(invalidEmail12);

        // Invalid email format with missing @ symbol
        boolean invalidEmail13 = (boolean) isValidEmailFormatMethod.invoke(signup, "jcexample.com");
        Assert.assertFalse(invalidEmail13);

        // Invalid email format with missing domain part
        boolean invalidEmail14 = (boolean) isValidEmailFormatMethod.invoke(signup, "jc@");
        Assert.assertFalse(invalidEmail14);

        // Invalid email format with multiple @ symbols
        boolean invalidEmail15 = (boolean) isValidEmailFormatMethod.invoke(signup, "jc@example@test.com");
        Assert.assertFalse(invalidEmail15);

        // Invalid email format with special characters in wrong positions
        boolean invalidEmail16 = (boolean) isValidEmailFormatMethod.invoke(signup, "jc!@example.com");
        Assert.assertFalse(invalidEmail16);

        // Invalid email format with null email
//        boolean invalidEmail17 = (boolean) isValidEmailFormatMethod.invoke(signup, null);
//        Assert.assertFalse(invalidEmail17);
    }
}