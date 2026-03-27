package com.usecase2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			ContactBook book = new ContactBook();
			int choice;
			while(true) {
				System.out.println("**************************************");
				System.out.println("**************************************");
				System.out.println("**********  Contact Book  ************");
				System.out.println("**************************************");
				System.out.println("**************************************");
				System.out.println("*********  1. Add Contact  ***********");
				System.out.println("*********  2. Search Contact  ********");
				System.out.println("*********  3. Update Contact  ********");
				System.out.println("*********  4. Remove Contact  ********");
				System.out.println("*********  5. Show Contact  **********");
				System.out.println("******  6. Show Phone Numbers  *******");
				System.out.println("***********  7. EXIT  ****************");
				System.out.println("**************************************");
				System.out.println("**************************************");
				choice = obj.nextInt();
				switch(choice) {
				case 1:
					
					System.out.println("Enter email");
					String email = obj.next();
					System.out.println("Enter Name");
					String name = obj.next();
					System.out.println("Enter mobile number");
					String phone = obj.next();
					Contact contact = new Contact(email,name,phone);
					book.addContact(contact);
					break;
					
				case 2:
					System.out.println("To Search Contact, give the phone number");
					phone = obj.next();
					book.searchContact(phone);
					break;
				case 3:
					System.out.println("To update the contact, give email, name, phone number");
					 email = obj.next();
					 name = obj.next();
				     phone = obj.next();
					 contact = new Contact(email,name,phone);
					 
					book.updateContact(contact);
					break;
				case 4:
					System.out.println("To remove Contact, give phone number");
					phone = obj.next();
					book.removeContact(phone);
					break;
				case 5:
					System.out.println("These are the list of Contacts");
					book.showContacts();
					break;
				case 6:
					System.out.println("These are the list of Phone Numbers");
					book.showPhoneNumbers();
					break;
				case 7:
					return;
					
				}
				
			}
		}
		

	}

}