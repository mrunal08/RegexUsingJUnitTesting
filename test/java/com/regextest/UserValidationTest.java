package com.regextest;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    private UserValidation userValidation = new UserValidation();

    @Test
    public void whenGivenEmailWithSpecialCharactersAtProperPlaces_shouldReturnTrue(){

        boolean validationStatus = userValidation.validateEmail("mrunalg96@gmail.com");
        Assert.assertEquals(true,validationStatus);
    }

    @Test
    public void whenGivenEmailWithSpecialCharactersNotAtProperPlaces_shouldReturnFalse(){

        boolean validationStatus = userValidation.validateEmail("mrunalg96gmailcom");
        Assert.assertEquals(false,validationStatus);
    }



}
