package com.adi.phonebook;

import java.util.ArrayList;
import java.util.List;

class PhoneBook {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void updateContact(String name, String newPhoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contact.setPhoneNumber(newPhoneNumber);
                System.out.println("Contact updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void deleteContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contacts.remove(contact);
                System.out.println("Contact deleted successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void searchContact(String pattern) {
        System.out.println("Search results:");
        for (Contact contact : contacts) {
            if (contact.getName().contains(pattern) || contact.getPhoneNumber().contains(pattern)) {
                System.out.println(contact);
            }
        }
    }
}
