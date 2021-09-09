package com.bridgelabz.day1;

import java.util.Scanner;

public class PrintThreeNames {
    private static void stringReverse(String[] name) {
        System.out.println("original String:"+name[0]+","+name[1]+","+name[2]);
        if(name.length==3){
            String temp=name[0];
            name[0]=name[2];
            name[2]=temp;
        }
        System.out.println("Reverse String:");
        System.out.println("Hi "+name[0]+","+name[1]+",And "+name[2]);
    }
    public static void main(String[] args) {
        int totalNames = 3;
        Scanner sc = new Scanner(System.in);
        String[] name = new String[totalNames];
        System.out.println("Enter three names:");
        for(int i=0;i<name.length;i++){
            name[i]= sc.next();
        }
        PrintThreeNames.stringReverse(name);

    }

}
