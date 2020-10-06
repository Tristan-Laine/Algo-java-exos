package com.company;

public class Compteàrebours {

    static void countDownRecursive(int start){
        if (start > 0){
            System.out.println(start + "...");
            countDownRecursive(start - 1);
        } else {
            System.out.println("FINISHED!");
        }
    }
    public static void main(String[] args) {
        countDownRecursive(3);
    }
}
