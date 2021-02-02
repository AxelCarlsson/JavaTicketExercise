package proj3;

import java.util.Scanner;

public class Ticket {

    Passenger passengerVariable = new Passenger();
    Scanner scanner = new Scanner(System.in);

    int ticketType;
    private String receipt;
    String ticketAgeGroup;

    // Getters och setters för variabeln receipt
    public String getReceipt() {
        return receipt;
    }

    // Metod som endast accepterar siffror. Matas fel värde in visas felmeddelandet.
    public void validateInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("\nFel val. \nVar god välj ett av alternativen.");
            scanner.next();
        }
    }

    // bestämmer priset beroende på åldersgrupp
    public void collectPassenger() {

        // Efterfrågar passagerarens ålder
        System.out.println("\nVälj 1 för ålder 0-17 år. \nVälj 2 för ålder 18-65 år. \nVälj 3 för ålder 65+ år.");

        // loop för att förhindra fel inmatning
        for (int i = 0; i < 1;) {

            validateInput();

            // inmatningen bestämmer åldersgruppen
            // setter
            passengerVariable.setAge(scanner.nextInt());

            // intierar variabeln ticketAgeGroup, åldersgrupp vald och priserna skrivs ut
            switch (passengerVariable.getAge()) {
                case 1:
                    ticketAgeGroup = ", barn";
                    i = 1; // Väljer användaren 1 avslutas loopen
                    System.out.println("\nBarnbiljett vald. \nEnkelbiljett: 20 kr. \nMånadskort: 450 kr.");
                    break;
                case 2:
                    ticketAgeGroup = ", vuxen";
                    i = 1; // Väljer användaren 2 avslutas loopen
                    System.out.println("\nVuxenbiljett vald. \nEnkelbiljett: 35 kr. \nMånadskort: 600 kr.");
                    break;
                case 3:
                    ticketAgeGroup = ", senior";
                    i = 1; // Väljer användaren 3 avslutas loopen
                    System.out.println("\nSeniorbiljett vald. \nEnkelbiljett: 20 kr. \nMånadskort: 450 kr.");
                    break;

                // Väljer användaren en annan siffra dyker felmeddelandet upp och loopen startar om
                default:
                    i = 0;
                    System.out.println("\nFel val. \nVar god välj alternativ 1, 2 eller 3");
            }
        }
    }

    // bestämmer enkelbiljett eller månadsbiljett
    public void collectTicket() {

        System.out.println("\nVälj 1 för enkelbiljett. \nVälj 2 för månadskort.");
        int j = 1;
        while (j == 1) {

            validateInput();

            // Användaren väljer 1 för enkelbiljett och 2 för månadsbiljett
            ticketType = scanner.nextInt();

            // initierar receipt
            if (ticketType == 1) {
                receipt = "Enkelbiljett";
                j = 0; // lopet kommer att avslutas
            } else if (ticketType == 2) {

                j = 0; // Lopet kommer att avslutas
                receipt = "Månadskort";
            } else {
                j = 1; // Loopen körs om, såvida användaren inte väljer 1 eller 2
                System.out.println("\nFel val. \nVar god välj alternativ 1 eller 2.");
            }
        }
    }
}