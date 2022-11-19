package com.skypro.calculator.service;

import com.skypro.Exseption.DividerByZeroExsception;
import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTestParameterized {

    private final CalculatorService cs = new CalculatorService();

    static Stream<Arguments> paramForTest() {
        return Stream.of(Arguments.of(1, 3),
                Arguments.of(-23, -10),
                Arguments.of(34, -15));
    }

    static Stream<Arguments> paramForTestbyZero() {
        return Stream.of(Arguments.of(1, 0));
    }

    @ParameterizedTest
    @MethodSource("paramForTest")
    void summPrint(int a, int b) {
        cs.summPrint(a, b);
    }

    @ParameterizedTest
    @MethodSource("paramForTest")
    void minusPrint(int a, int b) {
        cs.minusPrint(a, b);
    }

    @ParameterizedTest
    @MethodSource("paramForTest")
    void multiplyPrint(int a, int b) {
        cs.multiplyPrint(a, b);
    }

    @ParameterizedTest
    @MethodSource("paramForTest")
    void dividePrint(int a, int b) {
        cs.dividePrint(a, b);
    }

    @ParameterizedTest
    @MethodSource("paramForTestbyZero")
    void divideByZero(int a, int b) {
        if (b == 0) {
            throw new DividerByZeroExsception(" На ноль делить нельзя");
        } else cs.dividePrint(a, b);
    }
}