package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("42.0"));
        assertFalse(StringUtils.isPositiveNumber( "-42.0"));
        assertFalse(StringUtils.isPositiveNumber("message"));
    }
}