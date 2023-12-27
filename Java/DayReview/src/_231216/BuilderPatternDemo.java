package _231216;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder choose = new MealBuilder();
        Meal select = choose.prepareNoneVegMeal(); //Meal타입에 주문
        float cost = select.getCost();
        System.out.println(cost);
        select.showItems();

    }
}
