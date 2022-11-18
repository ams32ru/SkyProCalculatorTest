package com.skypro.calculator.service;

import ch.qos.logback.core.joran.conditional.IfAction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ServiceCalculator {


    public String summPrint(int a,  int b) {
        String result = String.valueOf(a + b);
        return result;
    }

    public String minusPrint(int a, int b) {
        String result = String.valueOf(a - b);
        return result;
    }

    public String multiplyPrint(int a, int b) {
        String result = String.valueOf(a * b);
        return result;
    }


    public String dividePrint(int a, int b) {
        String result = String.valueOf(a / b);
        return result;
    }

}
