package com.mytest;

import java.util.Arrays;

// 'words' in the context of this program are defined as group charters from a to z, also duplicates allowed.
// Bubble sort is being used as sorting method.

public class Problem4 {
    public static void question(){
        System.out.println("Problem 4:");
        System.out.println("Write a program that sets up a String variable with the soliloquy in the previous question, extracts the words from the text and sorts them into alphabetical order. You may define 'words' however you wish (within reason), but provide your definition with your solution. You can use the sorting method of your choice. The simplest one is the bubble sort, which works as follows: \n" +
                "• Starting with the first element in the array compare successive elements (0 and 1, 1 and 2, 2 and 3, and so on). \n" +
                "• If the first element of any pair is greater than the second, interchange the two elements. \n" +
                "• Repeat the process for the whole array until no interchanges are necessary. The array elements will now be in ascending order. \n" +
                "• Run the program once you have written your code. Turn in your code, and the output produced when the code runs.\n");
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {

                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }



    public static void main(String[] args){
        String text = "To be or not to be, that is the question;"
                +"Whether `tis nobler in the mind to suffer"
                +" the slings and arrows of outrageous fortune,"
                +" or to take arms against a sea of troubles,"
                +" and by opposing end them?";

        //making use of regex
        String[] words = text.toLowerCase().split("[^a-z]+");
        bubbleSort(words);
        System.out.println("Sorted words: ");
        System.out.println(Arrays.toString(words));

    }
}
