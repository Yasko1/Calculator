package main;

import main.entity.Expression;
import main.service.CalculatorService;
import main.service.ExpressionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class CalculatorApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApp.class, args);
    }

    @Autowired
    CalculatorService calculatorService;
    @Autowired
    ExpressionService expressionService;
    @Autowired
    Expression expression;

    @Override
    public void run(String... args) throws Exception {
        expression=expressionService.askParamsFromConsole();
        calculatorService.calculate(expression.getLeftOperator(),
                expression.getRightOperator(),
                expression.getOperator(),
                expression.getTypeFlag());
    }
}
