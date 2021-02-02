package proj3;

import java.util.ArrayList;
import java.util.Scanner;

public class Passenger {

    ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
    Scanner scanner = new Scanner(System.in);

    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    // Skapar en passagerare som objekt och läggs till i listan
    public void createPassenger() {
        System.out.println("\nVar god mata in passagerarens för- och efternamn.");
        name = scanner.nextLine();
        Passenger passengerName = new Passenger(name);
        passengerList.add(passengerName);
    }

    // konstruktor som endast tillåter inmatning av namn
    public Passenger(String name) {
        this.name = name;
    }

    // Overloadar metoden
    public Passenger() {
    }

    // översätter till läsbar text
    @Override
    public String toString() {
        return name;
    }
}