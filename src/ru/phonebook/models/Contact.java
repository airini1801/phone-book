package ru.phonebook.models;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    @Override
    public String toString() {
        return "Contact{" + user +
                ", " + adress +
                ", numberPhone=" + numberPhone +
                '}';
    }

    private User user;
    private Adress adress;
    private int numberPhone;

    public Contact(User user, Adress adress, int numberPhone) {
        this.user = user;
        this.adress = adress;
        this.numberPhone = numberPhone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }


}