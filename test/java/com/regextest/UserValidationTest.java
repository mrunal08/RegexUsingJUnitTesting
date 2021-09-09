package com.regextest;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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


    @Test
    public void whenGivenLastNameWith1stCapitalLetter_shouldReturnTrue(){

        boolean validationStatus = userValidation.validateLastName("Gadhave");
        Assert.assertEquals(true,validationStatus);
    }

    @Test
    public void whenGivenLastNameWith1stLetterNotCapital_shouldReturnFalse(){

        boolean validationStatus = userValidation.validateLastName("gadhave");
        Assert.assertEquals(false,validationStatus);
    }

    @Test
    public void whenGivenLastNameContainNumericValue_shouldReturnFalse(){

        boolean validationStatus = userValidation.validateLastName("Gadhave08");
        Assert.assertEquals(false,validationStatus);
    }

    @Test
    public void whenGivenLastNameContainSpecialCharacter_shouldReturnFalse(){

        boolean validationStatus = userValidation.validateLastName("Gadhave@08");
        Assert.assertEquals(false,validationStatus);
    }

    @Test
    public void whenGivenLastNameIsLessThan3Characters_shouldReturnFalse(){

        boolean validationStatus = userValidation.validateLastName("Ga");
        Assert.assertEquals(false,validationStatus);
    }
}
