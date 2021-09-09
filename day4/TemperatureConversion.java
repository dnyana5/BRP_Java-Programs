package com.bridgelabz.day4;
import java.util.Scanner;

public class TemperatureConversion {
   static Scanner sc = new Scanner(System.in);
    private static void conversion(int choice) {
        switch (choice){
            case 1:
                System.out.println("Enter Temperature in Celsius:");
                double c = sc.nextInt();
                double f = 32+(c * 9/5);
                System.out.println("Temperature in Fahrenheit:"+f+"\u2109");
                break;
            case 2:
                System.out.println("Enter Temperature in Fahrenheit:");
                f = sc.nextInt();
                c = (f-32)* 5/9;
                System.out.println("Temperature in Celsius:"+c+"\u2103");
                break;
            default:
                System.out.println("Enter valid choice");
        }
    }
    public static void main(String[] args) {

        System.out.println("1:Celsius to Fahrenheit Conversion\n" +
                           "2:Fahrenheit to Celsius Conversion");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        TemperatureConversion.conversion(choice);
    }
}
