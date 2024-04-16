package org.example.restaurant;

import java.util.Scanner;

public class SwiggyTest {
    public static void main(String[] args) {
        SwiggyService swiggyService = new SwiggyService();


        ReastaurentResponse response = swiggyService.getResturentList();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Reastaurent Name :");

        String resataurentName = input.nextLine();
        ReastaurentService reastaurentService = new ReastaurentService();
        reastaurentService.selectReasturent(response,resataurentName);

        Restaurent r1 = new Restaurent();
        r1.restaurentName="KOI Mandi";
        Address a1 = new Address(123,"PLK","AMP",533);
        r1.address=a1;

        Restaurent r2 = new Restaurent();
        r2.restaurentName="KOI Mandi";
        Address a2 = new Address(123,"PLK","AMP",533);
        r2.address=a2;

        Restaurent r3 = new Restaurent();
        r3.restaurentName="KOI Mandi";
        Address a3 = new Address(123,"PLK","AMP",533);
        r3.address=a3;

      //  Restaurent r3 = r1;


        System.out.println("REFLEXIV  : " +r1.equals(r1));
        System.out.println("SYMENTRIC : " +r1.equals(r2));
        System.out.println("Transtive  : " + r1.equals(r3));
    }
}
