package session3.lab;

import java.util.Scanner;

public class Car {
    String make;
    String model;
    short year;
    int price;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a car make/Name:");
        String make = scanner.nextLine();

        System.out.println("Enter a car model:");
        String model = scanner.nextLine();

        System.out.println("Enter a car year:");
        short year = scanner.nextShort();

        System.out.println("Enter a car Price:");
        int price = scanner.nextInt();

        Car mycar = new Car(make,model,year,price);

        mycar.displayCar();

        scanner.close();

    }
    // for taking all attributes here is Constructor
    public Car(String make, String model, short year, int price){
        this.make = make;
        this.model = model;
        this.year= year;
        this.price = price;
    }

    // To Display details of CAr

    public void displayCar(){
        System.out.println("Car details: ");
        System.out.println("make: "+ make);
        System.out.println("model:"+ model);
        System.out.println("Year: "+ year);
        System.out.println("Price: "+ price);
    }


}
