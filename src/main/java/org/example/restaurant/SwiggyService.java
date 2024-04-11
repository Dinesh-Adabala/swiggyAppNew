package org.example.restaurant;

import java.util.ArrayList;
import java.util.List;

public class SwiggyService {
    public ReastaurentResponse getResturentList(){
        Restaurent koiRestaurent = new Restaurent();
        koiRestaurent.restaurentName="KOI MANDI";
        koiRestaurent.phoneName="9000308335";
        koiRestaurent.rating="5.0";
        Address koiMandiAddress = new Address(123,"Gandhi center","Karimnagar",533239);
        Dish chickenFrypiceMandi = new Dish("Chicken frypice Mandi",650);
        Dish muttonFrypiceMandi = new Dish("Mutton frypice Mandi",850);
        Dish ChickenJucieMandi = new Dish("Chicken jucie Mandi",1200);
        Dish muttonJucieMandi = new Dish("Mutton jucie Mandi",1500);
        List<Dish> koiDishesList= new ArrayList<>();
        koiDishesList.add(chickenFrypiceMandi);
        koiDishesList.add(muttonFrypiceMandi);
        koiDishesList.add(ChickenJucieMandi);
        koiDishesList.add(muttonJucieMandi);
        koiRestaurent.address=koiMandiAddress;
        koiRestaurent.dishesList=koiDishesList;



        Restaurent mefileRestaurent = new Restaurent();
        mefileRestaurent.restaurentName="MEFIL MANDI";
        mefileRestaurent.phoneName="9000308335";
        mefileRestaurent.rating="4.5";
        Address mefileiAddress = new Address(123,"Gandhi center","Hyd",588853);
        Dish chickenFrypiceBiriyan = new Dish("Chicken frypice Biriyan",250);
        Dish muttonFrypiceBiriyan = new Dish("Mutton frypice Biriyan",350);
        Dish chickenStater = new Dish("Chicken stater",399);
        Dish muttonStater = new Dish("Mutton stater",499);
        List<Dish> mefileDishesList= new ArrayList<>();
        mefileDishesList.add(chickenFrypiceBiriyan);
        mefileDishesList.add(muttonFrypiceBiriyan);
        mefileDishesList.add(chickenStater);
        mefileDishesList.add(muttonStater);
        mefileRestaurent.address=mefileiAddress;
        mefileRestaurent.dishesList=mefileDishesList;



        Restaurent vishnuSreeRestaurent = new Restaurent();
        vishnuSreeRestaurent.restaurentName="VISHNU SREE MANDI";
        vishnuSreeRestaurent.phoneName="9000308335";
        vishnuSreeRestaurent.rating="4.5";
        Address vishnuSreeAddress = new Address(123,"Gandhi center","Hyd",588853);
        Dish chickenBiriyan = new Dish("Chicken frypice Biriyan",350);
        Dish muttonBiriyan = new Dish("Mutton frypice Biriyan",500);
        Dish chillyChickent = new Dish("Chicken stater",299);
        Dish muttonKeema = new Dish("Mutton stater",599);
        List<Dish> vishnuSreeDishesList= new ArrayList<>();
        vishnuSreeDishesList.add(chickenBiriyan);
        vishnuSreeDishesList.add(muttonBiriyan);
        vishnuSreeDishesList.add(chillyChickent);
        vishnuSreeDishesList.add(muttonKeema);
        vishnuSreeRestaurent.address=vishnuSreeAddress;
        vishnuSreeRestaurent.dishesList=vishnuSreeDishesList;


        List<Restaurent> restaurentList = new ArrayList<>();
        restaurentList.add(koiRestaurent);
        restaurentList.add(mefileRestaurent);
        restaurentList.add(vishnuSreeRestaurent);


        ReastaurentResponse reastaurentResponse = new ReastaurentResponse();
        reastaurentResponse.restaurentList=restaurentList;

        return reastaurentResponse;
    }
    

}
