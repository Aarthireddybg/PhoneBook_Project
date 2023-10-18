package com.adi.phonebook;

import java.util.Scanner;

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPhoneBook Application Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the contact phone number: ");
                    String phoneNumber = scanner.nextLine();
                    Contact newContact = new Contact(name, phoneNumber);
                    phoneBook.addContact(newContact);
                    break;

                case 2:
                    System.out.print("Enter search pattern: ");
                    String searchPattern = scanner.nextLine();
                    phoneBook.searchContact(searchPattern);
                    break;

                case 3:
                    System.out.print("Enter the contact name to update: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter the new phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    phoneBook.updateContact(updateName, newPhoneNumber);
                    break;

                case 4:
                    System.out.print("Enter the contact name to delete: ");
                    String deleteName = scanner.nextLine();
                    phoneBook.deleteContact(deleteName);
                    break;

                case 5:
                    System.out.println("Exiting PhoneBook Application.");
                    System.exit(0);
                    scanner.close();
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
