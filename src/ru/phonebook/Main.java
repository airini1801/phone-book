package ru.phonebook;

import ru.phonebook.models.Contact;
import ru.phonebook.service.ServiceMenuAdd;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Contact> contactList = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        Handler.HandlerMenu();

    }

}
