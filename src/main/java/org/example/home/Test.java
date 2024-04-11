package org.example.home;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Room> rooms = new ArrayList<>();
        Hall hall = new Hall();
        Kitchen kitchen = new Kitchen();

        rooms.add(hall);
        rooms.add(kitchen);

        Home home = new Home();
        home.roomList=rooms;
        System.out.println(home.roomList.size());
    }
}
