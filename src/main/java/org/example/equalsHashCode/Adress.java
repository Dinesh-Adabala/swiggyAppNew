package org.example.equalsHashCode;

import java.util.Objects;

public class Adress {
    public String houseNo;
    public String area;
    public String pinCode;
    public String street;
    public String state;


    @Override
    public boolean equals(Object o) {

        Adress otherAdress = (Adress) o;

        return this.area.equals(otherAdress.area) && this.houseNo.equals(otherAdress.houseNo)
                && this.pinCode.equals(otherAdress.pinCode) && this.street.equals(otherAdress.street) && this.state.equals(otherAdress.state);
    }


}
