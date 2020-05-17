package main.controller;

import main.service.CalculatorService;
import main.service.ImplExpressionService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
@Component
public class CalculatorController {

    private static CalculatorService calculatorService = new CalculatorService();
    private ImplExpressionService expressionService = new ImplExpressionService();

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
