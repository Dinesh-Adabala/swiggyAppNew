package org.example.restaurant;

import java.util.List;
import java.util.Objects;

public class Restaurent {
    String restaurentName;
    String phoneName;
    String rating;
    Address address;
    List<Dish> dishesList;

    @Override
    public boolean equals(Object o) {
        // same hashcodes
        if (this==o)
            return true;
        if (this.getClass() != o.getClass())
            return false;
        Restaurent restaurent = (Restaurent) o;
        return this.restaurentName.equals(restaurent.restaurentName)&& this.address.equals(restaurent.address);
    }


}
