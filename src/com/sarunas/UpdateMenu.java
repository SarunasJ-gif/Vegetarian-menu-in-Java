package com.sarunas;


import java.util.List;

public class UpdateMenu {


    public UpdateMenu() {}


    private static final MenuList menuList = new MenuList();
    static final List<Protein> protein = menuList.proteinMenu();
    static final List<Fat> fat = menuList.fatMenu();
    static final List<Carbs> carbs = menuList.carbsMenu();
    static final List<Fruits> fruits = menuList.fruitMenu();
    static final List<String> summerVegetables = menuList.summerVegetablesMenu();
    static final List<String> winterVegetables = menuList.winterVegetablesMenu();
    static final List<PartyFood> partyMenu = menuList.partyMenu();


    public void addProtein(String name, int weight, int calories) {
        Protein proteinFood = new Protein(name, weight, calories);
        protein.add(proteinFood);
    }



    public void addCarbs(String name, int weight, int calories) {
        Carbs carbsFood = new Carbs(name, weight, calories);
        carbs.add(carbsFood);
    }

    public void addFat(String name, int weight, int calories) {
        Fat fatFood = new Fat(name, weight, calories);
        fat.add(fatFood);
    }

    public void addFruits(String name, int weight, int calories) {
        Fruits fruitFood = new Fruits(name, weight, calories);
        fruits.add(fruitFood);
    }

    public void addSummerVegetables(String name) {
        summerVegetables.add(name);
    }

    public void addWinterVegetables(String name) {
        winterVegetables.add(name);
    }

    public void addPartyFood(String name, int quantity) {
        PartyFood partyFood = new PartyFood(name, quantity);
        partyMenu.add(partyFood);
    }


    public void deleteProtein(String name) {
        int count = 0;
        for (int i = 0; i < protein.size(); i++) {
            Protein proteinObj = protein.get(i);
            if (proteinObj.getName().equals(name)) {
                protein.remove(proteinObj);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There is no such food in the list");
        } else {
            System.out.println(name  + " was deleted from list.");
        }
    }

    public void deleteCarbs(String name) {
        int count = 0;
        for (int i = 0; i < carbs.size(); i++) {
            Carbs carbsObj = carbs.get(i);
            if (carbsObj.getName().equals(name)) {
                carbs.remove(carbsObj);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There is no such food in the list");
        } else {
            System.out.println(name  + " was deleted from list.");
        }
    }

    public void deleteFat(String name) {
        int count = 0;
        for (int i = 0; i < fat.size(); i++) {
            Fat fatObj = fat.get(i);
            if (fatObj.getName().equals(name)) {
                fat.remove(fatObj);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There is no such food in the list");
        } else {
            System.out.println(name  + " was deleted from list.");
        }
    }

    public void deleteFruits(String name) {
        int count = 0;
        for (int i = 0; i < fruits.size(); i++) {
            Fruits fruitObj = fruits.get(i);
            if (fruitObj.getName().equals(name)) {
                fruits.remove(fruitObj);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There is no such food in the list");
        } else {
            System.out.println(name  + " was deleted from list.");
        }
    }

    public void deletePartyFood(String name) {
        int count = 0;
        for (int i = 0; i < partyMenu.size(); i++) {
            PartyFood partyObj = partyMenu.get(i);
            if (partyObj.getName().equals(name)) {
                partyMenu.remove(partyObj);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There is no such food in the list");
        } else {
            System.out.println(name  + " was deleted from list.");
        }
    }

    public void deleteSummerVegetables(String name) {
        int count = 0;
        for (int i = 0; i < summerVegetables.size(); i++) {
            if (summerVegetables.contains(name)) {
                summerVegetables.remove(name);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There is no such food in the list");
        } else {
            System.out.println(name  + " was deleted from list.");
        }
    }

    public void deleteWinterVegetables(String name) {
        int count = 0;
        for (int i = 0; i < winterVegetables.size(); i++) {
            if (winterVegetables.contains(name)) {
                winterVegetables.remove(name);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There is no such food in the list");
        } else {
            System.out.println(name  + " was deleted from list.");
        }
    }

    public void printProteinList() {
        for (int i = 0; i < protein.size(); i++) {
            System.out.println((i + 1) + "." +  protein.get(i).getName() + " " + protein.get(i).getWeight() + "g" +" " + protein.get(i).getCalories() + "kCal ");
        }
    }

    public void printCarbsList() {
        for (int i = 0; i < carbs.size(); i++) {
            System.out.println((i + 1) + "." +  carbs.get(i).getName() + " " + carbs.get(i).getWeight() + "g" +" " + carbs.get(i).getCalories() + "kCal ");
        }
    }

    public void printFatList() {
        for (int i = 0; i < fat.size(); i++) {
            System.out.println((i + 1) + "." +  fat.get(i).getName() + " " + fat.get(i).getWeight() + "g" +" " + fat.get(i).getCalories() + "kCal ");
        }
    }

    public void printFruitsList() {
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println((i + 1) + "." +  fruits.get(i).getName() + " " + fruits.get(i).getWeight() + "g" +" " + fruits.get(i).getCalories() + "kCal ");
        }
    }

    public void printSummerVegetablesList() {
        for (int i = 0; i < summerVegetables.size(); i++) {
            System.out.println((i + 1) + "." +  summerVegetables.get(i));
        }
    }

    public void printWinterVegetablesList() {
        for (int i = 0; i < winterVegetables.size(); i++) {
            System.out.println((i + 1) + "." +  winterVegetables.get(i));
        }
    }

    public void printPArtyFoodList() {
        for (int i = 0; i < partyMenu.size(); i++) {
            System.out.println((i + 1) + "." +  partyMenu.get(i).getName() + " " + partyMenu.get(i).getQuantity() + "pcs.");
        }
    }
}
