package com.usecase2;

import java.util.HashMap;

//import java.util.ArrayList;

public class ContactBook {
	HashMap<String, Contact> contacts; //after this click ctrl space it will create this class
	public ContactBook() {
		
		contacts = new HashMap<String, Contact>();
	}
	public void addContact(Contact contact) {
		if(contacts.containsKey(contact.getPhone())) {
			System.out.println("Contact number already exist");
		}
		else {
			if(!contact.getEmail().contains("@")) {
				System.out.println("Invalid Email");
			}
			else if(!(contact.getPhone().length()==10)) {
				System.out.println("Mobile Number Should be exactly 10 digits");
			}
			else if(contact.getName().equals("") || contact.getName() == null) {
				System.out.println("Invalid Name");
			}
			else {
		        contacts.put(contact.getPhone(),contact);
		        System.out.println(contacts);
		        System.out.println("Contact Added Sucessfully");
			}
		}
	}
	public void removeContact(String phone) {
		if(phone.length() == 10) {
			if(contacts.containsKey(phone)) {
				contacts.remove(phone);
				System.out.println("Contact Deleted Successfully");
				//return;
				}
			else {
			System.out.println("No Contact Found");
			}
		}
		else {
			System.out.println("Mobile Number should be exactly 10 digits");
		}
		
    }
	public void searchContact(String phone) {
		if(contacts.containsKey(phone)) {
			Contact contact = contacts.get(phone);
			System.out.println(contact);
			//return;
			}
		else {
		System.out.println("No Contact Found");
		}
	}
	public void updateContact(Contact contact) {

	    if (!contacts.containsKey(contact.getPhone())) {
	        System.out.println("Contact number not found");
	    }
	    else {
	        if (contact.getEmail() == null || !contact.getEmail().contains("@")) {
	            System.out.println("Invalid Email");
	        }
	        else if (contact.getPhone() == null || contact.getPhone().length() != 10) {
	            System.out.println("Mobile Number Should be exactly 10 digits");
	        }
	        else if (contact.getName() == null || contact.getName().trim().equals("")) {
	            System.out.println("Invalid Name");
	        }
	        else {
	            contacts.replace(contact.getPhone(), contact);
	            System.out.println("Contact Updated Successfully");
	        }
	    }
	}
	
	
	
	public void showContacts() {
		for(Contact contact : contacts.values()) {
			System.out.println(contact);
		}
		
	}
	public void showPhoneNumbers() {
		for(String phone : contacts.keySet()) {
			System.out.println(phone);
		}
		
	}

}