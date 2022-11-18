package com.skypro.calculator.controller;

import com.skypro.calculator.service.ServiceCalculator;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/calculator")
@RestController
public class ControllerCalculator {

private final ServiceCalculator serviceCalculator;

    public ControllerCalculator(ServiceCalculator serviceCalculator) {
        this.serviceCalculator = serviceCalculator;
    }

    @GetMapping("/calculator")
    public String helloUser() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String summ(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + " + " + b + " = " + this.serviceCalculator.summPrint(a,b);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return a + " - " + b + " = " + this.serviceCalculator.minusPrint(a, b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + " * " + b + " = " + this.serviceCalculator.multiplyPrint(a,b);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return a + " / " + b + " = " + this.serviceCalculator.dividePrint(a, b);
    }
}
