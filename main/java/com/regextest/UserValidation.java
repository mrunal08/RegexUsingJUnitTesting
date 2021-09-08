package com.regextest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

    public boolean validateEmail(String email){

        String uc1Regex= "^[a-zA-Z0-9+_.]+@[a-zA-Z.-]+$";
        Pattern pattern = Pattern.compile(uc1Regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


}
