package ru.phonebook.menu;

import ru.phonebook.Reader;
import ru.phonebook.service.ServiceMenuAdd;

public class MenuMain {
    public static TypeMenu start() {
        int choice;
        do {
            System.out.println("Вы находитесь в главном меню.Выберите действие");
            System.out.println(" 1. Добавить контакт ");
            System.out.println(" 2. Удалить контакт ");
            System.out.println(" 3. Найти контакт ");
            System.out.println(" 4. Вывести весь список контактов ");
            choice = Reader.readDigital();

        } while (choice < 1 || choice > 4);

        switch (choice) {
            case 1:
               return MenuAdd.start();
            case 2:
                return MenuDelete.start();
            case 3:
                return MenuFind.start();
            case 4:
                ServiceMenuAdd.allPrintContact();

        }
        return TypeMenu.MAIN;
    }
}
