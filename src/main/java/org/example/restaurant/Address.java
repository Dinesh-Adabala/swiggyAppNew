package org.example.restaurant;

public class Address {
    public int flatNo;
    public String street;

    public String area;

    public int pincode;

    public Address(int flatNo, String street, String area, int pincode) {
        this.flatNo = flatNo;
        this.street = street;
        this.area = area;
        this.pincode = pincode;
    }
}
