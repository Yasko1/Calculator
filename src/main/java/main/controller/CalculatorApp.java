package main.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

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
