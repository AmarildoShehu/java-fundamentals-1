package org.learning;

import java.util.Scanner;

public class TicketCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci numero chilometri: ");
        int kilometers = scanner.nextInt();

        System.out.print("Inserisci la tua eta': ");
        int age = scanner.nextInt();

        scanner.close();

        // Calcolo prezzo base
        double basePrice = kilometers * 0.21;
        double finalPrice = basePrice;

        //Sconto in aìbase all'età
        if (age < 18) {
            //sconto 20%
            finalPrice = basePrice * 0.8;
        } else if (age > 65) {
            //sconto 40%
            finalPrice = basePrice * 0.6;
        }

        System.out.println("Il prezzo finale del biglietto è: " + finalPrice + " €");
    }
}
