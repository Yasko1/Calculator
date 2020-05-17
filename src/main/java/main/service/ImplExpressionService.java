package main.service;

import main.model.ArabNumeral;
import main.model.RomanNumeral;
import org.springframework.stereotype.Service;
import java.util.Scanner;

@Service
public class ImplExpressionService {

    private static final String message = "INPUT LINE : ";
    public int rightOperator = 0;
    public int leftOperator = 0;
    public String operator;
    public String typeFlag;

    public void askParams(){
        System.out.print(message);
        Scanner request = new Scanner(System.in);
        String a = request.next();
        this.operator = request.next();
        String b = request.next();
        request.close();
        convertToInt(a, b);
    }

    private void convertToInt(String a, String b){
        for(ArabNumeral r : ArabNumeral.values()){
            if(a.equals(r.getKey())){
                leftOperator = r.getValue();
            }
            if(b.equals(r.getKey())){
                rightOperator = r.getValue();
            }
            typeFlag = r.getName();
        }

        if(leftOperator==0) {
            if (rightOperator == 0) {
                for (RomanNumeral r : RomanNumeral.values()) {
                    if (a.equals(r.getKey())) {
                        leftOperator = r.getValue();
                    }
                    if (b.equals(r.getKey())) {
                        rightOperator = r.getValue();
                    }
                    typeFlag = r.getName();
                }
            } else {
                throw new RuntimeException("Unsupported values is given for calculation");
            }
        }
    }

    public int getRightOperator() {
        return rightOperator;
    }

    public int getLeftOperator() {
        return leftOperator;
    }

    public String getOperator() {
        return operator;
    }
    public String getTypeFlag() {
         return typeFlag;
    }

}
