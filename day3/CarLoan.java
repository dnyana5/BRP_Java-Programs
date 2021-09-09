package com.bridgelabz.day3;

import java.util.Scanner;

public class CarLoan {
    private static void payment(int P, int y, int R) {
        int n=12*y;
        int r= R /(12*100);
        double pay = (P * r) / (1-(Math.pow((1+r),-n)));
        System.out.println(pay);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three inputs for calculations:");
        int P=sc.nextInt();
        int Y=sc.nextInt();
        int R=sc.nextInt();
        CarLoan.payment(P,Y,R);

    }

}
