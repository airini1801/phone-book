package ru.phonebook.menu;

import ru.phonebook.Reader;
import ru.phonebook.service.ServiceMenuFind;

public class MenuFind {
    public static TypeMenu start(){
        int choice;
        do {
            System.out.println("Вы находитесь в меню - НАЙТИ КОНТАКТ");
            System.out.println(" 1 . Найти контакт по фамилии");
            System.out.println(" 2 . Найти контакт по адресу");
            System.out.println(" 3 . Найти контакт по номеру телефона");
            System.out.println(" 4 . Вернуться в главное меню ");
            choice = Reader.readDigital();

        } while (choice < 1 || choice > 4);

        System.out.println("\n");

        switch (choice) {
            case 1:
                ServiceMenuFind.findSurname();
                break;
            case 2:
                ServiceMenuFind.findAdress();
                break;
            case 3:
                ServiceMenuFind.findNumberPhone();
                break;
            case 4:
                return TypeMenu.MAIN;

        }
        return TypeMenu.FIND_NUMBER;

    }
}
