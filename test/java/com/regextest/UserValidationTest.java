package com.regextest;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    private UserValidation userValidation = new UserValidation();

    @Test
    public void whenGivenFirstNameWith1stCapitalLetter_shouldReturnTrue(){

        boolean validationStatus = userValidation.validateFirstName("Mrunal");
        Assert.assertEquals(true,validationStatus);
    }

    @Test
    public void whenGivenFirstNameWith1stLetterNotCapital_shouldReturnFalse(){

        boolean validationStatus = userValidation.validateFirstName("mrunal");
        Assert.assertEquals(false,validationStatus);
    }

    @Test
    public void whenGivenFirstNameContainNumericValue_shouldReturnFalse(){

        boolean validationStatus = userValidation.validateFirstName("Mrunal08");
        Assert.assertEquals(false,validationStatus);
    }

    @Test
    public void whenGivenFirstNameContainSpecialCharacter_shouldReturnFalse(){

        boolean validationStatus = userValidation.validateFirstName("Mrunal@08");
        Assert.assertEquals(false,validationStatus);
    }

    @Test
    public void whenGivenFirstNameIsLessThan3Characters_shouldReturnFalse(){

        boolean validationStatus = userValidation.validateFirstName("Mr");
        Assert.assertEquals(false,validationStatus);
    }








}
