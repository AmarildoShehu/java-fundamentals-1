package org.learning;

public class FavoriteFoods {
    public static void main(String[] args) {
        //array con il cibo preferito
        String[] favoriteFoods = {"Pizza", "Lasagna", "Sushi","Tiramisù", "Gelato"};

        //Stampo cibi preferiti
        System.out.println("Numero cibi preferiti: " + favoriteFoods.length);

        //Stampa cibo preferito
        System.out.println("Il mio cibo preferito è il/la: " +favoriteFoods[0]);

        //stampa  cibo preferito ma non troppo (ultima posizione della classifica)
        System.out.println("preferito ma non troppo :" +favoriteFoods[4]);

        //il cibo di mezza classifica, cioè che si trova nella posizione mediana
        System.out.println("il cibo nel mezzo è: " +favoriteFoods[2]);


    }
}
