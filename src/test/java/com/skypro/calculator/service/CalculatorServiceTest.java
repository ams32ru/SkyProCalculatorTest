package com.skypro.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorService sc = new CalculatorService();
    private int a;
    private  int b;

    @BeforeEach
    void SetNums() {
        a = 10;
        b = 5;
    }

    @Test
    void summPrint() {
        assertEquals(sc.summPrint(a, b)
                , sc.summPrint(b, a));
    }


    @Test
    void minusPrint() {
        int res1 = (sc.minusPrint(a, b));
        assertEquals(res1 + b, a);
    }

    @Test
    void multiplyPrint() {
        assertEquals(sc.multiplyPrint(a, b)
                , sc.multiplyPrint(b, a));
    }

    @Test
    void dividePrint() {
        int res1 = (sc.dividePrint(a, b));
        assertEquals(res1 * b, a);
    }

    @Test
    void dividePrintNoNull() {
        if (b == 0) {
            throw new IllegalArgumentException("На 0 делить нельзя");
        } else sc.dividePrint(a,b);
    }
}