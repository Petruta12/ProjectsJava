package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Sum sum = new Sum(4, 2);
        Diff diff = new Diff(4, 2);
        Multiply multy = new Multiply(4,2);
        Divide div = new Divide(4.3,3);
        System.out.println(sum.operation());
        System.out.println(sum);

        System.out.println(diff);
        System.out.println(multy);
       System.out.println(div);

        Sum sum2 = new Sum(div,diff);
        System.out.println(sum2);


    }

}


