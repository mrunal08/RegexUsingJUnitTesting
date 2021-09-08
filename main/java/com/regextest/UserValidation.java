package com.regextest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

    public boolean validateEmail(String emailSample){

        String emailRegex= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(emailSample);
        return matcher.matches();
    }
}
