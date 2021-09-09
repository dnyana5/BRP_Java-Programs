package com.bridgelabz.day5;

import java.util.Scanner;

public class FlipCoin {
    private static void operation(int turns) {
        int i,head=0,tail=0;
        for(i=1;i<=turns;i++) {
            double random = Math.floor(Math.random() * 10) % 2;
            if(random == 1){
                System.out.println("turn "+i+" = Head");
                head++;
            }
            else {
                System.out.println("turn "+i+" = Tail");
                tail++;
            }

        }
        System.out.println("percentage of tail="+tail*100 / turns+" percentage of head="+head*100 /turns);

    }
    public static void main(String[] args) {
        int turns;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many turns you want to perform:");
        turns=sc.nextInt();
        FlipCoin.operation(turns);
    }
}
