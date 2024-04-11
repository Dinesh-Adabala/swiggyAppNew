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
    }
}
