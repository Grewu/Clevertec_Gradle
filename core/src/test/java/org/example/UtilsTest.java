package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class UtilsTest {

    @Test
    void isAllPositiveNumbers() {
        assertTrue(Utils.isAllPositiveNumbers("12"));
        assertTrue(Utils.isAllPositiveNumbers("12","14","16","1934"));
        assertFalse(Utils.isAllPositiveNumbers("some","text","for","test"));
        assertFalse(Utils.isAllPositiveNumbers("-123123","-342454","-23434","-25343"));
    }
}