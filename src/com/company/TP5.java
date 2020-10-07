package com.company;

public class TP5 {

    /**
     * Fonction qui renvoie l'index de la case contenant
     * le nombre demandé (en recherche binaire) dans un tableau
     *
     * @param Tableau
     * @param A
     * @return
     */

    /*Fonction qui renvoie l'index de la case contenant
      le nombre demandé (en recherche binaire) */
    public static int RechercheBinaire(int[] Tableau, int A, int Indexmin, int Indexmax) {
        if (Indexmax >= Indexmin) {
            int Indexmid = (Indexmin + Indexmax) / 2;

            if (A == Tableau[Indexmid]) {
                return Indexmid;
            }
            if (A < Tableau[Indexmid]) {
                return RechercheBinaire(Tableau, A, Indexmin, Indexmid - 1);
            }
                return RechercheBinaire(Tableau, A, Indexmid + 1, Indexmax);

        }
        return -1;
}

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

        int min = 0;
        int max = scores.length;
        int IndexNum;
        IndexNum = RechercheBinaire(scores,71,min,max);

        System.out.println(IndexNum);

        
    }
}
