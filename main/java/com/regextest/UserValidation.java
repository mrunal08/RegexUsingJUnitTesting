package com.regextest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public boolean validateFirstName(String firstName){

<<<<<<< HEAD
    public boolean validateLastName(String lastName){
=======
        String uc1Regex= "^[A-Z]{1}[a-zA-Z]{2,20}";
        Pattern pattern = Pattern.compile(uc1Regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
>>>>>>> master

        String UC2Regex= "^[A-Z]{1}[a-zA-Z]{2,20}";
        Pattern pattern = Pattern.compile(UC2Regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
}
