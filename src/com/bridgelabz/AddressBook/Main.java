package com.bridgelabz.AddressBook;

import com.bridgelabz.AddressBook.AddressBook;
import com.bridgelabz.AddressBook.AddressBookService;
import com.bridgelabz.AddressBook.Person;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("<-Welcome to Address Book->");
        AddressBookService addressBookService = new AddressBookService();
        addressBookService.addPerson(addressBookService);

        // Display the address book after adding the first person
        System.out.println("Address Book after adding the first person:");
        AddressBook addressBook;
        addressBook = null;
        for (Person person : addressBook.contactList.values()) {
            System.out.println(addressBookService.display(person));
        }

        // Add a second person to the address book
        addressBook.addPerson(addressBookService);

        // Display the address book after adding the second person
        System.out.println("Address Book after adding the second person:");
        for (Person person : addressBook.contactList.values()) {
            System.out.println(addressBookService.display(person));
        }

        // Delete a person by name
        addressBook.deletePersonByName();

        // Display the updated address book
        System.out.println("Address Book after deleting a person:");
        for (Person person : addressBook.contactList.values()) {
            System.out.println(addressBookService.display(person));
        }


        // Edit an existing contact by name
        addressBook.editContactByName(addressBookService);

        // Display the updated address book
        System.out.println("Address Book after editing a contact:");
        for (Person person : addressBook.contactList.values()) {
            System.out.println(addressBookService.display(person));
    }
        }}

