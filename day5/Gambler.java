package com.bridgelabz.day5;

import java.util.Scanner;

public class Gambler {

    private static void startGame(int gambler, int end) {
        int win=0,lose=0;
        while (gambler > 0 && gambler < end){
            int random = (int) Math.floor(Math.random()*10) %2;
            if(random == 1){
                System.out.println("W");
                gambler++;
                win++;
            }
            else {
                System.out.println("l");
                gambler--;
                lose++;
            }
        }
        System.out.println("Gambler win="+win+" lose="+lose);
    }
    public static void main(String[] args) {
        int gambler,end;
        Scanner sc = new Scanner(System.in);
        System.out.println("l");
        gambler=sc.nextInt();
        System.out.println("l");
        end=sc.nextInt();
        Gambler.startGame(gambler,end);

    }

}
