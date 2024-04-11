package org.example.carDemo.model;

public class Seat {
    String type;
    String company;

    @Override
    public String toString() {
        return "Seat{" +
                "type='" + type + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
