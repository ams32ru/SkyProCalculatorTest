package com.skypro.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceCalculatorTest {
    private final ServiceCalculator sc = new ServiceCalculator();
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
        int res1 = Integer.parseInt(sc.minusPrint(a, b));
        assertEquals(res1 + b, a);
    }

    @Test
    void multiplyPrint() {
        assertEquals(sc.multiplyPrint(a, b)
                , sc.multiplyPrint(b, a));
    }

    @Test
    void dividePrint() {
        int res1 = Integer.parseInt(sc.dividePrint(a, b));
        assertEquals(res1 * b, a);
    }

    @Test
    void dividePrintNoNull() {
        if (b == 0) {
            throw new IllegalArgumentException("На 0 делить нельзя");
        } else sc.dividePrint(a,b);
    }
}