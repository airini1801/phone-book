package ru.phonebook.models;

public class Address {
    public void setNameStreet(String nameStreet) {
        this.nameStreet = nameStreet;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }

    @Override
    public String toString() {
        return "Address{" +
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

    public Address(String nameStreet, int numberHouse) {
        this.nameStreet = nameStreet;
        this.numberHouse = numberHouse;
    }
}
