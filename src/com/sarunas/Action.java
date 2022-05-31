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
        boolean action = true;
        while (action) {
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
                        scanner.nextLine();
                        System.out.println("\n");
                        menuChoice = chooseOption();
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
                                System.out.println("\n");
                                menuChoice = chooseOption();
                            } else {
                                scanner.nextLine();
                            }
                        }
                    } else {
                        scanner.nextLine();
                    }

                    break;
                case "add":
                    add();
                    menuChoice = chooseOption();
                    break;
                case "delete":
                    delete();
                    System.out.println("\n");
                    menuChoice = chooseOption();
                    break;
                case "print":
                    print();
                    System.out.println("\n");
                    menuChoice = chooseOption();
                    break;
                case "options":
                    menuChoice = chooseOption();
                    break;
                case "exit":
                    action = false;
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
        System.out.println("If you want add food to menu \"add\": ");
        System.out.println("If you want delete food from menu \"delete\": ");
        System.out.println("If you want print all food in the list press \"print\": ");
        System.out.println("Print a list of available actions press \"options\": ");
        System.out.println("If you want exit press \"exit\": ");
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

    public void add() {
        UpdateMenu addFood = new UpdateMenu();
        System.out.println( "Choice to add to the list:\npress:");
        System.out.println( "1 - add to protein list\n" +
                            "2 - add to carbs list\n" +
                            "3 - add to fat list\n" +
                            "4 - add to fruits list\n" +
                            "5 - add to summer time vegetables list\n" +
                            "6 - add to winter time vegetables list\n" +
                            "7 - add to party food menu list.");
        String option = scanner.nextLine();
        switch (option) {
            case "1":
                System.out.println("Please enter food name: ");
                String proteinName = scanner.nextLine();
                System.out.println("Please enter food weight: ");
                if (scanner.hasNextInt()) {
                    int proteinWeight = scanner.nextInt();
                    scanner.nextLine();
                    boolean correctInput = false;
                    while (!correctInput) {
                        System.out.println("Please enter food calories: ");
                        if (scanner.hasNextInt()) {
                            int proteinCalories = scanner.nextInt();
                            addFood.addProtein(proteinName, proteinWeight, proteinCalories);
                            scanner.nextLine();
                            correctInput = true;
                        } else {
                            scanner.nextLine();
                        }
                    }
                } else {
                    scanner.nextLine();
                }
                break;
            case "2":
                System.out.println("Please enter food name: ");
                String carbsName = scanner.nextLine();
                System.out.println("Please enter food weight: ");
                if (scanner.hasNextInt()) {
                    int carbsWeight = scanner.nextInt();
                    scanner.nextLine();
                    boolean correctInput = false;
                    while (!correctInput) {
                        System.out.println("Please enter food calories: ");
                        if (scanner.hasNextInt()) {
                            int carbsCalories = scanner.nextInt();
                            addFood.addCarbs(carbsName, carbsWeight, carbsCalories);
                            scanner.nextLine();
                            correctInput = true;
                        } else {
                            scanner.nextLine();
                        }
                    }
                } else {
                    scanner.nextLine();
                }
                break;
            case "3":
                System.out.println("Please enter food name: ");
                String fatName = scanner.nextLine();
                System.out.println("Please enter food weight: ");
                if (scanner.hasNextInt()) {
                    int fatWeight = scanner.nextInt();
                    scanner.nextLine();
                    boolean correctInput = false;
                    while (!correctInput) {
                        System.out.println("Please enter food calories: ");
                        if (scanner.hasNextInt()) {
                            int fatCalories = scanner.nextInt();
                            addFood.addFat(fatName, fatWeight, fatCalories);
                            scanner.nextLine();
                            correctInput = true;
                        } else {
                            scanner.nextLine();
                        }
                    }
                } else {
                    scanner.nextLine();
                }
                break;
            case "4":
                System.out.println("Please enter food name: ");
                String fruitName = scanner.nextLine();
                System.out.println("Please enter food weight: ");
                if (scanner.hasNextInt()) {
                    int fruitWeight = scanner.nextInt();
                    scanner.nextLine();
                    boolean correctInput = false;
                    while (!correctInput) {
                        System.out.println("Please enter food calories: ");
                        if (scanner.hasNextInt()) {
                            int fruitCalories = scanner.nextInt();
                            addFood.addFruits(fruitName, fruitWeight, fruitCalories);
                            scanner.nextLine();
                            correctInput = true;
                        } else {
                            scanner.nextLine();
                        }
                    }
                } else {
                    scanner.nextLine();
                }
                break;
            case "5":
                System.out.println("Please enter food name: ");
                String summerVegetablesName = scanner.nextLine();
                addFood.addSummerVegetables(summerVegetablesName);
                break;
            case "6":
                System.out.println("Please enter food name: ");
                String winterVegetablesName = scanner.nextLine();
                addFood.addWinterVegetables(winterVegetablesName);
                break;
            case "7":
                System.out.println("Enter the name of the dish: ");
                String partyDishName = scanner.nextLine();
                System.out.println("Please enter the amount of food in units: ");
                if (scanner.hasNextInt()) {
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    addFood.addPartyFood(partyDishName, quantity);
                } else {
                    scanner.nextLine();
                }
                break;
            default:
                System.out.println("Invalid input...");
                break;
        }
    }

    public void delete() {
        UpdateMenu deleteFood = new UpdateMenu();
        System.out.println( "Choice to delete from the list:\npress:");
        System.out.println( "1 - delete from protein list\n" +
                            "2 - delete from carbs list\n" +
                            "3 - delete from fat list\n" +
                            "4 - delete from fruits list\n" +
                            "5 - delete from summer time vegetables list\n" +
                            "6 - delete from winter time vegetables list\n" +
                            "7 - delete from party food menu list.");
        String option = scanner.nextLine();
        switch (option) {
            case "1":
                System.out.println("Please enter food name: ");
                String proteinName = scanner.nextLine();
                deleteFood.deleteProtein(proteinName);
                break;
            case "2":
                System.out.println("Please enter food name: ");
                String carbsName = scanner.nextLine();
                deleteFood.deleteCarbs(carbsName);
                break;
            case "3":
                System.out.println("Please enter food name: ");
                String fatName = scanner.nextLine();
                deleteFood.deleteFat(fatName);
                break;
            case "4":
                System.out.println("Please enter food name: ");
                String fruitsName = scanner.nextLine();
                deleteFood.deleteFruits(fruitsName);
                break;
            case "5":
                System.out.println("Please enter food name: ");
                String summerVegetableName = scanner.nextLine();
                deleteFood.deleteSummerVegetables(summerVegetableName);
                break;
            case "6":
                System.out.println("Please enter food name: ");
                String winterVegetableName = scanner.nextLine();
                deleteFood.deleteWinterVegetables(winterVegetableName);
                break;
            case "7":
                System.out.println("Please enter food name: ");
                String partyFoodName = scanner.nextLine();
                deleteFood.deletePartyFood(partyFoodName);
                break;
            default:
                System.out.println("Invalid input...");
                break;
        }
    }

    public void print() {
        UpdateMenu printFood = new UpdateMenu();
        System.out.println("Choice which list to print:\npress:");
        System.out.println("1 - print protein list\n" +
                "2 - print carbs list\n" +
                "3 - print fat list\n" +
                "4 - print fruits list\n" +
                "5 - print summer time vegetables list\n" +
                "6 - print winter time vegetables list\n" +
                "7 - print party food menu list.");
        String option = scanner.nextLine();
        switch (option) {
            case "1":
                System.out.println("Protein food list: ");
                printFood.printProteinList();
                break;
            case "2":
                System.out.println("Carbohydrate food list: ");
                printFood.printCarbsList();
                break;
            case "3":
                System.out.println("Food fat source list: ");
                printFood.printFatList();
                break;
            case "4":
                System.out.println("Fruits list: ");
                printFood.printFruitsList();
                break;
            case "5":
                System.out.println("List of vegetables for the summer season: ");
                printFood.printSummerVegetablesList();
                break;
            case "6":
                System.out.println("List of vegetables for the winter season: ");
                printFood.printWinterVegetablesList();
                break;
            case "7":
                System.out.println("Party food list: ");
                printFood.printPArtyFoodList();
                break;
            default:
                System.out.println("Invalid input...");
                print();
                break;
        }
    }
}
