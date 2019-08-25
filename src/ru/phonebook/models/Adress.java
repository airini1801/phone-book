package ru.phonebook.models;

public class Adress {
    public void setNameStreet(String nameStreet) {
        this.nameStreet = nameStreet;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "nameStreet='" + nameStreet + '\'' +
                ", numberHouse=" + numberHouse +
                '}';
    }

    private String nameStreet;
    private int numberHouse;

    public String getNameStreet() {
        return nameStreet;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public Adress(String nameStreet, int numberHouse) {
        this.nameStreet = nameStreet;
        this.numberHouse = numberHouse;
    }
}
