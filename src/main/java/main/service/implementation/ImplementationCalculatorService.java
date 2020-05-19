package main.service.implementation;

import main.entity.RomanNumeral;
import main.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class ImplementationCalculatorService implements CalculatorService {

    public void calculate(int a, int b, String operator, String f) {
        System.out.println("left " + a+
                " operator " +b +
                " right " +operator+
                " " +f);
        checkForLimit(a, b);
        int result;
        switch(operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new RuntimeException("Unsupported operation is given for calculation");
        }
        giveResult(result, f);
    }

    private void giveResult(int result, String f){
        {
            if (f == "Rome") {
                for (RomanNumeral r : RomanNumeral.values()) {
                    if (result == r.getValue()) {
                        System.out.println("OUTPUT : " + r.getKey());
                    }
                }
            } else if (f == "Arab") {
                System.out.println("OUTPUT : " + result);
            } else {
                throw new RuntimeException("Unsupported numeral system");
            }
        }
    }
    private void checkForLimit(int a, int b){
        if(a<1 || a>10 || b<1 || b>10){
            throw new RuntimeException("Incorrect data");
        }
    }
}
