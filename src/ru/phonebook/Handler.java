package ru.phonebook;
import ru.phonebook.menu.*;

public class Handler {

    public static TypeMenu HandlerMenu() {
        TypeMenu currantMenu = TypeMenu.MAIN;
        while (true) {
            switch (currantMenu) {
                case MAIN:
                    currantMenu = MenuMain.start();
                    break;
                case FIND_NUMBER:
                    currantMenu = MenuFind.start();
                    break;
                case ADD_NUMBER:
                    currantMenu = MenuAdd.start();
                    break;
                case DELETE_NUMBER:
                    currantMenu = MenuDelete.start();
                    break;
                default:
                    System.exit(0);
            }

        }
    }

}

