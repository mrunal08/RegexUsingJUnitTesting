package com.regextest;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    private UserValidation userValidation = new UserValidation();

    @Test
    public void whenGivenPasswordWithMinimum8Characters_shouldReturnTrue(){

        boolean validationStatus = userValidation.validateFirstName("Mrunal08");
        Assert.assertEquals(true,validationStatus);
    }

    @Test
    public void whenGivenPasswordWithOutMinimum8Characters_shouldReturnFalse(){

        boolean validationStatus = userValidation.validateFirstName("Mrunal");
        Assert.assertEquals(false,validationStatus);
    }
    @Test
    public void whenGivenPasswordWithFirstLetterCapital_shouldReturnTrue(){

        boolean validationStatus = userValidation.validateFirstName("Mrunal@08");
        Assert.assertEquals(true,validationStatus);
    }

    @Test
    public void whenGivenPasswordWithFirstLetterNOtCapital_shouldReturnFalse(){

        boolean validationStatus = userValidation.validateFirstName("mrunal@08");
        Assert.assertEquals(false,validationStatus);
    }

    @Test
    public void whenGivenPasswordWithAtLeast1NumericCharacter_shouldReturnTrue(){

        boolean validationStatus = userValidation.validateFirstName("Mrunal@08");
        Assert.assertEquals(true,validationStatus);
    }

    @Test
    public void whenGivenPasswordWithOutAtLeast1NumericCharacter_shouldReturnFalse(){

        boolean validationStatus = userValidation.validateFirstName("Mrunalsg@");
        Assert.assertEquals(false,validationStatus);
    }

}
