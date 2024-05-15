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

        System.out.println("Price Base: " + basePrice + " €");
    }
}
