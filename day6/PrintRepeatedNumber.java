package com.bridgelabz.day6;

public class PrintRepeatedNumber {
    public static void main(String[] args) {
        int array[]=new int[100];
        for(int i =0;i<100;i++){
            array[i]=i+1;
            if(array[i]== 11 || array[i]==22 ||array[i]==33||array[i]==44||array[i]==55
                            ||array[i]==66||array[i]==77||array[i]==88||array[i]==99){
                System.out.println(array[i]);
            }
        }
    }
}
