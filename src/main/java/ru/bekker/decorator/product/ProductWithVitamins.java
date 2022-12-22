package ru.bekker.decorator.product;

public class ProductWithVitamins extends Decorator {
    public ProductWithVitamins(Product product) {
        super(product);
    }

    @Override
    public int getPrice() {
        return getProduct().getPrice() + 12;
    }
}
