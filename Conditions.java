package org.example;

public class Conditions {
    public static void main(String[] args) {
        int marks = 49;

        if (marks >= 50) {
            if (marks == 100) {
                System.out.println("Got Perfect Score!");
            }
            else if(marks>=75 & marks<100){
            System.out.println("Got Distinction!");
            }
            else {
                System.out.println("Passed");
            }

        } else {
            System.out.println("Failed!");
        }
    }
}
