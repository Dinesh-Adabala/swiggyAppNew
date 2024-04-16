package org.example.restaurant;

import java.util.Objects;

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




    public boolean equals(Object obj) {
        // same hashcodes
        if (this==obj){
            return true;}
        if (this.getClass() != obj.getClass()){
            return false;}
        Address otherAdress = (Address) obj;
       return this.area.equals(otherAdress.area) && this.street.equals(otherAdress.street) && this.flatNo==otherAdress.flatNo &&this.pincode==otherAdress.pincode;
     //   return this.flatNo==otherAdress.flatNo&&this.street==otherAdress.street&&this.area==otherAdress.area&&this.pincode==otherAdress.pincode;

    }

    public int hashCode(){
        return this.flatNo+this.pincode+this.area.hashCode()+this.street.hashCode();
    }



}
