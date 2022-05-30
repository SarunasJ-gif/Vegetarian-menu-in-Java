package com.sarunas;

import java.util.List;

public class UpdateMenu {

    public UpdateMenu() {}

    MenuList menuList = new MenuList();

    List<Protein> protein = menuList.proteinMenu();
    List<Fat> fat = menuList.fatMenu();
    List<Carbs> carbs = menuList.carbsMenu();
    List<Fruits> fruits = menuList.fruitMenu();
    List<String> summerVegetables = menuList.summerVegetablesMenu();
    List<String> winterVegetables = menuList.winterVegetablesMenu();
    List<PartyFood> partyMenu = menuList.partyMenu();


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

    public void addFruits(String name, int quantity) {
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
}
