package ru.phonebook.menu;

import ru.phonebook.Reader;
import ru.phonebook.service.ServiceMenuDelete;

public class MenuDelete {
    public static TypeMenu start() {
        int choice;
        do {
            System.out.println("Вы находитесь в меню - УДАЛИТЬ КОНТАКТ");
            System.out.println(" 1. Удалить контакт");
            System.out.println(" 2. Вернуться в главное меню ");
            choice = Reader.readDigital();

        } while (choice < 1 || choice > 2);

        System.out.println("\n");

        switch (choice) {
            case 1:
                ServiceMenuDelete.delete();
                return TypeMenu.DELETE_NUMBER;
            default:
                return TypeMenu.MAIN;

        }
    }
}
