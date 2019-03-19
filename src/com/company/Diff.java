package com.company;

public class Diff extends Operation{


    public Diff(double termen1, double termen2) {
        super(termen1, termen2);
        operationSign = " - ";
    }

    public Diff(double termen1, Operation termen2) {
        super(termen1, termen2);
        operationSign = " - ";
    }

    public Diff(Operation termen1, Operation termen2) {
        super(termen1, termen2);
        operationSign = " - ";
    }

    public Diff(Operation termen1, double termen2) {
        super(termen1, termen2);
        operationSign = " - ";
    }

    @Override
    public double operation() {
        return this.termen1 - this.termen2;

    }
}


