package shop.tripn.app.demo.calculator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import shop.tripn.app.demo.calculator.entity.Calculator;
import shop.tripn.app.demo.calculator.repository.CalculatorRepository;

@Service @RequiredArgsConstructor
public class CalculatorServiceImpl implements CalculatorService{
    private final CalculatorRepository calculatorRepository;

    @Override
    public int createRandomNumbers() {
        return (int)(Math.random()*100)+1;
    }
}
