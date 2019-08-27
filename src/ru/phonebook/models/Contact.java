package ru.phonebook.models;

public class Contact {
    @Override
    public String toString() {
        return "Contact{" + user +
                ", " + address +
                ", numberPhone=" + numberPhone +
                '}';
    }

    private User user;
    private Address address;
    private int numberPhone;

    public Contact(User user, Address address, int numberPhone) {
        this.user = user;
        this.address = address;
        this.numberPhone = numberPhone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }


}