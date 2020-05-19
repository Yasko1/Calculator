package main.service.implementation;

import main.entity.ArabNumeral;
import main.entity.Expression;
import main.entity.RomanNumeral;
import main.service.Converter;
import main.service.ExpressionService;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class ImplementationExpressionService implements ExpressionService {

    private static final String message = "INPUT LINE : ";

    public Expression askParamsFromConsole(){
        System.out.print(message);
        Scanner request = new Scanner(System.in);
        String a = request.next();
        String oper = request.next();
        String b = request.next();
        request.close();

        return Converter.convert(a, b, oper);
    }

}
