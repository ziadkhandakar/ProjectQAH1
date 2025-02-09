package org.example;

public class Practice {
    public static void main(String[] args) {
        //Problem 1
        int i;
        for (i = 1; i <= 50; i++) {
            System.out.println("number= " + i);
        }

        //Problem 2
        int j=0;
        for (i = 1; i <= 50; i++) {
            j=j+i;
            System.out.println("number= " + j);
        }
        //problem 3

        for(i=1;i<=50;i++){
            if(i%2==0){
                System.out.println(i+ " is an even number");
            }
            else {
                System.out.println(i+ " is an Odd number");
            }
        }



    }
}