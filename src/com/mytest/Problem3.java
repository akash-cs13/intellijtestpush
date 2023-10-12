package com.mytest;

public class Problem3 {
    public static void question(){
        System.out.println("Problem 3:");
        System.out.println("In the following code the soliloquy is analyzed character by character to determine the vowels, spaces and letters used. Fill in the code that computes the number of spaces, vowels, and consonants.\n");
    }
    public static void main(String[] args)
    {
        String text = "To be or not to be, that is the question;"
                +"Whether `tis nobler in the mind to suffer"
                +" the slings and arrows of outrageous fortune,"
                +" or to take arms against a sea of troubles,"
                +" and by opposing end them?";

        int spaces = 0, vowels = 0, letters = 0;

        for (char c : text.toCharArray()) {
            if (Character.isWhitespace(c)) {
                spaces++;
            } else if (Character.isLetter(c)) {
                letters++;
                char lowercaseChar = Character.toLowerCase(c);
                if (lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i'
                        || lowercaseChar == 'o' || lowercaseChar == 'u') {
                    vowels++;
                }
            }
        }

        System.out.println("The text contained vowels: " + vowels +
                 "\nconsonants: "  + (letters - vowels) +
                "\nspaces: " + spaces);
    }
}
