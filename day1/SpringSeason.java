package com.bridgelabz.day1;

import java.util.Scanner;

public class SpringSeason {
    private static void printSpringSeason(int month, int day) {
        boolean Spring =
                (month == 3 && day >= 20 && day <= 31)
                        || (month == 4 && day >=  1 && day <= 30)
                        || (month == 5 && day >=  1 && day <= 31)
                        || (month == 6 && day >=  1 && day <= 20);

        System.out.println(Spring);
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter month and day");
            int month = sc.nextInt();
            int day   = sc.nextInt();
            SpringSeason.printSpringSeason(month,day);

        }

}


