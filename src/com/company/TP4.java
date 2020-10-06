package com.company;

public class TP4 {
    /**
     * Fonction qui renvoie l'index de la case contenant
     * le nombre demandé (en recherche binaire) dans un tableau
     * @param Tableau
     * @param A
     * @return
     */

    /*Fonction qui renvoie l'index de la case contenant
      le nombre demandé (en recherche binaire) */
    public static int RechercheBinaire (int [] Tableau, int A){
        int Index = -1;                             //index
        int Indexmin = 0;                           //index minimum
        int Indexmid;                               //index milieu
        int Indexmax = Tableau.length - 1;              //index maximum
        while (Indexmax >= Indexmin ){              //tant que l'indexmax > que l'indexmin
            Indexmid = (Indexmin + Indexmax) / 2;   //on prend le milieu entre le min et le max
            if (A == Tableau[Indexmid]){            //si A == au plus grand que le nombre avec l'index du milieu
                Index = Indexmid;                   // Index prend l'index du milieu
                return Index;                       //return index
            }
            else if (A < Tableau[Indexmid]){        //sinon si A < que le plus grand que le nombre avec l'index du milieu
                Indexmax = Indexmid - 1;            //indexmax prend l'index du milieu - 1
            }
            else if (A > Tableau[Indexmid]){        //sinon si A > que le plus grand que le nombre avec l'index du milieu
                Indexmin = Indexmid + 1;            //indexmin prend l'index du milieu + 1
            }
        }
        return Index;                               //return index (-1)
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

        int IndexNum;
        IndexNum = RechercheBinaire(scores,80);

        System.out.println(IndexNum);



    }
}
