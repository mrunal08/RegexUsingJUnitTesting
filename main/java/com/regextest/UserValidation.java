package com.regextest;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

    public boolean validateEmail(String[] array){


        boolean result=false;
        List<String> list = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            String emailRegex= "^([a-zA-Z0-9+_.-]+)@([a-zA-Z0-9.-]+){8,15}$";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(array[i]);
            result= matcher.matches();
        }
        return result;
    }
}
