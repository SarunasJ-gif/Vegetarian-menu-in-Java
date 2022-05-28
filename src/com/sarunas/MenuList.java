package com.sarunas;

import java.util.ArrayList;
import java.util.List;

public class MenuList {

    public MenuList() {
    }


    public List<Protein> proteinMenu() {
        List<Protein> protein = new ArrayList<>();
        Protein soy = new Protein("Soy", 100, 337);
        Protein beans = new Protein("Beans", 100, 290);
        Protein lenses = new Protein("Lences", 100, 312);
        Protein fishFillets = new Protein("Fish fillets", 100, 183);
        Protein curd = new Protein("Curd", 100, 160);
        Protein shrimp = new Protein("Shrimp", 100, 70);
        Protein tuna = new Protein("Tuna", 100, 186);
        Protein caviar = new Protein("Caviar", 100, 267);
        Protein eggWhites = new Protein("Egg whites", 100, 49);
        protein.add(soy);
        protein.add(beans);
        protein.add(lenses);
        protein.add(fishFillets);
        protein.add(curd);
        protein.add(shrimp);
        protein.add(tuna);
        protein.add(caviar);
        protein.add(eggWhites);

        return protein;
    }

    public List<Fat> fatMenu() {
        List<Fat> fat = new ArrayList<>();
        Fat nuts = new Fat("Nuts", 100, 658);
        Fat eggYolk = new Fat("Egg yolk", 100, 359);
        Fat linseed = new Fat("Linseed", 100, 365);
        Fat spanishSageSeeds = new Fat("Spanish sage seeds", 100, 453);
        Fat avocado = new Fat("Avocado", 100, 224);
        fat.add(nuts);
        fat.add(eggYolk);
        fat.add(linseed);
        fat.add(spanishSageSeeds);
        fat.add(avocado);

        return fat;
    }

    public List<Carbs> carbsMenu() {
        List<Carbs> carbs = new ArrayList<>();
        Carbs buckwheat = new Carbs("Buckwheat", 100, 349);
        Carbs rice = new Carbs("Rice", 100, 344);
        Carbs ryeBread = new Carbs("Rye bread", 100, 215);
        Carbs pasta = new Carbs("Whole grain pasta", 100, 359);
        Carbs spaghetti = new Carbs("Spaghetti", 100, 359);
        Carbs potatoes = new Carbs("Potatoes", 100, 81);
        Carbs corn = new Carbs("Corn", 100, 39);
        Carbs oatmeal = new Carbs("Oatmeal", 100, 365);
        Carbs millet = new Carbs("Millet", 100, 119);
        Carbs bolivianPigeon = new Carbs("Bolivian pigeon", 100, 120);
        Carbs barleyGroats = new Carbs("Barley groats", 100, 319);
        Carbs couscous = new Carbs("Couscous", 100, 112);
        Carbs brownRice = new Carbs("Brown rice", 100, 353);
        Carbs wildRice = new Carbs("Wild rice", 100, 101);
        Carbs tortillas = new Carbs("Tortillas whole grain", 100, 310);
        carbs.add(buckwheat);
        carbs.add(rice);
        carbs.add(ryeBread);
        carbs.add(pasta);
        carbs.add(spaghetti);
        carbs.add(potatoes);
        carbs.add(corn);
        carbs.add(oatmeal);
        carbs.add(millet);
        carbs.add(bolivianPigeon);
        carbs.add(barleyGroats);
        carbs.add(couscous);
        carbs.add(brownRice);
        carbs.add(wildRice);
        carbs.add(tortillas);

        return carbs;
    }

    public List<Fruits> fruitMenu() {
        List<Fruits> fruits = new ArrayList<>();
        Fruits bananas = new Fruits("Bananas", 100, 97);
        Fruits apple = new Fruits("Apple", 100, 53);
        Fruits persimmons = new Fruits("Persimmons", 100, 70);
        Fruits orange = new Fruits("Orange", 100, 43);
        Fruits fruitSalad = new Fruits("Fruit salad", 100, 49);
        fruits.add(bananas);
        fruits.add(apple);
        fruits.add(persimmons);
        fruits.add(orange);
        fruits.add(fruitSalad);

        return fruits;
    }

    public List<String> summerVegetablesMenu() {
        List<String> vegetablesInSummer = new ArrayList<>();
        vegetablesInSummer.add("Cucumber");
        vegetablesInSummer.add("Dill");
        vegetablesInSummer.add("Parsley");
        vegetablesInSummer.add("Tomatoes");
        vegetablesInSummer.add("Lettuce leaves");
        vegetablesInSummer.add("Carrots");
        vegetablesInSummer.add("Green onions");
        vegetablesInSummer.add("Cabbage");
        vegetablesInSummer.add("Cabbage");
        vegetablesInSummer.add("Bitter herbs");
        vegetablesInSummer.add("Bitter herbs");

        return vegetablesInSummer;
    }

    public List<String> winterVegetablesMenu() {
        List<String> vegetablesInWinter = new ArrayList<>();
        vegetablesInWinter.add("Sauerkraut");
        vegetablesInWinter.add("Pickled garlic");
        vegetablesInWinter.add("Boiled beetroot");
        vegetablesInWinter.add("Tanned cucumbers");
        vegetablesInWinter.add("Roasted peppers");
        vegetablesInWinter.add("Carrots");
        vegetablesInWinter.add("Sour tomatoes");
        vegetablesInWinter.add("Canned peas");
        vegetablesInWinter.add("Canned peas");
        vegetablesInWinter.add("Sour beets");
        vegetablesInWinter.add("Fried onions");
        vegetablesInWinter.add("Canned asparagus");

        return vegetablesInWinter;
    }

    public List<String> partyMenu() {
        List<String> partyMeal = new ArrayList<>();
        partyMeal.add("Ice creams");
        partyMeal.add("Snickers cake");
        partyMeal.add("Donuts");
        partyMeal.add("Chocolate cakes with Riccota cheese filling and light cream, flavored with fresh raspberries");
        partyMeal.add("Tiramisu flavored with amaret and dark chocolate");
        partyMeal.add("Containers with Crème brûlée cream and berries");
        partyMeal.add("Wild berry and cream cheese pies");
        partyMeal.add("Crispy cheese balls");
        partyMeal.add("Cucumber bites with avocado and shrim");
        partyMeal.add("Crispy bits of broccoli and cheese");
        partyMeal.add("Fried lavash rolls with cheese");
        partyMeal.add("Crispy onion rings in batter");
        partyMeal.add("Avocado appetizers with herring and mangoes");
        partyMeal.add("Pickled olives");
        partyMeal.add("Stuffed dates");
        partyMeal.add("Chocolate truffles");

        return partyMeal;
    }
}
