package com.bridgelabz.addressbook.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    static final int ADD_CONTACT = 1;
    static final int EDIT_CONTACT = 2;
    static final int DELETE_CONTACT = 3;
    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDRESS BOOK SYSTEM");
        System.out.println("Make choice" + '\n' + "1. Add contact" + '\n' + "2. Edit contact"  + '\n' + "3: Delete Contact");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case ADD_CONTACT:
                AddressBook addContact = new AddressBook();
                addContact.addContact();
                break;

            case EDIT_CONTACT:
                AddressBook editContact = new AddressBook();
                editContact.editContact();
                break;

            case DELETE_CONTACT:
                AddressBook deleteContact = new AddressBook();
                deleteContact.deleteContact();
                break;
        }
    }
}
