package com.bridgelabz.day3;

import java.util.Scanner;

public class WindChill {
     static void calculateTemperature(int t, int v) {
        // calculating wind chill(effective Temperature)
        double w = (35.74 + 0.6215 * t + (0.4275 * t - 35.75) * (Math.pow(v, 0.16)));
        System.out.print("Effective Temperature(wind chill) is = " + Math.round(w) + "\u2109");
    }
    public static void main(String[] args) {
        int t,v;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Temperature below 120 Fahrenheit:");
        t  = scan.nextInt();
        System.out.println("Enter wind speed below 50 mph:");
         v = scan.nextInt();
       WindChill.calculateTemperature(t,v);

    }

}
