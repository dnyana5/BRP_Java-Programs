package com.bridgelabz.day6;

import java.util.Scanner;

public class PrimeNumber {
    public static int isPrime(int num,int count) {
        for (int j = 2; j < num-1; j++) {
            if(num % j == 0)
                 count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size=sc.nextInt();
        int[] array =new int[size];
        System.out.println("Enter elements");
        for(int i=0;i<array.length;i++){
           array[i]=sc.nextInt();

        }
        System.out.println("Prime Number From array:");
         for(int i=0;i<array.length;i++){
             int count=0;
             int prime= isPrime(array[i],count); {
                 if (prime==0)
                 System.out.println(array[i]);
             }
        }
    }

   }

