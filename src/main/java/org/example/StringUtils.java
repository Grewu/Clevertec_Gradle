package org.example;

public class StringUtils {

    static boolean isPositiveNumber(String str) {
        try {
            double number = Double.parseDouble(str);
            return number > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}