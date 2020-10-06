package com.company;

public class Main {
    /**
     * Fonction qui renvoie le score du tableau
     * @param Score
     */

    //Fonction qui renvoie le score
    public static void FonctionScore (int [] Score ) {            //Création fonctionScore
        for (int i = 0; i < Score.length; i++) {          //Création boucle for
            int score1 = Score[i];                        //Score1 prend la valeur du tableau en i

            System.out.println("Fonction score " + (i + 1) + " = " + score1); //on dis le score
        }
    }

    /**
     * Fonction qui renvoie le score moyen du tableau
     * @param Moy
     */

    //Fonction qui renvoie le score moyen
    public static void FonctionMoyenne (int [] Moy ){           //Création fonctionMoyenne
            int moyenne = 0;                                //on crée la variable moyenne
            for (int i = 0; i < Moy.length; i++) {          //Création boucle for
                moyenne = moyenne + Moy[i];                 //la varible moyenne prend sa valeur + la valeur Moy en i
            }
            moyenne = moyenne / 7;                          //on divise moyenne par le nombre totale de valeur dans le tableau
            System.out.println("Fonction Moyenne = " +moyenne); //on dis la moyenne
        }

    /**
     * Fonction qui renvoie le plus grand nombre du tableau
     * @param Nombre
     * @return
     */

    //Fonction qui renvoie le plus grand nombre
    public static int FonctionPlusGrandNB (int [] Nombre ){     //Création fonctionPlusGrandNB
        int PlusGrandNB = 0;                                //on crée la variable PlusGrandNB
            for (int i = 0; i < Nombre.length; i++) {       //Création boucle for
                if (PlusGrandNB < Nombre[i]){               //si PlusGrandNB plus petit que Nombre[i] (valeur du tableau en i)
                    PlusGrandNB = Nombre[i];                //alors PlusGrandNB prend la valeur de Nombre en i
                }
            }
        return PlusGrandNB;                                 //on return PlusGrandNB
        }

    /**
     * Fonction qui renvoie true si une valeur est plus petite que 10
     * @param Valeur
     * @return
     */

    //Fonction qui renvoie true si une valeur est plus petite que 10
    public static boolean FonctionValeur10 (int [] Valeur ){    //Création FonctionValeur10
            boolean BoolValeur = false ;                    //Création du boolean BoolValeur
            for (int i = 0; i < Valeur.length; i++){        //Création d'une boucle for
                if (Valeur[i] < 10){                        //si la valeur en i du tableau est plus petit que 10
                    BoolValeur = true;                      //le boolean BoolValeur prend true
                }
            }
        return BoolValeur;                                  //on return BoolValeur
        }






    public static void main(String[] args) {
        // write your code here

        //Création d'un Tableau scores
        int[] scores = new int[7];
        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 30;
        scores[3] = 40;
        scores[4] = 50;
        scores[5] = 60;
        scores[6] = 70;

        FonctionScore(scores);                              //on utilise la fonction Score
        FonctionMoyenne(scores);                            //on utilise la fonction Moyenne

        //on utilise la fonction du PlusGrandNB
        System.out.println("Le plus grand nombre = " + FonctionPlusGrandNB(scores));

        //on utilise la fonction du si un nombre plus petit de 10 alors on renvoie true
        if (FonctionValeur10(scores)) {
            System.out.println("Il y a un nombre > 10 = " + FonctionValeur10(scores));
        }
        else {
            System.out.println("Il n'y a pas un nombre > 10 = " + FonctionValeur10(scores));
        }


    }
}
