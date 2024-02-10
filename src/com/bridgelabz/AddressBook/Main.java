package com.bridgelabz.AddressBook;

import com.bridgelabz.AddressBook.AddressBook;
import com.bridgelabz.AddressBook.AddressBookService;
import com.bridgelabz.AddressBook.Person;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        AddressBookService s1 = new AddressBookService();
        s1.setValues(p1);
        System.out.println(s1.display(p1));
        AddressBook a1 = new AddressBook();
        a1.contactList.put(1,p1);
        System.out.println(a1.contactList);
    }
        }

