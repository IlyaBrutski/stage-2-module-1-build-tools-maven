package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       //magic happens here
        return args.stream()
                .allMatch(str -> str.matches("\\d+"))
                && args.stream()
                .map(Integer::parseInt)
                .allMatch(num -> num > 0);
    }
    
}