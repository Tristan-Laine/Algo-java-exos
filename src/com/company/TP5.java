package com.company;

public class TP5 {

    

    public static void main(String[] args) {

        //Création d'un Tableau scores
        int[] scores = new int[7];
        scores[0] = 1;
        scores[1] = 2;
        scores[2] = 3;
        scores[3] = 4;
        scores[4] = 50;
        scores[5] = 60;
        scores[6] = 70;

        int IndexNum;
        IndexNum = RechercheBinaire(scores,80);

        System.out.println(IndexNum);


    }
}
