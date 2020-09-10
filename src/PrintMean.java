package com.company;

public class PrintMean {

    public static void main(String[] args) {
        //int=hel tal
        //double = med komma tecken
        System.out.println("Mean of 1, 1, 3, 3: " + meanCalc (1, 1,3,3));
        System.out.println("Mean of 1, 2, 3, 4: " + meanCalc (1, 2,3, 4));
        System.out.println("Mean of 1, -2, 3, -4: " + meanCalc(1 ,-2 ,3, -4));
        System.out.println("Mean of -1, -11, 24, 2: " + meanCalc(-1, -11, 24, 2));
        System.out.println("Slut på programmet!");
    }
    public static String meanCalc(int a, int b, int c, int d){
        String mean = String.valueOf((a + b + c + d) / 4.0);
        String meanString = mean;

        return  meanString;
    }
}