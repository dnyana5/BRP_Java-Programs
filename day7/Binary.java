package com.bridgelabz.day7;

import java.util.Scanner;

public class Binary {
     static void conversion(int decimal) {
        int binary=0,reminder,temp=1;
         while (decimal!=0){
             reminder = decimal % 2;
             decimal = decimal / 2;
             binary = binary + reminder * temp;
             temp = temp * 10;
         }
         System.out.println("The Binary Number is : "+binary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal;
        System.out.println("Enter a Decimal Number : ");
        decimal = sc.nextInt();
        Binary.conversion(decimal);

    }


}
