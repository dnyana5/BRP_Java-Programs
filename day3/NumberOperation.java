package com.bridgelabz.day3;

public class NumberOperation {
    public static void main(String[] args) {
        double array[]=new double[5];
        double sum=0,max=0,min=0;
        for (int i=0;i<array.length;i++) {
            array[i] = Math.random();
            System.out.println("number:"+array[i]);
            sum = sum + array[i];
            max=Math.max(array[i],max);//0 1 2 3 4
            min=Math.min(array[i],min);

        }
        System.out.println("Average of 5 random numbers is "+sum/5);
        System.out.println("Max num:"+max);
        System.out.println("Min num"+min);

    }
}
