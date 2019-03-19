package com.company;

import com.company.Operation;

public class Divide extends Operation {



    public Divide(double termen1, double termen2) {
        super(termen1, termen2);
        operationSign = " / ";
    }

    public Divide(double termen1, Operation termen2) {
        super(termen1, termen2);
        operationSign = " / ";
    }

    public Divide(Operation termen1, Operation termen2) {
        super(termen1, termen2);
        operationSign = " / ";
    }

    public Divide(Operation termen1, double termen2) {
        super(termen1, termen2);
        operationSign = " / ";
    }

    @Override
    public double operation() {
        return this.termen1/this.termen2;
    }

}


