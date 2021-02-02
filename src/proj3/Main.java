package proj3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Passenger passenger = new Passenger();
        Ticket ticket = new Ticket();

        // Variabel för while-loopen
        int k = 1;
        //Loop för att lägga till passagerare, visa passagerarlistan eller avsluta programmet
        while(k==1) {

            // Visar alternativen
            System.out.println("\nVälj 1 för att lägga till passagerare. \nVälj 2 för att se passagerarlistan.\nVälj 3 för att avsluta programmet.");

            // initierar mainvariable efter användarens val
            int mainVariable = scanner.nextInt();

            //
            switch (mainVariable) {

                    // Passagerare läggs till och kvitto skrivs ut
                    case 1:
                        passenger.createPassenger();
                        ticket.collectPassenger();
                        ticket.collectTicket();
                        System.out.println("\nNamn: " + passenger.getName() + "\n" + ticket.getReceipt() + ticket.ticketAgeGroup);
                        k = 1;
                        break;
                    // Skriver ut passagerarlistan
                    case 2:
                        System.out.println("\nPassagerarlista:\n" + passenger.passengerList);
                        k = 1;
                        break;
                    // Skriver ut passagerarlistan och avslutar programmet
                    case 3:
                        System.out.println("\nPassagerarlista : " + passenger.passengerList + "\nProgrammet avslutas");
                        k = 0;
                        break;
                    // felmeddelande om användaren matar in fel siffra
                    default:
                        System.out.println("\nFel val. \nVar god välj alternativ 1, 2 eller 3");
                        k = 1;
            }
        }
    }
}