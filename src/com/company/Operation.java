package com.company;

public abstract class Operation {


    protected double termen1;
    protected double termen2;
    protected String operationSign;
    protected Operation termen1Op;
    protected Operation termen2Op;

    public Operation(double termen1, double termen2) {
        this.termen1 = termen1;
        this.termen2 = termen2;
    }

    public Operation(double termen1, Operation termen2) {
        this.termen1 = termen1;
        this.termen2 = termen2.operation();
        this.termen2Op = termen2;
    }

    public Operation(Operation termen1, Operation termen2) {

        this.termen1 = termen1.operation();
        this.termen2 = termen2.operation();
        this.termen1Op = termen1;
        this.termen2Op = termen2;
    }

    public Operation(Operation termen1, double termen2) {
        this.termen1 = termen1.operation();
        this.termen2 = termen2;
        this.termen1Op = termen1;

    }

    public abstract double operation();

    //metoda de convertire a unui intreg in String
    //display
    @Override
    public String toString() {
        return computetionTerms() + " = " + this.operation();
    }

    private String computetionTerms() {
        String primulOperator;
        String alDoileaOperator;

        if (termen1Op == null) {
            primulOperator = termen1 + " ";
        } else {
            primulOperator = termen1Op.computetionTerms() + " ";
        }

        if (termen2Op == null) {
            alDoileaOperator = termen2 + " ";
        } else {
            alDoileaOperator = termen2Op.computetionTerms() + " ";
        }

        return " ( " +primulOperator + operationSign + alDoileaOperator + " ) ";
    }

}



