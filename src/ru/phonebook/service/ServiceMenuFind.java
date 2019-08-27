package ru.phonebook.service;

import ru.phonebook.Main;
import ru.phonebook.Reader;
import ru.phonebook.models.Contact;

public class ServiceMenuFind {
    public static void findSurname() {
        if (Main.contactList.isEmpty()) {
            System.out.println("Список пуст");
            System.out.println();
        } else {
            System.out.println("Введите фамилию, который хотите найти");
            String surnameFind = Reader.readline();
            boolean isFind = false;
            for (Contact contact : Main.contactList) {
                if (surnameFind.equals(contact.getUser().getSurname())) {
                    System.out.println(contact);
                    isFind = true;
                }
            }
            if (!isFind) {
                System.out.println("Данной фамилии не найдено");
            }

        }
    }

    public static void findAddress() {
        if (Main.contactList.isEmpty()) {
            System.out.println("Список пуст");
            System.out.println();
        } else {
            System.out.println("Введите адрес, который хотите найти");
            String addressFind = Reader.readline();
            boolean isFind = false;
            for (Contact contact : Main.contactList) {
                if (addressFind.equals(contact.getAddress().getNameStreet())) {
                    System.out.println(contact);
                    isFind = true;

                }
            }
            if (!isFind) {
                System.out.println("Данного адреса не найдено");
            }
        }
    }

    public static void findNumberPhone() {
        if (Main.contactList.isEmpty()) {
            System.out.println("Список пуст");
            System.out.println();
        } else {
            System.out.println("Введите любые цифры по порядку из номера телефона, который ищите");
            String numberPhoneFind = Reader.readline();
            boolean isFind = false;
            for (Contact contact : Main.contactList) {
                String numberPhone = String.valueOf(contact.getNumberPhone());
                if (numberPhone.contains(numberPhoneFind)) {
                    System.out.println(contact);
                    isFind = true;
                }
            }
            if (!isFind) {
                System.out.println("Не верный ввод");
            }
        }
    }

}
