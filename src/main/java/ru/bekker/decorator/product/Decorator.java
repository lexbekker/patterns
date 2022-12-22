package ru.bekker.decorator.product;

public abstract class Decorator implements Product {
    private Product product;

    public Decorator(Product product) {
        this.product = product;
    }

    @Override
    public abstract int getPrice();

    public Product getProduct() {
        return product;
    }
}
