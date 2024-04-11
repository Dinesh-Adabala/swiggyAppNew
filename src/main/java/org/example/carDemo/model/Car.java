package org.example.carDemo.model;

import java.util.List;

public class Car {
    String carCompanyName;
    String carModel;
    String carColour;
    Ac ac;
    Break aBreak;
    List<Door>doorList;
    Engine engine;
    FuelTank fuelTank;
    Light light;
    List<Wheel>wheelList;
    List<Seat>seatList;


    @Override
    public String toString() {
        return "Car{" +
                "carCompanyName='" + carCompanyName + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carColour='" + carColour + '\'' +
                ", ac=" + ac +
                ", aBreak=" + aBreak +
                ", doorList=" + doorList +
                ", engine=" + engine +
                ", fuelTank=" + fuelTank +
                ", light=" + light +
                ", wheelList=" + wheelList +
                ", seatList=" + seatList +
                '}';
    }
}
