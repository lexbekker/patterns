package ru.bekker.decorator.product;

public class BadMilk extends Decorator {
    public BadMilk(Product product) {
        super(product);
    }

    @Override
    public int getPrice() {
        return getProduct().getPrice() / 2;
    }
}
