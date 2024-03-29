package ru.phonebook.service;

import ru.phonebook.Main;
import ru.phonebook.Reader;
import ru.phonebook.models.Address;
import ru.phonebook.models.Contact;
import ru.phonebook.models.User;

public class ServiceMenuAdd {

    public static void add() {

        System.out.println("Введите имя чей номер");
        String name = Reader.readline();
        System.out.println("Введите фамилию чей номер");
        String surname = Reader.readline();
        System.out.println("Введите номер телефона,который нужно добавить в справочник");
        int phone = Reader.readDigital();
        User user = new User(name, surname);

        System.out.println("Введите название улицы");
        String nameStreet = Reader.readline();
        System.out.println("Введите номер дома");
        int numberHouse = Reader.readDigital();
        Address address = new Address(nameStreet, numberHouse);
        Contact contact = new Contact(user, address, phone);

        Main.contactList.add(contact);

    }

    public static void allPrintContact() {
        if (Main.contactList.isEmpty()) {
            System.out.println("Список пуст");
            System.out.println();
        } else {
            for (Contact contact : Main.contactList) {
                System.out.println(contact);
            }
        }
    }

}
