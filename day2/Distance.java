package com.bridgelabz.day2;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two inputs for calculations:");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double Distance = Math.sqrt(Math.pow(x,2.0)+Math.pow(y,2.0));
        System.out.println(Distance);

    }
}
