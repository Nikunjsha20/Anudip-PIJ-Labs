package session3.lab;

import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        int ans1 = add(29,40);
        System.out.println("Sum of Two integer number: "+ ans1);

        int ans2 = add(10,20,30);
        System.out.println("Sum of Three integer number: "+ ans2);

        double ans3 = add(230.34, 345.67);
        System.out.println("Sum of Two double/float number: "+ ans3);
    }
    public static int add(int num1, int num2){
        return num1+num2;
    }

    public static int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static double add(double num1, double num2){
        return num1+num2;
    }

}
