package com.regextest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

    public boolean validateFirstName(String password){

        String passswordRegex= "^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z*.!@$%^&(){}:;<>,.?/~_+-=|]).{8,32}$";
        Pattern pattern = Pattern.compile(passswordRegex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
