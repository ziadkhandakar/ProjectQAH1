package org.example;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operator
        System.out.println("***Arithmetic Operator**");
        int a= 10, b=3;
        System.out.println("Addition= "+ (a+b));
        System.out.println("Substruction= "+ (a-b));
        System.out.println("Multipllication= "+ (a*b));
        System.out.println("Division= "+ (a/b));
        System.out.println("Modulus= "+ (a%b));
        System.out.println(" ");

        //Relational Operator
        System.out.println("***Relational Operator**");
        System.out.println("Equal to = "+ (a==b));
        System.out.println("Not Equal to = "+ (a!=b));
        System.out.println("Greater than = "+ (a>b));
        System.out.println("Less than = "+ (a<b));
        System.out.println("Greater than or equal to = "+ (a>=b));
        System.out.println("Less than or equal to = "+ (a<=b));

        //Logical Operator

        System.out.println("***Logical Operator**");
        System.out.println("a>b && b<a is: "+ (a>b && b<a));
        System.out.println("a>b || b<a is: "+ (a>b || b<a));
        System.out.println("! b<a is: "+ (!(b<a)));

        //Logical Operator

        System.out.println("***Logical Operator**");
        System.out.println("equal operator: a is assigned as "+ a);
        System.out.println("a1 = "+ a);



    }
}
