package com.skypro.calculator.service;

import com.skypro.Exseption.DividerByZeroExsception;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {


    public int summPrint(int a, int b) {
        int result = (a + b);
        return result;
    }

    public int minusPrint(int a, int b) {
        int result = (a - b);
        return result;
    }

    public int multiplyPrint(int a, int b) {
        int result = (a * b);
        return result;
    }


    public int dividePrint(int a, int b) {
        if (b == 0) {
            throw new DividerByZeroExsception("На нуль делить нельзя");
        }
        int result = (a / b);
        return result;
    }

}
