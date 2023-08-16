package com.epam.demo;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        try{
            for (String arg: args) {
                double numb = Double.parseDouble(arg);
                if(numb<=0) return false;
            }
        }
        catch(Exception e){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add(null);
        System.out.println(isAllPositiveNumbers(lst));
    }
}