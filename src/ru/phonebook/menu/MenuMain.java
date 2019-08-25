package ru.phonebook.menu;

import ru.phonebook.Handler;
import ru.phonebook.Reader;
import ru.phonebook.models.Contact;
import ru.phonebook.service.ServiceMenuAdd;

import java.io.IOException;
import java.util.Collections;

public class MenuMain {
    public static TypeMenu start() {
        int choice;
        do {
            System.out.println("Вы находитесь в главном меню.Выберите действие");
            System.out.println(" 1 . Добавить контакт ");
            System.out.println(" 2 . Удалить контакт ");
            System.out.println(" 3 . Найти контакт ");
            System.out.println(" 4 . Вывести весь список контактов ");
            choice = Reader.readDigital();

        } while (choice < 1 || choice > 4);

        switch (choice) {
            case 1:
                MenuAdd.start();
                break;
            case 2:
                MenuDelete.start();
                break;
            case 3:
                MenuFind.start();
                break;
            case 4:
                ServiceMenuAdd.allPrintContact();
                break;
        }
        return TypeMenu.MAIN;
    }
}
