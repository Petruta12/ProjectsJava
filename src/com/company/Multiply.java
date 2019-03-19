package com.company;

public class Multiply extends Operation{

    public Multiply(double termen1, double termen2) {
        super(termen1, termen2);
        operationSign = " * ";
    }

    public Multiply(double termen1, Operation termen2) {
        super(termen1, termen2);
        operationSign = " * ";
    }

    public Multiply(Operation termen1, Operation termen2) {
        super(termen1, termen2);
        operationSign = " * ";
    }

    public Multiply(Operation termen1, double termen2) {
        super(termen1, termen2);
        operationSign = " * ";
    }

    @Override
    public double operation() {
        return this.termen1 * this.termen2;
    }


}




