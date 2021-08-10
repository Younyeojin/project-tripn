package shop.tripn.app.demo.calculator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import shop.tripn.app.demo.calculator.service.CalculatorService;

@RestController @RequiredArgsConstructor
public final class CalculatorController {
    private final CalculatorService calculatorService;
}
