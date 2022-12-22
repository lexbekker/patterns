package ru.bekker.decorator.product;

public class Milk implements Product {
    private int price;

    public Milk(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
