package com.bridgelabz.day2;

public class SumOfTwoDice {
    public static void main(String[] args) {
        int p = (int) (Math.random() * 6)+1;
        int q = (int) (Math.random() * 6)+1;
        System.out.println("P="+p+"\nq= "+q+"\nsum="+(p+q));
    }
}
