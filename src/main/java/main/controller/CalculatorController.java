package main.controller;

import main.service.CalculatorService;
import main.service.ExpressionService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class CalculatorController {

    private static CalculatorService calculatorService = new CalculatorService();
    private ExpressionService expressionService = new ExpressionService();

    public void askExpression(){
        expressionService.askParams();
    }

    public void calculate(){
        calculatorService.calculate(
                expressionService.getLeftOperator(),
                expressionService.getRightOperator(),
                expressionService.getOperator(),
                expressionService.getTypeFlag());
    }
}
