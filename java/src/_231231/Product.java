package _231231;

public class Product {
    private int price;
    private int bonusPoint;

    Product(){};

    Product(int price){
        this.price = price;
        this.bonusPoint = (int) (price/10.0);
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }
}