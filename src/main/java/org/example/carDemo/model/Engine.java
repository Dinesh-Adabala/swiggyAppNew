package org.example.carDemo.model;

public class Engine {
    String cc;
    String fuelType;
    String engineOil;

    @Override
    public String toString() {
        return "Engine{" +
                "cc='" + cc + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", engineOil='" + engineOil + '\'' +
                '}';
    }
}
