package com.regextest;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    private UserValidation userValidation = new UserValidation();

    @Test
    public void whenGivenEmailMatchingAllSamples_shouldReturnTrue(){

        boolean validationStatus = userValidation.validateEmail("mrunalg96@gmail.com");
        Assert.assertEquals(true,validationStatus);
    }

   
}
