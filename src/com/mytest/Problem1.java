package com.mytest;

public class Problem1 {
    private static float volume(int diameter){
        return (float) (4 * Math.PI * Math.pow((float) diameter /2, 3) / 3);
    }

    private static float ratio(float argument1, float argument2){
        return argument1/argument2;
    }

    public static void question(){
        System.out.println("Problem 1:");
        System.out.println("The diameter of the Sun is approximately 865,000 miles. The diameter of the Earth is approximately 7600 miles. Use the methods in the class Math to calculate, \n(a) the volume of the Earth in cubic miles \n(b) the volume of the Sun in cubic miles \n(c) the ratio of the volume of the Sun to the volume of the Earth \nand then output the three values. Treat both the earth and sun as spheres. The volume of a sphere is given by the formula 4 pi r^3/3 where r is the radius.\n");
    }


    public static void main(String[] args){
        question();
        float earthVolume = volume(7600);
        float sunVolume = volume(865_000);
        float myRatio = ratio(sunVolume,earthVolume);
        System.out.println("Answer:");
        System.out.println("The volume of the Earth is " + earthVolume + " cubic miles, the volume of the sun is " + sunVolume + " cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is " + myRatio + ":1.");

    }
}
