package com.mytest;

public class Problem2 {
    public static void question(){
        System.out.println("Problem 2:");
        System.out.println(" Create a  program that has the following features \n(a) Uses labeled continue instead of break.\n(b) Does not require the isPrime variable.\n(c) When testing whether an integer is prime, it is sufficient to try and divide by integers up to the square root of the number being tested.\n");

    }

    public static void main(String[] args) {
        int nValues = 50;

        label:
        for (int i = 2; i <= nValues; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue label;
                }
            }
            System.out.println(i);
        }
    }
}
