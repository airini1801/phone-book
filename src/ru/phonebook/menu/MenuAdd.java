package ru.phonebook.menu;

import ru.phonebook.Reader;
import ru.phonebook.service.ServiceMenuAdd;

public class MenuAdd {
    public static TypeMenu start(){
        int choice;
        do {
            System.out.println("Вы находитесь в меню - ДОБАВИТЬ КОНТАКТ.Выберите действие");
            System.out.println(" 1 . Добавить ");
            System.out.println(" 2 . Вернуться в главное меню ");
            choice =  Reader.readDigital();

        } while (choice < 1 || choice > 2);

        System.out.println("\n");

        switch (choice) {
            case 1:
                ServiceMenuAdd.add();
                return TypeMenu.ADD_NUMBER;
            default :
               return TypeMenu.MAIN;
        }


    }
}
