package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone myPhone = new CellPhone();

        // Prompt user for cell phone information
        System.out.print("What is the serial number? ");
        int serialNumber = Integer.parseInt(scanner.nextLine());
        myPhone.setSerialNumber(serialNumber);

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        myPhone.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        myPhone.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        myPhone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        myPhone.setOwner(owner);

        // Print the phone properties using getters
        System.out.println("\n--- Phone Details ---");
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());

        scanner.close();
    }
}