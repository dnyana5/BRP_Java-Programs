package com.bridgelabz.day4;

import java.util.Scanner;

public class Trigonometry {
    private static void conversion(int degree) {
        //conversion of degree in radian
        double radians = Math.toRadians(degree);
        //System.out.println(radians);
        double sine= Math.sin(radians);
        System.out.println("sin("+degree+")= " +sine);
        double cosine=Math.cos(radians);
        System.out.println("cos("+degree+")= " +cosine);
        double tan = Math.tan(radians);
        System.out.println("tan("+degree+")= " +tan);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle in degree :");
        int degree = sc.nextInt();
        Trigonometry.conversion(degree);
    }

}
