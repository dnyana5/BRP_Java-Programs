package com.bridgelabz.day3;

import java.util.Scanner;

public class DayOfWeek {
    static int m,y,d;
    static Scanner sc = new Scanner(System.in);
    private static void printDaysOfWeek(int d0,int d, int m, int y) {
        System.out.println("The day fall on "+d+"/"+m+"/"+y+" is ");
        switch (d0){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
    static {
        System.out.println("1.January  2.February  3.March  4.April  5.May  6.June  7.July  8.August  9.September" +
                "  10.October  11.November  12.December ");
        System.out.println("Enter month:");
        m = sc.nextInt();
        System.out.println("Enter date:");
        d=sc.nextInt();
        System.out.println("Enter year:");
        y=sc.nextInt();

    }
    public static void main(String[] args) {

        int y0,x,m0,d0;
        y0=y-(14-m)/12;
        x=y0 + (y0 /4)-(y0/100)+(y0/400);
        m0=m+12 *((14-m)/12)-2;
        d0=(d+x+(31*m0)/12)%7;
        DayOfWeek.printDaysOfWeek(d0,d,m,y);

    }

}
