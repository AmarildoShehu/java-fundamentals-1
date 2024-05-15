package org.learning;

import java.util.Scanner;

public class MetGalaSecurity {
    public static void main(String[] args) {

        //lista array di persone
        String[] guestList = {
                "Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny",
                "Cara Delevingne", "Kendall Jenner", "Uma Thurman",
                "Damiano David", "Luca Guadagnino"
        };

        //Chiedere all'utente il nome
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String userName = scanner.nextLine();

        //chiudo lo scan
        scanner.close();

    }
}
