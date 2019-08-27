package ru.phonebook.service;


import ru.phonebook.Main;
import ru.phonebook.Reader;
import ru.phonebook.models.Contact;

import java.util.ArrayList;
public class ServiceMenuDelete {

    public static void delete() {
        if (Main.contactList.isEmpty()) {
            System.out.println("Список пуст");
            System.out.println();
        } else {
            System.out.println("Введите номер телефона, который хотите удалить");
            int phoneDelete = Reader.readDigital();
            boolean isDelete = false;
            for (Contact contact : new ArrayList<>(Main.contactList)) {
                if (phoneDelete == contact.getNumberPhone()) {
                    Main.contactList.remove(contact);
                    System.out.println("Контакт удален");
                    isDelete = true;
                }
            }
            if (!isDelete) {
                System.out.println("Данные не верны, повторите ввод");
            }

        }

    }

}
