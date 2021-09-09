package com.bridgelabz.day4;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Hn=0,x;
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i=n;i>0;i--){
            Hn= Hn+(float)1/i;
        }
        System.out.println(n+"th Harmonic Number is "+Hn);
    }
}

