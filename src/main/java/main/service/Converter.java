package main.service;

import main.entity.ArabNumeral;
import main.entity.Expression;
import main.entity.RomanNumeral;

public class Converter {

    public static Expression convert(String a, String b, String oper){
        Expression expression= new Expression();
        expression.setOperator(oper);
        for(ArabNumeral r : ArabNumeral.values()){
            if(a.equals(r.getKey())){
                expression.setLeftOperator(r.getValue());
            }
            if(b.equals(r.getKey())){
                expression.setRightOperator(r.getValue());
            }
        }

        if(expression.leftOperator==0) {
            if (expression.rightOperator == 0) {
                for (RomanNumeral r : RomanNumeral.values()) {
                    if (a.equals(r.getKey())) {
                        expression.setLeftOperator(r.getValue());
                    }
                    if (b.equals(r.getKey())) {
                        expression.setRightOperator(r.getValue());
                    }
                    expression.typeFlag = r.getName();
                }
            } else {
                throw new RuntimeException("Unsupported values is given for calculation");
            }
        }
        return expression;
    }
}
