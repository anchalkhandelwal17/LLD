package org.lld.CarRentalSystem;

public class Customer {
    // name, age, address, rentedVehicle, totalVehiclesRented

    private String name;
    private String email;
    private int contactNo;
    private Address address;

    public Customer(String name, String email, int contactNo, Address address, Vehicle rentedVehicle) {
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getContactNo() {
        return contactNo;
    }

    public Address getAddress() {
        return address;
    }

}
