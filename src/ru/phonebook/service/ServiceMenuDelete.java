package ru.phonebook.service;


import ru.phonebook.Main;
import ru.phonebook.Reader;
import ru.phonebook.models.Contact;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ServiceMenuDelete {

    public static void delete(){
        System.out.println("Введите номер телефона, который хотите удалить");
        int phoneDelete = Reader.readDigital();
        boolean isDelete = false;
        for (Contact contact : new ArrayList<>(Main.contactList)) {
            if(phoneDelete == contact.getNumberPhone() ){
                Main.contactList.remove(contact);
                System.out.println("Контакт удален1");
                isDelete = true;
            }
        }
        if(!isDelete){
            System.out.println("Данные не верны, повторите ввод");
        }

    }

}
