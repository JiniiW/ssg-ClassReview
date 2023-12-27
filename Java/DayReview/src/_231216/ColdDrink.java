package _231216;

public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
