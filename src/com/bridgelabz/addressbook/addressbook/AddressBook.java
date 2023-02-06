package com.bridgelabz.addressbook.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static ArrayList<UserContactInfo> infoArrayList = new ArrayList<>();
    UserContactInfo user1 = new UserContactInfo();

    public void addContact() {

        System.out.println("Add new contact to the AddressBook: ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        user1.setFirstName(scanner.nextLine());

        System.out.print("Enter last name: ");
        user1.setLastName(scanner.nextLine());

        System.out.print("Enter locality name: ");
        user1.setLocality(scanner.nextLine());

        System.out.print("Enter city name: ");
        user1.setCity(scanner.nextLine());

        System.out.print("Enter state name: ");
        user1.setState(scanner.nextLine());

        System.out.print("Enter email: ");
        user1.setEmail(scanner.nextLine());

        System.out.print("Enter zip: ");
        user1.setZip(scanner.nextInt());

        System.out.print("Enter mobile number: ");
        user1.setNumber(scanner.nextLong());

        System.out.println("Details of User" + "\n" + "FirstName = " + user1.getFirstName() + "\n" + "LastName = "
                + user1.getLastName() + "\n" + "Locality = " + user1.getLocality() + "\n" + "City = " + user1.getCity()
                + "\n" + "State = " + user1.getState() + "\n" + "Email =" + user1.getEmail() + "\n" + "Zip ="
                + user1.getZip() + "\n" + "Number = " + user1.getNumber());

        infoArrayList.add(user1);
    }

    public void editContact() {
        UserContactInfo contactInfo = new UserContactInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of contact you want to edit : ");
        String firstName = scanner.next();
        if (firstName.equals(user1.getFirstName())) {
            user1 = contactInfo;
        } else {
            System.out.println("No contact found");
            System.out.println("Add the contact if need press 1 or 0 to stop");
            if (scanner.nextInt() == 1) {
                addContact();
                editContact();
            } else if (scanner.nextInt() == 0) {
                return;
            }
            return;
        }
        System.out.println("Enter value of data you want to edit. 1:Name 2:Last Name 3:Locality 4:City 5:State 6:Email 7:Zip 8:Mobile");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter new name: ");
                contactInfo.setFirstName(scanner.next());
                break;

            case 2:
                System.out.print("Enter new last name: ");
                contactInfo.setLastName(scanner.next());
                break;

            case 3:
                System.out.print("Enter new  locality name: ");
                contactInfo.setLocality(scanner.next());
                break;

            case 4:
                System.out.print("Enter new city name: ");
                contactInfo.setCity(scanner.next());
                break;

            case 5:
                System.out.print("Enter new state name: ");
                contactInfo.setState(scanner.next());
                break;

            case 6:
                System.out.print("Enter new email: ");
                contactInfo.setEmail(scanner.next());
                break;

            case 7:
                System.out.print("Enter new zip: ");
                contactInfo.setZip(scanner.nextInt());
                break;

            case 8:
                System.out.print("Enter new mobile number: ");
                contactInfo.setNumber(scanner.nextLong());
                break;
            //}
        }
    }

    public void deleteContact() {
        System.out.println("Name the contact you want to delete = ");
        Scanner scanner = new Scanner(System.in);
        String firstName1 = scanner.next();
        if (firstName1.equals(user1.getFirstName())) {
            infoArrayList.remove(user1);
            System.out.println("Contact deleted");
        } else {
            System.out.println("No contact found");
            System.out.println("Add the contact if need press 1 or 0 to stop");
            if (scanner.nextInt() == 1) {
                addContact();
                deleteContact();
            } else if (scanner.nextInt() == 0) {
                return;
            }
        }
    }
}
