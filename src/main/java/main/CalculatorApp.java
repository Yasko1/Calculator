package main;

import main.controller.CalculatorController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        CalculatorController calculatorController =new CalculatorController();
        calculatorController.askExpression();
        calculatorController.calculate();
    }
}
