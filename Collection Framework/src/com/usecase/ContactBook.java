package com.usecase;
import java.util.ArrayList;

public class ContactBook {
	ArrayList<Contact>contacts;
	public ContactBook() {
		contacts =new ArrayList<Contact>();
		
	}
	public void addContact(Contact contact) {
		
		if(contacts.contains(contact.getPhone())) {
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
//		        contacts.put(contact.getPhone(),contact);
		        System.out.println(contacts);
		        System.out.println("Contact Added Sucessfully");
			}
		}
	}
			
			
//			contacts.add(contact);
//			System.out.println("............");
//		}
//		
//		
//	}
   public void removeContact(String phone) {
	   for(Contact contact: contacts) {
			if(contact.getPhone().equals(phone)) {
				contacts.remove(contact);
				System.out.println("contact removed successfully..........");
				return;
			}
		}
	   System.out.println("no contact found.........");
	   
	   
	   
	   
   }
   public void searchContact(String phone) {
	  

	        for (Contact contact : contacts) {
	            if (contact.getPhone().equals(phone)) {
	                System.out.println(contact);
	                return;
	            }
	        }
	        System.out.println("No Contact Found");
	    }
	   
	   
	   
	   
	   
	   
//	   for(Contact contact: contacts) {
//			if(contact.getPhone().equals(phone)) {
//				System.out.println(contact);
//				return;
//			}
//		}
//	   System.out.println("no contact found.........");  
//   }
   
   
   
   
public void updateContact(Contact contact) {
	
	
	for (int i = 0; i < contacts.size(); i++) {
	
		if (contacts.get(i).getPhone().equals(contact.getPhone())) {
	
	        if (contact.getEmail() == null || !contact.getEmail().contains("@")) {
	            System.out.println("Invalid Email");
	            return;
	        }
	        else if (contact.getPhone() == null || contact.getPhone().length() != 10) {
	            System.out.println("Mobile Number Should be exactly 10 digits");
	            return;
	        }
	        else if (contact.getName() == null || contact.getName().trim().equals("")) {
	            System.out.println("Invalid Name");
	            return;
	        }
	
	        contacts.set(i, contact);
	        System.out.println("Contact Updated Successfully");
	        return;
	    }
	}
		System.out.println("Contact number not found");
		}

//	for(Contact sc: contacts) {
//		if(sc.getPhone().equals((contact.getPhone()))) {
//			int index = contacts.indexOf(sc);
//			contacts.set(index, contact);
//			System.out.println(contact);
//			return;
//		}
//	}
//   System.out.println("no contact found.........");   
  //}




public void showContact() {
	for(Contact contact: contacts) {
		System.out.println(contact);
	}
	
   }
}
