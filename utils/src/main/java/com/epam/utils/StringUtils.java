package com.epam.utils;

import static org.apache.commons.lang3.StringUtils.isBlank;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (isBlank(str)) {
            return false;
        }

        try {
            double num = Double.parseDouble(str);
            return num > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
