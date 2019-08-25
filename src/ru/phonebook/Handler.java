package ru.phonebook;
import ru.phonebook.menu.*;
import ru.phonebook.models.Contact;

public class Handler {

    public static TypeMenu HandlerMenu() {
        Handler handler = new Handler();
        TypeMenu curantMenu = TypeMenu.MAIN;
        while (true){
            switch (curantMenu){
                case MAIN:
                    curantMenu = MenuMain.start();
                    break;
                case FIND_NUMBER:
                    curantMenu = MenuFind.start();
                    break;
                case ADD_NUMBER:
                    curantMenu = MenuAdd.start();
                    break;
                case DELETE_NUMBER:
                    curantMenu = MenuDelete.start();
                    default:System.exit(0);
            }

        }
    }

}

