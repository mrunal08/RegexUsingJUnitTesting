package com.regextest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public boolean validateFirstName(String firstName){

        String uc1Regex= "^[A-Z]{1}[a-zA-Z]{2,20}";
        Pattern pattern = Pattern.compile(uc1Regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

}
