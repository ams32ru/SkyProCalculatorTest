package com.skypro.calculator.service;

import com.skypro.Exseption.DividerByZeroExsception;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.util.Assert;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceTestParameterized {

    private final CalculatorService cs = new CalculatorService();

    static Stream<Arguments> ParamSumm() {
        return Stream.of(Arguments.of(1, 3, 4),
                Arguments.of(-10, -10, -20),
                Arguments.of(5, -15, -10));
    }

    @ParameterizedTest
    @MethodSource("ParamSumm")
    void summPrintTest(int a, int b, int result) {
        assertEquals(cs.summPrint(a, b), result);
    }

    static Stream<Arguments> ParamMinus() {
        return Stream.of(Arguments.of(1, 3, -2),
                Arguments.of(-10, -10, 0),
                Arguments.of(5, -15, 20));
    }

    @ParameterizedTest
    @MethodSource("ParamMinus")
    void minusPrint(int a, int b, int result) {
        assertEquals(cs.minusPrint(a, b), result);
    }

    static Stream<Arguments> ParamMultiply() {
        return Stream.of(Arguments.of(2, 3, 6),
                Arguments.of(-10, -10, 100),
                Arguments.of(5, -10, -50));
    }

    @ParameterizedTest
    @MethodSource("ParamMultiply")
    void multiplyPrint(int a, int b, int result) {
        assertEquals(result, cs.multiplyPrint(a, b));
    }

    static Stream<Arguments> ParamDivide() {
        return Stream.of(Arguments.of(6, 3, 2),
                Arguments.of(-10, -10, 1),
                Arguments.of(10, -5, -2));
    }

    @ParameterizedTest
    @MethodSource("ParamDivide")
    void dividePrint(int a, int b, int result) {
        assertEquals(result, cs.dividePrint(a, b));
    }


    static Stream<Arguments> paramForTestbyZero() {
        return Stream.of(Arguments.of(1, 0));
    }

    @ParameterizedTest
    @MethodSource("paramForTestbyZero")
    void divideByZero(int a, int b) {
        if (b == 0) {
            throw new DividerByZeroExsception(" На ноль делить нельзя");
        } else cs.dividePrint(a, b);
    }
}