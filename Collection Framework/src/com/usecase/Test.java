package com.usecase;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContactBook book = new ContactBook();
        int choice;

        while (true) {
            System.out.println("********************************");
            System.out.println("********** ContactBook *********");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Show Contacts");
            System.out.println("6. Exit");
            System.out.println("********************************");

            choice = sc.nextInt();
            sc.nextLine(); //

            switch (choice) {

                case 1:
                    System.out.println("Enter email:");
                    String email = sc.nextLine();

                    System.out.println("Enter name:");
                    String name = sc.nextLine();

                    System.out.println("Enter phone:");
                    String phone = sc.nextLine();

                    Contact contact = new Contact(email, name, phone);
                    book.addContact(contact);
                    break;

                case 2:
                    System.out.println("Enter phone:");
                    phone = sc.nextLine();
                    book.removeContact(phone);
                    break;

                case 3:
                    
                    System.out.println("Enter phone:");
                    phone = sc.nextLine();
                    book.searchContact(phone);
                    break;


                case 4:
                	System.out.println("Enter email:");
                    email = sc.nextLine();

                    System.out.println("Enter name:");
                    name = sc.nextLine();

                    System.out.println("Enter phone:");
                    phone = sc.nextLine();

                    contact = new Contact(email, name, phone);
                    book.updateContact(contact);
                    break;

                case 5:
                    book.showContact();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
