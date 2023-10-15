package org.example;

import static org.example.StringUtils.isPositiveNumber;

public class Utils {
    static boolean isAllPositiveNumbers(String... str) {
        for (String s : str) {
            if (!isPositiveNumber(s)) {
                return false;
            }
        }
        return true;
    }

}