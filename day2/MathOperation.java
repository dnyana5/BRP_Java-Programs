package com.bridgelabz.day2;

import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three inputs for calculations:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        MathOperation.operation(a,b,c);
    }

    private static void operation(int a, int b, int c) {
        int operation1 = a+b*c;
        int operation2 = a*b+c;
        int operation3 = c+a/c;
        int operation4 = a%b+c;
        System.out.println("a+b*c="+operation1+"\na*b+c="+operation2+"\na*b+c="+operation3+"\na%b+c="+operation4);

    }
}
