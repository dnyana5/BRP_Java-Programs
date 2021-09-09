package com.bridgelabz.day1;

import java.util.Scanner;

public class Quadratic {
    static void equations(int a,int b,int c){
        int delta = ((b*b)-(4*a*c));
        double root1 = (-b+(Math.sqrt(delta)/(2*a)));
        double root2 = (-b-(Math.sqrt(delta)/(2*a)));
        System.out.println(+delta+" "+root1+" "+root2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three inputs for calculations:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Quadratic.equations(a,b,c);

    }
}
