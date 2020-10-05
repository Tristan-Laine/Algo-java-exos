package com.company;

public class Main {

    

    public static void main(String[] args) {
	// write your code here

    int[] scores = new int [7];
        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 30;
        scores[3] = 40;
        scores[4] = 50;
        scores[5] = 60;
        scores[6] = 70;


    for(int i = 0; i < scores.length; i++) {
        int score1= scores[i];

        System.out.println("score "+(i+1) +" = "+score1);
    }

    int moyenne = 0;
    for (int i = 0; i < scores.length; i++) {
        moyenne = moyenne + scores[i];
    }
        moyenne = moyenne / 7;
        System.out.println("Moyenne = " + moyenne);
    }
}
