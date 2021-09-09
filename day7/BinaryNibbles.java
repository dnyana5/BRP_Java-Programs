package com.bridgelabz.day7;

import java.util.Scanner;

public class BinaryNibbles {
    private static void decimalToBinary(int decimal) {
        int temp=1,reminder,binary=0;
     while(decimal !=0)
        {
            reminder = decimal % 2;
            decimal = decimal / 2;
            binary = binary + reminder * temp;
            temp = temp * 10;
        }
        System.out.println("The Binary Number is : "+binary);
        binaryToDecimal(binary);
    }
    private static void binaryToDecimal(int binary) {
        int reminder2,decimal2=0,i=0;

        while(binary !=0)
        {
            reminder2 = binary % 10;
            binary = binary / 10;
            decimal2 = (int) (decimal2 + reminder2 * Math.pow(2,i));
            i++;
        }
        System.out.println("The Decimal Number is : "+decimal2);


    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal;
        System.out.println("Enter a Decimal Number : ");
        decimal = sc.nextInt();
        BinaryNibbles.decimalToBinary(decimal);

    }
}
