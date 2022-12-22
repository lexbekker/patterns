package ru.bekker.decorator.product;

public class Main {
    public static void main(String[] args) {
        Product milk = new Milk(40);

        Product badMilk = new BadMilk(milk);
        Product badMilkWithVitamins = new ProductWithVitamins(badMilk);
        Product bmvv = new ProductWithVitamins(new BadMilk(new Milk(40)));

        System.out.println("Bad milk : "+ badMilk.getPrice());
        System.out.println("Bad milk + vitamins: "+ badMilkWithVitamins.getPrice());
        System.out.println("Bad milk + vitamins: "+ bmvv.getPrice());
    }
}
