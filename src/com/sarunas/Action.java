package com.sarunas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Action {

    private static Scanner scanner = new Scanner(System.in);

    public Action() {}

    public void runMenuAplication() {

        String menuChoice = chooseOption();
        boolean rightOption = false;
        while(!rightOption) {
            switch (menuChoice) {
                case "menu":
                    String[] week = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
                    System.out.println("Please enter your preferred daily caloric intake: ");
                    boolean hasNext = scanner.hasNextInt();
                    if (hasNext) {
                        int input = scanner.nextInt();
                        Menu menu = new Menu(input);
                        for (String day : week) {
                            System.out.println("\n\n" + day + ": ");
                            System.out.println(menu.breakfastMenu());
                            seasonVegetables();
                            System.out.println(menu.lunchMenu());
                            seasonVegetables();
                            System.out.println(menu.dinnerMenu());
                            seasonVegetables();
                        }
                        rightOption = true;
                    } else {
                        scanner.nextLine();
                        break;
                    }
                    break;
                case "party":
                    Menu party = new Menu();
                    int dishes = 0;
                    int participants = 0;
                    System.out.println("Please enter as many dishes as you want to order: ");
                    if (scanner.hasNextInt()) {
                        dishes = scanner.nextInt();
                        scanner.nextLine();
                        boolean correctInput = false;
                        while (!correctInput) {
                            System.out.println("Please enter how many participants will attend the party: ");
                            if (scanner.hasNextInt()) {
                                participants = scanner.nextInt();
                                party.partyMenu(dishes, participants);
                                scanner.nextLine();
                                correctInput = true;
                                rightOption = true;
                            } else {
                                scanner.nextLine();
                            }
                        }
                    } else {
                        scanner.nextLine();
                    }
                    break;
                default:
                    System.out.println("Invalid choice, choose one more time: ");
                    menuChoice = chooseOption();
                    break;
            }
        }
    }

    public static String chooseOption() {
        System.out.println("Make your choice: ");
        System.out.println("If you want vegetarian food menu list for all week press \"menu\": ");
        System.out.println("If you want vegetarian food menu for party press \"party\": ");
        String menuChoice = scanner.nextLine().toLowerCase();
        return menuChoice;
    }

    public static void seasonVegetables() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        Menu m = new Menu();
        if (month == 10 || month == 11 || month == 12 || month == 1 || month == 2) {
            System.out.println(m.winterTimeVegetables());
        } else {
            System.out.println(m.summerTimeVegetables());
        }
    }
}
