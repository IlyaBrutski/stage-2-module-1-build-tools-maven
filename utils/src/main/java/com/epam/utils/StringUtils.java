package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try{
            if (str.contains(" ")) return false;
            double numb = Double.parseDouble(str);
            if(numb<=0) return false;
        }
        catch(Exception e){
            return false;
        }
        return true;
//        return org.apache.commons.lang3.StringUtils.isNumeric(str);
    }

    public static void main(String[] args) {
        System.out.println(isPositiveNumber(""));
        System.out.println(isPositiveNumber("-6"));
        System.out.println(isPositiveNumber("0"));
        System.out.println(isPositiveNumber("3"));
        System.out.println(isPositiveNumber("12.2"));
        System.out.println(isPositiveNumber("-9.5"));
        System.out.println(isPositiveNumber("."));
        System.out.println(isPositiveNumber("0.00"));
        System.out.println(isPositiveNumber("  100.1"));
        System.out.println(isPositiveNumber(null));
    }
}
