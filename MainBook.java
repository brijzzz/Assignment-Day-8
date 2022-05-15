package com.bridgelabz.AddressBook;

public class MainBook {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Program");
        AddressBook ad = new AddressBook();
        ad.getContact();
        ad.editContact();
        for (Contacts c:ad.lc) {
            System.out.println(c);


        }
    }
}
