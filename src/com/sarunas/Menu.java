package com.sarunas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Menu {

    Random random = new Random();

    protected int caloriesOfDay;
    protected double proteinDayCalories;
    protected double fatDayCalories;
    protected double carbsDayCalories;

    public Menu() {}

    public Menu(int caloriesOfDay) {
        this.caloriesOfDay = caloriesOfDay;
        this.proteinDayCalories = (this.caloriesOfDay * 0.2);
        this.fatDayCalories = this.caloriesOfDay * 0.2;
        this.carbsDayCalories = this.caloriesOfDay * 0.6;
    }

    MenuList menuList = new MenuList();


    List<Protein> protein = menuList.proteinMenu();
    List<Fat> fat = menuList.fatMenu();
    List<Carbs> carbs = menuList.carbsMenu();
    List<Fruits> fruits = menuList.fruitMenu();
    List<String> summerVegetables = menuList.summerVegetablesMenu();
    List<String> winterVegetables = menuList.winterVegetablesMenu();
    List<PartyFood> partyMenu = menuList.partyMenu();


    public void breakfastMenu() {
        System.out.println();
        System.out.println("Breakfast: ");
        int x = random.nextInt(carbs.size());
        int breakfastCarbsWeight = (int) (carbs.get(x).getWeight() * (this.carbsDayCalories / carbs.get(x).getCalories()) * 0.5 * 0.8);
        System.out.println(carbs.get(x).getName() + " " + breakfastCarbsWeight + "g");
        int y = random.nextInt(fruits.size());
        int breakfastFruitsWeight = (int) (fruits.get(y).getWeight() * (this.carbsDayCalories / fruits.get(y).getCalories()) * 0.5 * 0.2);
        System.out.println(fruits.get(y).getName() + " " + breakfastFruitsWeight + "g");
    }

    public void lunchMenu() {
        System.out.println();
        System.out.println("Lunch: ");
        int x = random.nextInt(carbs.size());
        int lunchCarbsWeight = (int) (carbs.get(x).getWeight() * (this.carbsDayCalories / carbs.get(x).getCalories()) * 0.4);
        System.out.println(carbs.get(x).getName() + " " + lunchCarbsWeight + "g");
        int y = random.nextInt(protein.size());
        int lunchProteinWeight = (int) (protein.get(y).getWeight() * (this.proteinDayCalories / protein.get(y).getCalories()) * 0.5);
        System.out.println(protein.get(y).getName() + " " + lunchProteinWeight + "g");
        int z = random.nextInt(fat.size());
        int lunchFatWeight = (int) (fat.get(z).getWeight() * (this.fatDayCalories / fat.get(z).getCalories()) * 0.5);
        System.out.println(fat.get(z).getName() + " " + lunchFatWeight + "g");
    }

    public void dinnerMenu() {
        System.out.println();
        System.out.println("Dinner: ");
        int x = random.nextInt(carbs.size());
        int dinnerCarbsWeight = (int) (carbs.get(x).getWeight() * (this.carbsDayCalories / carbs.get(x).getCalories()) * 0.1);
        System.out.println(carbs.get(x).getName() + " " + dinnerCarbsWeight + "g");
        int y = random.nextInt(protein.size());
        int dinnerProteinWeight = (int) (protein.get(y).getWeight() * (this.proteinDayCalories / protein.get(y).getCalories()) * 0.5);
        System.out.println(protein.get(y).getName() + " " + dinnerProteinWeight + "g");
        int z = random.nextInt(fat.size());
        int dinnerFatWeight = (int) (fat.get(z).getWeight() * (this.fatDayCalories / fat.get(z).getCalories()) * 0.5);
        System.out.println(fat.get(z).getName() + " " + dinnerFatWeight + "g");
    }

    public String summerTimeVegetables() {
        int x = random.nextInt(summerVegetables.size());
        return summerVegetables.get(x) + " 100g";
    }

    public String winterTimeVegetables() {
        int x = random.nextInt(winterVegetables.size());
        return winterVegetables.get(x) + " 100g";
    }

    public void partyMenu(int numberOfDishes, int participants) {
        int portion = 0;
        if (participants <= 8) {
            portion = 1;
        } else if (participants > 8 && participants <= 16){
            portion = 2;
        } else {
            portion = 3;
        }
        System.out.println();
        System.out.println("Party menu: ");
        List<Integer> counting = new ArrayList<>();
        int x = 0;
        for (int i = 0; i < numberOfDishes; i++) {
            x = random.nextInt(partyMenu.size());
            if (counting.contains(x)) {
                i--;
                continue;
            } else {
                int y = x;
                counting.add(y);
                System.out.println(partyMenu.get(x).getName() + " " + (portion * partyMenu.get(x).getQuantity()) + "pcs.");
            }
        }
    }
}
