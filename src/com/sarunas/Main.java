package com.sarunas;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your preferred daily caloric intake: ");
        int input = scanner.nextInt();

        Menu menu = new Menu(input);

        menu.breakfastMenu();
        menu.lunchMenu();
        menu.dinnerMenu();
        System.out.println("-----------------");
        menu.summerTimeVegetables();
        menu.winterTimeVegetables();
        System.out.println("-----------------");
        menu.partyMenu(8);

    }
}









