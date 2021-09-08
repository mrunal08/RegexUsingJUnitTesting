package com.regextest;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    private UserValidation userValidation = new UserValidation();

    @Test
    public void whenGivenContactWithCountryCodeAnd10Digits_shouldReturnTrue(){

        boolean validationStatus = userValidation.validateContactNumber("91 8862010179");
        Assert.assertEquals(true,validationStatus);
    }

    @Test
    public void whenGivenContactWithoutCountryCodeAndLessThan10Digits_shouldReturnFalse(){

        boolean validationStatus = userValidation.validateContactNumber("882010179");
        Assert.assertEquals(false,validationStatus);
    }

    @Test
    public void whenGivenContactWithCountryCodeAndLessThan10Digits_shouldReturnFalse(){

        boolean validationStatus = userValidation.validateContactNumber(" 91 88620101");
        Assert.assertEquals(false,validationStatus);
    }
    @Test
    public void whenGivenContactWithoutCountryCodeAndWith10Digits_shouldReturnFalse(){

        boolean validationStatus = userValidation.validateContactNumber("8862010179");
        Assert.assertEquals(false,validationStatus);
    }
    @Test
    public void whenGivenContactWithAlphabetsAndSpecialCharacters_shouldReturnFalse(){

        boolean validationStatus = userValidation.validateContactNumber("882ed%0179");
        Assert.assertEquals(false,validationStatus);
    }

}
