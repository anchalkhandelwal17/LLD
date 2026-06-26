package org.lld.CarRentalSystem;

public class Address {

    private String streetAdress;
    private String city;
    private String country;
    private String state;
    private int zipCode;

    public Address(String streetAdress, String city, String country, String state, int zipCode) {
        this.streetAdress = streetAdress;
        this.city = city;
        this.country = country;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }
}
