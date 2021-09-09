package com.bridgelabz.day7;

import java.util.Scanner;

public class SmallestLargest {
            static int i;
    private static void arrayOperation(int[] array, int size) {
        int s=array[0],l=array[0],i;
        // Second Smallest Number without sorting array
        for(i=0;i<size;i++){
            if(s>array[i])
                s=array[i];
        }
        int Smallest2nd=array[0];
        if(array[0]==s) Smallest2nd=array[1];
        for(i=0;i<size;i++) {
            if (array[i] != s && Smallest2nd>array[i])
                Smallest2nd=array[i];
        }
        System.out.println("Second smallest number is "+Smallest2nd);

        // Second largest Number without sorting array
        for(i=0;i<array.length;i++){
            if(l<array[i])
                l=array[i];
        }
        int largest2nd=array[0];
        for(i=0;i<array.length;i++) {
            if (array[i] != l && largest2nd<array[i])
                largest2nd=array[i];
        }
        System.out.println("Second largest number is "+largest2nd);
    }
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter size of array:");
    int size = scan.nextInt();
    int [] array = new int[size];
    System.out.println("Enter array Elements:");
    for(i=0;i<array.length;i++){
            array[i]=scan.nextInt();
    }

    SmallestLargest.arrayOperation(array,size);

    }

}
