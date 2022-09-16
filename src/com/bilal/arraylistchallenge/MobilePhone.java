package com.bilal.arraylistchallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    String name;

    public MobilePhone(String name) {
        this.name = name;
    }

    private static ArrayList<Contacts> contacts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("Enter the number corresponding to the feature: ");
        System.out.println("0: Print the menu items");
        System.out.println("1: Print the list of contacts");
        System.out.println("2: Add a new contact");
        System.out.println("3: Update existing contact");
        System.out.println("4: Search for a contact");
        System.out.println("5: remove a contact");
        System.out.println("6: Remove all contacts");
        System.out.println("7: Quit");
        processTheChoice();
    }
    public void processTheChoice() {
        boolean quit = false;
        int choice = 0;
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    showMenu();
                    break;
                case 1:
                    printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    clearContacts();
                    break;
                case 7:
                    quit = true;
                    break;
                default:
                    System.out.println("You have entered an invalid value.");
                    showMenu();
            }
        }
    }

    public void printContactList() {
        return;
    }

    public void addContact() {
        return;
    }

    public void updateContact() {
        return;
    }

    public void removeContact() {
        return;
    }

    public void searchContact() {
        return;
    }

    public void clearContacts() {
        return;
    }

}
