package com.bridgelabz.day6;

import java.util.Scanner;

public class TaylorSeries {
    static int fact=1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        double num = sc.nextInt();
        System.out.println("Enter angle:");
        double angle = sc.nextInt();
        double radian  = (angle % (2 * Math.PI));
        calculateTaylorSeries(radian,num);

    }

    static void calculateTaylorSeries(double radian , double num) {
        int power=1;
        double sinX=0.0;
        for (int i = 1; i <= num; i++) {

            double currentTerm;
            if(i%2==0)
                currentTerm = -Math.pow(radian ,power)/getfactorial(power);
            else {
                currentTerm = Math.pow(radian , power) / getfactorial(power);
            }
            sinX =sinX+currentTerm;
            power=power+2;
        }
        System.out.println(sinX);
    }

    private static int getfactorial(int num) {
        for(int i=num;i>0;i--){
          fact = fact *i;
        }
        return fact;
    }
}
