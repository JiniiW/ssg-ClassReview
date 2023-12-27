package _231216;

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal set1 = new Meal();
        set1.addItem(new ChickenBurger());
        set1.addItem(new Coke());
        return set1;
    }
    public Meal prepareNoneVegMeal(){
        Meal set2 = new Meal();
        set2.addItem(new VegBurger());
        set2.addItem(new Pepsi());
        return set2;
    }
}
