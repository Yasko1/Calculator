package main.entity;

import org.springframework.stereotype.Component;

@Component
public class Expression {
    public int rightOperator;
    public int leftOperator;
    public String operator;

    public String getTypeFlag() {
        return typeFlag;
    }

    public void setTypeFlag(String typeFlag) {
        this.typeFlag = typeFlag;
    }

    public String typeFlag = "Arab";

    public int getRightOperator() {
        return rightOperator;
    }

    public int getLeftOperator() {
        return leftOperator;
    }

    public String getOperator() {
        return operator;
    }
    public void setRightOperator(int rightOperator) {
        this.rightOperator = rightOperator;
    }

    public void setLeftOperator(int leftOperator) {
        this.leftOperator = leftOperator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
