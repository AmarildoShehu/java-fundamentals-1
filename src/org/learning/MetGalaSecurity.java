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

        // Verifica se il nome e presente
        boolean isInvited = false;
        for (String guest : guestList) {
            if (guest.equalsIgnoreCase(userName)) {
                isInvited = true;
                break;
            }
        }

        //Mostra in console se puo entrare o meno
        if (isInvited){
            System.out.println("Benvenuto al Met Gala ");
        } else {
            System.out.println("Mi dispiace non fai parte della lista degli invitati");
        }
        // chiudo lo scan
        scanner.close();

    }
}
