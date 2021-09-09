package com.bridgelabz.day5;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print table of the power of 2: ");
         int number=sc.nextInt();
         while (number>=0){
             int power = (int) Math.pow(2,number);
             System.out.println("2 power "+number+" = "+power);
             number--;
         }
    }
}
