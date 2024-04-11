package org.example.carDemo.model;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public Car addCar(){
        Ac ac = new Ac();
        ac.airFilter="Yes";
        ac.windSpeed=5;

        Break breaks = new Break();
        breaks.handBreak = "Yes";
        breaks.legBreak = "Yes";

        Door door1 = new Door();
        door1.type = "Auto";
        door1.windowType="Auto";

        Door door2 = new Door();
        door2.type = "Auto";
        door2.windowType="Auto";

        Door door3 = new Door();
        door3.type = "Auto";
        door3.windowType="Auto";

        Door door4 = new Door();
        door4.type = "Auto";
        door4.windowType="Auto";

        List<Door> doorList= new ArrayList<>();
        doorList.add(door1);
        doorList.add(door2);
        doorList.add(door3);
        doorList.add(door4);



        Engine engine = new Engine();
        engine.cc="500";
        engine.fuelType="Petrol";
        engine.engineOil="car4S";

        FuelTank fuelTank = new FuelTank();
        fuelTank.tankCapacity = 70;

        Light light = new Light();
        light.bodyLight="Cream";
        light.frontLight="Milk white";
        light.SignelLight="Yellow";

        Seat seat = new Seat();
        seat.type="Leather";
        seat.company="Ads fabrics";

        Seat seat1 = new Seat();
        seat1.type="Leather";
        seat1.company="Ads fabrics";

        Seat seat2 = new Seat();
        seat2.type="Leather";
        seat2.company="Ads fabrics";

        Seat seat3 = new Seat();
        seat3.type="Leather";
        seat3.company="Ads fabrics";

        List<Seat> seatList = new ArrayList<>();
        seatList.add(seat);
        seatList.add(seat1);
        seatList.add(seat2);
        seatList.add(seat3);

        Wheel wheel = new Wheel();
        wheel.type="Aliwheel";
        wheel.company = "Ads Rubber Tyers";

        Wheel wheel1 = new Wheel();
        wheel1.type="Aliwheel";
        wheel1.company = "Ads Rubber Tyers";

        Wheel wheel2 = new Wheel();
        wheel2.type="Aliwheel";
        wheel2.company = "Ads Rubber Tyers";

        Wheel wheel3 = new Wheel();
        wheel3.type="Aliwheel";
        wheel.company = "Ads Rubber Tyers";

        List<Wheel>wheelList = new ArrayList<>();
        wheelList.add(wheel);
        wheelList.add(wheel1);
        wheelList.add(wheel2);
        wheelList.add(wheel3);


        Car car = new Car();
        car.carCompanyName = "Audi";
        car.carModel="A6";
        car.carColour="RED & BLACK";
        car.ac=ac;
        car.aBreak=breaks;
        car.doorList=doorList;
        car.engine=engine;
        car.fuelTank=fuelTank;
        car.light=light;
        car.wheelList=wheelList;
        car.seatList=seatList;

        System.out.println(car);

        return car;
    }
}
